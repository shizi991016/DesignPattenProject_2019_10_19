package Scene_BuyTickets.Class.Pool;

public class DataStack {
    private String userName;
    public DataStack(){
        this.userName = "NONAME";
    }
    public DataStack(String name){
        this.userName = name;
    }

    public void CreateDataStack(){
        System.out.println("Set Data Stack to " + this.userName + "'s Connection");
    }

    public  void DestroyDataStack(){
        System.out.println("Destroy Data Stack");
    }
}
