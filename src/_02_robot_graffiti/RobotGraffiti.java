package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot luca = new Robot();
	luca.setSpeed(100);
	luca.setAngle(270);
	luca.move(400);
	luca.penDown();
	luca.setAngle(180);
	luca.move(200);
	luca.setAngle(90);
	luca.move(200);
	luca.penUp();
	luca.move(25);
	luca.penDown();
	luca.setAngle(0);
	luca.move(200);
	luca.setAngle(180);
	luca.move(200);
	luca.setAngle(90);
	luca.move(125);
	luca.setAngle(0);
	luca.move(200);
	luca.penUp();
	luca.setAngle(180);
	luca.move(200);
	luca.setAngle(90);
	luca.move(125);
	luca.setAngle(0);
	luca.penDown();
	luca.move(200);
	luca.setAngle(90);
	luca.move(100);
	luca.setAngle(270);
	luca.move(100);
	luca.setAngle(180);
	luca.move(200);
	luca.setAngle(90);
	luca.move(100);
	luca.penUp();
	luca.move(125);
	luca.penDown();
	luca.setAngle(20);
	luca.move(200);
	luca.setAngle(160);
	luca.move(60);
	luca.setAngle(270);
	luca.move(40);
	luca.setAngle(90);
	luca.move(40);
	luca.setAngle(160);
	luca.move(140);
}
}
