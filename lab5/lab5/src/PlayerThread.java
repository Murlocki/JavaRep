public class PlayerThread extends Thread {
    private int number;
    private final Players playerModel;
    private String colorName;

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public PlayerThread(int number, Players p, String colorName){
        this.playerModel = p;
        this.number = number;
        this.colorName = colorName;
    }
    @Override
    public void run(){
        int i = 0;
        while(true){
            synchronized (playerModel){
                if(this.playerModel.getCurrentPlayer()==this.number){
                    System.out.println(this.number);
                    if(this.playerModel.checkButtonArrayLength()){
                        break;
                    }
                    else{
                        int butNumb = this.playerModel.getButtonNumber();
                        this.playerModel.setButtonColor(butNumb);
                        this.playerModel.addTextToOutPut("Игрок " + this.number+ ",фишка "+ butNumb+" цвета "+this.colorName+"\n");
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        if(this.playerModel.getLabelText()=="Никто"&&this.playerModel.getButtonArrayLength()==3){
                            this.playerModel.setLabelText("Первым закончил "+ this.colorName);
                        }
                    }
                    this.playerModel.setNextPlayer();
                }
            }

        }
    }
}
