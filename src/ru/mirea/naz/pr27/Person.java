package ru.mirea.naz.pr27;

public class Person {
    private String n="";
    private String f="";
    private String o="";
    public Person(String f,String n,String o){
        this.f=f;
        this.n=n;
        this.o=o;
    }
    public String getFNO(){
        String result="";
        if(f!=null){result+=f+" ";}
        if(n!=null){result+=n+" ";}
        if(o!=null){result+=o+" ";}
        return result;
    }
}
