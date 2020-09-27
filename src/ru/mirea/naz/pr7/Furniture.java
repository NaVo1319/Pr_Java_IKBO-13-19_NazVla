package ru.mirea.naz.pr7;

public abstract class  Furniture {
    private String name;
    private String data;
    private double price;
    private String  material;

    public Furniture(String name,String data, double price, String material) {
        this.name=name;
        this.data = data;
        this.price = price;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public  void openDoor(){}
    public  void closeDoor(){}
    public String knockTable(){
        return "??";
    }
    public void sitDownChair(){}
    public void sitUpChair (){}
    public void sleep(){}
    public void up(){}
    @Override
    public String toString() {
        return name+"::"+ " data: "+getData()+", material: "+ getMaterial()+", price: "+getPrice()+"\n";
    }
}
