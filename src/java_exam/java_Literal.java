package java_exam;

public class java_Literal {

	public static void main(String[] args) {
		// literal이란 프로그램에서 사용하는 모든 숫자, 문자, 논리값을 일컫는 말
		// 숫자가 변수에 대입되는 과정은 일단 숫자값이 메모리 어딘가에 쓰여 있고, 이 값이 다시 변수 메모리에 복사됨
		
		// 형변환(type conversion)
		// 정수화 실수를 더할때, 하나의 자료형으로 통일하여 연산을 해야함.
		// 1. 바이트 크기가 작은 자료형에서 큰자료형으로.
		// 2. 덜 정밀한 자료형에서 더 정밀한 자료형으로.
		
		// 덜 정밀 > 더 정밀
		byte bNum = 10;
		int iNum = bNum;
		System.out.println("int " + iNum);
		
		// 연산 중 자동변환
		int iNum1 = 20;
		float fNum = iNum1;
		double dNum;
		dNum = fNum + iNum1;
		
		System.out.println("float >>> double " + dNum);
		
		

	}

}
