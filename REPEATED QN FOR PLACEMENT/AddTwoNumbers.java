import java.util.Scanner;

/**
 * Problem: Add Two Numbers
 * Description: You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * 
 * Example:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807
 */

class ListNode {
    int val;
    ListNode next;
    
    // Constructor to create a node with value
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    
    // Constructor to create a node with value and next pointer
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    /**
     * Add two numbers represented as linked lists
     * @param l1 First linked list
     * @param l2 Second linked list
     * @return Result linked list with sum
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Traverse both lists until both are empty and no carry
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from nodes (0 if node is null)
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate sum with carry
            int sum = carry + x + y;
            carry = sum / 10;
            
            // Create new node with digit (sum % 10)
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            // Move to next nodes
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummyHead.next;
    }
}

public class AddTwoNumbersComplete {
    
    /**
     * Helper method to create linked list from array
     */
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    
    /**
     * Helper method to print linked list
     */
    public static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        System.out.println(sb.toString());
    }
    
    /**
     * Helper method to convert linked list to string representation
     */
    public static String linkedListToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode current = head;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(",");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
    
    /**
     * Main method with test cases
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Basic example
        System.out.println("=== Test Case 1 ===");
        System.out.println("Input: l1 = [2,4,3], l2 = [5,6,4]");
        ListNode l1 = createLinkedList(new int[]{2, 4, 3});
        ListNode l2 = createLinkedList(new int[]{5, 6, 4});
        System.out.print("l1: ");
        printLinkedList(l1);
        System.out.print("l2: ");
        printLinkedList(l2);
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        printLinkedList(result);
        System.out.println("Explanation: 342 + 465 = 807 (stored as [7,0,8])\n");
        
        // Test Case 2: Different lengths
        System.out.println("=== Test Case 2 ===");
        System.out.println("Input: l1 = [0], l2 = [0]");
        l1 = createLinkedList(new int[]{0});
        l2 = createLinkedList(new int[]{0});
        System.out.print("l1: ");
        printLinkedList(l1);
        System.out.print("l2: ");
        printLinkedList(l2);
        result = solution.addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        printLinkedList(result);
        System.out.println("Explanation: 0 + 0 = 0\n");
        
        // Test Case 3: Carry operations
        System.out.println("=== Test Case 3 ===");
        System.out.println("Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]");
        l1 = createLinkedList(new int[]{9, 9, 9, 9, 9, 9, 9});
        l2 = createLinkedList(new int[]{9, 9, 9, 9});
        System.out.print("l1: ");
        printLinkedList(l1);
        System.out.print("l2: ");
        printLinkedList(l2);
        result = solution.addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        printLinkedList(result);
        System.out.println("Explanation: 9999999 + 9999 = 10009998 (stored as [8,9,9,9,0,0,0,1])\n");
        
        // Test Case 4: Single digit numbers
        System.out.println("=== Test Case 4 ===");
        System.out.println("Input: l1 = [2], l2 = [5]");
        l1 = createLinkedList(new int[]{2});
        l2 = createLinkedList(new int[]{5});
        System.out.print("l1: ");
        printLinkedList(l1);
        System.out.print("l2: ");
        printLinkedList(l2);
        result = solution.addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        printLinkedList(result);
        System.out.println("Explanation: 2 + 5 = 7\n");
        
        // Test Case 5: Different lengths with carry
        System.out.println("=== Test Case 5 ===");
        System.out.println("Input: l1 = [9,9], l2 = [1]");
        l1 = createLinkedList(new int[]{9, 9});
        l2 = createLinkedList(new int[]{1});
        System.out.print("l1: ");
        printLinkedList(l1);
        System.out.print("l2: ");
        printLinkedList(l2);
        result = solution.addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        printLinkedList(result);
        System.out.println("Explanation: 99 + 1 = 100 (stored as [0,0,1])\n");
        
        // Interactive mode
        System.out.println("=== Interactive Mode ===");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Do you want to enter custom test cases? (yes/no)");
            String choice = scanner.nextLine().trim().toLowerCase();
            
            if (choice.equals("yes")) {
                System.out.println("Enter first number (digits separated by space, e.g., 2 4 3 for 342):");
                String[] input1 = scanner.nextLine().split(" ");
                int[] arr1 = new int[input1.length];
                for (int i = 0; i < input1.length; i++) {
                    arr1[i] = Integer.parseInt(input1[i]);
                }
                
                System.out.println("Enter second number (digits separated by space):");
                String[] input2 = scanner.nextLine().split(" ");
                int[] arr2 = new int[input2.length];
                for (int i = 0; i < input2.length; i++) {
                    arr2[i] = Integer.parseInt(input2[i]);
                }
                
                l1 = createLinkedList(arr1);
                l2 = createLinkedList(arr2);
                System.out.print("First number: ");
                printLinkedList(l1);
                System.out.print("Second number: ");
                printLinkedList(l2);
                
                result = solution.addTwoNumbers(l1, l2);
                System.out.print("Sum: ");
                printLinkedList(result);
            }
        } finally {
            scanner.close();
        }
    }
}
