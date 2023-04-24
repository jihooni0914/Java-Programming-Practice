import java.util.Scanner;
import java.util.ArrayList;

public class Week_1 {	
	public static void dTob(int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while (num > 0) {
			arr.add(num % 2);
			num /= 2;
		}
		
		System.out.print("b ");
		for (int i = arr.size() - 1; i >= 0; i --) {
			System.out.printf("%d", arr.get(i));
		}
		System.out.println();
	}
	
	public static void dToo(int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while (num > 0) {
			arr.add(num % 8);
			num /= 8;
		}
		
		System.out.print("o ");
		for (int i = arr.size() - 1; i >= 0; i --) {
			System.out.printf("%d", arr.get(i));
		}
		System.out.println();
	}
	
	public static void dToh(int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while (num > 0) {
			arr.add(num % 16);
			num /= 16;
		}
		
		System.out.print("h ");
		for (int i = arr.size() - 1; i >= 0; i --) {
			int cur = arr.get(i);
			
			if (cur >= 10) {
				System.out.printf("%c", 'a' + cur - 10);
			}
			else {
				System.out.printf("%d", arr.get(i));				
			}
		}
		System.out.println();
		
	}
	
	public static void convertDecimalTo(char to, int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int div;
		if (to == 'b') {
			div = 2;
		}
		else if (to == 'o') {
			div = 8;
		}
		else if (to == 'h') {
			div = 16;
		}
		else { // may not occur
			div = 10;
		}
		
		while (num > 0) {
			arr.add(num % div);
			num /= div;
		}
		
		System.out.printf("%c ",to);
		for (int i = arr.size() - 1; i >= 0; i --) {
			int cur = arr.get(i);
			
			if (div == 16 && cur >= 10) {
				System.out.printf("%c", 'a' + cur - 10);
			}
			else {
				System.out.printf("%d", arr.get(i));				
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
//		dTob(num);
//		dToo(num);
//		dToh(num);
		convertDecimalTo('b', num);
		convertDecimalTo('o', num);
		convertDecimalTo('h', num);
		
		scn.close();
	}
}
