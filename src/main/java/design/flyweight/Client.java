package design.flyweight;

public class Client {
	public static void main(String[] args) {
		
		//��������
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		
		//�ͻ�Ҫһ����������ʽ��������վ
		WebSite webSite1 = webSiteFactory.getWebSiteCategory("����");
		webSite1.use(new User("tom"));
		
		//�ͻ�Ҫһ���Բ�����ʽ��������վ
		WebSite webSite2 = webSiteFactory.getWebSiteCategory("����");
		webSite2.use(new User("jim"));
		
		//�ͻ�Ҫһ���Բ�����ʽ��������վ
		WebSite webSite3 = webSiteFactory.getWebSiteCategory("����");
		webSite3.use(new User("jacky"));
		
		System.out.println("��վ�ķ��๲="+webSiteFactory.getWebSiteCount());
		
	}

}
