package main;

import java.util.Scanner;

import domain.Dish;

public class Restaurant {
    static Scanner sc= new Scanner(System.in);
	Dish[] arr;
    int count;
	public Restaurant() {
       this.arr= new Dish[3];
	}
	
	public void addDishToMenu(Dish dish) {
		if(dish==null) System.out.println("Order details are incomplete");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) {
				arr[i]=dish;
				return;
			}
		}
		System.out.println("Menu List is full !!");
	}
	public void showMenuDishes() {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
			   System.out.println(arr[i]);
			}
		}
	}
	
	
	public Dish modifyPrice(String name) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getName().equals(name)) {
				System.out.println("current price :"+arr[i].getPrice());
				System.out.println("Enter new price :");
				arr[i].setPrice(sc.nextDouble());
				return arr[i];
			}
		}
		return null;
	}
	
	
	public Dish removeDish(String name) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) continue;
			
			
			if(arr[i].getName().equals(name)) {
			      System.out.println("Dish Found :");
			      arr[i]=null;
				   return arr[i];
				
			}
		}
		System.out.println("Dish with this name doesnt exit!!");
		return null;
		
	}
	
}
