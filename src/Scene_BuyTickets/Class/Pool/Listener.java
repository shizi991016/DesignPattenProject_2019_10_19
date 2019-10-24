package Scene_BuyTickets.Class.Pool;

public class Listener {
    private String userName;
    public Listener(){
        this.userName = "NONAME";
    }
    public Listener(String name){
        this.userName = name;
    }

    public void Listen(){
        System.out.println("Set Listener to " + this.userName + "'s Connection");
    }

    public void DestroyListener(){
        System.out.println("Destroy Listener");
    }
}
