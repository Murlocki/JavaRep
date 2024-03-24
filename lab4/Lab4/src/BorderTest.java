import javax.swing.*;
import java.awt.*;

public class BorderTest extends JFrame {
    public BorderTest(String s){
        super(s);
        add(new JButton("NORTH"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("East"), BorderLayout.EAST);

        JTextField tf = new JTextField("Центр");
        tf.setBackground(Color.yellow);
        tf.setForeground(Color.RED);
        tf.setHorizontalAlignment(JTextField.CENTER);
        add(tf);
        setSize(300,200);
        setVisible(true);
    }
}
