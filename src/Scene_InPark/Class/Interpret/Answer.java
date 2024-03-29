package Scene_InPark.Class.Interpret;

import java.util.HashMap;

/**
 * 答案类，将各种店的编号与解释结果封装，通过getAnswer()方法获得结果 
 */
public class Answer {
    //存储回答结果的hashmap
    private HashMap<String, String> shopMap = new HashMap<String, String>();

    //类实例对象，单例
    private static Answer answer;

    //构造函数，私有化确保单例
    private Answer() {
        //店的编号
        String[] shopId = {"A-01", "A-02", "A-03",
                            "B-01", "B-02", "B-03",
                            "C-01", "C-02", "C-03", 
                            "D-01", "D-02", "D-03"};
        //编号的解释，与上面一一对应
        String[] shopName = {"A区服装店", "A区食品店", "A区纪念品店",
                            "B区服装店", "B区食品店", "B区纪念品店",
                            "C区服装店", "C区食品店", "C区纪念品店",
                            "D区服装店", "D区食品店", "D区纪念品店"};
        for (int i = 0; i < shopId.length; i++) {
            shopMap.put(shopId[i], shopName[i]);
        }
    }

    //获得单例
    public static Answer getInstance() {
        if(answer == null) {
            answer = new Answer();
        }
        return answer;
    }

    //获得解释结果
    public String getAnswer(String problem) {
        return shopMap.get(problem);
    }
}