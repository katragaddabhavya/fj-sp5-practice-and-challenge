import java.util.Scanner;
public class WeightedAverage {
	public static void main(String args[]){
		Scanner sc= new Scanner (System.in);
		//FOR ASSIGNMENTS
		System.out.println("enter assignment score:" );
		int assignmentscore= sc.nextInt();
		System.out.println("enter assignment weight is :");
		int assignmentweight= sc.nextInt();
		float assignmentpercentagescore= (assignmentweight/100.0f)*assignmentscore;
//FOR projects
		System.out.println("enter project score:" );
		int projectscore= sc.nextInt();
		System.out.println("enter project weight is :");
		int projectweight= sc.nextInt();
		float projectpercentagescore= (projectweight/100.0f)*projectscore;

	//FOR quiz
		System.out.println("enter quiz score:" );
		int quizscore= sc.nextInt();
		System.out.println("enter quiz weight is :");
		int quizweight= sc.nextInt();
		float quizpercentagescore= (quizweight/100.0f)*quizscore;	
//FOR midterm
		System.out.println("enter midterm score:" );
		int midtermscore= sc.nextInt();
		System.out.println("enter midterm weight is :");
		int midtermweight= sc.nextInt();
		float midtermpercentagescore= (midtermweight/100.0f)*midtermscore;	
	//FOR finalexam
		System.out.println("enterfinalexam score:" );
		int finalexamscore= sc.nextInt();
		System.out.println("enter finalexam weight is :");
		int finalexamweight= sc.nextInt();
		float finalexampercentagescore= (finalexamweight/100.0f)*finalexamscore;	
	
			float overallpercentage= (assignmentpercentagescore*projectpercentagescore*quizpercentagescore*midtermpercentagescore*finalexampercentagescore);
			System.out.println("Weights:" +valueofscore);
			System.out.println("assignments:" +assignmentpercentagescore);
			System.out.println("projects:" +projectpercentagescore);
			System.out.println("quiz:" +quizpercentagescore);
			System.out.println("midterm:" +midtermpercentagescore);
			System.out.println("finalexam:" +finalexampercentagescore);
			System.out.println("The WeightedAverage score:" +overallpercentage);
	
	public void display(int score){
		System.out.println("score");
		WeightedAverage obj= new WeightedAverage();
		obj. WeightedAverage();
	}
     	

	}
	
