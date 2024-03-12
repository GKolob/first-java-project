package middleEarth;

public class AdminDepartment extends superDepartment {
	
		String departmentName() {
			
			
			System.out.println("Admin Department");
			return "departmentName";
			
		}
		String getTodaysWork()
		{
			System.out.println("complete your documents");
			return "getTodaysWorkgetTodaysWork" ;
		}
		String getWorkDeadline() {
			System.out.println("completed by EOD");
			return "getWorkDeadline";
		}
		
	}
	

