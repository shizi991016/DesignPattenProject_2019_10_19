package Scene_KFC.Test;
import Scene_KFC.Class.Tourist;
public class MultitionPatternTest {

	public static void multitionPatternTest() {
		// TODO Auto-generated method stub
		System.out.println("\n" +"----------------------------------------");
		System.out.println("24. 多例模式(Multition)：");
		System.out.println("\n"+"测试：");
		Tourist tom = new Tourist("tom");
		tom.gotoKFC();
		System.out.println("访问随机单例成功");
		tom.gotoKFC(0);
		tom.gotoKFC(1);
		System.out.println("访问指定单例成功");
        System.out.println("----------------------------------------" + "\n");
	}

}
