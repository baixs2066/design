package design.jdk;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Decorator {
	public static void main(String[] args) throws IOException {
		
		//说明
		//1.InputStream 是抽象类，类似于前面讲的Drink
		//2.FileInputStream 是 InputStream 的子类，类似 LongBlack咖啡
		//3.FilterInputStream 是 InputStream 子类，类似前面讲的 Decorator 修饰着
		//4.DataInputStream 是 FilterInputStream 子类，具体的修饰着，类似前面讲过的Milk，Soy等
		//5.FileInputStream 类里有 protected volatile InputStream in;即含有被装饰者
		//6.分析得出，在jdk的io体系中使用了装饰者模式
		DataInputStream dis = new DataInputStream(new FileInputStream("D:\\常用对照语句.txt"));
		System.out.println(dis.read());
		dis.close();
	}

}
