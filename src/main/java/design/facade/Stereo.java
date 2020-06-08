package design.facade;
//������
public class Stereo {
	//ʹ�õ���ģʽ��ʹ�ö�ʽ
	private static Stereo instance = new Stereo();
	
	public static  Stereo getInstance() {
		return instance;
	}
	public void on() {
		System.out.println("Stereo on");
	}
	public void off() {
		System.out.println("Stereo off");
	}
	
	public void up() {
		System.out.println("Stereo up");
	}
	public void down() {
		System.out.println("Stereo down");
	}

}
