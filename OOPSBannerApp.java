/**
 * OOPSBannerApp UC6: Refactoring into Static Functions
 * Using helper methods to generate patterns for O, P, and S.
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[]{ "  **** ", " **  **", " **  **", " **  **", " **  **", " **  **", "  **** " };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[]{ " ***** ", " **  **", " **  **", " ***** ", " ** ", " ** "," ** " };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[]{ "  **** ", " ** ", " ** ", "  **** ", " **", " **", "  **** " };
    }

    public static void main(String[] args) {
        // Fetch the patterns from our functions
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        String gap = "      "; // 6 spaces for a spacious look

        // Assemble and print the banner row by row
        for (int i = 0; i < 7; i++) {
            System.out.println(String.join(gap, oPattern[i], oPattern[i], pPattern[i], sPattern[i]));
        }
    }
}
