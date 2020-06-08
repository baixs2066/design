package design.flyweight;

public class Client {
	public static void main(String[] args) {
		
		//创建工程
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		
		//客户要一个以新闻形式发布的网站
		WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
		webSite1.use(new User("tom"));
		
		//客户要一个以博客形式发布的网站
		WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
		webSite2.use(new User("jim"));
		
		//客户要一个以博客形式发布的网站
		WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
		webSite3.use(new User("jacky"));
		
		System.out.println("网站的分类共="+webSiteFactory.getWebSiteCount());
		
	}

}
