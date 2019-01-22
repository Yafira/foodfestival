
package veganfoodfestival;

import java.util.Scanner;

public class menu {
	
	public static void main(String [] args) {
			
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to the Vegan Food Festival!");
		System.out.println("What is your name?");
		String name = kb.nextLine(); 
		System.out.println("Hello "+ name);
		
		String answer;
		String foodsEaten= "";
		Boolean hungry = false;
		Boolean legal = false;
		int category = 0;
		int subCategory = 0;
		int totalCost= 0;
	
		System.out.println("Are you hungry? I have a variety of healthy food and yummy treats! We accept Cash and Debit/Credit Card! ");
		System.out.println("Yes or No?");	
		answer = kb.nextLine(); 
		
		if (answer.equals("no") && (answer.equals("No"))){
			hungry = false;
		}
		else if (answer.equals("yes")) {
			hungry = true;
		}
		else {}
		
		while  (hungry) {
			
			System.out.println("What would you like to eat and/or drink?");
			System.out.println("1 Protein, 2 Base, 3 Veggies, 4 Snack, 5 Dessert, 6 Drink, 7 Specialty");
			category = kb.nextInt(); 
	
		 
			if (category == 1) {
				
					System.out.println("What kind of protein would you like? \n 1 Tofu $3.00 \n 2 Soy BBQ Chicken $4.00 \n 3 Falafel $3.00 \n 4 Beans $2.00 \n 5 Mushrooms $2.00 \n"); 
					subCategory = kb.nextInt(); 
					
					if (subCategory == 1) {
						foodsEaten = foodsEaten + "Tofu ";
						totalCost = totalCost + 3 ;
						System.out.println("Enjoy.");
					}
					
					else if (subCategory == 2) {
						foodsEaten = foodsEaten + "Soy BBQ Chicken "; 
						totalCost = totalCost + 4 ;
						System.out.println("Great! ");
					}
					
					else if (subCategory == 3) {
						foodsEaten = foodsEaten + "Falafel "; 
						totalCost = totalCost + 3 ;
						System.out.println("Enjoy.");
					}
					
					else if (subCategory == 4) {
						foodsEaten = foodsEaten + "Beans "; 
						totalCost = totalCost + 2;
						System.out.println("Great source of protein.");
					}
					
					else if (subCategory == 5) {
						foodsEaten = foodsEaten + "Mushrooms "; 
						totalCost = totalCost + 2 ;
						System.out.println("Enjoy.");
					}
					
					else {}
					
			}
			
			else if (category == 2) {
				
				System.out.println("What kind of base would you like? \n 1 Brown Rice $4.00 \n 2 White Rice $4.00 \n 3 Quinoa $3.00 \n 4 3 Tortillas $6.00 \n 5 Pad Thai Noodles $4.00\n"); 
				subCategory = kb.nextInt(); 
				
					if (subCategory == 1) {
						foodsEaten = foodsEaten + "Brown Rice "; 
						totalCost = totalCost + 4 ;
						System.out.println("Enjoy.");
					}
					
					else if (subCategory == 2) {
						foodsEaten = foodsEaten + "White Rice "; 
						totalCost = totalCost + 4 ;
						System.out.println("Enjoy.");
					}
					
					else if (subCategory == 3) {
						foodsEaten = foodsEaten + "Quinoa "; 
						totalCost = totalCost + 3 ;
						System.out.println("Enjoy.");
					}
																	
					else if (subCategory == 4) {
						foodsEaten = foodsEaten + "Tortilla "; 
						totalCost = totalCost + 6 ;
						System.out.println("These Whole Grain tortillas make the perfect taco. ");
					}
																	
					else if (subCategory == 5) {
						foodsEaten = foodsEaten + "Pad Thai Noodles "; 
						totalCost = totalCost + 4 ;
						System.out.println("Enjoy.");
					}
					
					else {}
			}
						
			else if (category == 3) {
				
				System.out.println("What kind of veggies would you like? \n 1 Beets $2.00 \n 2 Carrots $2.00 \n 3 Broccoli $2.00 \n 4 Kale $2.00 \n 5 Zucchini $2.00 \n"); 
				subCategory = kb.nextInt(); 
				
					if (subCategory == 1) {
						foodsEaten = foodsEaten + "Beets "; 
						totalCost = totalCost + 2 ;
						System.out.println("Enjoy.");
					}
																	
					else if (subCategory == 2) {
						foodsEaten = foodsEaten + "Carrots ";
						totalCost = totalCost + 2 ;
						System.out.println("Enjoy.");
					}			
					
					else if (subCategory == 3) {
						foodsEaten = foodsEaten + "Broccoli "; 
						totalCost = totalCost + 2 ;
						System.out.println("Enjoy.");
					}	
					
					else if (subCategory == 4) {
						foodsEaten = foodsEaten + "Kale "; 
						totalCost = totalCost + 2 ;
						System.out.println("Great source of calcium. ");		
					}									
					
					else if (subCategory == 5) {
						foodsEaten = foodsEaten + "Zucchini "; 
						totalCost = totalCost + 2 ;
						System.out.println("Enjoy.");	
					}
					
					else {}
			}
					
			else if (category == 4) {
				
				System.out.println("What kind of snack would you like? \n 1 Seasonal Fruit $3.00 \n 2 Coconut Yogurt with Berries $5.00 \n 3 Raw Veggie Plate with dipping sauce $5.00 \n 4 Granola Bar $3.00 \n 5 Sea Salt Popcorn $4.00\n"); 
				subCategory = kb.nextInt(); 
				
					if (subCategory == 1) {
						foodsEaten = foodsEaten + "Seasonal Fruit "; 
						totalCost = totalCost + 3 ;
						System.out.println("Enjoy!");
					}
					
					else if (subCategory == 2) {
						foodsEaten = foodsEaten + "Coconut Yogurt "; 
						totalCost = totalCost + 5 ;
						System.out.println("Yummy treat filled with good fats!");
					}
					
					else if (subCategory == 3) {
						foodsEaten = foodsEaten + "Raw Veggie Plate With Dipping Sauce "; 
						totalCost = totalCost + 5 ;
						System.out.println("Great choice");
					}
					
					else if (subCategory == 4) {
						foodsEaten = foodsEaten + "Granola Bar "; 
						totalCost = totalCost + 3 ;
						System.out.println("Good choice.");
					}
					
					else if (subCategory == 5) {
						foodsEaten = foodsEaten + "Sea Salt Popcorn "; 
						totalCost = totalCost + 4 ;
						System.out.println("Enjoy.");
					}
					
					else {}
			}
									
			else if (category == 5) {
				
				System.out.println("What kind of dessert would you like? \n 1 Vanilla Coconut Cupcakes $3.00 \n 2 Cookie Dough Ice Cream $5.00 \n 3 Key lime Cheesecake $7.00 \n 4 Mango Strawberry Sorbet $5.00 \n 5 3 Chocolate Chip cookies $8.00 \n"); 
				subCategory = kb.nextInt(); 
				
					if (subCategory == 1) {
						foodsEaten = foodsEaten + "Vanilla Coconut Cupcakes "; 
						totalCost = totalCost + 3 ;
						System.out.println("Enjoy!");
					}
							
					else if (subCategory == 2) {
						foodsEaten = foodsEaten + "Cookie Dough Ice Cream "; 
						totalCost = totalCost + 5 ;
						System.out.println("Enjoy!");
					}
							
					else if (subCategory == 3) {
						foodsEaten = foodsEaten + "Key Lime Chessecake "; 
						totalCost = totalCost + 7 ;
						System.out.println("Enjoy!");
					}
					
					else if (subCategory == 4) {
					foodsEaten = foodsEaten + "Mango Strawberry Sorbet "; 
					totalCost = totalCost + 5 ;
					System.out.println("Enjoy!");
					}
					
					else if (subCategory == 5) {
					foodsEaten = foodsEaten + "Chocolate Chip Cookies "; 
					totalCost = totalCost + 8 ;
					System.out.println("Homemade and delish! ");
					}
					
					else {}
			}
												
			else if (category == 6) {
				
				System.out.println("What kind of drink would you like? \n 1 Bottled Water $2.00 \n 2 Mint Lemonade $4.00 \n 3 Coffee $2.00 \n 4 Tea $2.00 \n 5 Wine $9.00\n"); 
				subCategory = kb.nextInt(); 
				
					if (subCategory == 1) {
						foodsEaten = foodsEaten + "Bottled Water "; 
						totalCost = totalCost + 2 ;
						System.out.println("Enjoy.");
					}
																	
					else if (subCategory == 2) {
						foodsEaten = foodsEaten + "Mint Lemonade ";
						totalCost = totalCost + 4 ;
						System.out.println("Enjoy.");
					}	
					
					else if (subCategory == 3) {
						foodsEaten = foodsEaten + "Coffee "; 
						totalCost = totalCost + 2 ;
						Scanner drink  = new Scanner(System.in);
						System.out.println("Would you like some almond milk with your coffee for $1.00 extra?");
						System.out.println("Yes or No?");
						answer = drink.nextLine(); 
						
							if (answer.equals("yes")) {
								foodsEaten = foodsEaten + "Almond Milk "; 
								totalCost = totalCost + 1 ;
							}
							
							else {}
						
						System.out.println("Great, enjoy!");
					}
																	
					else if (subCategory == 4) {
						foodsEaten = foodsEaten + "Tea "; 
						totalCost = totalCost + 2 ;
						System.out.println("Enjoy.");
					}
					
					else if (subCategory == 5) {
						
						legal = checkIfLegal();
						
						if (legal) {
							System.out.print("You are 21 and older, and can drink. ");
						
							foodsEaten = foodsEaten + "Wine "; 
							totalCost = totalCost + 9 ;
							System.out.print("Cheers! ");
						}	
						else  {
							System.out.print("Sorry but you are under age and cannot drink. ");
						}	
					}
				
			}
			
			else if (category == 7) {
				System.out.println("What kind of speciality would you like? \n 1 Veggie Pizza $4.00 \n 2 Veggie Lasagna $7.00 \n 3 Veggie Burger $6.00 \n"); 
				subCategory = kb.nextInt(); 
				
				if (subCategory == 1) {
					foodsEaten = foodsEaten + "Veggie Pizza "; 
					totalCost = totalCost + 9 ;
					System.out.println("Enjoy. ");
				}
																
				else if (subCategory == 2) {
					foodsEaten = foodsEaten + "Veggie Lasagna "; 
					totalCost = totalCost + 7 ;
					System.out.println("Enjoy. ");
				}													
				
				else if (subCategory == 3) {
					foodsEaten = foodsEaten + "Veggie Burger "; 
					totalCost = totalCost + 6 ;
					System.out.println("Enjoy! ");
				}
				
				else {}
															
			}
				
			else {}
			
			if ( (category != 6)  && (category != 7) && (category != 4) && (category != 5) ) {
				System.out.println("What kind of condiment/toppings would you like? At no extra cost! \n 1 Guacamole \n 2 Kimchi \n 3 Pico de Gallo \n 4 Garlic Sauce \n 5 Sriracha \n 6 Hummus \n 7 Sauteed Peppers \n 8 None \n"); 
				subCategory = kb.nextInt(); 

					if (subCategory == 1) {
						foodsEaten = foodsEaten + "Guacamole ";
						System.out.print("Always a good option." );
					}
					
					else if (subCategory == 2) {
						foodsEaten = foodsEaten + "Kimchi "; 
						System.out.print("Awesome! ");
					}
					
					else if (subCategory == 3) {
						foodsEaten = foodsEaten + "Pico De Gallo "; 
						System.out.print("Enjoy. ");
					}
					
					else if (subCategory == 4) {
						foodsEaten = foodsEaten + "Garlic Sauce "; 
						System.out.print("Enjoy! ");
					}
					
					else if (subCategory == 5) {
						foodsEaten = foodsEaten + "Sriracha "; 
						System.out.print("The best hot sauce. ");
					}
					
					else if (subCategory == 6) {
						foodsEaten = foodsEaten + "Hummus "; 
						System.out.print("Enjoy! ");
					}
					
					else if (subCategory == 7) {
						foodsEaten = foodsEaten + "Sauteed Peppers "; 
						System.out.print("Enjoy! ");
					}
					
					else if (subCategory == 8) {
						System.out.print("No problem! ");
					}
			
					else {}						
			}  // end of condiments/toppings check
			
			kb  = new Scanner(System.in);

			System.out.println("Are you still hungry?");
			System.out.println("Yes or No?");
			answer = kb.nextLine(); 
			
			if (answer.equals("no")) {
				hungry = false;
			}
			else if (answer.equals("yes")) {
				hungry = true;
			}
			else {}
		
		}  // end of while loop
		
		

	
		System.out.println("Bye "+  name +"! Thank you for coming!!");
		System.out.println("These are the things you ate/drank : " + foodsEaten);
		System.out.println("Your total cost is : $" + totalCost +".00");
	}	
			
public static boolean checkIfLegal () {
	Scanner kb  = new Scanner(System.in);
	
	System.out.println("How old are you? I may need to see your ID to verify.");
	int answer = kb.nextInt(); 
	
	if (answer >= 21) {
		return true;
	}
	else {
		return false;
	}
}

	
	
	
}
					




