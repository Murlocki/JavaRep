import javax.swing.*;
import java.awt.*;
import java.util.StringTokenizer;

public class GridTest extends JFrame {
    public GridTest(String s){
        super(s);
        setLayout(new GridLayout(4,4,5,5));

        StringTokenizer st = new StringTokenizer("7 8 9 / 4 5 6 * 1 2 3 - 0 .=+");
        while(st.hasMoreTokens())
            add(new JButton(st.nextToken()));
        setSize(200,200);
        setVisible(true);
    }
}
