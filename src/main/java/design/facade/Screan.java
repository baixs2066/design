package design.facade;
//��Ļ
public class Screan {
	//ʹ�õ���ģʽ��ʹ�ö�ʽ
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
