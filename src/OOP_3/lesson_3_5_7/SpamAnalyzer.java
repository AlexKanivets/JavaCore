package OOP_3.lesson_3_5_7;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    Label label = Label.SPAM;
    public SpamAnalyzer (String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
