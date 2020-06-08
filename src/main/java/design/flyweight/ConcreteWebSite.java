package design.flyweight;
//具体网站
public class ConcreteWebSite extends WebSite{
	
	private String type ="";//网站发布的形式（类型）
	@Override
	public void use(User user) {
		System.out.println("网站的发布形式为:"+type+ "在使用中。。。使用者是："+user.getName());
		
	}
	//构造器
	public ConcreteWebSite(String type) {
		this.type = type;
		
	}

}
