package java_exam;

public class java_Literal2 {

	public static void main(String[] args) {
		
		// 묵시적 형 변환 
		// 바이트 크기가 작은 자료형에서 큰 자료형으로
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println("byte " + bNum);
		System.out.println("int " + iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println("int " + iNum);
		System.out.println("float " + fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		System.out.println("double > " + dNum);
		
		// 명시적 형 변환
		// 바이트 크기가 큰 자료형에서 작은 자료형으로
		
		int iNum1 = 10;
		byte bNum1 = (byte)iNum1; // (byte) 강제 형변환
		
		System.out.println("byte " + bNum1);
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int)dNum1  + (int)fNum2;
		// dNum1 == 1  fNum2 == 0
		int iNum4 = (int)(dNum1 + fNum2);
		// dNum1 == 1  fNum2 == 1
		System.out.println("iNum3 = " + iNum3);
		System.out.println("iNum4 = " + iNum4);
		
		
		
		
		
	}

}
