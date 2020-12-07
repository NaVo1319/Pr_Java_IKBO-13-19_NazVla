package ru.mirea.naz.pr27;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String city;
    private String region;
    private String street;
    private String house;
    private String housing;
    private String apartment;
     public void setAddressS(String address){
         String[] x=address.split(" ");
         country=x[0];
         region=x[1];
         city=x[2];
         street=x[3];
         house=x[4];
         housing=x[5];
         apartment=x[6];
     }
    public void setAddressT(String address){
        StringTokenizer x=new StringTokenizer(address,".,;-");
        country=x.nextToken();
        region=x.nextToken();
        city=x.nextToken();
        street=x.nextToken();
        house=x.nextToken();
        housing=x.nextToken();
        apartment=x.nextToken();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
