package ru.mirea.naz.pr24.Q3;

import java.util.ArrayList;

public interface ICreateDocument {
    public abstract IDocument CreateNew(String name);
    public abstract IDocument CreateOpen(String name, ArrayList<IDocument> documents);
}
