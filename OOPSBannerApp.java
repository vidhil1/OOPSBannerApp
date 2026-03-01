public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC3: Using String.join("", ...) instead of + for better memory efficiency
        System.out.println(String.join("", "  *** ", "  *** ", "   ***** ", "  **** "));
        System.out.println(String.join("", " **  ** ","**  ** ", " **  ** ", " ** "));
        System.out.println(String.join("", " **  ** ","**  ** ", " **  ** ", " ** "));
        System.out.println(String.join("", " **  ** ","**  ** ", " ***** ", "   **** "));
        System.out.println(String.join("", " **  ** ","**  ** ", " ** ", "     **"));
        System.out.println(String.join("", " **  ** ","**  ** ", " ** ", "     **"));
        System.out.println(String.join("", "  *** ", "  *** ",   " ** ", "  **** "));
    }
}
