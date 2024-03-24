import javax.swing.*;
import java.awt.*;

public class BorderPanelTest extends JFrame {
    public BorderPanelTest(String s){
        super(s);

        JPanel p2 = new JPanel();
        JLabel l1 = new JLabel(("Это панель p2"));
        l1.setForeground(Color.BLUE);
        p2.add(l1);
        p2.add(new JButton("Выполнить"));
        p2.add(new JButton("Отменить"));
        p2.add(new JButton("Выйти"));
        p2.setBounds(5,5,5,5);

        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(p2,BorderLayout.SOUTH);
        p1.add(new JTextField("Поле ввода",20),BorderLayout.NORTH);
        JScrollPane sp = new JScrollPane(new JTextArea("Область ввода",20,5));
        p1.add(sp,BorderLayout.CENTER);
        p1.setBorder(BorderFactory.createEtchedBorder(100,Color.RED,Color.BLACK));
        p1.setBounds(5,5,5,5);

        add(p1,BorderLayout.CENTER);
        add(new JButton("Совсем выйти"),BorderLayout.SOUTH);
        setSize(400,200);
        setVisible(true);


    }
}
