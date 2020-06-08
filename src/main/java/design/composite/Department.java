package design.composite;

public class Department extends OrganizationComponent{
	
	//构造器
	public Department(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	
	//add ,remove 方法就不需要重写了，因为是叶子节点
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
		System.out.println(getName());
		
	}



}
