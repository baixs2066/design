package design.composite;

import java.util.ArrayList;
import java.util.List;

// Univercity ���� Composite �����Թ���College
public class Univercity extends OrganizationComponent{
	
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	//������
	public Univercity(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	
	//��дadd����
	@Override
	protected void add(OrganizationComponent org) {
		System.out.println("����univercity �� add ����");
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
