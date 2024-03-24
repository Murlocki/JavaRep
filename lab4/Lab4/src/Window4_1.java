import javax.swing.*;

public class Window4_1 {
    public Window4_1(){
        JFrame f = new JFrame();
        f.setSize(300,200);
        f.setLocation(500,200);

        JButton b1 = new JButton("But1");
        JButton b2 = new JButton("But2");
        JButton b3 = new JButton("But3");
        JLabel lab = new JLabel("Новая метка");

        f.add(b1);
        f.add(b2);
        f.add(b3);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
