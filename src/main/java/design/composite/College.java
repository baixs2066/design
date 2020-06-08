package design.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	//������
	public College(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	
	//��дadd����
	@Override
	protected void add(OrganizationComponent org) {
		//ʵ��ҵ���У�College��add�� Univercity��add������һ����ȫһ��
		organizationComponents.add(org);
	}
	//��дremove
	@Override
	protected void remove(OrganizationComponent org) {
		organizationComponents.remove(org);
	}
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
		System.out.println("-----------------------------"+getName()+"---------------------------");
		for(OrganizationComponent org1:organizationComponents) {
			org1.print();
		}
		
	}


}
