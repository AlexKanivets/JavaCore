package OOP_3.lesson_3_5_7;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    String [] negaive = {":(","=(",":|"};
    Label label = Label.NEGATIVE_TEXT;

    @Override
    protected String[] getKeywords() {
        return negaive;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
