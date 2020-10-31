package ru.mirea.inbo_05_19.Kuznetsov.Task1;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Creates a {@code ConcurrentLinkedQueue} that is initially empty.
     */
    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Creates a {@code ConcurrentLinkedQueue}
     * initially containing the elements of the given collection,
     * added in traversal order of the collection's iterator.
     *
     * @param c the collection of elements to initially contain
     */
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }

    /**
     * Returns an array containing all of the elements in this queue, in proper sequence.
     */
    @Override
    public String toString() {
        return content.toString();
    }

    /**
     * Inserts the specified element at the tail of this queue.
     */
    public void add(E element) {
        content.offer(element);
    }

    /**
     * Retrieves and removes the head of this queue, or returns null if this queue is empty.
     */
    public E remove() {
        return content.poll();
    }

    /**
     * Returns {@code true} if this queue contains the specified element.
     * More formally, returns {@code true} if and only if this queue contains
     * at least one element {@code e} such that {@code o.equals(e)}.
     *
     * @param element object to be checked for containment in this queue
     * @return {@code true} if this queue contains the specified element
     */
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     * This implementation iterates over the specified collection,
     * checking each element returned by the iterator in turn to see
     * if it's contained in this collection.  If all elements are so
     * contained {@code true} is returned, otherwise {@code false}.
     */
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    /**
     * Returns {@code true} if this queue contains no elements.
     */
    public boolean isEmpty() {
        return content.isEmpty();
    }

    public static void main(String[] args) {
        WaitList w = new WaitList<Integer>();
        w.add(1);
        w.add(2);
        w.remove();
        System.out.println(w.contains(2));
        System.out.println(w.toString());
        System.out.println(w.isEmpty());
        WaitList c = new WaitList<Integer>(w.content);
        System.out.println(c.containsAll(w.content));
        System.out.println(c.toString());
    }
}