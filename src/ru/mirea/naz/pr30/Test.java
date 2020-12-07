package ru.mirea.naz.pr30;

public class Test {
    public static void main(String[] args) {
        LinkedQueue q=new LinkedQueue();
        for(int i=0;i<12;++i){
            q.enqueue(i);
        }
        q.dequeue();
        System.out.println(q.size());
        System.out.println(q.element());
        System.out.println(q);
    }
}
