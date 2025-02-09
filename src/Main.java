import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        LinearSearch linearSearch = new LinearSearch();
        RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
        CreateRangedList createRangedList = new CreateRangedList();

        Random rand = new Random();
        int listSize = rand.nextInt(6, 20);

        int[] list =CreateRangedList.newList(1, listSize);
        int target = rand.nextInt(0, list.length);

        int[] unsortedList = {5, 3, 5, 1, 5, 6, 5, 6, 9, 8, 4, 33, 3, 2, 5, 4, 8, 7, 6, 9, 10};
        int[] sortedLit = {1,2,3,4};




       binarySearch.binarySearch(sortedLit, 2);
       linearSearch.linearSearch(unsortedList, 9);

    }

}