package ru.mirea.inbo_05_19.Kuznetsov.Task1;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        new WaitList<E>();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }

    public static void main(String[] args) {
        UnfairWaitList u = new UnfairWaitList<Integer>();
        u.add(1);
        u.add(2);
        u.add(3);
        u.remove(2);
        u.moveToBack(1);
        System.out.println(u.toString());
    }
}