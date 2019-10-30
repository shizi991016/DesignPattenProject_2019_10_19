package Scene_KFC.Class.ProducerAndComcumer;
/*
 *消费者类，继承自线程，对应仓库为其成员变量
 */
public class Producer extends Thread {
    //生产的数量
    private int num;
    //仓库
    public Storage storage;
    public Producer(Storage storage) {
        this.storage = storage;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void run() {
        storage. produce(num);
    }
}

