package design.composite;

public abstract class OrganizationComponent {
	
	private String name;//名字
	private String des;//描述
	//方法print，做成抽象的，子类都需要实现
	protected abstract void  print();
	
	protected void add(OrganizationComponent org) {
		//默认实现     不写成抽象方法，是因为很多leaf叶子节点不具备管理功能，不用再去实现这些抽象方法
		
		throw new UnsupportedOperationException();
	}
	protected void remove(OrganizationComponent org) {
		//默认实现     不写成抽象方法，是因为很多leaf叶子节点不具备管理功能，不用再去实现这些抽象方法
		
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
