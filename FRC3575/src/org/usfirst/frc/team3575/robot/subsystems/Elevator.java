package org.usfirst.frc.team3575.robot.subsystems;

import org.usfirst.frc.team3575.robot.OI;
import org.usfirst.frc.team3575.robot.RobotMap;
import org.usfirst.frc.team3575.robot.commands.ElevatorStop;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	
	private Spark elevatorDrive= new Spark(RobotMap.elevatorPort) ;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ElevatorStop());
    }
    
    
    public void elevatorJoystick() {
    	double elevatorThrottle = OI.myJoystick.getRawAxis(3);
    	elevatorDrive.setSpeed(elevatorThrottle);
    	
    }  
    public void elevatorup(double elevatorThrottle) {
    	elevatorDrive.setSpeed(elevatorThrottle);
    }  
    public void elevatordown(double elevatorThrottle) {
    	elevatorDrive.setSpeed(elevatorThrottle);
    }
     
     public void elevatorstop() {
     	elevatorDrive.setSpeed(0.0);
      }
     
}

