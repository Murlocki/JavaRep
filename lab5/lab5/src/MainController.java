import java.awt.*;

public class MainController {
    private MainWindow mainWindow;
    private Players players;
    public MainController(MainWindow m){
        this.mainWindow=m;
        this.players = null;
    }
    public void setButtonColor(int i, Color color){
        this.mainWindow.getMainField().getButton(i).setBackground(color);
    }
    public int getButtonsCount(){
        return this.mainWindow.getMainField().getButtons().length;
    }

    public String getLabelText(){
        return this.mainWindow.getRightPanel().getFinishedPlayer().getText();
    }
    public void setLabelText(String text){
        this.mainWindow.getRightPanel().getFinishedPlayer().setText(text);
    }

    public void addTextToOutPut(String text){
        this.mainWindow.getRightPanel().getOutPut().append(text);
    }
    public void startCalc(){
        this.mainWindow.getRightPanel().getOutPut().setText("");
        this.setLabelText("Никто");
        for(int i=0;i<this.getButtonsCount();i++){
            this.mainWindow.getMainField().getButton(i).setBackground(new Color(255,255,255));
        }
        this.players=new Players(this);
        this.players.startPlay();
    }
}
