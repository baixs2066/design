package design.composite;

public class Department extends OrganizationComponent{
	
	//������
	public Department(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	
	//add ,remove �����Ͳ���Ҫ��д�ˣ���Ϊ��Ҷ�ӽڵ�
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	//print�������ǣ����������ѧԺ
	@Override
	protected void print() {
		System.out.println(getName());
		
	}



}
