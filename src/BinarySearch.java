public class BinarySearch {

    /*
     * Returns the index postion of the target
     * if found else return Nono
     */

    static int binarySearch(int[] list, int target) {
        int first = 0;
        int last = list.length - 1;
        int tries = 0;
        while (first <= last) {
            int midpoint = (first + last) / 2;

            if (list[midpoint] == target) {
                tries += 1;
                System.out.println(
                        " Found target: " + target + "  at index: " + midpoint + " with number of tries " + tries);
                return midpoint;
            } else if (list[midpoint] < target) {
                tries += 1;
                first = midpoint + 1;

            } else if (list[midpoint] > target) {
                tries += 1;
                last = midpoint - 1;

            }

        }
        System.out.println("Not Found");
        return 0;
    }
}
