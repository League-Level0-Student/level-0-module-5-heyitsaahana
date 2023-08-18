package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//drawSquare();
		//drawTriangle();
		drawCircle();


	}
	static void drawSquare(  ) {
		Robot bob=new Robot();		
		bob.setX(250);
		bob.setY(500);
		bob.penDown();
		bob.setSpeed(20);
		bob.setPenColor(0,0,0);
		bob.move(250);
		bob.turn(90);
		bob.move(250);
		bob.turn(90);
		bob.move(250);
		bob.turn(90);
		bob.move(250);

	}
	static void drawTriangle(  ) {
		Robot bob=new Robot();
		bob.setX(450);
		bob.setY(100);
		bob.penDown();
		bob.setSpeed(10);
		bob.setPenColor(0,0,0);
		bob.turn(120);
		bob.move(350);
		bob.turn(120);
		bob.move(350);
		bob.turn(120);
		bob.move(340);
	}
	static void drawCircle( ) {
		Robot bob=new Robot();
		bob.setX(400);
		bob.setY(550);
		bob.penDown();
		bob.setSpeed(30);
		bob.setPenColor(0,0,0);
		for(int x=0;x<36;x++) {
			bob.move(10);
			bob.turn(10);
		}



	}
}
