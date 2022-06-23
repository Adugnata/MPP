package tsol.lab2.prob1;


public class Util {
    static int count = 0;
    static int[] nums = {923, 822, 553, 123, 123, 986, 101, 92, 787, 525, 629, 555};

    public static String nextFeatureId() {
        return "" + nums[count++];
    }
}
