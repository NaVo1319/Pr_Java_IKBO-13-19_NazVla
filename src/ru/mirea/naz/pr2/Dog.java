package ru.mirea.naz.pr2;

public class Dog {
    private  String name;
    private int age;
    public Dog(String name, int age){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int humanAge(){
        return this.age*7;
    }
    @Override
    public String toString(){
        return "Dog:"+name+" Age:"+age;
    }
}
