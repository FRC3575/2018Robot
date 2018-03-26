package org.usfirst.frc.team3575.robot.subsystems;

import org.usfirst.frc.team3575.robot.OI;
import org.usfirst.frc.team3575.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Climber extends Subsystem {
	
	private Talon climberDrive= new Talon(RobotMap.climberPort) ;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       // setDefaultCommand(new ClimbStop());
    	
    }
    
    public void climbJoystick() {
    	double climbThrottle = OI.myJoystick.getRawAxis(3);
    	climberDrive.setSpeed(climbThrottle);	
    }
    public void climbUp(double climbThrottle) {
    	climberDrive.setSpeed(climbThrottle);
    
    }  
    public void climbDown(double climbThrottle) {
    	climberDrive.setSpeed(climbThrottle);
    
    }
      public void climbStop() {
     	climberDrive.setSpeed(0.0);
      }
}