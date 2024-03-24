import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;

public class MainController {
    private final MainWindow mainWindow;
    private JPanel mainInformationWindow;
    private final DatabaseConnection mainConnection;
    public MainController(MainWindow m){
        this.mainWindow = m;
        this.mainConnection = new DatabaseConnection();
    }
    public HashMap<String,Integer>getAllNamesAndId(){
        return mainConnection.getAllNamesAndId();
    }
    public void putInformation(int id){
        System.out.println(Arrays.toString(mainConnection.getViaId(id)));
        if(mainInformationWindow!=null) mainWindow.getMainContainer().remove(mainInformationWindow);
        this.mainInformationWindow = new MainInformationWindow(mainConnection.getViaId(id)[0],
                mainConnection.getViaId(id)[1],mainConnection.getViaId(id)[2],mainConnection.getViaId(id)[3]).createInformWindow();
        mainWindow.getMainContainer().add(mainInformationWindow);
        mainWindow.getMainContainer().revalidate();
    }
}
