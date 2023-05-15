package org.example;

public class listaJednokierunkowa<E> {

    private static class Node<E>{

        private E element;
        private Node<E> next;

        public Node(E e, Node<E> k){
            element = e;
            next = k;
        }

        public E getElement() {
            return element;
        }
        public Node<E> getNext(){return next;}
        public void setNext(Node<E> k) {next = k;}

    }

    private Node<E> head = null;

    private Node<E> tail = null;

    private int size = 0;

    public int size() {return size;}

    public boolean isEmpty() {return size==0;}

    public E front(){
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        head = new Node<>(e, head);
        if (size==0)
            tail = head;
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if(isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        E temp=head.getElement();
        head = head.getNext();
        size--;
        if (size==0)
            tail=null;
        return temp;
    }

}
