/**
 * OOPSBannerApp UC4: String Array and Loop
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // We use an array to store the 7 rows of the banner.
        // I added extra "      " (6 spaces) between letters to prevent congestion.
        String[] banner = {
            String.join("      ", "  **** ", "  **** ", " ***** ", "  **** "),
            String.join("      ", " ** ** ", " ** ** ", " ** ** ", " ** "),
            String.join("      ", " ** ** ", " ** ** ", " ** ** ", " ** "),
            String.join("      ", " ** ** ", " ** ** ", " ***** ", "  **** "),
            String.join("      ", " ** ** ", " ** ** ", " ** ", "     ** "),
            String.join("      ", " ** ** ", " ** ** ", " ** ", "     ** "),
            String.join("      ", "  **** ", "  **** ", " ** ", "  **** ")
        };

        // This loop prints the array row by row
        for (String line : banner) {
            System.out.println(line);
        }
    }
}