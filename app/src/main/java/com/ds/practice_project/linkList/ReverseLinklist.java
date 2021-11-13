package com.ds.practice_project.linkList;

public class ReverseLinklist {

    static Node head;

    public static void main(String[] arg){
        Intersection2LinkList linkList = new Intersection2LinkList();

        int[] ar = {1,2,3,4,5};
        Node node =  linkList.add(ar);
        linkList.display(node);

        System.out.println();
        ReverseList(node);

        linkList.display(head);
     //   linkList.display(RevList(node));
    }

    public static Node RevList(Node node){ // null 1 2 3 4 5
        Node pre = null,curr = node, next = null;

        while (curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    public static void ReverseList(Node node){
        Node node1 = node;
        if (node.next == null){
            head = node;
            return ;
        }

        ReverseList(node.next);

        Node q = node.next;
        q.next = node;
        node.next = null;

        //return q;
    }

    private static Node reverse(Node head) {
        if(head==null || head.next == null)
            return head;

        Node p = reverse(head.next);
        head.next.next = head;//n+1 th node pointing nth node
        head.next = null;
        return p;
    }
}
