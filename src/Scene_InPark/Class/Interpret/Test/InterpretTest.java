package Test;
import Interpret.*;
import java.util.HashMap;
import java.util.Scanner;

public class InterpretTest {
    public static void main(String[] args) {
        //设定几个默认问题
        String[] problems = {"A-01", "B-02", "C-03", "D-04"};
        //构建解释器环境类
        Ask ask = new Ask();
        //答案类实例
        Answer answer = Answer.getInstance();

        System.out.println("Some examples:");
        for (int i = 0; i < problems.length; i++) {
            if(ask.Asking(problems[i])) {
                System.out.println("the '" + problems[i] +"' is: " + answer.getAnswer(problems[i]));
            } else {
                System.out.println("the '" + problems[i] +"' is an incorrect shop ID!");
            }
        }

        //根据输入进行解释
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to ask again? (1: yes , 0: no): ");
        int flag = sc.nextInt();
        String problem;
        while (flag == 1) {
            System.out.print("Please input the shop ID (such as A-01): ");
            problem = sc.next();
            if(ask.Asking(problem)) {
                System.out.println("the '" + problem +"' is: " + answer.getAnswer(problem));
            } else {
                System.out.println("the '" + problem +"' is an incorrect shop ID!");
            }
            System.out.println("");
            System.out.print("Do you want to ask again? (1: yes , 0: no): ");
            flag = sc.nextInt();
        }
        sc.close();
    }
}