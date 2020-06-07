package design.decorator;

public class CoffeeBar {

	public static void main(String[] args) {
		//装饰者模式下的订单：2份巧克力+一份牛奶的Espresso
		
		//1.点一份LongBlack
		Drink order = new LongBlack();
		System.out.println("费用1="+order.cost());
		System.out.println("描述="+order.getDes());
		
		//2.order 加入一份牛奶
		order = new Milk(order);
		
		System.out.println("order 加入一份牛奶="+order.cost());
		System.out.println("order 加入一份牛奶="+order.getDes());
		
		//3.order 加入一份巧克力
		order = new Chocolate(order);
		
		System.out.println("order 加入一份牛奶  加入一份巧克力="+order.cost());
		System.out.println("order 加入一份牛奶  加入一份巧克力="+order.getDes());
		
		//4.order 加入一份巧克力
		order = new Chocolate(order);
		
		System.out.println("order 加入一份牛奶  加入一份巧克力 加入一份巧克力="+order.cost());
		System.out.println("order 加入一份牛奶  加入一份巧克力 加入一份巧克力="+order.getDes());
		
	}

}
