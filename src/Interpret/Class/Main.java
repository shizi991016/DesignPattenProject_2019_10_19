import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] shopId = {"A-01", "A-02", "A-03",
                            "B-01", "B-02", "B-03",
                            "C-01", "C-02", "C-03", 
                            "D-01", "D-02", "D-03"};
        String[] shopName = {"District A clothing store", "District A food store", "District A souvenir shop",
                            "District B clothing store", "District B food store", "District B souvenir shop",
                            "District C clothing store", "District C food store", "District C souvenir shop",
                            "District D clothing store", "District D food store", "District D souvenir shop"};
        HashMap<String, String> shopMap = new HashMap<String, String>();
        for (int i = 0; i < shopId.length; i++) {
            shopMap.put(shopId[i], shopName[i]);
        }

        String[] problem = {"A-01", "B-02", "C-03", "D-04"};
        Ask ask = new Ask();
        for (int i = 0; i < problem.length; i++) {
            if(ask.Asking(problem[i])) {
                System.out.println("the '" + problem[i] +"' is: " + shopMap.get(problem[i]));
            } else {
                System.out.println("the '" + problem[i] +"' is an incorrect shop ID!");
            }
        }
    }
}