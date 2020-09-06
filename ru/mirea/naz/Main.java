package ru.mirea.naz;


public class Main {

    public static void main(String[] args) {
        Dog[] dogs=new Dog[3];
        String name="re";
        int age=0;
        for(int i=0;i<3;++i){
            Dog dog=new Dog(name,age);
            dogs[i]=dog;
        }
        DogKennel kennel=new DogKennel();
        kennel.addKennel(dogs);
        System.out.printf(kennel.toString());
    }
}
