package design.jdk;

public class FlyWeight {
	
	public static void main(String[] args) {
		//如果 Integer.valueOf(x) x 在 -128 ----- 127 之间 ，就是使用享元模式返回
		//超出了范围 ，仍然 new
		
		//小结：
		//1.在 valueOf 方法中，先判断 值是否在 IntegerCache 中，如果不在，就创建新的Integer（new)，否则，就直接从缓存池中获取，并返回
		Integer x = Integer.valueOf(127); //得到 x 实例，类型 Integer
		Integer y = new Integer(127);
		Integer z = Integer.valueOf(127);
		Integer w = new Integer(127);
		System.out.println(x.equals(y));// 比较大小   ，true
		System.out.println(x == y);// 是不是同一个对象 false
		System.out.println(x == z);//true
		System.out.println(w == x);//false
		System.out.println(w == y);//false
		
		Integer x1 = Integer.valueOf(200);
		Integer x2 = Integer.valueOf(200);
		System.out.println(x1==x2);//false
	}

}
