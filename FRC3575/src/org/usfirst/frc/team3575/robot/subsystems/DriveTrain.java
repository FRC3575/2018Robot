package org.usfirst.frc.team3575.robot.subsystems;

import org.usfirst.frc.team3575.robot.OI;
import org.usfirst.frc.team3575.robot.RobotMap;
import org.usfirst.frc.team3575.robot.commands.DriveRobot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Define and set ports for both left and right drives
	private Spark leftMotor;
	private Spark rightMotor;
	
	private SpeedControllerGroup leftSide;
	private SpeedControllerGroup rightSide;
	
	private DifferentialDrive driveTrain;
	
	private double deadZone = 0.1;
	
	public DriveTrain() {
		leftMotor = new Spark(RobotMap.leftMotor);
		rightMotor = new Spark(RobotMap.rightMotor);
		
		leftSide = new SpeedControllerGroup(leftMotor);
		rightSide = new SpeedControllerGroup(rightMotor);
		
		rightMotor.setInverted(true);
		
		driveTrain = new DifferentialDrive(leftSide, rightSide);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new DriveRobot());
    }
    
    public void driveRobot(double throttle, double turn) {
    	driveTrain.arcadeDrive(throttle, turn);
    	
    }
    
    public void driveRobotJoystick() {
    	double throttle = OI.myJoystick.getRawAxis(1);
    	double turn = OI.myJoystick.getRawAxis(2);
    	if(Math.abs(throttle) < deadZone) {
    		throttle = 0.0;
    	}
    	if(Math.abs(turn) < deadZone) {
    		turn = 0.0;
    	}
    	driveTrain.arcadeDrive(throttle, turn);   	
    	
    }
    
    public void driveStop() {
    	driveTrain.arcadeDrive(0.0, 0.0);
    }
}

