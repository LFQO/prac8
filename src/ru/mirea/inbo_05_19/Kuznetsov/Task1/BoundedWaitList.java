package ru.mirea.inbo_05_19.Kuznetsov.Task1;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
        new WaitList<E>();
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) throws IndexOutOfBoundsException {
        if (content.size() < capacity) {
            super.add(element);
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        BoundedWaitList b = new BoundedWaitList<Integer>(2);
        b.add(1);
        b.add(2);
        System.out.println(b.toString());
        b.add(3);
    }
}