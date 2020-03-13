package com.svecw.Collections;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice of list");
		System.out.println("1.ArrayList");
		System.out.println("2.LinkedList");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:Arraylist obj = new Arraylist();
		       obj.arrayList();
		       break;
		case 2:Linkedlist obj1 = new Linkedlist();
		       obj1.linkedList();
		       break;
		}
	}

}
