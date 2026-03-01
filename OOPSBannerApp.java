public class OOPSBannerApp {
    public static void main(String[] args) {
        // We use an array to store the 7 rows of the banner.
        String[] banner = {
            String.join("      ", "  **** ", "  **** ", "   ***** ", "  **** "),
            String.join("      ", " **   ** ","**   ** ", " **  ** ", " ** "),
            String.join("      ", " **   ** ","**   ** ", " **  ** ", " ** "),
            String.join("      ", " **   ** ","**   ** ", " ***** ", "   **** "),
            String.join("      ", " **   ** ","**   ** ", " ** ", "     ** "),
            String.join("      ", " **   ** ","**   ** ", " ** ", "     ** "),
            String.join("      ", "  **** ", "  **** ",   " ** ", "  **** ")
        };

        // This loop prints the array row by row
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
