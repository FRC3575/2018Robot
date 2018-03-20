package org.usfirst.frc.team3575.robot.commands;

import org.usfirst.frc.team3575.robot.OI;
import org.usfirst.frc.team3575.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorDown extends Command {

    public ElevatorDown() {
        // Use requires() here to declare subsystem dependencies
         requires(Robot.myelevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double elevatorThrottle = OI.myJoystick.getRawAxis(3);
    	Robot.myelevator.elevatordown(-Math.abs(elevatorThrottle));
    	//Robot.myelevator.elevatordown(-1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.myelevator.elevatorstop(); 
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
