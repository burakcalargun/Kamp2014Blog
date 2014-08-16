package com.linux.kamp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.linux.kamp.model.Page;

public class MenuManager {
	public static int showMainMenu() {
		System.out.println("============ Main Menu ==============");
		System.out.println("1 - Create Page");
		System.out.println("2 - Create Post");
		System.out.println("3 - List Pages");
		System.out.println("4 - List Posts");
		System.out.println("5 - Quit");

		Scanner reader = new Scanner(System.in);

		System.out.println("Choose menu item >");
		int input = reader.nextInt();

		System.out.println("==========================");
		return input;
	}

	public static void createPageMenu() {
		Scanner reader = new Scanner(System.in);
		System.out.println("---------- Create Page -------------");

		System.out.println("Page title:");
		String title = reader.nextLine();

		System.out.println("Page content:");
		String content = reader.nextLine();

		Page page = new Page(title, content);
		StorageManager.addPage(page);

		System.out.println("Your page is created successfully");
		System.out.println("------------------------------");
	}

	public static int listPages() {
		Scanner reader = new Scanner(System.in);
		System.out.println("---------- List Pages -------------");

		System.out.println("Page list");

		printListOfPages(StorageManager.getPages());

		System.out.println("Enter page number to see:");
		int input = reader.nextInt();

		input = input - 1;// WHY?

		Page page = StorageManager.getPages().get(input);
		showPage(page);

		System.out.println("------------------------------");
		return -1;// return to main menu

	}

	private static void printListOfPages(List<Page> list) {
		int index = 1;
		for (Page page : list) {
			System.out.println(index + " - " + page.getTitle());
			index++;
		}
	}

	private static void showPage(Page page) {

		System.out.println("---------- Showing Page -------------");

		// TODO show the page here

		System.out.println("C to add comment");
		System.out.println("M to return to main menu");
		System.out.println("> ");

		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		switch (input.toLowerCase()) {
		case "c":
			System.out.println("adding comment");
			// TODO add comment to the page
			break;
		case "m":
			System.out.println("returning to main menu");
			break;
		default:
			System.out.println("Wrong input, returning to main menu...");
			break;
		}

	}
}
