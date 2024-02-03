import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создает папки с названием задачи, папки с названиями ЯП, на которых ее можно решить
 * и дефолтные классы с тестами для начала решения.
 */

public class Creator {
    public static void main(String[] args) throws IOException {
        //Добавить URL с задачей на уже выбранном языке (у меня дефолт Java)
        String urlData = "https://www.codewars.com/kata/5545f109004975ea66000086/train/java";
        URL url = new URL(urlData);
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        //Контейнер для содержимого URL
        StringBuilder data = new StringBuilder();
        //Контейнер для ЯП, на которых можно решить задачу
        Set<String> languages = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                data.append(line);
                //Добавить ЯП, которые нужны
                Pattern patternLanguages = Pattern.compile("(icon-moon-javascript|icon-moon-sql|icon-moon-groovy)");
                Matcher matcherLanguages = patternLanguages.matcher(line);
                if (matcherLanguages.find()) {
                    String language = matcherLanguages.group(1);
                    languages.add(language);
                }
            }
        }
        System.out.println(data);
        Pattern patternKyu = Pattern.compile("<span>(\\d kyu)</span>");
        Pattern patternTitle = Pattern.compile("<h4 class=\"ml-2 mb-3\">(.*)</h4>");
        Matcher matcherKyu = patternKyu.matcher(data.toString());
        Matcher matcherTitle = patternTitle.matcher(data.toString());

        if (matcherKyu.find() && matcherTitle.find()) {
            String kyu = matcherKyu.group(1);
            //TODO Пока хуй знет как поймать только одно название задачи, поэтому вот такое говно
            String title = matcherTitle.group(1).split("<")[0].toLowerCase().replaceAll("[ ?]", "_");
            //Проверка на наличие в конце строки символа, который не является буквой
            if (!Character.isLetter(title.length() - 1)) {
                title = title.substring(0, title.length() - 1);
            }
            switch (kyu) {
                case "1 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_1", title);
                    folder.mkdirs();
                }
                case "2 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_2", title);
                    folder.mkdirs();
                }
                case "3 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_3", title);
                    folder.mkdirs();
                }
                case "4 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_4", title);
                    folder.mkdirs();
                }
                case "5 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_5", title);
                    folder.mkdirs();
                }
                case "6 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_6", title);
                    folder.mkdirs();
                }
                case "7 kyu" -> {
                    File folder = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_7", title);
                    folder.mkdirs();
                }
                case "8 kyu" -> {
                    File folderJava = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_8", title + "\\java");
                    //TODO разработать пиздатый fileContent
                    createFile(folderJava.toString(), "MyFile.java", "package kyu_8." + title + ".java;\n\npublic class MyFile {\n\t// File content here\n}");
                    for (String check : languages) {
                        if (check.contains("javascript")) {
                            File folderSql = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_8", title + "\\js");
                            folderSql.mkdirs();
                        } else if (check.contains("groovy")) {
                            File folderGroovy = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_8", title + "\\groovy");
                            folderGroovy.mkdirs();
                        } else if (check.contains("sql")) {
                            File folderSql = new File("C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_8", title + "\\sql");
                            folderSql.mkdirs();
                        }
                    }
                }
            }
        }
    }

    //Создает классы и тесты в папке
    public static void createFile(String folderPath, String fileName, String fileContent) {
        try {
            File folder = new File(folderPath);
            if (!folder.exists()) {
                folder.mkdirs();
            }
            File file = new File(folder, fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(fileContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


