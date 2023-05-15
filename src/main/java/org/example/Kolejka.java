package org.example;

public interface Kolejka<E> {

    int size();
    boolean isEmpty();
    void enqueue(E e);
    E first();
    E dequeue();

}
