package org.usfirst.frc.team3575.robot.subsystems;

import org.usfirst.frc.team3575.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Define and set ports for both left and right drives
	public static Spark leftDrive = new Spark(RobotMap.LEFT_MOTOR_PORT);
	public static Spark rightDrive = new Spark(RobotMap.RIGHT_MOTOR_PORT);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveRobot() {
    	
    }
}

