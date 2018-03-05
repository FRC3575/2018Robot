package org.usfirst.frc.team3575.robot.subsystems;

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

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveRobot());
    }
    
    public void driveRobot(double leftSpeed, double rightSpeed) {
    	driveTrain.arcadeDrive(leftSpeed, rightSpeed);
    }
}

