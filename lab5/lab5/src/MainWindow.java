import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MainWindow extends JFrame {
    private JPanel mainPanel;
    private FieldGrid mainField;
    private RightPanel rightPanel;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public FieldGrid getMainField() {
        return mainField;
    }

    public RightPanel getRightPanel() {
        return rightPanel;
    }

    public MainWindow(String name){
        super(name);
    }
    public void createWindow(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Главная панель
        this.mainPanel = new JPanel();
        BoxLayout mainBox = new BoxLayout(this.mainPanel,BoxLayout.X_AXIS);
        this.mainPanel.setLayout(mainBox);

        //Игровая панель
        this.mainField = new FieldGrid(4,6);
        this.mainField.createField();

        //Боковая панель
        this.rightPanel = new RightPanel();
        this.rightPanel.create();


        this.mainPanel.add(this.mainField.getMainPanel());
        this.mainPanel.add(this.rightPanel);


        this.add(this.mainPanel);
        this.setMinimumSize(new Dimension(1200,580));
        this.pack();
        this.setVisible(true);
    }
}
