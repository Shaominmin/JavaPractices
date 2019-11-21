public class PalindromeList {
    public static ListNode getMiddle(ListNode head){
            ListNode fast = head;
            ListNode slow = head;
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
    public static ListNode reverseList(ListNode head){
            ListNode nHead = null;
            ListNode cur = head;
            while (cur != null) {
                ListNode next = cur.next;

                cur.next = nHead;
                nHead = cur;

                cur = next;
            }

            return nHead;
        }
        public boolean chkPalindrome(ListNode A) {
            ListNode middle = getMiddle(A);
            ListNode rHead = reverseList(middle);
            ListNode c1 = A;
            ListNode c2 = rHead;
            while (c1 != null && c2 != null) {
                if (c1.val != c2.val) {
                    return false;
                }

                c1 = c1.next;
                c2 = c2.next;
            }

            return true;
        }
    }
