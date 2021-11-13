package com.ds.practice_project.linkList;

public class Add2No {

    public static void main(String[] args) {
        Intersection2LinkList linkList = new Intersection2LinkList();

        int[] ar = {1,2,3,6,5};
        com.example.practice.linkList.Node node =  linkList.add(ar);
        linkList.display(node);

        System.out.println();

        //linkList.display(reverse(node));

        int[] a2 = {9,1,2,4,7};
        com.example.practice.linkList.Node node1 =  linkList.add(a2);
        linkList.display(node1);

        System.out.println();

        Node result = reverse(addLinkList(reverse(node),reverse(node1)));
        linkList.display(result);
        //   1 1     1
        // 5 6 3 2 1
        // 7 4 2 1 9
        // 2 1 6 3 0 1

        // 1 0 3 6 1 2
        //================

        //   1 1
        // 5 6 3 2 1
        // 7 4
        // 2 1 4 2 1

        //
    }

    private static Node addLinkList(Node node1, Node node2) {

        Node resNode = null;
        Node lastNode = null;
        Node newNode = null;
        int reminder = 0;
        String finalReault = "";

        while (node1 != null && node2 != null){
            int res = node1.data + node2.data + reminder;
            int res1 = 0;
            String r = String.valueOf(res);

            if (r.length() == 2){
                String re = r.substring(0,1);
                reminder = Integer.parseInt(re);
                res1 = Integer.parseInt(r.substring(1));
            }else {
                reminder = 0;
                res1 = res;
            }

            node1= node1.next;
            node2 = node2.next;

            newNode = new Node(res1);

            if (resNode == null) {
                resNode = newNode;
                lastNode = resNode;
            }else{
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }

        while (node1 != null){
            int res = node1.data + reminder;
            Node  newNod1 = new Node(res);
            lastNode.next = newNod1;
            lastNode = newNod1;
            reminder = 0;
            node1 = node1.next;
        }

        while (node2 != null){
            int res = node2.data + reminder;
            Node newNod1 = new Node(res);
            lastNode.next = newNod1;
            lastNode = newNod1;
            reminder = 0;
            node2 = node2.next;
        }

        if (reminder != 0){
            Node   newNod1 = new Node(reminder);
            lastNode.next = newNod1;
        }
        return resNode;
    }


    public Node addLast(int[] ar){
        Node firstNode = null;
        Node lastNode = null;

        for (int i=0; i< ar.length; i++){
            Node newNode = new Node(ar[i]);
            if (firstNode == null) {
                firstNode = newNode;
                lastNode = firstNode;
            }else{
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
        return firstNode;
    }

    public static Node reverse(Node node){ // null 1 2 3 4
        Node current = node,pre = null,nextNode = null;

        while (current != null){
            nextNode = current.next;
            current.next = pre;
            pre = current;
            current = nextNode;
        }

        return pre;
    }

    public Node add(int[] data){
        Node head = null;
        int i=0;
        while ( i < data.length){
            Node newNode = new Node(data[i]);
            i++;
            if (head == null){
                head = newNode;
                continue;
            }

            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = newNode;
        }

        return head;
    }
}
