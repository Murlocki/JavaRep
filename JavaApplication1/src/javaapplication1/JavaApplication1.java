import java.awt.*;
import java.awt.event.*;

//class SimpleFrame extends Frame{
//        public SimpleFrame(String s){
//            super(s);
//            setSize(400,150);
//            setVisible(true);
//            addWindowListener(new WindowAdapter(){
//                public void windowClosing(WindowEvent ev){
//                    dispose();
//                    System.exit(0);
//                }
//            
//            });
//        }
//        public static void main(String[] args) {
//            new SimpleFrame("Моя программа"); 
//        } 
//    }

//class HelloWorldFrame extends Frame{
//    HelloWorldFrame(String s){
//        super(s);
//    }
//    public void paint(Graphics g){
//        g.setFont(new Font("Serif",Font.ITALIC|Font.BOLD,30));
//        g.drawString("Hello, 21 century wolrd!",20,100);
//    }
//     public static void main(String[] args) {
//        Frame f = new HelloWorldFrame("Здравствуй, мир XXI века!");
//        f.setSize(400, 150);
//        f.setVisible(true);
//        f.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent ev) {
//                f.dispose();
//                System.exit(0);
//            }
//        });
//    } 
//}

class GraphTest01 extends Frame{
    GraphTest01(String s){
        super(s);
        setBounds(0,0,500,300);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        Dimension d = getSize();
        int dx = d.width/20, dy=d.height/20;
        int myWidth = 250, myHeight=250;
        g.drawLine(0,0,myWidth,myHeight);
        g.drawLine(0,0, d.width, d.height);
        g.setColor(Color.red);
        g.fillOval(d.width/2, d.height/2, 30, 30);
        g.setColor(Color.green);
        g.drawRect(0,0,100,100);
        g.setColor(Color.yellow);
        g.fillRect(50, 50, 60, 60);
        g.fillRoundRect(110,100,30,30,25,25);
        g.setColor(Color.black);
        g.drawArc(40,40,100,1000,40,180);
        setBackground(Color.blue);
    }
    public static void main(String[] args){
        Frame f = new GraphTest01("ff");
    }

}

//public class JavaApplication1 {
// 
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//        Calculator calc = new Calculator();
//        System.out.println("2+2="+calc.sum(2,2));
//        
//        //SimpleFrame a = new SimpleFrame("FFFF");
//        
//        //Frame f = new HelloWorldFrame("ffff");
//        //f.setSize(400,150);
//        //f.setVisible(true);
//        //f.addWindowListener(new WindowAdapter(){
//        //    public void windowClosing(WindowEvent ev){
//        //        System.exit(0);
//        //    }
//        //});
//        //Frame f = new GraphTest01("ff");
//    }
//    
//    public static class Adder{
//        private int sum;
//        public Adder(){sum=0;}
//        public Adder(int a){this.sum=a;}
//        
//        public void add(int b){
//            sum+=b;
//        }
//        public int getSum(){return sum;}
//    }
//    public static class Calculator{
//        public int sum(int... a){
//            Adder adder = new Adder();
//            for(int i:a){
//                adder.add(i);
//            }
//            return adder.getSum();
//        }
//    }
//    
//    
//}
