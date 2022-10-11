package hu.webuni.hr.model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
	
	/**
	 * 
	 */
	private String Name;
	private String Position;
	private long FirmNumb;
	private int MonthPrice;
	private int Year;
	private int Month;
	private int Day;
	private int Hour;
	private int Minute;
	
	
	

	LocalDateTime aTime= LocalDateTime.of(Year, Month, Day, Hour, Minute);
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY.MMMM.dd-HH-mm");
	
	//System.out.println(dtf.format(aTime));

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Position=" + Position + ", FirmNumb=" + FirmNumb + ", MonthPrice="
				+ MonthPrice + ", Year=" + Year + ", Month=" + Month + ", Day=" + Day + ", Hour=" + Hour + ", Minute="
				+ Minute + ", aTime=" + aTime + ", dtf=" + dtf + "]";
	}
	
	public String getName() {
		return Name;
	}

	public long getFirmNumb() {
		return FirmNumb;
	}

	public void setFirmNumb(long firmNumb) {
		FirmNumb = firmNumb;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public int getMonthPrice() {
		return MonthPrice;
	}

	public void setMonthPrice(int monthPrice) {
		MonthPrice = monthPrice;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getHour() {
		return Hour;
	}

	public void setHour(int hour) {
		Hour = hour;
	}

	public int getMinute() {
		return Minute;
	}

	public void setMinute(int minute) {
		Minute = minute;
	}

	public LocalDateTime getaTime() {
		return aTime;
	}

	public void setaTime(LocalDateTime aTime) {
		this.aTime = aTime;
	}

	public DateTimeFormatter getDtf() {
		return dtf;
	}

	public void setDtf(DateTimeFormatter dtf) {
		this.dtf = dtf;
	}

	


	
}
