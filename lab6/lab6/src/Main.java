import java.util.concurrent.Semaphore;

class Barbers {
    private static int time=0;
    private static int queueTime=0;
    private static int revenue = 0;
    private static final boolean[] barbersChair= new boolean[4];
    private static final Semaphore SEMAPHORE = new Semaphore(4,true);
    public static void main(String[] args) throws InterruptedException {
        int i=1;
        while (time<=13800){ // запускаем 5 машинок
            new Thread(new Client(i)).start();
            Thread.sleep(400);
            time+=400;
            i=i+1;
        }
        Thread.sleep(10000);
        System.out.println("Общая выручка:"+revenue);
        System.out.println("Время образования очереди:"+queueTime);

    }
    public static class Client implements Runnable{
        private final int clientNumber;
        public Client(int numb){
            this.clientNumber = numb;
        }
        @Override
        public void run(){
            System.out.println("Клиент номер "+this.clientNumber+" пришел");
            try {
                if(!SEMAPHORE.tryAcquire()){
                    System.out.println("Занято все");
                    queueTime=time;
                }
                SEMAPHORE.release();

                SEMAPHORE.acquire();
                int barberNumber=-1;
                synchronized (barbersChair){
                    for(int i=0;i<4;i++){
                        if(!barbersChair[i]){
                            barbersChair[i]=true;
                            barberNumber=i;
                            System.out.println("Клиент "+this.clientNumber +" сел на место "+barberNumber);
                            break;
                        }
                    }
                }
                Thread.sleep(600);
                revenue+=600;
                synchronized (barbersChair){
                    barbersChair[barberNumber]=false;
                    SEMAPHORE.release();
                    System.out.println("Клиент "+this.clientNumber+" ушел");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


