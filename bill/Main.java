package customer4;



import billingprocess.Finalbilling;

import java.util.Scanner;

public class Main {


	
public static void purchasingproducts() 
{
	System.out.println("Clothing  1\f2  kitchen\f3  Bathing\f4  Electronics\f5  Final Bill");
	Scanner scanner = new Scanner(System.in);

System.out.println("enter your choice");
    int a=scanner.nextInt();


    if (a==1) {


       Electronics e= new Electronics();


       e.display();

       







    }


    else if (a==2) {


        Kitchen kitchen= new Kitchen();


        kitchen.display();


        





    }


    else if (a==3)
    {





      Bathing bath=new Bathing();


      bath.display();

     








    }


    else if (a==4) {


        Clothing clothes =new Clothing();

clothes.display();
    }
    else if(a==4) {
    	Finalbilling finalbilling = new Finalbilling();
    	finalbilling.bill();
    }
}
public static void main(String[] args) {
	Main.purchasingproducts();
	
}
}




       




    



