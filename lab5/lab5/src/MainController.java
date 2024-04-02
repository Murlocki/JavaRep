import java.awt.*;

public class MainController {
    private MainWindow mainWindow;
    private Players players;
    public MainController(MainWindow m){
        this.mainWindow=m;
        this.players = new Players(this);
    }
    public void setButtonColor(int i, Color color){
        this.mainWindow.getMainField().getButton(i).setBackground(color);
    }
    public int getButtonsCount(){
        return this.mainWindow.getMainField().getButtons().length;
    }
}
