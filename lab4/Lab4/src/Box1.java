import javax.swing.*;
import java.awt.*;

public class Box1 extends JFrame {
    public Box1(){
        super("Box-Y");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c =getContentPane();
        BoxLayout boxy = new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(boxy);
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        setVisible(true);
    }
}
class Box2 extends JFrame{
    public Box2(){
        super("Box2");
        setSize(400,200);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        BoxLayout boxx = new BoxLayout(c,BoxLayout.X_AXIS);
        c.setLayout(boxx);
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        setVisible(true);
    }
}
