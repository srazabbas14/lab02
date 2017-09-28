import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class menu {
	 private static Scanner scanner = new Scanner(System.in);
	 private static String fileName;
	 private static String fileName1;
	 private static String fileName2;
	 private static String fileName3;
	 
	
	 
	 public static void main(String[] args) throws IOException {
		 
		 set_item[] item = new set_item[15];
		 for ( int i=0; i<item.length; i++) {
			 item[i]=new set_item();
			 }

		 item[0].setValues("Special Burger",390,5);
		 item[1].setValues("Molten Lava Cake",400,5);
		 item[2].setValues("French Toast",250,5);
		 item[3].setValues("Chicken Spagetthi",450,5);
		 item[4].setValues("Chicken Corn Soup",500,10);
		 item[5].setValues("Chicken Hot and Sour Soup",520,10);
		 item[6].setValues("Chicken Manchurian",800,15);
		 item[7].setValues("Egg Fried Rice",600,15);
		 item[8].setValues("Chicken Tikka Boti",500,15);
		 item[9].setValues("Chicken Karhai",650,15);
		 item[10].setValues("Chicken Malai Boti",650,15);
		 item[11].setValues("Chicken Jalfrezzi",650,15);
		 item[12].setValues("Club Sandwich",450,10);
		 item[13].setValues("Chicken Fajita",900,10);
		 item[14].setValues("Beef Pepporoni",850,10);
		 
		 
		   System.out.print("--------Welcome to CAFE ISLAMABAD----------\n");
		   System.out.print("-----------------MENU----------------------\n\n");
		   System.out.print("-------------1.Appetizers------------------\n");
		   fileName = "appetizer.txt";
		   FileReader fr = new FileReader(fileName);
		   BufferedReader br  = new BufferedReader(fr);

		   for (int i=0;i<15;i++)
		    {
			   System.out.print(br.readLine());
			   System.out.print("\n");
		   }
		   br.close();
		 
		   System.out.print("\n----------------2.Soups-------------------\n");
		   fileName1 = "soup.txt";
		   FileReader fr1 = new FileReader(fileName1);
		   BufferedReader br1  = new BufferedReader(fr1);

		   for (int i=0;i<7;i++)
		    {
			   System.out.print(br1.readLine());
			   System.out.print("\n");
		   }
		   br1.close();
		   
		   System.out.print("\n--------------3.Main Course Dishes----------\n");
		   fileName2 = "dish.txt";
		   FileReader fr2 = new FileReader(fileName2);
		   BufferedReader br2  = new BufferedReader(fr2);

		   for (int i=0;i<23;i++)
		    {
			   System.out.print(br2.readLine());
			   System.out.print("\n");
		   }
		   br2.close();
		   
		   System.out.print("\n------------------4.Side Dishes-------------\n");   
		   fileName3 = "side.txt";
		   FileReader fr3 = new FileReader(fileName3);
		   BufferedReader br3  = new BufferedReader(fr3);

		  	   
		   for (int i=0;i<11;i++)
		    {
			   System.out.print(br3.readLine());
			   System.out.print("\n");
		   }
		   br3.close();
		   
		   String end="continue";
		   int total_bill=0;
		   int total_time=0;
		   
		   while (end.equals("continue"))
		   {
			   System.out.print("\n-----------------------");
			   System.out.print("\n\n");
			   System.out.print("SELECT COURSE NO \n");
			   System.out.print("1 for Appetizer \n");
			   System.out.print("2 for Soups \n");
			   System.out.print("3 for Main Course Dishes \n");
			   System.out.print("4 for Side Dishes\n");
			   System.out.print("E for BILL\n");
			   System.out.print("\n\n");
			   System.out.print("ENTER COURSE NO: ");
			   String course_no = scanner.nextLine();
			   String item_name="";
			   if (!course_no.equals("E"))
			   { System.out.print("\nENTER FOOD ITEM NAME: ");
			   item_name = scanner.nextLine();}
			   
			   switch(course_no) {
		         case "1" :
		        	 for (int i=0; i<4;i++)
		        	 {
		        		 if (item_name.equals(item[i].getItem()))
		        		 {
		        			 total_bill=total_bill+item[i].getPrice();
		        			 total_time=total_time+item[i].getTime();
		        		 }
		        	 }
		        
		            break;
		            
		         case "2" :
		        	 for (int i=4; i<6;i++)
		        	 {
		        		 if (item_name.equals(item[i].getItem()))
		        		 {
		        			 total_bill=total_bill+item[i].getPrice();
		        			 total_time=total_time+item[i].getTime();
		        		 }
		        	 }
				        
			            break;
			            
		         case "3" :
		        	 for (int i=6; i<12;i++)
		        	 {
		        		 if (item_name.equals(item[i].getItem()))
		        		 {
		        			 total_bill=total_bill+item[i].getPrice();
		        			 total_time=total_time+item[i].getTime();
		        		 }
		        	 }
				        
			            break;
			            
		         case "4" :
		        	 for (int i=12; i<15;i++)
		        	 {
		        		 if (item_name.equals(item[i].getItem()))
		        		 {
		        			 total_bill=total_bill+item[i].getPrice();
		        			 total_time=total_time+item[i].getTime();
		        		 }
		        	 }
			            break;
		       
		         case "E" :
		        	 System.out.println("Total Bill: Rs"+total_bill);
		        	 System.out.println("Total Time: "+total_time+" mins"); 
		        	 end="end";
			            break;
			            
		         default :
		            System.out.println("INVALID OPTION ! RE-ENTER CORRECT VALUE !!!");
		      }			  
		   }
		   
		   System.out.print("\n\nWould you like to dine in or deliver ?\n");
		   System.out.print("Enter Y for DINE IN, N for DELIVERY \n");
		   
		   String user_op = scanner.nextLine();
		   if (user_op.equals("N")) {
			   System.out.print("\nEnter your name: ");
			   String n= scanner.nextLine();
			   System.out.print("Enter your address: ");
			   String ad= scanner.nextLine();//address
		   }
		   
		   System.out.print("\n\nThankyou for ordering to our CAFE !");
		   
	 }
}
