package Scene_BuyTickets.Test;

import Scene_BuyTickets.Class.Pool.Connection;
import Scene_BuyTickets.Class.Pool.Pool;

import java.util.Scanner;

public class PoolPatternTest {
    public static void poolPatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("9. 对象池模式(PoolPattern):");
        System.out.println("\n测试:");
        System.out.println("当前对象池共有5个空连接等待");
        String select;
        String name;
        Pool pool = new Pool();
        System.out.println("请输入: A: 创建连接 B: 删除链接 C: 退出测试");
        Scanner input = new Scanner(System.in);
        select = input.nextLine();
        while(!select.equals("C"))
        {
            if(select.equals("A"))
            {
                System.out.println("请输入连接名:");
                name = input.nextLine();
                Connection conn = new Connection(name);
                pool.get(conn);
            }
            else if(select.equals("B"))
            {
                System.out.println("请输入连接名:");
                name = input.nextLine();
                Connection conn = new Connection(name);
                pool.release(conn);
            }
            else
            {
                System.out.println("您输入的选项有误，请重新输入");
            }
            System.out.println("请输入: A: 创建连接 B: 断开链接 C: 退出测试");
            select = input.nextLine();
        }
        System.out.println("连接已关闭");
        System.out.println("----------------------------------------" + "\n");
    }
}

//System.out.println("");