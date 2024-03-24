import java.awt.*;


public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow m = new MainWindow("Автосалон");
                m.createMainWindow();
            }
        });
    }
}
