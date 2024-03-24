//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        new Box1();
//        new Box2();


//        JFrame f = new GridTest("Пкшв");
//        f.setLocation(400,200);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//        JFrame f = new BorderTest("V");
//        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        JFrame f = new BorderPanelTest("V");
//        f.setLocation(400,200);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        JFrame f = new FlowLayoutWindow("Менеджер");
//        f.setLocation(400,200);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Window4_2 b = new Window4_2();

//        Window4_1 a = new Window4_1();

//        Windows4_3 p = new Windows4_3();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Windows4_4 a = new Windows4_4();
            }
        });
    }
}