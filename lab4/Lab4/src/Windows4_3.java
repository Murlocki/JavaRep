import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Handler implements ActionListener{
    JButton B;
    public Handler(JButton bb){
        B=bb;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String t = this.B.getText();
        if(Integer.parseInt(t)>1){
            this.B.setText(String.valueOf((Integer.parseInt(t)-1)));
        }
        else{
            System.exit(0);
        }
    }
}
public class Windows4_3 {
    public Windows4_3(){
        JFrame f = new JFrame();
        f.setSize(300,200);
        f.setLocation(500,200);

        JButton b1 = new JButton("10");
        b1.addActionListener(new Handler(b1));

        JPanel panel = new JPanel();
        panel.add(b1);
        f.add(panel);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
