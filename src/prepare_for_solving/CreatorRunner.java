package prepare_for_solving;

import java.io.IOException;

/**
 * Запуск Creator'а
 */
public class CreatorRunner {
    public static void main(String[] args) throws IOException {
        //Добавить в 'challenge' ID или название задачи
        String challenge = "5545f109004975ea66000086";
        String url = "https://www.codewars.com/api/v1/code-challenges/" + challenge;
        Creator creator = new Creator();
        creator.start(url);
    }
}
