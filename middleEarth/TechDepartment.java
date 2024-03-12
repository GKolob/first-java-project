package middleEarth;

public class TechDepartment extends superDepartment {
	
		String departmentName() {
			
			System.out.println("Tech department");
			return "departmentName";
			
		}
		String getTodaysWork()
		{
			System.out.println("completed coding of module1");
			return "getTodaysWork";
		}
		String getWorkDeadline() {
			System.out.println("completed EOD");
			return "getWorkDeadline";
		}
		String isTodayAHoliday() {
			System.out.println("core Java");
			return "isTodayAHoliday";
		}
	}

