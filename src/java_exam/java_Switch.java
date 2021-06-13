package java_exam;

import java.util.Random;

public class java_Switch {

	public static void main(String[] args) {
		
		char medalColor;
		Random rand = new Random();
		int max = 3;
		int min = 1;
		
		int randNum = rand.nextInt(max + min)+min;
		
		
		switch(randNum) {
		
		case 1 : medalColor = 'G';
				break;
		case 2 : medalColor = 'S';
				break;
		case 3 : medalColor = 'B';
				break;
		default:
				medalColor = 'A';
				
		}
		System.out.println(randNum + "등 메달의 색깔은 " + medalColor + "입니다.");

	}

}
