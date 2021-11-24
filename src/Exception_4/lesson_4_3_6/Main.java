package Exception_4.lesson_4_3_6;

import java.util.logging.Logger;

public class Main {
    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.info("Все хорошо");
        logger.warning("Произошла ошибка");
    }
}
