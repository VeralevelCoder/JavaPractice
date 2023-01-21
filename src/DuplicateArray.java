import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5, 5, 6, 7};

        // Initialize sets for storing the duplicates and non-duplicates
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> nonDuplicates = new HashSet<>();

        // Iterate through the array and store each element in the appropriate set
        for (int i = 0; i < 10; i++) {
            if (nonDuplicates.contains(a[i])) {
                // If the element is already in the non-duplicates set, move it to the duplicates set
                nonDuplicates.remove(a[i]);
                duplicates.add(a[i]);
            } else if (!duplicates.contains(a[i])) {
                // If the element is not in either set, add it to the non-duplicates set
                nonDuplicates.add(a[i]);
            }
        }

        // Print the duplicates and non-duplicates sets
        System.out.print("Duplicates: ");
        for (int x : duplicates) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Non-duplicates: ");
        for (int x : nonDuplicates) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}


