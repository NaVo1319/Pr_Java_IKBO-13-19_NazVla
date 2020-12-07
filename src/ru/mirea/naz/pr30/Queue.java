package ru.mirea.naz.pr30;

public interface Queue {
    public void enqueue(int element);
    public int element();
    public int dequeue();
    public int size();
    public boolean isEmpty();
    public void clear();

}
