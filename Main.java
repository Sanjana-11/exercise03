package exercise03;

import java.util.Scanner;


class Browser {
	int tabsCount;
	Integer tabsCountValue;

	public void setTabsCount(int tabsCount, Integer tabsCountValue) {
		this.tabsCount = tabsCount;
		this.tabsCountValue = tabsCountValue;
	}

	Integer getTabsCount() {
		Integer newTabsCount = tabsCount;
		return newTabsCount;
	}

	int getTabsCountValue() {
		int newTabsCountValue = tabsCountValue.intValue();
		return newTabsCountValue;
	}
}

public class Main {
	public static void main(String[] args) {

		System.out.println("Enter no. of tabs opened");
		Scanner sc = new Scanner(System.in);
		
		int tabsCount = sc.nextInt();
		Integer tabsCountValue = sc.nextInt();

		Browser browser = new Browser();

		browser.setTabsCount(tabsCount, tabsCountValue);
		System.out.println(browser.getTabsCount());
		System.out.println(browser.getTabsCountValue());

	}

}
