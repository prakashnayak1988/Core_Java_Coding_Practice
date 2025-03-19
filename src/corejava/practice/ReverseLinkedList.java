package corejava.practice;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; // Initialize the previous node as null
        ListNode current = head; // Start with the head node

        while (current != null) {
            ListNode nextNode = current.next; // Store the next node
            current.next = prev; // Reverse the pointer
            prev = current; // Move the previous pointer forward
            current = nextNode; // Move the current pointer forward
        }

        return prev; // The new head of the reversed list
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        head = reverseList(head); // Reverse the list

        System.out.println("Reversed List:");
        printList(head);
    }
}
