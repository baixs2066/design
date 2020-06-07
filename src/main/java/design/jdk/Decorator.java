package design.jdk;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Decorator {
	public static void main(String[] args) throws IOException {
		
		//˵��
		//1.InputStream �ǳ����࣬������ǰ�潲��Drink
		//2.FileInputStream �� InputStream �����࣬���� LongBlack����
		//3.FilterInputStream �� InputStream ���࣬����ǰ�潲�� Decorator ������
		//4.DataInputStream �� FilterInputStream ���࣬����������ţ�����ǰ�潲����Milk��Soy��
		//5.FileInputStream ������ protected volatile InputStream in;�����б�װ����
		//6.�����ó�����jdk��io��ϵ��ʹ����װ����ģʽ
		DataInputStream dis = new DataInputStream(new FileInputStream("D:\\���ö������.txt"));
		System.out.println(dis.read());
		dis.close();
	}

}
