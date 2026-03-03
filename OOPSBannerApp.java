import java.util.*;

public class BannerApp {

    /**
     * Inner Static Class to store character and its pattern
     */
    public static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character
         * @param pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get character pattern
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        };

        CharacterPatternMap[] maps = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}