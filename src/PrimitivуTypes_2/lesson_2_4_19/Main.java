package PrimitivуTypes_2.lesson_2_4_19;

public class Main {
    public static void main(String[] args) {

    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < roles.length; i++ ) {
            result.append(roles[i]+':'+'\n');
            for (int k = 0; k < textLines.length; k++) {
                if (textLines[k].startsWith(roles[i]+":" )) {
                    result.append(k+1).append(')');
                    result.append(textLines[k].replaceFirst(roles[i] +": ", " ")).append('\n');
                }
            }
            result.append('\n');
        }
        return result.toString();
    }
}
