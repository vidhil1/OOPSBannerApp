/**
 * OOPSBannerApp UC5: Inline Array Initialization
 * Combining array declaration and population in one step.
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Define and populate the array at the same time (Inline)
        // Spacing is increased ("      ") to make the banner look big and clear
        String[] lines = {
            String.join("      ", "  **** ", "  **** ", " ***** ", "  **** "),
            String.join("      ", " ** **", " ** **", " ** **", " ** "),
            String.join("      ", " ** **", " ** **", " ** **", " ** "),
            String.join("      ", " ** **", " ** **", " ***** ", "  **** "),
            String.join("      ", " ** **", " ** **", " ** ", "     **"),
            String.join("      ", " ** **", " ** **", " ** ", "     **"),
            String.join("      ", "  **** ", "  **** ", " ** ", "  **** ")
        };

        // Loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}