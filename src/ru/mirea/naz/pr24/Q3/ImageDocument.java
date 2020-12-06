package ru.mirea.naz.pr24.Q3;

public class ImageDocument implements IDocument {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean CreateSave() {
        return true;
    }
}
