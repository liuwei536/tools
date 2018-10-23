package com.liu.algoritlh;

/**
 * Created by Administrator on 2018/10/22/022.
 */
public class LinkListReverse {
    public static void main(String[] args) {
        LinkListReverse linkListReverse = new LinkListReverse();
        Node node5 = linkListReverse.new Node("5", null);
        Node node4 = linkListReverse.new Node("4", node5);
        Node node3 = linkListReverse.new Node("3", node4);
        Node node2 = linkListReverse.new Node("2", node3);
        Node node1 = linkListReverse.new Node("1", node2);
        linkListReverse.print(node1);
        System.out.println("reverse......");
        Node reverse = linkListReverse.reverse(node1);
        linkListReverse.print(reverse);
    }

    public Node reverse(Node node) {
        if (node.getNext() == null) {
            return node;
        }
        Node next = node.getNext();
        node.setNext(null);
        Node reverse = reverse(next);
        next.setNext(node);
        return reverse;
    }

    public void print(Node node){
        System.out.println(node.getValue());
        if(node.getNext()==null){return;}
        print(node.getNext());
    }

    class Node {
        public Node() {

        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        private String value;
        private Node next;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
