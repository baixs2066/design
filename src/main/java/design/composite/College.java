package design.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();
	
	//构造器
	public College(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	
	//重写add方法
	@Override
	protected void add(OrganizationComponent org) {
		//实际业务中，College的add和 Univercity的add方法不一定完全一样
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
