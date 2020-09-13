package ru.mirea.naz;

public class HumanTest {
    public static void main(String[] args) {
        HumanLeg LLeg=new HumanLeg(56);
        HumanLeg Rleg=new HumanLeg(78);
        HumanHand LHand=new HumanHand(98);
        HumanHand RHand=new HumanHand(97);
        HumanHead head=new HumanHead(33);
        Human human=new Human(head,LLeg,Rleg,LHand,RHand);
        System.out.println(human.getHead());
        System.out.println(human.getLeftHand()+" "+human.getRightHand());
        System.out.println(human.getLeftLeg()+" "+human.getRightLeg());
    LLeg.setHealth(100);
    LHand.setHealth(100);
    RHand.setHealth(100);
    Rleg.setHealth(100);
    head.setHealth(100);
        System.out.println(human.getHead());
        System.out.println(human.getLeftHand()+" "+human.getRightHand());
        System.out.println(human.getLeftLeg()+" "+human.getRightLeg());
    }
}
