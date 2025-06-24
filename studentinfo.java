import java.util.jar.Attributes.Name;

public class studentinfo {
	private String name;
	private int rollno;
	private int marks;
	
	
	public studentinfo() {
		super();
	}



	public studentinfo(String name, int rollno, int marks) {
		
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void display() {
		System.out.println("STUDENT INFORMATION");
		System.out.println("student name="+name);
		System.out.println("student rollno="+rollno);
		System.out.println("student marks="+marks);
	}
	public static void main(String[] args) {
		studentinfo s1=new studentinfo("sarthk",38,20);
		studentinfo s2=new studentinfo("kesh",26,50);
		studentinfo s3=new studentinfo();
		s3.setName("harsh");
		s3.setRollno(15);
		s3.setMarks(100);
	
	    
	    s1.display();
	    s2.display();
	    System.out.println("STUDENT INFORMATION");
	    System.out.println("student name="+s3.getName());
	    System.out.println("student rollno="+s3.getRollno());
	    System.out.println("student marks="+s3.getMarks());
	    
	    
		}

}
