package customer4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Booking {
	
public void book() {
	String query="SELECT * FROM billing.customer3";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billing","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		Scanner scanner = new Scanner(System.in);
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+""+rs.getInt(5));
			
		}
		} catch (Exception e) {
		// TODO Auto-generated catch block
		
		public void bookingkitchen()
		{	 
            try {
            	Scanner scanner = new Scanner(System.in);
                  System.out.println("please select product for that enter id of product");
                  int id=scanner.nextInt();
                  System.out.println("please enter quantity");
                  int quantity=scanner.nextInt();
                    Connection connection;

                 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");

                 Statement statement=connection.createStatement();

                 ResultSet re=statement.executeQuery("SELECT * FROM billing.kitchen where id='"+id+"'");

                 while(re.next())
                 {
                 System.out.println("1");
                  
                int   price=quantity*a;
                  String discription=re.getString(5);
                  String name=re.getString(2);
                   id=re.getInt(1);

                  
                   System.out.println("if want to continue this section press 1\n2 for next section");
                   int z=scanner.nextInt();
                   if (z==1) {
                          display();
                          bookingkitchen();

                                }
                   else {
                          Main main=new Main();
                          main.bookproducts();

                   }




                 }

            } catch (Exception e) {
                  // TODO: handle exception
            }


     }
     public void bill1() {


                  try {
                    Class.forName("com.mysql.cj.jdbc.Driver");


                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");
                    Statement statement=connection.createStatement();
                    System.out.println("1");
                    String query="INSERT INTO `store`.`cart` (`id`, `name`, `quantity`, `price`, `discription`) VALUES ('"+id1+"', '"+name+"', '"+quantity+"', '"+price+"','"+discription+"')";
                     statement.executeUpdate(query);
                     ResultSet rs=statement.executeQuery("SELECT * FROM store.cart");
                     System.out.println("id"+"\t"+"name"+"\t"+"quantity"+"\t"+"price"+"\t"+"discription");
                     while (rs.next()) {

                           System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"\t "+rs.getDouble(3)+"   \t"+rs.getDouble(4)+"\t"+rs.getString(5));

                         }



                } catch (Exception e) {
                    System.out.println(e);



               }

     }

	} 
}
}
