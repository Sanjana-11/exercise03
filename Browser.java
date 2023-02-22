package exercise03;

import java.util.Scanner;

public class Browser {
	public static void main(String[] args) {
		System.out.println("Enter the number of tabs opened");
		Scanner sc = new Scanner(System.in);
		
		int tabsCount = sc.nextInt();		
		Integer newtabsCount = tabsCount;    
		
		int numTabs = newtabsCount;			
		System.out.println(numTabs);
	}
}
