package ru.mirea.naz.pr24.Q2;

public class MagicChair implements Chair {
    private String name;
    private String Stat;

    public MagicChair(String name, String stat) {
        this.name = name;
        Stat = stat;
    }

    @Override
    public void Sit(Chair chair) {
        System.out.println("Стул не сядет на стул");
    }

    @Override
    public void Stat() {
        System.out.println(Stat);
    }

    @Override
    public String toString() {
        return "MagicChair{" +
                "name='" + name + '\'' +
                ", Stat='" + Stat + '\'' +
                '}';
    }
}
