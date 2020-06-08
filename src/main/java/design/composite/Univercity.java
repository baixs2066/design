package design.composite;

import java.util.ArrayList;
import java.util.List;

// Univercity 就是 Composite ，可以管理College
public class Univercity extends OrganizationComponent{
	
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	//构造器
	public Univercity(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	
	//重写add方法
	@Override
	protected void add(OrganizationComponent org) {
		System.out.println("调用univercity 的 add 方法");
		organizationComponents.add(org);
	}
	//重写remove
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
	//print方法就是，输出包含的学院
	@Override
	protected void print() {
		System.out.println("-----------------------------"+getName()+"---------------------------");
		for(OrganizationComponent org1:organizationComponents) {
			org1.print();
		}
		
	}

}
