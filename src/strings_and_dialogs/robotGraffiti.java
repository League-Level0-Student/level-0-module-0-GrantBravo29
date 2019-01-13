package strings_and_dialogs;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class robotGraffiti {
	public static void main(String[] args) {
		Robot jeff = new Robot();

	jeff.setPenColor(Color.BLUE);	
		jeff.setSpeed(10);
		jeff.penDown();
jeff.turn(-90);
jeff.move(25);		
jeff.move(50);
	
jeff.turn(90);
	jeff.move(150);
	jeff.turn(90);
	jeff.move(75);
	jeff.turn(90);
	jeff.move(25);
	jeff.penUp();
	jeff.move(100);
	jeff.penDown();
	jeff.move(25);
	jeff.turn(180);
	jeff.move(50);
	jeff.turn(-90);
	jeff.move(25);
	jeff.hide();
	
	
	}
}

