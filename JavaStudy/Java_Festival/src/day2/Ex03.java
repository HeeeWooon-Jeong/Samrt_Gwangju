package day2;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int re = 0;
		while(true) {
		int rNum = ran.nextInt(10);
		int rNum2 = ran.nextInt(10);

		System.out.print(rNum +" + "+rNum2+ " = " );
		int num = sc.nextInt();
		
		
		if(rNum + rNum2 == num) {
			System.out.println("SUCCESS!");
		} else {
			System.out.println("Fail..");
			re++;
		if (re >= 5) {
			System.out.println("GAME OVER!");
			break;
			}
		
			}
		}
		
		}
		
	Random ran = new Random();
	
		
		
	}
