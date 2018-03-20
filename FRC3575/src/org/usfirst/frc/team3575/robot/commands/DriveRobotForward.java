package org.usfirst.frc.team3575.robot.commands;

import org.usfirst.frc.team3575.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveRobotForward extends Command {
	double speed;
    public DriveRobotForward(double timeOutS, double speedIn) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.mydrive);
        speed = speedIn;
        setTimeout(timeOutS);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    //	 setTimeout(4);  // set 4 second timeout

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.mydrive.driveRobot(speed, 0.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.mydrive.driveStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
