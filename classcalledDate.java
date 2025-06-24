// create a class called date that includes three fields a month(type int),a day(type int)and a year(type int).provide a constructor that inilizes the three instance variables and assumes that
//the values provided are correct. provide a set and get method for each instance variables.provided a method displayDate that displyas tha month,day and year separated byforward slashes(/).
//write a test application named DateTeast demonstates class Date's capabilities
import java.time.Year;

public class classcalledDate {
	private static int month;
	private int date;
	private int year;
	

	public classcalledDate() {
	
	}
	
	public classcalledDate(int month, int date, int year) {
		super();
		this.month = month;
		this.date = date;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void display() {
		System.out.println(month+"/"+date+"/"+year);
		System.out.println(month+"/"+date+"/"+year);
		
	}

	public static void main(String[] args) {
		classcalledDate date=new classcalledDate(05,22,2005);
		date.display();

	}

}
