package design.jdk;

public class FlyWeight {
	
	public static void main(String[] args) {
		//��� Integer.valueOf(x) x �� -128 ----- 127 ֮�� ������ʹ����Ԫģʽ����
		//�����˷�Χ ����Ȼ new
		
		//С�᣺
		//1.�� valueOf �����У����ж� ֵ�Ƿ��� IntegerCache �У�������ڣ��ʹ����µ�Integer��new)�����򣬾�ֱ�Ӵӻ�����л�ȡ��������
		Integer x = Integer.valueOf(127); //�õ� x ʵ�������� Integer
		Integer y = new Integer(127);
		Integer z = Integer.valueOf(127);
		Integer w = new Integer(127);
		System.out.println(x.equals(y));// �Ƚϴ�С   ��true
		System.out.println(x == y);// �ǲ���ͬһ������ false
		System.out.println(x == z);//true
		System.out.println(w == x);//false
		System.out.println(w == y);//false
		
		Integer x1 = Integer.valueOf(200);
		Integer x2 = Integer.valueOf(200);
		System.out.println(x1==x2);//false
	}

}
