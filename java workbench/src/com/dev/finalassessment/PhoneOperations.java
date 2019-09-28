package com.dev.finalassessment;

import java.util.Scanner;

public class PhoneOperations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		PhoneImpl p = new PhoneImpl();
		Phone sravya = p.createContact("sravya", 1987654329, "friend");
		Phone sree = p.createContact("bobby", 87654321, "college");

		p.addContact("sravya", sravya);
		p.addContact("sree", sree);
		int i1 = 1;
		while (i1 == 1) {
			System.out.println("Enter your choice");
			System.out.println("1.Show all contacts");
			System.out.println("2.Search contacts");
			System.out.println("3.Edit contacts");

			int i = scn.nextInt();
			if (i == 1) {
				p.showContact();
			} else if (i == 2) {
				System.out.println("Enter a name for searching..");
				String name = scn.next();

				p.searchHere(name);
				System.out.println("Enter your choice");
				System.out.println("1.call");
				System.out.println("2.Meaasge");
				System.out.println("3.Show MainMenu");

				int l = scn.nextInt();
				if (l == 1) {
					System.out.println("Calling to " + name);
					System.out.println("Enter 1 to end the call");
					if (scn.nextInt() == 1) {
						System.out.println("Call ended");
					}

				} else if (l == 2) {
					System.out.println("Enter your message ");
					String msg = scn.next();
					System.out.println("Sending your message to " + name + " and message is " + msg);
				} else if (l == 3) {
					System.out.println("Going back to main menu");

				}

			} else if (i == 3) {
				System.out.println("Enter your choice");
				System.out.println("1.add");
				System.out.println("2.delete");
				System.out.println("3.Update");
				int n = scn.nextInt();
				if (n == 1) {
					System.out.println("Enter name");
					String name = scn.next();
					System.out.println("Enter number");
					long number = scn.nextLong();
					System.out.println("Enter Group");
					String group = scn.next();
					Phone c4 = p.createContact(name, number, group);
					p.addContact(name, c4);
					p.showContact();
					System.out.println(name + " contact added successfull...!");
				} else if (n == 2) {
					System.out.println("Enter Object to Delete Contact");
					String m = scn.next();
					p.removeContact(p.searchHere(m));
					p.showContact();
				} else if (n == 3) {
					System.out.println("Enter Object to edit ");
					Phone edit = p.searchHere(scn.next());
					System.out.print("Enter name :");
					edit.setName(scn.next());
					System.out.print("Enter number to edit :");
					edit.setNumber(scn.nextLong());
					System.out.print("Enter group to edit :");
					edit.setGroup(scn.next());
					p.showContact();
				}

			}
		System.out.println("enter 1 continue ");
		i1=scn.nextInt();
		}
	}

}
