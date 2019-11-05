package main;

import Scene_BuyTickets.Test.*;
import Scene_InPark.Test.*;
import Scene_KFC.Class.ProducerAndComcumer.Producer;
import Scene_KFC.Test.*;

import java.awt.image.RescaleOp;
import java.util.Scanner;

public class DesignPattern_main {
	public static void main(String[] args) {

		System.out.println("\n" +"----------------------------------------");
		System.out.println("本测试代码为顺序测试31种设计模式");
		System.out.println("一些设计模式需要用户输入");
		System.out.println("按提示进行输入即可");
		System.out.println("----------------------------------------");

		System.out.println("模式一 前端控制器");
		System.out.println("模式二 简单工厂");
		System.out.println("模式三 过滤器模式");
		System.out.println("模式四 空对象模式");
		System.out.println("模式五 状态模式");
		System.out.println("模式六 代理模式");
		System.out.println("模式七 对象池模式");
		System.out.println("模式八 门面模式");
		System.out.println("模式九 享元模式");
		System.out.println("模式十 单例模式");
		System.out.println("模式十一 抽象工厂模式");
		System.out.println("模式十二 组合模式");
		System.out.println("模式十三 参观者模式");
		System.out.println("模式十四 观察者者模式");
		System.out.println("模式十五 中介模式");
		System.out.println("模式十六 适配器模式");
		System.out.println("模式十七 模板模式");
		System.out.println("模式十八 策略模式");
		System.out.println("模式十九 工厂模式");
		System.out.println("模式二十 解释器模式");
		System.out.println("模式二十一 命令模式");
		System.out.println("模式二十二 备忘录模式");
		System.out.println("模式二十三 迭代器模式");
		System.out.println("模式二十四 多例模式");
		System.out.println("模式二十五 桥接模式");
		System.out.println("模式二十六 原型模式");
		System.out.println("模式二十七 责任链模式");
		System.out.println("模式二十八 不变模式");
		System.out.println("模式二十九 建造者模式");
		System.out.println("模式三十 装饰模式");
		System.out.println("模式三十一 生产者消费者模式");
		System.out.println("----------------------------------------");
		System.out.println("输入数字编号，进入相应的测试");
		System.out.println("如：输入 15 ，进入中介模式测试");
		System.out.println("输入 0 退出测试");

		String type;
		Scanner input = new Scanner(System.in);
		type = input.nextLine();

		while(!type.equals("0"))
		{
			if(type.equals("1"))
			{
				// 模式一 前端控制器
				FrontControllerPatternTest.frontControllerPatternTest();
			}
			else if(type.equals("2"))
			{
				// 模式二 简单工厂
				EasyFactoryPatternTest.easyFactoryPatternTest();
			}
			else if(type.equals("3"))
			{
				// 模式三 过滤器模式
				FilterPatternTest.filterPatternTest();
			}
			else if(type.equals("4"))
			{
				// 模式四 空对象模式
				NullObjectPatternTest.nullObjectPatternTest();
			}
			else if(type.equals("5"))
			{
				// 模式五 状态模式
				StatePatternTest.statePatternTest();
			}
			else if(type.equals("6"))
			{
				// 模式六 代理模式
				ProxyPatternTest.proxyPatternTest();
			}
			else if(type.equals("7"))
			{
				// 模式七 对象池模式
				PoolPatternTest.poolPatternTest();
			}
			else if(type.equals("8"))
			{
				// 模式八 门面模式
				FacadePatternTest.facadePatternTest();
			}
			else if(type.equals("9"))
			{
				// 模式九 享元模式
				FlyweightPatternTest.flyweightPatternTest();
			}
			else if(type.equals("10"))
			{
				// 模式十 单例模式
				SingletonPatternTest.singletonPatternTest();
			}
			else if(type.equals("11"))
			{
				// 模式十一 抽象工厂模式
				AbstractFactoryPatternTest.abstractFactoryPatternTest();
			}
			else if(type.equals("12"))
			{
				// 模式十二 组合模式
				CompositePatternTest.compositePatternTest();
			}
			else if(type.equals("13"))
			{
				// 模式十三 参观者模式
				VisitorPatternTest.visitorPatternTest();
			}
			else if(type.equals("14"))
			{
				// 模式十四 观察者者模式
				ObserverPatternTest.observerPatternTest();
			}
			else if(type.equals("15"))
			{
				// 模式十五 中介模式
				MediatorPatternTest.mediatorPatternTest();
			}
			else if(type.equals("16"))
			{
				// 模式十六 适配器模式
				AdapterPatternTest.adapterPatternTest();
			}
			else if(type.equals("17"))
			{
				// 模式十七 模板模式
				TemplateMethodPatternTest.templateMethodPatternTest();
			}
			else if(type.equals("18"))
			{
				// 模式十八 策略模式
				StrategyPatternTest.strategyPatternTest();
			}
			else if(type.equals("19"))
			{
				// 模式十九 工厂模式
				FactoryPatternTest.factoryPatternTest();
			}
			else if(type.equals("20"))
			{
				// 模式二十 解释器模式
				InterpretPatternTest.interpretPatternTest();
			}
			else if(type.equals("21"))
			{
				// 模式二十一 命令模式
				CommandPatternTest.commandPatternTest();
			}
			else if(type.equals("22"))
			{
				// 模式二十二 备忘录模式
				MementoPatternTest.mementoPatternTest();
			}
			else if(type.equals("23"))
			{
				// 模式二十三 迭代器模式
				IteratorPatternTest.iteratorPatternTest();
			}
			else if(type.equals("24"))
			{
				// 模式二十四 多例模式
				MultitionPatternTest.multitionPatternTest();
			}
			else if(type.equals("25"))
			{
				// 模式二十五 桥接模式
				BridgePatternTest.bridgePatternTest();
			}
			else if(type.equals("26"))
			{
				// 模式二十六 原型模式
				PrototypePatternTest.prototypePatternTest();
			}
			else if(type.equals("27"))
			{
				// 模式二十七 责任链模式
				ResponsibilityPatternTest.responsibilityPatternTest();
			}
			else if(type.equals("28"))
			{
				// 模式二十八 不变模式
				ImmutablePatternTest.immutablePatternTest();
			}
			else if(type.equals("29"))
			{
				// 模式二十九 建造者模式
				BuilderPatternTest.builderPatternTest();
			}
			else if(type.equals("30"))
			{
				// 模式三十 装饰模式
				DecoratorPatternTest.decoratorPatternTest();
			}
			else if(type.equals("31"))
			{
				// 模式三十一 生产者消费者模式
				PAndCPatternTest.pandcPatternTest();
			}
			else
			{
				System.out.println("您的输入有错误，请重新输入");
			}
			System.out.println("输入数字编号，进入相应的测试");
			type = input.nextLine();
		}
	}
	
}
