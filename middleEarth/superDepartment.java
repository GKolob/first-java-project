package middleEarth;

public class superDepartment {
	String departmentName() {
		
		System.out.println("Super department");
		return "superDepartment";
		
	}
	String getTodaysWork()
	{
		System.out.println("No work as of now");
		return "getTodaysWork" ;
	}
	String getWorkDeadline() {
		System.out.println("nil");
		
		return "getWorkDeadline";
	}
	String isTodayAHoliday() {
		System.out.println("today is not a holiday");
		return  "isTodayAHoliday";
	}
}
