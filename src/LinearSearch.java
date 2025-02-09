public class LinearSearch {

    static int linearSearch(int[] list, int target) {
        /*
         * Returns the index postion of the target
         * if found else return Nono
         */
        int tries = 0;
        for (int i = 0; i < list.length; i++) {
            tries+=1;
            if (list[i] == target) {
                System.out.println("Target " + target +" found at index: " + i + " with :" + tries + " tries");
                return i;
            }

        }

        return 0;

    }
}
