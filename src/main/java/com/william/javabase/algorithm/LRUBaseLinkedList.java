package com.william.javabase.algorithm;

import java.util.Scanner;

/**
 * @Auther: williamdream
 * @Date: 2019/3/1 12:47
 * @Description: 基于单链表实现的LRU算法
 */
public class LRUBaseLinkedList<T> {

    private final static Integer DEFAULT_CAPACITY = 10;

    private int capacity = 10;

    private int length;

    private Node<T> headNode;


    public LRUBaseLinkedList() {
        this.capacity = DEFAULT_CAPACITY;
        this.length = 0;
        this.headNode = new Node<T>();
    }

    public LRUBaseLinkedList(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.headNode = new Node<T>();
    }


    public void add(T data){
        Node preNode = findPreNode(data);
        if(preNode != null){    //元素已存在，先删除，然后插入到头结点
            deleteElem(preNode);
            insertToHead(data);
        }else {
            if(length>this.capacity){
                deleteTailElem();
            }
            insertToHead(data);
        }
    }
    /**
     * 获取下一个节点
     * @param data
     * @return
     */
    private Node findPreNode(T data){
        Node node = headNode;
        while(node.getNext()!=null){
            if (data.equals(node.getNext().getElement())){
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    /**
     * 删除下一个节点
     * @param preNode
     */
    private void deleteElem(Node preNode){
        Node temp = preNode.getNext();
        preNode.setNext(temp.getNext());
        temp = null;
        length--;
    }

    /**
     * 插入到头部
     * @param data
     */
    private void insertToHead(T data){
        Node node = headNode.getNext();
        headNode.setNext(new Node(data,node));
        length++;
    }

    /**
     * 删除尾节点
     */
    private void deleteTailElem(){
       Node node = headNode.getNext();
       while (node.getNext()==null){
           return;
       }
        // 倒数第二个结点
        while (node.getNext().getNext() != null) {
            node = node.getNext();
        }

        Node temp = node.getNext();
        node.setNext(null);
        temp = null;
        length--;
    }

    private void printAll() {
        Node node = headNode.getNext();
        while (node != null) {
            System.out.print(node.getElement() + ",");
            node = node.getNext();
        }
        System.out.println();
    }

    public class Node<T>{
        private T element;

        private Node next;

        public Node(T element) {
            this.element = element;
        }

        public Node() {
            this.next = null;
        }

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LRUBaseLinkedList list = new LRUBaseLinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            list.add(sc.nextInt());
            list.printAll();
        }
    }

}
