package design.facade;
//投影仪
public class Projector {
	//使用单例模式，使用恶汉式
	private static Projector instance = new Projector();
	
	public static  Projector getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("Projector on");
	}
	public void off() {
		System.out.println("Projector off");
	}

	public void focus() {
		System.out.println("Projector focus");
	}

}
