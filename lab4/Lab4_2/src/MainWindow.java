import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainWindow extends JFrame {
    private final MainController mainController;
    private Container mainContainer;


    public Container getMainContainer() {
        return mainContainer;
    }

    public MainWindow(String title){
        super(title);
        this.mainController = new MainController(this);

    }
    public void createMainWindow(){

        setSize(1200,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        this.mainContainer = getContentPane();
        BoxLayout boxLayout = new BoxLayout(mainContainer,BoxLayout.Y_AXIS);
        mainContainer.setLayout(boxLayout);

        ComboBoxSelector c = new ComboBoxSelector(this.mainController.getAllNamesAndId(),this.mainController);

        mainContainer.add(c);
        c.setSelectedIndex(1);

        setVisible(true);
    }
}
