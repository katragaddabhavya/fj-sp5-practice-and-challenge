import java.util.Scanner;

public class AreaCalculator{
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter chickens,ducks,cows");
		int chickens=sc.nextInt();
		int ducks=sc.nextInt();
		int cows=sc.nextInt();
		AreaCalculator obj= new AreaCalculator();
		//double chickens=obj.CalculateSquare(0);
		//double ducks=obj.CalculateCircle(0);
		//double cows= obj.Calculaterectangle(0);
		System.out.println("area of square is :" +chickens);
	  System.out.println("area of Circle is :" +ducks);
	  System.out.println("area of rectangle is :" +cows);
	  
	}

	public double CalculateSquare (double side ){
		double  chickens=side*side;
	return chickens;
	}
		public double CalculateCircle (double radius){
		double ducks=3.14*radius*radius;
		return ducks;

	}
	public double Calculaterectangle(double length , double breadth){
		double ducks=length*breadth;
		return ducks;
	}
}
//task2 
public class AnnualPerformance {
	public static void main(String args[]){
		AnnualPerformance obj= new AnnualPerformance();
		int a= obj.Calculatetotalmarks(30,40,50);
		int b=obj.calculateaverage(a);
System.out.println("total marks" +a);
System.out.println("average" +b);
	}
	public int Calculatetotalmarks(int sub1,int sub2,int sub3){
		int totalmarks=sub1+sub2+sub3;
		return totalmarks;
	}
	public int calculateaverage(int totalmarks){
		int average=totalmarks/3;
		return average;
	}
}