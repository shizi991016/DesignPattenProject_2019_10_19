package Scene_KFC.Class.ProducerAndComcumer;
/*
 *消费者类，继承自线程，对应仓库为其成员变量
 */
public class Consumer extends Thread {
    //消费的数量
    private int num;
    //仓库
    public Storage storage;
    public Consumer(Storage storage) {
        this.storage = storage;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void run() {
        storage. consume(num);
    }
}