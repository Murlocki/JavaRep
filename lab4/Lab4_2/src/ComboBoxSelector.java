import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;

public class ComboBoxSelector extends JComboBox {
    MainController mainController;
    HashMap<String,Integer>dictionary;
    public ComboBoxSelector(HashMap<String,Integer>NamesIds,MainController m){


        super(NamesIds.keySet().toArray(new String[0]));

        this.dictionary = NamesIds;
        this.mainController = m;

        this.setFont(this.getFont().deriveFont((float)17));
        ((JLabel)this.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainController.putInformation(dictionary.get(getSelectedItem()));

            }
        });

    }
    @Override
    public Dimension getMaximumSize() {
        Dimension max = super.getMaximumSize();
        //max.height = getPreferredSize().height;
        max.height=80;
        return max;
    }
}
