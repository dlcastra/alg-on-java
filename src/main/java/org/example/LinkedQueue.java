package org.example;

public class LinkedQueue<E> implements Kolejka<E>{
    private listaJednokierunkowa<E> list = new listaJednokierunkowa<>();
    public LinkedQueue() {}

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E first() {
        return list.front();
    }

    @Override
    public E dequeue() {
        return list.removeFirst( );
    }
}
