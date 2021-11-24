package OOP_3.lesson_3_5_7;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() <= maxLength) {
            return Label.OK;
        } else {
            return Label.TOO_LONG;
        }
    }
}
