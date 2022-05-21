import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Demo
{
    public String DataDe()
    {
        return "Jay ganesh...";
    }
}

class MarvellousFrame extends WindowAdapter implements ActionListener

{
    public Frame fobj;
    public Button bobj;
    public TextField tobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj = new Button("Marvellous");
        tobj = new TextField();

        tobj.setBounds(60,60,170,20);
        bobj.setBounds(100, 130,90,20);

        fobj.add(bobj);
        fobj.add(tobj);

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        bobj.addActionListener(this);
        fobj.addWindowListener(this);
    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj)
    {
        Demo dobj=new Demo();
        String str=dobj.DataDe();
        tobj.setText(str);   
    }

}

class FrameDemo5
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");

        Scanner sobj=new Scanner((System.in));
        int iNo1=sobj.nextInt();
        int iN02=sobj.nextInt();
    }
}