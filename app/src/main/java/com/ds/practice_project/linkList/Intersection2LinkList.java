package com.ds.practice_project.linkList;
public class Intersection2LinkList {
    public com.example.practice.linkList.Node add(int[] data){
        com.example.practice.linkList.Node head = null;
        int i=0;
        while ( i < data.length){
            com.example.practice.linkList.Node newNode = new com.example.practice.linkList.Node(data[i]);
            i++;
            if (head == null){
                head = newNode;
                continue;
            }

            com.example.practice.linkList.Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = newNode;
        }

        return head;
    }

    public void display(com.example.practice.linkList.Node node){
        while (node != null){
            System.out.print(" "+node.data+" ");
            node = node.next;
        }
    }

    public com.example.practice.linkList.Node checkIntersection(com.example.practice.linkList.Node node1, com.example.practice.linkList.Node node2){
        com.example.practice.linkList.Node node = null;
        while (node1 != null){
            com.example.practice.linkList.Node nodesec = node2;
            while (nodesec != null){
                if (node1.data == nodesec.data){
                    com.example.practice.linkList.Node newNode = new com.example.practice.linkList.Node(node1.data);

                    if (node == null){
                        node = newNode;
                        nodesec = nodesec.next;
                        continue;
                    }

                    com.example.practice.linkList.Node nn = node;
                    while (nn.next != null){
                        nn = nn.next;
                    }
                    nn.next = newNode;
                }
                nodesec = nodesec.next;
            }

            node1 = node1.next;
        }
        return node;
    }

    public static void main(String[] ag){

        Intersection2LinkList linkList = new Intersection2LinkList();

        int[] ar = {1,2,3,4,5};
        com.example.practice.linkList.Node node =  linkList.add(ar);
        linkList.display(node);

        System.out.println();

        int[] a2 = {0,1,2,4,3};
        com.example.practice.linkList.Node node1 =  linkList.add(a2);
        linkList.display(node1);

        System.out.println();

        com.example.practice.linkList.Node node3 = linkList.checkIntersection(node,node1);
        linkList.display(node3);
    }
}
