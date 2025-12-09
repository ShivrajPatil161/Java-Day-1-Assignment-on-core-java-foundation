public class SecondSmallest {
    static void main(String[] args) {
        int[] arr = {12, 5, 7, 3, 9, 3};

        Integer smallest = null;
        Integer secondSmallest = null;

        for (int num : arr) {
            if (smallest == null || num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num != smallest && (secondSmallest == null || num < secondSmallest)) {
                secondSmallest = num;
            }
        }

        if (secondSmallest != null) {
            System.out.println("Second smallest: " + secondSmallest);
        } else {
            System.out.println("No second smallest element (all elements may be equal).");
        }
    }
}
