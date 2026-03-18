public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    // Static function (UC6 requirement)
    public static void printBanner() {

        String[] lines = {

            String.join("   ", " *** ", " *** ", " ****", " ****"),
            String.join("   ", "*   *", "*   *", "*   *", "*    "),
            String.join("   ", "*   *", "*   *", "*   *", "*    "),
            String.join("   ", "*   *", "*   *", " ****", " *** "),
            String.join("   ", "*   *", "*   *", "*    ", "    *"),
            String.join("   ", "*   *", "*   *", "*    ", "*   *"),
            String.join("   ", " *** ", " *** ", "*    ", " *** ")

        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}