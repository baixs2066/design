package design.composite;

public class Client {
	public static void main(String[] args) {
		
		
		 OrganizationComponent univercity = new Univercity("�廪��ѧ","�й�������ѧ");
		
		 OrganizationComponent college = new College("�����ѧԺ","�����");
		 OrganizationComponent college2 = new College("ˮ��ѧԺ","ˮ��");
		 
		 OrganizationComponent department = new Department("�����ϵ","�����ϵ"); 
		 OrganizationComponent department2 = new Department("ˮ��ϵ","ˮ��ϵ"); 
		 

		 univercity.add(college);
		 univercity.add(college2);
		 college.add(department);
		 college2.add(department2);
		 univercity.print();

		 
		
		
		
	}

}
