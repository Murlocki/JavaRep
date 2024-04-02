import java.awt.*;
import java.util.*;
import java.util.List;

public class Players {
    private int[] playersOrder;
    private int currentPlayer;
    private Color[] playerColors;
    private MainController mainController;

    private ArrayList<Integer>buttonToFill;

    public Players(MainController mainController){
        this.mainController = mainController;
        this.buttonToFill = new ArrayList<Integer>();
        for(int i=0;i<mainController.getButtonsCount();i++){
            this.buttonToFill.add(i);
        }

        //Настраиваем игроков
        this.playersOrder = new int[]{1,2,3,4};
        this.shuffleArray();

        this.currentPlayer = this.playersOrder[0];

        this.playerColors = new Color[]{Color.BLUE,Color.GREEN,Color.RED,Color.ORANGE};
    }

    public void shuffleArray() {
        Random rand = new Random();
        for (int i = this.playersOrder.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = this.playersOrder[i];
            this.playersOrder[i] = this.playersOrder[j];
            this.playersOrder[j] = temp;
        }
    }
    public void setNextPlayer(){
        this.currentPlayer=(this.currentPlayer+1)%4;
    }
    public int getButtonNumber(){
        Random rand = new Random();
        int i = rand.nextInt(this.buttonToFill.size());
        Integer el = this.buttonToFill.get(i);
        this.buttonToFill.remove(el);
        return (int)el;
    }
    public void setButtonColor(int buttonNumber){
        mainController.setButtonColor(buttonNumber,this.playerColors[this.playersOrder[currentPlayer]]);
    }
}
