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
	private Spark leftMotor = new Spark(RobotMap.leftMotor);
	private Spark rightMotor = new Spark(RobotMap.rightMotor);
	
	private SpeedControllerGroup leftSide = new SpeedControllerGroup(leftMotor);
	private SpeedControllerGroup rightSide = new SpeedControllerGroup(rightMotor);
	
	private DifferentialDrive driveTrain = new DifferentialDrive(leftSide, rightSide);
	double deadZone = 0.1;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	rightMotor.setInverted(true);
        setDefaultCommand(new DriveRobot());
    }
    
    public void driveRobot(double throttle, double turn) {
    	driveTrain.arcadeDrive(throttle, turn);
    	
    }
    public void driveRobotTank(double leftSpeed, double rightSpeed) {
    	driveTrain.tankDrive(leftSpeed, rightSpeed);
    	
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
//    	leftMotor.set(throttle);
//    	rightMotor.set(turn);
    	
    	
    }
    public void driveStop() {
    	driveTrain.arcadeDrive(0.0, 0.0);
    }
}

