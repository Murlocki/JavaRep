import javax.swing.*;
import java.awt.*;

public class MainInformationWindow {
    private final String name;
    private final String creator;
    private final float Power;
    private final String imagePath;
    public MainInformationWindow(String name, String creator, String power, String imagePath){
        this.name=name;
        this.creator=creator;
        this.Power= Float.parseFloat(power);
        this.imagePath=imagePath;
    }
    public JPanel createInformWindow(){
        JPanel j =new JPanel(new FlowLayout());
        Container c = new Container();


        c.setLayout(new GridLayout(3,1,5,5));


        JLabel l1 = new JLabel("Модель:"+this.name);
        l1.setFont(l1.getFont().deriveFont((float)20));
        c.add(l1);

        l1 = new JLabel("Производитель:"+this.creator);
        l1.setFont(l1.getFont().deriveFont((float)17));
        c.add(l1);

        l1 = new JLabel("Мощность:"+String.valueOf(this.Power)+" л.c.");
        l1.setFont(l1.getFont().deriveFont((float)17));
        c.add(l1);

        j.add(new ShowImageFrame(imagePath).printImage());
        j.add(c);


        return j;
    }
}
