public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Define and populate the array at the same time (Inline)
        String[] lines = {
            String.join("      ", "  **** ", "  **** ", " ***** ", "  **** "),
            String.join("      ", " **  **", " **  **", " **  **", " ** "),
            String.join("      ", " **  **", " **  **", " **  **", " ** "),
            String.join("      ", " **  **", " **  **", " ***** ", "  **** "),
            String.join("      ", " **  **", " **  **", " ** ", "     **"),
            String.join("      ", " **  **", " **  **", " ** ", "     **"),
            String.join("      ", "  **** ", "  **** ", " ** ", "  **** ")
        };

        // Loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
