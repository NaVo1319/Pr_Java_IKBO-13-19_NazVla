package ru.mirea.naz.pr24.Q3;

import java.io.File;

public interface IDocument {
    public String getName();
    public void setName(String name);
    public abstract boolean CreateSave();
}
