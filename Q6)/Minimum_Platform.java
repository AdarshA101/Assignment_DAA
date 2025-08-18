public class Minimum_Platform{

    public static int min_Platform(int[] arrival, int[] dep) {
        int n = arrival.length;
        int max_platform = 0;
        for (int i = 0; i < n; i++) {
            int platform = 1;
            for (int j = 0; j < n; j++) {
                    if (arrival[i] >= arrival[j] && dep[j] >= arrival[i] && i!=j) {
                        platform++;
                }
                    
            }
            max_platform = Math.max(max_platform, platform);
        }
        return max_platform;
    }

    public static void main(String[] args) {
        // int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        // int[] dep = {910, 1120, 1130, 1200, 1900, 2000};

        // int[] arrival = {805, 810, 830, 900, 945, 1020};
        // int[] dep = {815, 835, 915, 1015, 1100, 1130};

        int[] arrival = {700, 720, 730, 740, 750, 800};
        int[] dep = {715, 730, 745, 800, 815, 830};

        System.out.println(min_Platform(arrival, dep));
    }
}