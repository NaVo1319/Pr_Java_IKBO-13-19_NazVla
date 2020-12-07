package ru.mirea.naz.pr27;

public class Telefon {
    private String Kod="";
    private String Num31="";
    private String Num32="";
    private String Num4="";
    public Telefon(String x){
        Num4=x.substring(x.length()-4,x.length());
        Num32=x.substring(x.length()-7,x.length()-4);
        Num31=x.substring(x.length()-10,x.length()-7);
        Kod=x.substring(0,x.length()-10);
        if(Kod.equals("8")){
            Kod="+7";
        }
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "Kod='" + Kod + '\'' +
                ", Num31='" + Num31 + '\'' +
                ", Num32='" + Num32 + '\'' +
                ", Num4='" + Num4 + '\'' +
                '}';
    }
}
