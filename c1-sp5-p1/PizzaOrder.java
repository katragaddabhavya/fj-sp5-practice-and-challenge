import java.util.Scanner;
public class PizzaOrder{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		PizzaOrder obj=new PizzaOrder();
		System.out.println("enter customer name");
		String cname=sc.next();
		System.out.println("enter customer email");
		String cemail=sc.next();
		System.out.println("enter customer phonenum ");
		long cphonenum=sc.nextLong();
		System.out.println("enter customer address");
		String caddress=sc.next();
		obj.displaycustomerdetails(cname,cemail,cphonenum,caddress);
		float tpizzaprice=0;
		float tgarlicbreadprice=0;
		float tbeverages =0;
		int choice;
		int noofpizza=0;
		int noofgarlicbread=0;
		int noofbeverages=0;
		
	
	do {
		obj.displayMenu();
		System.out.println("enter the (1-3) to order");
		int itemnumber = sc.nextInt();
		switch (itemnumber){
			case 1: {
				System.out.println("enter the number of pizza you want to order");
				noofpizza= sc.nextInt();
				System.out.println("enter the size of pizza(1-3)");
				int size=sc.nextInt();
				float priceofpizza=obj.getpriceofpizzabasedonsize(size);
				tpizzaprice=obj.calculatepriceofpizza(noofpizza,priceofpizza);
			}
			break;
			case 2:{
				System.out.println("enter number of garlicbread");
				noofgarlicbread=sc.nextInt();
				float garlicbreadprice=obj.getpriceofgarlicbread();
				tgarlicbreadprice=obj.calculatepriceofgarlicbread(noofgarlicbread,garlicbreadprice);

			}
			break;
			case 3:{
				System.out.println("enter the number of beverages");
				noofbeverages=sc.nextInt();
				float beverages=obj.getpriceofbeverages();
				tbeverages=obj.calculatepriceofbeverages(noofbeverages,beverages);
			}
			break;
			default:
			System.out.println("wrong choice entered");
		}
		System.out.println("do you want to order more 1-yes, 0-no");
		choice =sc.nextInt();

	}while (choice==1);
	float totalbill=obj.calculatetotalbill(tpizzaprice,tgarlicbreadprice,tbeverages);
	 float discountedbill=obj.calculatediscountedbill(totalbill);
    obj.displayorderdetails(noofpizza, noofgarlicbread, noofbeverages, 1, totalbill,discountedbill);

			}
			public void displaycustomerdetails(String name, String email, long phonenum, String address){
				System.out.println("customername" +name);
				System.out.println("customeremail" +email);
				System.out.println("customerphonenum" +phonenum);
				System.out.println("customeraddress" +address);
			}
			public void displayMenu(){
				
			System.out.println("select the item to order");				
			System.out.println("sl.no\t Item category");
			System.out.println("..............................." );
			System.out.println(" 1 \tpizza");
            System.out.println(" price of regular pizza: $9.99");
			 System.out.println(" price of medium pizza: $11.99");
             System.out.println(" price of large pizza: $13.99");
			 System.out.println(" 2 \tgarlicbread");
			 System.out.println("price of garlicbread: $5.99");
			 System.out.println("3 \tbeverages");
			 System.out.println("price of beverages: $1.99");

			}
			public float getpriceofpizzabasedonsize(int size)
			{
				float priceofpizza =0;
				if (size==1){
					priceofpizza=9.99f;
				}
				else if (size==2){
					priceofpizza=11.99f;
				}
				else if (size==3){
					priceofpizza=13.99f;
				}
				else{
					System.out.println("invalid size,enter 1,2 or 3");
					priceofpizza=0;
				}
				return priceofpizza;
			}
			public float getpriceofgarlicbread(){
				return 5.99f;
			}
			public float getpriceofbeverages(){
				return 1.99f;
			}
			public float calculatepriceofpizza(int noofpizza, float priceofpizza){
				float tpizzaprice=noofpizza*priceofpizza;
				return tpizzaprice;
			}
			public float calculatepriceofgarlicbread(int noofgarlicbread, float priceofgarlicbread){
				float tgarlicbreadprice= noofgarlicbread*priceofgarlicbread;
				return tgarlicbreadprice;
			}
			public float calculatepriceofbeverages(int noofbeverages, float beveragesprice){
				float tbeveragesprice=noofbeverages*beveragesprice;
				return tbeveragesprice;
			}
			public float calculatetotalbill(float tpizzaprice, float tgarlicbreadprice,float tbeverages){
				float totalbill=tpizzaprice+tgarlicbreadprice+tbeverages;
				return totalbill;
			}
			public float calculatediscountedbill(float totalbillamount){
				if(totalbillamount>50){
					totalbillamount=totalbillamount-(totalbillamount*0.1f);
					return totalbillamount;
				}
				else {
					return totalbillamount;
				}
			}
			public void displayorderdetails(int noofpizza,int noofgarlicbread,int noofbeverages,int size, float totalbill, float totaldiscountedbill){
				System.out.println("order details");
				System.out.println("..............................");
				System.out.println("the number of pizza ordered:" +noofpizza);
				System.out.println("the number of garlicbread ordered:" +noofgarlicbread);
				System.out.println("the number of beverages ordered:" +noofbeverages);
				System.out.println("the totalbill is:" +totalbill);
				System.out.println("the discounted bill amount is:" +totaldiscountedbill);
			}
}