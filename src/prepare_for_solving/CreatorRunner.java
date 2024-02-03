package prepare_for_solving;

import java.io.IOException;

/**
 * Запуск Creator'а
 */
public class CreatorRunner {
    public static void main(String[] args) throws IOException {
        //Добавить URL с задачей на уже выбранном языке (у меня дефолт Java)
        String url = "https://www.codewars.com/kata/5545f109004975ea66000086/train/java";
        Creator creator = new Creator();
        creator.start(url);
    }
}
