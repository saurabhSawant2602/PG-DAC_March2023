
package main;

import java.util.Scanner;

import domain.Dish;

class Restaurant{
	Dish[] arr;
	static Scanner sc = new Scanner(System.in);
	public Restaurant() {
		this.arr= new Dish[10];
	}
	//0 1 2 3 4 5 6 7 8 9 ===10
	public void AddDish(Dish d ) {
		for(int i=0;i<this.arr.length;i++) {
			if(arr[i]==null) {
				arr[i]=d;
				return;
			}
		}
		
		System.out.println("Menu list is full !!!!");
		
	}
	
	
	public void removeDish(String dishName) {
		for(int i=0;i< arr.length;i++) {
			if(arr[i]!=null && arr[i].getDishName().equals(dishName) ) {
				arr[i]=null;
				return;
			}
		}
		System.out.println("Menu dish with entered name not found !!!");
	}
	
	
	public void updatePrice(String dishName) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null && arr[i].getDishName().equals(dishName))
			{
				System.out.println("Enter new price for "+arr[i].getDishName());
				arr[i].setPrice(sc.nextDouble());
			}
		}
		
	}
	
	public void showAllDishes() {
		for(Dish dish : arr) {
			if(dish!=null) {
				System.out.println(dish);
			}
		}
	}
	
	
	
}