import java.util.Arrays;

/**
 * Created by sayali on 10/18/20.
 */
public class Router {

    public static void main(String[] args) {


        int[] houses = new int[]{100, 120, 180, 200, 350, 400, 500, 650, 700, 820, 950, 1000};
      //  int[] houses = new int[]{100, 300, 340, 380, 440, 510, 600, 650};
       // int[] houses = new int[]{100, 301, 501, 250, 1000, 1200};
       // int[] houses = new int[]{100, 301, 501, 250, 650,1000, 1200};


        Arrays.sort(houses);
        int res = minimumRouters(houses);

        System.out.println(res);

    }


    private static int minimumRouters(int[] houses) {

        int maxRange = 100;
        int noRouter = 0, range = 0, skipRange = 0;
        boolean checkSkip = false;


        for (int i = 1; i < houses.length; i++) {
          int distance= houses[i] - houses[i-1];

            if (checkSkip) {
                skipRange += distance;

                if (skipRange >= maxRange) {
                    checkSkip = false;
                }

            } else {
                range += distance;

                if (range >= maxRange) {

                    noRouter++;
                    skipRange = range - maxRange;
                    range = 0;
                    if (skipRange <= maxRange)
                        checkSkip = true;

                }
            }
        }

        if (range>0)
            noRouter++;


        return noRouter;
    }

}
