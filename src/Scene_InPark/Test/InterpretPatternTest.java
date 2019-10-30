package Scene_InPark.Test;

import Scene_InPark.Class.Interpret.Answer;
import Scene_InPark.Class.Interpret.Ask;

import java.util.Scanner;

/**
 * 解释器模式测试类，提供静态函数用于测试
 * 测试中预设几个简单的例子来演示解释器模式
 * 测试后半部分允许输入，对输入进行解释
 */
public class InterpretPatternTest {
    public static void interpretPatternTest() {
        System.out.println("\n" +"classname: (objectid) : method name :action desc");
        System.out.println("----------------------------------------");

        //设定几个默认问题
        String[] problems = {"A-01", "B-02", "C-03", "D-04"};
        //构建解释器环境类
        Ask ask = new Ask();
        //答案类实例
        Answer answer = Answer.getInstance();
        System.out.println("几个例子:");
        for (int i = 0; i < problems.length; i++) {
            if(ask.Asking(problems[i])) {
                System.out.println("编号'" + problems[i] +"'是: " + answer.getAnswer(problems[i]));
            } else {
                System.out.println("编号'" + problems[i] +"'不是正确的店铺编号!");
            }
        }

        //根据输入进行解释
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("是否继续解释? (1: 是 , 0: 否): ");
        int flag = sc.nextInt();
        String problem;
        while (flag == 1) {
            System.out.print("请输入店铺编号 (例如 A-01): ");
            problem = sc.next();
            if(ask.Asking(problem)) {
                System.out.println("编号'" + problem +"'是: " + answer.getAnswer(problem));
            } else {
                System.out.println("编号'" + problem +"'不是正确的店铺编号!");
            }
            System.out.println("");
            System.out.print("是否继续解释? (1: 是 , 0: 否): ");
            flag = sc.nextInt();
        }

        sc.close();
        System.out.println("----------------------------------------" + "\n");
    }
}