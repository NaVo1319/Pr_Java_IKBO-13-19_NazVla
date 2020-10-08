package ru.mirea.naz.pr1112;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.pow;

public enum Planet  {
    MERCURY(3.3011*pow(10,23),4880),
    VENUS(4.8675*pow(10,24),6051.8),
    EARTH(5.97237*pow(10,24),6371),
    MARS(6.4171*pow(10,23),3389.5),
    JUPITER(1.8982*pow(10,27),69911),
    SATURN(5.6834*pow(10,26),58232),
    URANUS(8.6810*pow(10,25),25362),
    NEPTUNE(1.02413*pow(10,26),24622);
    private double mass;
    private double radius;
    Planet(double mass,double radius){
        this.mass=mass;
        this.radius=radius;

    }
    public double Gravitation(){
        double G=6.67408*pow(10,-11);
        return G*mass/(radius*radius);
    }
}
