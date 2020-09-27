package ru.mirea.naz.pr3;

public class Human {
    HumanHead Head;
    HumanHand LeftHand;
    HumanHand RightHand;
    HumanLeg LeftLeg;
    HumanLeg RightLeg;
    public Human(HumanHead head, HumanLeg Lleg,HumanLeg Rleg, HumanHand Lhand, HumanHand Rhand){
        Head=head;
        LeftHand=Lhand;
        RightHand=Rhand;
        LeftLeg=Lleg;
        RightLeg=Rleg;
    }

    public HumanHand getLeftHand() {
        return LeftHand;
    }

    public HumanHand getRightHand() {
        return RightHand;
    }

    public HumanHead getHead() {
        return Head;
    }

    public HumanLeg getLeftLeg() {
        return LeftLeg;
    }

    public HumanLeg getRightLeg() {
        return RightLeg;
    }

    public void setHead(HumanHead head) {
        Head = head;
    }

    public void setLeftHand(HumanHand leftHand) {
        LeftHand = leftHand;
    }

    public void setLeftLeg(HumanLeg leftLeg) {
        LeftLeg = leftLeg;

    }

    public void setRightHand(HumanHand rightHand) {
        RightHand = rightHand;
    }

    public void setRightLeg(HumanLeg rightLeg) {
        RightLeg = rightLeg;
    }
}
