package main;

import Scene_BuyTickets.Test.*;
import Scene_InPark.Test.*;
import Scene_KFC.Class.ProducerAndComcumer.Producer;
import Scene_KFC.Test.*;

import java.awt.image.RescaleOp;

public class DesignPattern_main {
	public static void main(String[] args) {

		System.out.println("\n" +"----------------------------------------");
		System.out.println("本测试代码为顺序测试31种设计模式");
		System.out.println("一些设计模式需要用户输入");
		System.out.println("按提示进行输入即可");
		System.out.println("----------------------------------------");

		
		// 模式一 前端控制器
		FrontControllerPatternTest.frontControllerPatternTest();

		// 模式二 简单工厂
		EasyFactoryPatternTest.easyFactoryPatternTest();

		// 模式三 过滤器模式
		FilterPatternTest.filterPatternTest();

		// 模式四 空对象模式
		NullObjectPatternTest.nullObjectPatternTest();

		// 模式五 状态模式
		StatePatternTest.statePatternTest();

		// 模式六 代理模式
		ProxyPatternTest.proxyPatternTest();

		// 模式七 对象池模式
		PoolPatternTest.poolPatternTest();

		// 模式八 门面模式
		FacadePatternTest.facadePatternTest();

		// 模式九 享元模式
		FlyweightPatternTest.flyweightPatternTest();

		// 模式十 单例模式
		SingletonPatternTest.singletonPatternTest();

		// 模式十一 抽象工厂模式
		AbstractFactoryPatternTest.abstractFactoryPatternTest();

		// 模式十二 组合模式
		CompositePatternTest.compositePatternTest();

		// 模式十三 参观者模式
		VisitorPatternTest.visitorPatternTest();

		// 模式十四 观察者者模式
		ObserverPatternTest.observerPatternTest();

		// 模式十五 中介模式
		MediatorPatternTest.mediatorPatternTest();

		// 模式十六 适配器模式
		AdapterPatternTest.adapterPatternTest();

		// 模式十七 模板模式
	  	TemplateMethodPatternTest.templateMethodPatternTest();

		// 模式十八 策略模式
	  	StrategyPatternTest.strategyPatternTest();

	  	// 模式十九 工厂模式
	  	FactoryPatternTest.factoryPatternTest();

	  	// 模式二十 解释器模式
	  	InterpretPatternTest.interpretPatternTest();

	  	// 模式二十一 命令模式
	  	CommandPatternTest.commandPatternTest();

	  	// 模式二十二 备忘录模式
	  	MementoPatternTest.mementoPatternTest();

	  	// 模式二十三 迭代器模式
	  	IteratorPatternTest.iteratorPatternTest();

		// 模式二十四 多例模式
		MultitionPatternTest.multitionPatternTest();

		// 模式二十五 桥接模式
		BridgePatternTest.bridgePatternTest();

		// 模式二十六 原型模式
		PrototypePatternTest.prototypePatternTest();

		// 模式二十七 责任链模式
		ResponsibilityPatternTest.responsibilityPatternTest();

		// 模式二十八 不变模式
		ImmutablePatternTest.immutablePatternTest();

		// 模式二十九 建造者模式
		BuilderPatternTest.builderPatternTest();

		// 模式三十 装饰模式
		DecoratorPatternTest.decoratorPatternTest();

		// 模式三十一 生产者消费者模式
		PAndCPatternTest.pandcPatternTest();
	}

}
