package design.composite;

public abstract class OrganizationComponent {
	
	private String name;//����
	private String des;//����
	//����print�����ɳ���ģ����඼��Ҫʵ��
	protected abstract void  print();
	
	protected void add(OrganizationComponent org) {
		//Ĭ��ʵ��     ��д�ɳ��󷽷�������Ϊ�ܶ�leafҶ�ӽڵ㲻�߱������ܣ�������ȥʵ����Щ���󷽷�
		
		throw new UnsupportedOperationException();
	}
	protected void remove(OrganizationComponent org) {
		//Ĭ��ʵ��     ��д�ɳ��󷽷�������Ϊ�ܶ�leafҶ�ӽڵ㲻�߱������ܣ�������ȥʵ����Щ���󷽷�
		
		throw new UnsupportedOperationException();
	}
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	

}
