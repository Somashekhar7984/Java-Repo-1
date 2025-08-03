package LinkedList;

import java.util.LinkedList;

public class BasicLinkedListActions {
    public static void main(String[] args) {
        // 1. Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // 2. Insert values
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // 3. Access an element
        System.out.println("Element at index 2: " + list.get(2));

        // 4. Update an element
        list.set(2, 35);
        System.out.println("Updated element at index 2: " + list.get(2));

        // 5. Delete an element
        list.remove(3); // removes element at index 3
        System.out.println("List after deletion at index 3: " + list);

        // 6. Search for an element
        int searchValue = 20;
        int index = list.indexOf(searchValue);
        if (index != -1) {
            System.out.println(searchValue + " found at index " + index);
        } else {
            System.out.println(searchValue + " not found in the list.");
        }

        // 7. Traverse and print all elements
        System.out.print("LinkedList elements: ");
        for (int value : list) {
            System.out.print(value + " ");
        }
    }
}