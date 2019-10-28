package Scene_KFC.Class.ProducerAndComcumer;
//生产者
public class Producer extends Thread {
    private int num;//生产的数量
    public Storage storage;//仓库
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

