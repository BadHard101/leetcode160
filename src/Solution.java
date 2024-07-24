import java.util.HashSet;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while (headA != null && headB != null) {
            if (set.contains(headA)) return headA;
            set.add(headA);
            headA = headA.next;
            if (set.contains(headB)) return headB;
            set.add(headB);
            headB = headB.next;
        }
        while (headA != null) {
            if (set.contains(headA)) return headA;
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) return headB;
            set.add(headB);
            headB = headB.next;
        }
        return null;
    }
}