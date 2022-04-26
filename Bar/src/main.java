import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ingredients ing = new Ingredients();
		
	int age;
	System.out.println("Wilkommen in Bar");
    System.out.println("Eintritt ab 18 Jahren");
    //Eintritt ab 18 Jahren
	while(true) {
	System.out.println("Enter your age: ");
	Scanner scan = new Scanner(System.in);
	age=scan.nextInt();
	if(age>=18) {
		System.out.println("You are allowed to enter the bar");
		break;
	}else {
		System.out.println("You are under 18, you cannot enter");
	}
	}
	//ArrayList for the food,drink,dessert	
	ArrayList<WriteMenu> entry = new ArrayList<WriteMenu>();
	
	//Drinks
	entry.add(new Drinks("beer",330,2,true));
	entry.add(new Drinks("beer",500,3,false));
	entry.add(new Drinks("vodka",750,15,true));
	entry.add(new Drinks("apple juice",330,5,true));
	entry.add(new Drinks("whiskey",75,20,false));
	entry.add(new Drinks("orange juice",330,2,true));
	entry.add(new Drinks("lemonade",500,5,true));
	entry.add(new Drinks("wine",750,5,true));
	entry.add(new Drinks("wine",250,5,true));
	
	//Food
	entry.add(new Foods("Spaghetti",5,true));
	entry.add(new Foods("Pizza",5,true));
	entry.add(new Foods("Spargel",7,false));
	entry.add(new Foods("French fries",3,true));
	entry.add(new Foods("Cheeseburger",5,true));
	entry.add(new Foods("Chicken wrap",7,false));
	entry.add(new Foods("Steak",5,true));
	entry.add(new Foods("Chicken Nuggets",5,true));
	entry.add(new Foods("Tacos",7,false));
	entry.add(new Foods("Salad",5,true));
	entry.add(new Foods("Hot dog",5,true));
	entry.add(new Foods("Lasagne",7,false));
	
	//Dessert
	entry.add(new Desserts("Brownie",3,true));
	entry.add(new Desserts("Cheesecake",4,true));
	entry.add(new Desserts("Cupcake",3,true));
	entry.add(new Desserts("Ice cream",3,false));
	entry.add(new Desserts("Chocolate Lava Cake",3,true));
	entry.add(new Desserts("Apple Pie",3,true));
	entry.add(new Desserts("Cherry Pie",3,false));
	entry.add(new Desserts("Tiramisu",3,true));	
	while(true) {
		String a;
		System.out.println("Please enter your drink for seeing Ingredients: ");
		System.out.println("Type exit for exit");
		Scanner scan = new Scanner(System.in);
		a=scan.next();
	if(a.equals("beer")) {
		ing.Beer();	
	}
	if(a.equals("vodka")) {
		ing.Vodka();
	}if(a.equals("apple juice")) {
		ing.AppleJuice();
	}if(a.equals("whiskey")) {
		ing.Whiskey();
	}if(a.equals("orange juice")) {
		ing.OrangeJuice();
	}if(a.equals("Lemonade")) {
		ing.Lemonade();
	}if(a.equals("wine")) {
		ing.Wine();
	}if(a.equals("exit")) {
		break;
	}
	
	}
	
	
	 for(WriteMenu material: entry) {
  	   material.printMenu();//invoke method
     }
	
	
	}


	
	
	

}
