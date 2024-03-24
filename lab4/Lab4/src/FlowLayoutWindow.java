import javax.swing.*;
import java.awt.*;

public class FlowLayoutWindow extends JFrame {
    public FlowLayoutWindow(String s){
        super(s);
        setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        add(new JButton("кНОПКА"));
        add(new JLabel("Метка"));
        add(new JCheckBox("Выбор"));
        add(new JComboBox<>());
        add(new JTextField("Ввод",10));
        setSize(300,100);
        setVisible(true);
    }
}
