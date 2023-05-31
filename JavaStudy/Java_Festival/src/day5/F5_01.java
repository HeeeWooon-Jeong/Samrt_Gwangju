package day5;

import java.util.Random;

public class F5_01 {

	public static void main(String[] args) {
		

        int[] num = new int[8];
        Random ran = new Random();
        int max = 0;
        int min = 100;
        int a = 1;
        System.out.print("배열에 있는 모든 값 : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = ran.nextInt(100)+1;
            if(max < num[i]) {
                 max = num[i] ;
            }
            if(min > num[i]) {
                min = num[i];
            }
            System.out.print(num[i]+" ");
            }
            
            
        System.out.println();
        System.out.println("가장 큰 값 : "+max);
        System.out.println("가장 작은 값 : "+min);
        }
		
		
	}


