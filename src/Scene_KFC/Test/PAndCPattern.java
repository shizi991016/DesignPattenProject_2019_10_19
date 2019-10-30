
package Scene_KFC.Test;
import Scene_KFC.Class.ProducerAndComcumer.*;
public class PAndCPattern {
    public static void pandcPattern (String[] args)
    {
        System.out.println("\n" +"----------------------------------------");
        System.out.println("26.生产者消费者模式(Producer consumer Pattern)：");
        System.out.println("\n"+"测试一：");

        Storage storage = new Storage();
        Producer p1 = new Producer(storage);
        Producer p2 = new Producer(storage);
        Producer p3 = new Producer(storage);
        Producer p4 = new Producer(storage);
        Producer p5 = new Producer(storage);

        Consumer c1 = new Consumer(storage);
        Consumer c2 = new Consumer(storage);
        Consumer c3 = new Consumer(storage);
        p1.setNum(10);
        p2.setNum(20);
        p3.setNum(10);
        p4.setNum(80);
        p5.setNum(10);
        c1.setNum(50);
        c2.setNum(20);
        c3.setNum(20);
        c1.start();
        c2.start();
        c3.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        System.out.println("\n" +"----------------------------------------");
    }
}
