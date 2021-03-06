package org.usfirst.frc.team3575.robot.commands;

import org.usfirst.frc.team3575.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveAndDropBox extends CommandGroup {

    public DriveAndDropBox() {
        // Add Commands here:

    	
    	// raise elevator
    	addSequential(new ElevatorUpAuto());
    	
    	// Drive Forward
    	addSequential(new DriveRobotForward(RobotMap.driveForwardTime, RobotMap.driveForwardSpeed));
        
        
        // Punch Forward
    	//addSequential(new  PunchForward());
        
        
        
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
