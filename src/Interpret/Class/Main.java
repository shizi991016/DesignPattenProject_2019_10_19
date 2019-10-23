import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] problems = {"A-01", "B-02", "C-03", "D-04"};
        Ask ask = new Ask();
        Answer answer = Answer.getInstance();
        for (int i = 0; i < problems.length; i++) {
            if(ask.Asking(problems[i])) {
                System.out.println("the '" + problems[i] +"' is: " + answer.getAnswer(problems[i]));
            } else {
                System.out.println("the '" + problems[i] +"' is an incorrect shop ID!");
            }
        }
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