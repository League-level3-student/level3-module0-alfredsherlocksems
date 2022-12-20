package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main (String [] args) {
		Robot[] robots = new Robot[5];
		Random ran = new Random();
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot(i*10, 650);
			robots[i].setSpeed(10);
		}
		Thread one = new Thread(() -> robots[0].move(ran.nextInt(50)));
		Thread two = new Thread(() -> robots[1].move(ran.nextInt(50)));
		Thread three = new Thread(() -> robots[2].move(ran.nextInt(50)));
		Thread four = new Thread(() -> robots[3].move(ran.nextInt(50)));
		Thread five = new Thread(() -> robots[4].move(ran.nextInt(50)));
		boolean notDone = true;
		while (notDone) {	
			one.start();
			two.start();
			three.start();
			four.start();
			five.start();
			for (int i = 0; i < robots.length; i++) {
				if (robots[i].getY() < 10) {
					notDone = false;
					JOptionPane.showMessageDialog(null, "Robot " + i +" wins!");
					break;
				}
			}
			
		}
	} 
        // 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.

        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
