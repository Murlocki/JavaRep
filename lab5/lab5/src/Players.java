import java.awt.*;
import java.util.*;
import java.util.List;

import static java.lang.System.gc;

public class Players {
    private ArrayList<Integer> playersOrder;
    private PlayerThread[] playerThreads;
    private int currentPlayer;
    private int winner;
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
        this.playersOrder = new ArrayList<>();
        for(int i=0;i<4;i++){
            this.playersOrder.add(i);
        }
        this.shuffleArray();

        this.currentPlayer = this.playersOrder.getFirst();
        this.winner = 0;

        this.playerColors = new Color[]{Color.BLUE,Color.GREEN,Color.RED,Color.ORANGE};
        this.playerThreads = new PlayerThread[1];
    }

    public void addTextToOutPut(String text){
        this.mainController.addTextToOutPut(text);
    }

    public void startPlay(){
        System.out.println(playersOrder);
        this.currentPlayer = this.playersOrder.getFirst();
        for (PlayerThread playerThread : this.playerThreads) {
                if(playerThread!=null){
                    playerThread.interrupt();
                }
            System.out.println(222222);
        }
        gc();
        //Создаем новый массив потоков
        this.playerThreads = new PlayerThread[4];
        String[] colorNames = new String[]{"Синий","Зеленый","Красный","Оранжевый"};
        for (int i=0;i<this.playerThreads.length;i++) {
            if(this.playerThreads!=null){
                this.playerThreads[i]=new PlayerThread(this.playersOrder.get(i),this,colorNames[this.playersOrder.get(i)]);
            }
            else{
                this.playerThreads[i].setNumber(this.playersOrder.get(i));
                this.playerThreads[i].setColorName(colorNames[this.playersOrder.get(i)]);
            }
        }
        for (PlayerThread playerThread : this.playerThreads) {
            playerThread.start();
        }
    }
    public void shuffleArray() {
        Random rand = new Random();
        for (int i = this.playersOrder.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = this.playersOrder.get(i);
            this.playersOrder.set(i, this.playersOrder.get(j));
            this.playersOrder.set(j, temp);
        }
    }
    public void setNextPlayer(){

        this.currentPlayer=this.playersOrder.get(((this.playersOrder).indexOf((Integer)this.currentPlayer)+1)%4);
    }
    public boolean checkButtonArrayLength(){
        if(this.buttonToFill.isEmpty()){
            return true;
        }
        return false;
    }
    public int getCurrentPlayer() {
        return this.currentPlayer;
    }

    public int getButtonNumber(){
        Random rand = new Random();
        int i = rand.nextInt(this.buttonToFill.size());
        Integer el = this.buttonToFill.get(i);
        this.buttonToFill.remove(el);
        return (int)el;
    }
    public int getButtonArrayLength(){
        return this.buttonToFill.size();
    }
    public void setButtonColor(int buttonNumber){
        mainController.setButtonColor(buttonNumber,this.playerColors[this.playersOrder.get(currentPlayer)]);
    }
    public String getLabelText(){
        return this.mainController.getLabelText();
    }
    public void setLabelText(String text){
        this.mainController.setLabelText(text);
    }
}
