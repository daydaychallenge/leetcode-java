package daydaychange.p00382;

import daydaychange.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LinkedListRandomNode {
    List<ListNode> elements = new ArrayList<>();
    Random random = new Random();
    public LinkedListRandomNode(ListNode head) {
        ListNode tmp = head;
        while (tmp != null) {
            elements.add(tmp);
            tmp = tmp.next;
        }
    }

    public int getRandom() {
        int index = random.nextInt(elements.size());
        ListNode listNode = elements.get(index);
        return listNode.val;
    }

}
