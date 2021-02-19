package algorithm.leecode.p202102;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSort {

    public class ListNode {

        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }


        List<ListNode> list1 = new ArrayList<>();
        List<ListNode> list2 = new ArrayList<>();

        while (l1 != null) {
            list1.add(l1);
            l1 = l1.next;
        }

        while (l2 != null) {
            list2.add(l2);
            l2 = l2.next;
        }

        list1.addAll(list2);

        list1.sort(Comparator.comparingInt(o -> o.val));

        for(int index = 0; index < list1.size() - 1; index++) {
            list1.get(index).next = list1.get(index+1);
        }

        return list1.get(0);
    }

    @Test
    public void test1() {
        ListNode lnA1 = new ListNode(1);
        ListNode lnA2 = new ListNode(3);
        ListNode lnA3 = new ListNode(7);

        lnA1.next = lnA2;
        lnA2.next = lnA3;

        ListNode lnB1 = new ListNode(2);
        ListNode lnB2 = new ListNode(4);
        ListNode lnB3 = new ListNode(6);
        ListNode lnB4 = new ListNode(8);

        lnB1.next = lnB2;
        lnB2.next = lnB3;
        lnB3.next = lnB4;

        ListNode result = mergeTwoLists(lnA1, lnB1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}
