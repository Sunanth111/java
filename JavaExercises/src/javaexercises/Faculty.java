package javaexercises;


class Faculty extends Person{
	int Id;
	String facultyposition;
	
	public void addDetails() {
		
		super.addDetails();
		
		System.out.println("Enter FacultyId:");
		Id=sc.nextInt();
		
		System.out.println("Enter faculty Position:");
		facultyposition=sc.next();
		
	}
	
	public void dispDetails() {
		
		System.out.println(Id);
		System.out.println(facultyposition);
		
		
	}
}

