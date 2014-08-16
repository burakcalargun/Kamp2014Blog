package com.linux.kamp;


public class Blog {
	public static void main(String[] args) {

		int input;

		do {
			input = MenuManager.showMainMenu();

			switch (input) {
			case 1:
					MenuManager.createPageMenu();
				break;
			case 2:
					//TODO create post
				break;
			case 3:
					MenuManager.listPages();
				break;
			case 4:
					//TODO list posts
				break;
			case 5:
				System.out.println("Bye bye...");
				break;

			}
		} while (input != 5);
		
		
	}


}
