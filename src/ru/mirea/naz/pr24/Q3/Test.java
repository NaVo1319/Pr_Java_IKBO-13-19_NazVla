package ru.mirea.naz.pr24.Q3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Test extends JFrame {
    ArrayList<IDocument> documents=new ArrayList<>();
    ICreateDocument[] create={new CreateImage(),new CreateMusic(),new CreateText()};
    public Test(){
        JFrame frame=new JFrame();
        frame.setBounds(10,10,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menu=new JMenuBar();
        JMenu file=new JMenu("file");
        JMenu New=new JMenu("New");
        JMenuItem Music=new JMenuItem("Music");
        JMenuItem Text=new JMenuItem("Text");
        JMenuItem Image=new JMenuItem("Image");
        JMenuItem Open=new JMenuItem("Open");
        JMenuItem Save=new JMenuItem("Save");
        JMenuItem exit=new JMenuItem("Exit");
        file.add(New);
        New.add(Text);
        New.add(Image);
        New.add(Music);

        file.add(Open);
        file.add(Save);
        file.add(exit);
        menu.add(file);
        menu.setBackground(Color.white);

        frame.setJMenuBar(menu);
        frame.setVisible(true);

        Text.addActionListener(e ->{
            IDocument document=create[2].CreateNew(documents.size()+"");
            documents.add(document);
            JOptionPane.showMessageDialog(frame,
                    "Create document name: "+document.getName());

        });
        Music.addActionListener(e ->{
            IDocument document=create[1].CreateNew(documents.size()+"");
            document.setName(documents.size()+"");
            documents.add(document);
            JOptionPane.showMessageDialog(frame,
                    "Create document name: "+document.getName());
        });
        Image.addActionListener(e ->{
            IDocument document=create[0].CreateNew(documents.size()+"");
            document.setName(documents.size()+"");
            documents.add(document);
            JOptionPane.showMessageDialog(frame,
                    "Create document name: "+document.getName());
        });
        Open.addActionListener(e->{
            String open=JOptionPane.showInputDialog(
                    frame,
                    "Enter name:\n",
                    "Enter name",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    null,
                    "0")+"";
            System.out.println(open);
            for(IDocument x: documents){
                System.out.println(x.getName());
                if(x.getName().equals(open)){
                    create[0].CreateOpen(open,documents);
                    JOptionPane.showMessageDialog(frame,
                            "Open "+x.getName());
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame,
                    "document not found");
        });
        Save.addActionListener(e->{
            for(IDocument x: documents){
                x.CreateSave();
            }
            JOptionPane.showMessageDialog(frame,
                    "Save all");
        });
        exit.addActionListener(e->{
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        new Test();
    }
}
