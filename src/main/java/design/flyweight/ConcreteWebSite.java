package design.flyweight;
//������վ
public class ConcreteWebSite extends WebSite{
	
	private String type ="";//��վ��������ʽ�����ͣ�
	@Override
	public void use(User user) {
		System.out.println("��վ�ķ�����ʽΪ:"+type+ "��ʹ���С�����ʹ�����ǣ�"+user.getName());
		
	}
	//������
	public ConcreteWebSite(String type) {
		this.type = type;
		
	}

}
