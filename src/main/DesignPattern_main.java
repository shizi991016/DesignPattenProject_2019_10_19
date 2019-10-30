package main;

import Scene_BuyTickets.Test.*;
import Scene_InPark.Test.*;
import Scene_KFC.Test.BuilderPatternTest;
import Scene_KFC.Test.MultitionPatternTest;

public class DesignPattern_main {
	public static void main(String[] args) {
		// 模式一 前端控制器
		FrontControllerTest.frontControllerTest();
		// 模式二 简单工厂
		EasyFactoryTest.easyFactoryTest();
		// 模式三 过滤器模式
		FilterPatternTest.filterPatternTest();
		// 模式四 空对象模式
		NullObjectTest.nullObjectTest();
		// 模式五 状态模式
		StatePatternTest.statePatternTest();
		// 模式六 代理模式
		ProxyPatternTest.proxyPatternTest();

		// 模式八 门面模式
		FacadePatternTest.facadePatternTest();
	}

}
