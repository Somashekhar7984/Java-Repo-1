package Arrays;

public class BasicArrayActions {
    public static void main(String[] args) {
        // 1. Create an array
        int[] arr = new int[5];

        // 2. Insert values
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // 3. Access an element
        System.out.println("Element at index 2: " + arr[2]);

        // 4. Update an element
        arr[2] = 35;
        System.out.println("Updated element at index 2: " + arr[2]);

        // 5. Delete an element (set to 0)
        arr[3] = 0;
        System.out.println("Element at index 3 after deletion: " + arr[3]);

        // 6. Search for an element
        int searchValue = 20;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                System.out.println(searchValue + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(searchValue + " not found in the array.");
        }

        // 7. Traverse and print all elements
        System.out.print("Array elements: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}