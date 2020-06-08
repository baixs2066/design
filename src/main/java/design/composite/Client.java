package design.composite;

public class Client {
	public static void main(String[] args) {
		
		
		 OrganizationComponent univercity = new Univercity("清华大学","中国顶级大学");
		
		 OrganizationComponent college = new College("计算机学院","计算机");
		 OrganizationComponent college2 = new College("水利学院","水利");
		 
		 OrganizationComponent department = new Department("计算机系","计算机系"); 
		 OrganizationComponent department2 = new Department("水利系","水利系"); 
		 

		 univercity.add(college);
		 univercity.add(college2);
		 college.add(department);
		 college2.add(department2);
		 univercity.print();

		 
		
		
		
	}

}
