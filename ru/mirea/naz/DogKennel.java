package ru.mirea.naz;


public class DogKennel {
    private Dog[] kennel;
    public DogKennel(){
        kennel=new Dog[0];
    }
    public void addKennel(Dog ...dogs){
        Dog[] kennelBuf=new Dog[kennel.length+dogs.length];
        System.arraycopy(kennel,0,kennelBuf,0,kennel.length);
        System.arraycopy(dogs,0,kennelBuf,kennel.length,dogs.length);
        kennel=kennelBuf;
    }

    public Dog[] getKennel() {
        return kennel;
    }

    public void setKennel(Dog[] kennel) {
        this.kennel = kennel;
    }
    @Override
    public String toString(){
        String Res="";
        for(int i=0;i< kennel.length;++i){
            Res+=kennel[i].toString()+"\n";
        }
        return Res;
    }
}
