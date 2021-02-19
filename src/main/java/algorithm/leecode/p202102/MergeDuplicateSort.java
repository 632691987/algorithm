package algorithm.leecode.p202102;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.IntegerSyntax;

public class MergeDuplicateSort {

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

    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> nodeValueList = new ArrayList<>();
        Map<Integer, Integer> maps = new HashMap<>();

        while (head != null) {
            int currentValue = head.val;
            nodeValueList.add(currentValue);
            if (maps.containsKey(currentValue)) {
                maps.computeIfPresent(currentValue, (key, value) -> {
                    return value + 1;
                });
            } else {
                maps.put(currentValue, 1);
            }
            head = head.next;
        }

        ListNode headNode = null;
        ListNode lastNode = null;
        boolean isFirst = true;
        for (int index = 0; index < nodeValueList.size(); index++) {
            int currentValue = nodeValueList.get(index);
            if (maps.get(currentValue) > 1) {
                continue;
            }

            ListNode currentNode = new ListNode(currentValue);
            if (isFirst) {
                headNode = currentNode;
                lastNode = currentNode;
                isFirst = false;
            } else {
                lastNode.next = currentNode;
                lastNode = currentNode;
            }
        }

        return headNode;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null) {
            return null;
        }

        while (head != null) {
            head = head.next;
        }

        ListNode headNode = head;
        ListNode lastNode = head;
        head = head.next;

        while (head != null) {
            if (head.val != lastNode.val) {
                lastNode.next = head;
                lastNode = lastNode.next;
            }
            head = head.next;
        }

        return headNode;
    }

    @Test
    public void test1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode result = deleteDuplicates2(node1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
