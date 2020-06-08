package design.facade;
//屏幕
public class Screan {
	//使用单例模式，使用恶汉式
	private static Screan instance = new Screan();
	
	public static  Screan getInstance() {
		return instance;
	}
	
	public void up() {
		System.out.println("Screan up");
	}
	public void down() {
		System.out.println("Screan down");
	}



}
