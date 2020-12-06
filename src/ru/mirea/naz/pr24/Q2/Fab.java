package ru.mirea.naz.pr24.Q2;

public class Fab implements AbstractFab {

    @Override
    public VicChair MakeVicChair(String a,String b) {
        return new VicChair(a,b);
    }

    @Override
    public MagicChair MakeMagicChair(String a,String b) {
        return new MagicChair(a,b);
    }

    @Override
    public FuncChair MakeFuncChair(String a,String b) {
        return new FuncChair(a,b);
    }

}
