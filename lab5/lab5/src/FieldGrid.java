import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FieldGrid {

    private final JButton[] buttons;
    private final int row;
    private final int col;
    private final JPanel mainPanel;
    public FieldGrid(int row,int col){
        super();
        this.row=row;
        this.col=col;
        this.buttons = new JButton[row*col];
        this.mainPanel = new JPanel(new GridLayout(this.row,this.col,2,2));
    }
    public void createField(){
        for(int i = 0 ;i<this.row*this.col;i++){
            buttons[i] = new JButton("");
            buttons[i].setBackground(new Color(255,255,255));
            buttons[i].setPreferredSize(new Dimension(125,125));
            buttons[i].setBorder( new LineBorder(Color.BLACK) );
            mainPanel.add(buttons[i]);
        }

    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JButton[] getButtons() {
        return buttons;
    }
    public JButton getButton(int i){
        return this.buttons[i];
    }
}
