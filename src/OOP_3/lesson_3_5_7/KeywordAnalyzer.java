package OOP_3.lesson_3_5_7;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    private Label label = Label.OK;
    public Label processText(String text){
        String[] keywords = getKeywords();
        for (String key: keywords) {
            if (text.contains(key)) {
                return getLabel();
            }
        }
        return label;
    }
}
