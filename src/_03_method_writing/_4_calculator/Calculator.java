package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		int x = 0;
		System.out.println(task);
		if(task==0) {
			x=divide(number1,number2 );
		}
		if(task==1) {
			x=multiply(number1,number2)  ;
		}
		if(task==2) {
			x=subtract( number1,number2 );
		}
		if(task==3) {
			x=add( number1,number2 );
		}
		// 4) Call the result() method and put the answer in a pop-up
		JOptionPane.showMessageDialog(null, result(x)   );

		// 1) Make 4 static methods (add, subtract, multiply, divide)
		//		They should each take 2 numbers as parameters
		//		and return the answer.
		add(number1,number2);
		subtract(number1,number2);
		multiply(number1,number2);
		divide(number1,number2);
	}

	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	static int  add(int m,int n ) {
		return m+n;

	}
	static int subtract(int m,int n) {
		return m-n;

	}
	static int multiply(int m,int n) {
		return m*n;
	}
	static int divide(int m,int n) {
		return m/n;
	}
	static String result ( int m ) {
		return "Your answer is " + m;
	
	}




}
