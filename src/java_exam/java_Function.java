package java_exam;

public class java_Function {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다.");

	}
	
	// 함수를 호출하면 그 함수만을 위한 메모리 공간이 할당되는데 Stack이라고 함
	// 멤버변수와 다른 공간에 생성 되므로, 이름이 같든 다르든 상관 없는거임
	// 수행이 끝나면 Stack이 사라짐
	// 스택은 호출된 순서대로 소멸됨
	// 함수의 장점을 살려서 이름에 맞는 하나의 기능을 구현하는 것이 중요함!

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		
		return result;
	}
	
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		
		return result;
	}
	
	public static int multi(int n1, int n2) {
		int result = n1 * n2;
		
		return result;
	}
	
	public static int dvide(int n1, int n2) {
		int result = n1 / n2;
		
		return result;
	}
	

}
