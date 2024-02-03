import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создает папки с названием задачи, папки с названиями ЯП, на которых ее можно решить
 * и дефолтные классы с тестами для начала решения
 */

public class Creator {
    public static void main(String[] args) throws IOException {
        //Поле для URL с задачей
        String urlData = "https://www.codewars.com/kata/59377c53e66267c8f6000027/train/java";
        URL url = new URL(urlData);
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        //Контейнер для содержимого URL
        StringBuilder data = new StringBuilder();
        //Контейнер для ЯП, на которых можно решить задачу
        List<String> languages = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line);
                Pattern patternLanguages = Pattern.compile("(</i>()</dd>)");
                Matcher matcherLanguages = patternLanguages.matcher(line);
                if (matcherLanguages.find()) {
                    String language = matcherLanguages.group(1);
                    languages.add(language);
                }
            }
        }
        System.out.println(data);
        System.out.println(languages);
        Pattern patternKyu = Pattern.compile("<span>(\\d kyu)</span>");
        Pattern patternTitle = Pattern.compile("<h4 class=\"ml-2 mb-3\">(.*)</h4>");
        Matcher matcherKyu = patternKyu.matcher(data.toString());
        Matcher matcherTitle = patternTitle.matcher(data.toString());
        if (matcherKyu.find() && matcherTitle.find()) {
            String kyu = matcherKyu.group(1);
            //Пока хуй знет как поймать только одно название задачи, поэтому вот такое говно
            String title = matcherTitle.group(1).split("<")[0].toLowerCase().replace(" ", "_");
            switch (kyu) {
                case "6 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_6", title);
                    folder.mkdirs();
                }
                case "7 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_7", title);
                    folder.mkdirs();
                }
                case "8 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_8", title);
                    folder.mkdirs();
                }
            }
        }
    }
}


