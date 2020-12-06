package ru.mirea.naz.pr24.Q3;

import java.util.ArrayList;

public class CreateImage implements ICreateDocument {
    @Override
    public IDocument CreateNew(String name) {
        IDocument document=new ImageDocument();
        document.setName(name);
        return document;
    }

    @Override
    public IDocument CreateOpen(String name, ArrayList<IDocument> documents) {
        for(IDocument x: documents){
            if(x.getName()==name){
                return x;
            }
        }
        return null;
    }
}
