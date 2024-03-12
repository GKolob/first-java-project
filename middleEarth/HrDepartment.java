package middleEarth;

public class HrDepartment extends superDepartment {
	

		String departmentName() {
			
			System.out.println("Hr Department");
			return "departmentName";
			
		}
		String getTodaysWork()
		{
			System.out.println("fill today's timesheet and mark your attendance");
			return "getTodaysWork";
		}
		String getWorkDeadline() {
			System.out.println("completed bu  EOD");
			return "getWorkDeadline";
		}
		String getTechStackInformation() {
			System.out.println("team lunch");
			return "getTechStackInformation";
		}
		
	}


