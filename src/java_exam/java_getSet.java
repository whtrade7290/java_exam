package java_exam;

public class java_getSet {
	
	

		int StudentId;
		String studentName;
		int grade;
		String address;
		
		// String을 반환함
		public String getStudentName() {
			return studentName;
		}
		// set메서드는 반환값이 없고, 학생이름을 매개변수로 받는 역할만 하므로 void
		public void setStudentName(String name) {
			studentName = name;
		}
		

	}




