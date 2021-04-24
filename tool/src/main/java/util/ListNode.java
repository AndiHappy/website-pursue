package util;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    /**
     * 构建方法
     * */
    public static ListNode construct(int[] value){
        ListNode head = null;
        ListNode result = null;
        for (int i = 0; i < value.length; i++) {
            if(head == null){
                head=new ListNode(value[i]);
                result=head;
                continue;
            }
            head.next=new ListNode(value[i]);
            head=head.next;
        }
        return result;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
