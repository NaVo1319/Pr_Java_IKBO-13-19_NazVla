package ru.mirea.naz.pr29;

public class Test {
    public static void main(String[] args) {
        ArrayQueueModule Q=new ArrayQueueModule(10);
        for(int i=1;i<10;++i){
            Q.enqueue(i);
        }
        Q.dequeue();
        Q.enqueue(13);
        Q.enqueue(45);
        System.out.println(Q.element());
        System.out.println(Q.isEmpty());
        System.out.println(Q.size());
        System.out.println(Q);

        ArrayQueueADT Q2=new ArrayQueueADT(10);
        for(int i=1;i<10;++i){
            Q2.enqueue(Q2,i);
        }
        Q2.dequeue(Q2);
        Q2.enqueue(Q2,13);
        Q2.enqueue(Q2,45);
        System.out.println(Q2.element(Q2));
        System.out.println(Q2.isEmpty(Q2));
        System.out.println(Q2.size(Q2));
        System.out.println(Q2);

        ArrayQueue Q3=new ArrayQueue(10);
        for(int i=1;i<10;++i){
            Q3.enqueue(i);
        }
        Q3.dequeue();
        Q3.enqueue(13);
        Q3.enqueue(45);
        System.out.println(Q3.element());
        System.out.println(Q3.isEmpty());
        System.out.println(Q3.size());
        System.out.println(Q3);
    }
}
