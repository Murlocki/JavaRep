class MyThread extends Thread{

    BlockingQueue<String> in;
    BlockingQueue<String> out;

    public MyThread(BlockingQueue<String> in, BlockingQueue<String> out){
        this.in = in;
        this.out = out;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                in.take();
                System.out.println(Thread.currentThread().getName() + " Number: " + i);
                out.put("your turn");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> t1t2 = new LinkedBlockingQueue<>(1);
        BlockingQueue<String> t2t1 = new LinkedBlockingQueue<>(1);
        new MyThread(t1t2, t2t1).start();
        new MyThread(t2t1, t1t2).start();
        t1t2.put("Start");
    }
}