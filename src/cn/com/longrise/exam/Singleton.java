package cn.com.longrise.exam;

public class Singleton {
	private static Singleton	singleton	= new Singleton();

	private Singleton() {
	}

	public static Singleton getInstace() {
		return singleton;
	}
}
