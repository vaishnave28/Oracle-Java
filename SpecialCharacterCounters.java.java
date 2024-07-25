public class SpecialCharacterCounters {
    public static void main(String[] args) {
        String statement = "Modi Birthday @ September 17, #&$% is the wishes code for him.";
        int count = countSpecialCharacters(statement);
        System.out.println("Number of special Characters: " + count);
    }
    public static int countSpecialCharacters(String statement) {
        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (!Character.isLetterOrDigit(ch) &&!Character.isWhitespace(ch)) {
                count++;
            }
        }
        return count;
    }
}
