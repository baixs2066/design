package design.flyweight;

import java.util.HashMap;

//��վ������ �������󷵻�һ����վ
public class WebSiteFactory {
	//���ϣ��䵱�ص�����
	private HashMap<String,ConcreteWebSite> pool = new HashMap<>();
	
	//������վ���ͣ�����һ����վ�����û�д���һ����վ����������У�������
	public WebSite getWebSiteCategory(String type) {
		if(!pool.containsKey(type)) {
			//����һ����վ���������
			pool.put(type, new ConcreteWebSite(type));
			
		}
		return (WebSite)pool.get(type);
		
	}
	
	//��ȡ��վ����������������ж���ʵ�ʵ���վ���ͣ�
	public int getWebSiteCount() {
		return pool.size();
	}

}
