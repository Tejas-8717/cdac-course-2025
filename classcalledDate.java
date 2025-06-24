import java.time.Month;
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
