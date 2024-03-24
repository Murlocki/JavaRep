import javax.swing.*;

public class Window4_2 {
    public Window4_2(){
        JFrame f = new JFrame();
        f.setSize(300,200);
        f.setLocation(500,200);

        JButton b1 = new JButton("But1");
        JButton b2 = new JButton("But2");
        JButton b3 = new JButton("But3");
        JButton b4 = new JButton("But4");
        JButton b5 = new JButton("But5");
        JButton b6 = new JButton("But6");
        JButton b7 = new JButton("But7");
        JLabel lab = new JLabel("Новая метка");

        JPanel panel = new JPanel();
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(lab);
        f.add(panel);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
