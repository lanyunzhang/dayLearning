package com.zhang.rpc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 动态代理类，用户可以方便的创建代理对象进行处理
 */
interface CalculatorProtocol{
	public int add(int a, int b);
	public int subtract(int a,int b);
}

class Servers implements CalculatorProtocol{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

}

class CalculatorHandler implements InvocationHandler{
	
	private Object object;
	public CalculatorHandler(Object obj){
		object = obj;
	}

	@Override
	public Object invoke(Object object, Method method, Object[] args)
			throws Throwable {
		Object result = method.invoke(this.object, args);
		return result;
	}
	
}
public class DynamicProxyExample {
	public static void main(String[] args){
		CalculatorProtocol server = new Servers();
		InvocationHandler handler = new CalculatorHandler(server);
		CalculatorProtocol client = (CalculatorProtocol)Proxy.newProxyInstance(
				server.getClass().getClassLoader(),server.getClass().getInterfaces(),handler);
		int r = client.add(5, 3);
		System.out.println(r);
	}
}
