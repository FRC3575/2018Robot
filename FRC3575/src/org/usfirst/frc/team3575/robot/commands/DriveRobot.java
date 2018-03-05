package org.usfirst.frc.team3575.robot.commands;

import org.usfirst.frc.team3575.robot.OI;
import org.usfirst.frc.team3575.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveRobot extends Command {

    public DriveRobot() {
        requires(Robot.mydrive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double leftSpeed = OI.myJoystick.getRawAxis(1);
    	double rightSpeed = OI.myJoystick.getRawAxis(2);
    	Robot.mydrive.driveRobot(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
