public class Solution {
    public static Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

