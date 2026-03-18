import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Function to build character pattern map
    private static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        // O (5 width)
        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // P (5 width)
        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        // S (5 width)
        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return map;
    }

    // Function to render banner for a given word
    private static void renderBanner(String word, Map<Character, String[]> patternMap) {
        int rows = 7;

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]).append("   "); // 3-space gap
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        renderBanner("OOPS", patternMap);
    }
}