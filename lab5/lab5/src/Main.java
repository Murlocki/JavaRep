import java.awt.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class MyThread extends Thread{
    private final Object number;
    public MyThread(int n){
        this.number = n;
    }
    @Override
    public void run() {
        int i = 0;

        while(i>=0){
            synchronized (number){
                if((Integer)number==2){
                    System.out.println(Thread.currentThread().getName() + " Number: " + i);
                }
            }
            i=i+1;
            System.out.println(i);
            if(i==100){
                break;
            }

        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        new MyThread(1).start();
//        new MyThread(2).start();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow m = new MainWindow("Лото");
                m.createWindow();
            }
        });

    }
}