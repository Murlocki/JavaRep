import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    private JTextArea outPut;
    private JButton startButton;
    private JLabel finishedPlayer;
    public RightPanel(){
        super();
        this.outPut = new JTextArea();
        this.startButton = new JButton("Start");
        this.finishedPlayer = new JLabel("Никто");
    }

    public JButton getStartButton() {
        return startButton;
    }

    public JLabel getFinishedPlayer() {
        return finishedPlayer;
    }

    public JTextArea getOutPut() {
        return outPut;
    }

    public void create(){

        //Границы и размеры панели
        this.setPreferredSize(new Dimension(300,300));
        this.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        //Добавляем заголовок окончания
        this.finishedPlayer.setFont(this.finishedPlayer.getFont().deriveFont((float)17));
        this.finishedPlayer.setAlignmentX(CENTER_ALIGNMENT);
        this.finishedPlayer.setBorder(BorderFactory.createEmptyBorder(0,0,20,0));
        this.add(this.finishedPlayer);


        //this.startButton.setPreferredSize(new Dimension(200,100));
        this.startButton.setMaximumSize(new Dimension(200,50));
        this.startButton.setMinimumSize(new Dimension(200,50));
        this.startButton.setPreferredSize(new Dimension(200,50));
        this.startButton.setAlignmentX(CENTER_ALIGNMENT);
        this.startButton.setFont(this.startButton.getFont().deriveFont((float)17));
        this.startButton.setBackground(new Color(255,255,255));
        this.add(this.startButton);

        //Добавляем панель вывода
        this.outPut.setFont(this.outPut.getFont().deriveFont((float)17));
        //Добавляем ей скролл
        JScrollPane outPutScroll = new JScrollPane(this.outPut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        outPutScroll.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        this.add(outPutScroll);




        BoxLayout boxy = new BoxLayout(this,BoxLayout.Y_AXIS);
        this.setLayout(boxy);
    }
}
