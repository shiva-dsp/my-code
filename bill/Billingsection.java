package customer4;

import java.util.Scanner;

public class Billingsection {

	Scanner sc=new Scanner(System.in);
	private String refrigerator;
    static int sum=0;
    static int price;
public void cashier()
{
    System.out.println("available items in our mart");
    System.out.println("1.Electronics category");
    System.out.println("2.Cloths");
    System.out.println("3.Bath");
    System.out.println("4.kitchen");
    System.out.println("enter required section");
    int sec=sc.nextInt();
    if(sec<=4)
    {
    switch(sec)
    {
    case 1:
         System.out.println("you choosed electronics");
         System.out.println("the avaible items are");
         System.out.println("1.refrigerator");
         System.out.println("2.rice cooker");
         System.out.println("3.television");
         System.out.println("4.washing machine");
         System.out.println("enter required item");
         int i=sc.nextInt();
         if(i==1)
         {
             System.out.println("the item is refrigerator");
             int Totalquantity=200;
             System.out.println("available items are:"+Totalquantity);
             System.out.println("enter required quantity of items");
             int req=sc.nextInt();
             int cost=300;
             System.out.println("cost of one refrigerator:"+cost);
             int price=cost*req;
             System.out.println("price:"+ price);
             
             sum+= price;
         }
         else if(i==2)
         {
             System.out.println("the item is rice cooker");
             int Totalquantity=200;
             System.out.println("available items are:"+Totalquantity);
             System.out.println("enter required quantity of products");
             int req=sc.nextInt();
             int cost=250;
             System.out.println("cost of one rice cooker:"+cost);
             int price=cost*req;
             System.out.println("price:"+price);
             
             sum+= price;
         }
             else if(i==3)
             {
            	 System.out.println("The item is television");
            	 int Totalquantity=200;
            	 int Productcode=3456;
                 System.out.println("Available products are:"+Totalquantity);
                 System.out.println("Enter required product code is:"+Productcode);
                 int req=sc.nextInt();
                 int cost=20000;
                 System.out.println("cost of one television:"+cost);
                 int price=cost*req;
                 System.out.println("price:"+ price);
                 
                 sum+= price;
             }
                 else if(i==4)
                 {
                     System.out.println("The item is washing machine");
                     int Totalquantity=200;
                     int Productcode=4567;
                 
                     System.out.println("available products quantity are:"+Totalquantity);
                     System.out.println("available product code is:"+Productcode);
                     System.out.println("Enter quantity of products");
                     int req=sc.nextInt();
                     int cost=20000;
                     System.out.println("cost of one washing machine:"+cost);
                     int price=cost*req;
                     System.out.println("price:"+price);
                     
                     sum+=price;
             }
                 else
                 {
                     System.out.println("you entered unavailable products");
                 }
                 break;
    }
                
            }
            
                 System.out.println("total bill is:"+ price);
                 if(sum>2000) {
                 
                 System.out.println("start again");
                 System.out.println("It is more than your budget");
                 cashier();
    }
    
System.out.println("Validation to be Done");
}
}

