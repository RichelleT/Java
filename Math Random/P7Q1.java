import java.util.Random;
import java.util.Scanner;

public class P7Q3{

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int n1 = rand.nextInt(20);
		int n2 = rand.nextInt(20);
		char operator = genOperator(rand.nextInt(3));
		System.out.println(evaluateQuestion(n1,n2,operator));
		System.out.println("The answer?");
		int answer = input.nextInt();
		if(answer == calcAnswer(n1,n2,operator)){
			System.out.println("Correct!");
		}
		else{
			System.out.println("Wrong Answer!");
		}

	}
	public static char genOperator(int a){
		switch(a){
			case 0: return '+';
			case 1: return '-';
			case 2: return '*';
			case 3: return '/';
			default: return 'x';
		}
	}
	public static String evaluateQuestion(int n1, int n2, char operator){
		return  "The question is: " + n1 + " " + operator + " " + n2+ ".";
	}
	public static int calcAnswer(int n1, int n2, char operator){
		switch (operator){
			case '+': return n1 + n2;
			case '-': return n1 - n2;
			case '*': return n1 * n2;
			case '/': return n1 / n2;
			default: return -1;
		}
	}
}
