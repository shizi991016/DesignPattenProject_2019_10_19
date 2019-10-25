package ProducerAndComcumer;
//消费者
public class Consumer extends Thread {
    private int num;//消费的数量
    public Storage storage;//仓库
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