import java.util.Arrays;

public class RecursiveBinarySearch {

    /*
     * returns true if target found in the list return false if target is not found
     */

    public static boolean recursiveBinarySearch(int[] list, int target) {
        if (list.length == 0) {
            return false;
        } else {
            int midpoint = list.length / 2;
            if (list[midpoint] == target) {
                return true;
            } else {
                if (list[midpoint] < target) {
                    return recursiveBinarySearch(Arrays.copyOfRange(list, midpoint + 1, list.length), target);
                }

                else {

                    return recursiveBinarySearch(Arrays.copyOfRange(list, 0, midpoint), target);

                }
            }
        }
    }
}
