package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String y=JOptionPane.showInputDialog("Enter a number");
		int x = Integer.parseInt(y);
		for(int k=2; k<x ;k++) {
			if( x%k==0   ) {
				JOptionPane.showMessageDialog(null,"Your number is not prime");
				System.exit(0);
			}
			 }
		 JOptionPane.showMessageDialog(null,"Your number is prime");
	
		
	}

}
