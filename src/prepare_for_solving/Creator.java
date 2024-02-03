package prepare_for_solving;

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
    public Creator() {
    }

    /**
     * Запуск скрипта
     */
    public void start(String url) throws IOException {
        parser(url);
    }

    /**
     * Парсер страницы с задачей
     */
    public void parser(String url) throws IOException {
        URL tasksUrl = new URL(url);
        URLConnection con = tasksUrl.openConnection();
        InputStream is = con.getInputStream();
        //Контейнер для содержимого URL
        StringBuilder data = new StringBuilder();
        //Контейнер для ЯП, на которых можно решить задачу
        Set<String> languages = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
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
            //TODO Пока хуй знет, как поймать только одно название задачи, поэтому вот такое говно
            String title = matcherTitle.group(1).split("<")[0].toLowerCase().replaceAll("[ ?]", "_").trim();
            //Проверка на наличие в конце строки символа, который не является буквой
            if (!Character.isLetter(title.length() - 1)) {
                title = title.substring(0, title.length() - 1).trim();
            }
            //Прописать свой путь
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
                case "8 kyu" ->
                    //TODO разработать пиздатый fileContent
                        foldersFilesCodeCreator(languages, "C:\\Users\\seera\\IdeaProjects\\Codewars\\src\\kyu_8\\" + title, kyu, title/*"MyFile.java"*/);
            }
        }
    }

    /**
     * Подготовка папок, файлов и стартового кода для решения задачи
     */
    public void foldersFilesCodeCreator(Set<String> languages, String folderPath, String kyu, String title) {

        try {
            File folder = new File(folderPath + "\\java");
            if (!folder.exists()) {
                folder.mkdirs();
            }
            File object = new File(folder, filesCreator("java", title));
            FileWriter code = new FileWriter(object);
            code.write(codeCreator("java", kyu, title));
            code.close();
            for (String check : languages) {
                if (check.contains("javascript")) {
                    folder = new File(folderPath + "\\js");
                    if (!folder.exists()) {
                        folder.mkdirs();
                    }
                    object = new File(folder, filesCreator("js", title));
                    code = new FileWriter(object);
                    code.write(codeCreator("js", kyu, title));
                    code.close();
                } else if (check.contains("groovy")) {
                    folder = new File(folderPath + "\\groovy");
                    if (!folder.exists()) {
                        folder.mkdirs();
                    }
                    object = new File(folder, filesCreator("groovy", title));
                    code = new FileWriter(object);
                    code.write(codeCreator("groovy", kyu, title));
                    code.close();
                } else if (check.contains("sql")) {
                    folder = new File(folderPath + "\\sql");
                    if (!folder.exists()) {
                        folder.mkdirs();
                    }
                    object = new File(folder, filesCreator("sql", title));
                    code = new FileWriter(object);
                    code.write(codeCreator("sql", kyu, title));
                    code.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String filesCreator(String objectType, String title) {
        switch (objectType) {
            case "java" -> {
                return "Test.java";
            }
            case "js" -> {
            }
            case "groovy" -> {
            }
            case "sql" -> {
            }
        }
        return "";
    }

    public String codeCreator(String objectType, String kyu, String title) {
        String kyuDigit = String.valueOf(kyu.charAt(0));
        switch (objectType) {
            case "java" -> {
                return "package kyu_" + kyuDigit + "." + title + ".java;\n\npublic class MyFile {\n\t// File content here\n}";
            }
            case "js" -> {
            }
            case "groovy" -> {
            }
            case "sql" -> {
            }
        }
        return "\"package kyu_8.\" + title + \".java;\\n\\npublic class MyFile {\\n\\t// File content here\\n}\"";
    }
}


