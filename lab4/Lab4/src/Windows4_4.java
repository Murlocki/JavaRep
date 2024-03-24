import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Windows4_4 {
    public Windows4_4(){
        JFrame frame = new JFrame("Окно верхнего уровня");

        frame.setLayout(new FlowLayout());


        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (b1.isEnabled()){
                    b2.setEnabled(!b2.isEnabled());
                }

            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(b2.isEnabled()){
                    b1.setEnabled(!b1.isEnabled());
                }

            }
        });

        frame.add(b1);
        frame.add(b2);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
