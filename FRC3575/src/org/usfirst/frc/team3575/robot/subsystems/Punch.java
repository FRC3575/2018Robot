package org.usfirst.frc.team3575.robot.subsystems;

import org.usfirst.frc.team3575.robot.commands.PunchForward;
import org.usfirst.frc.team3575.robot.commands.PunchReverse;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Punch extends Subsystem {
	private DoubleSolenoid punchSolenoid;
	public Compressor compressor;
	
	public Punch() {
		punchSolenoid = new DoubleSolenoid(1,0);
		compressor = new Compressor(0);
	}
	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new PunchReverse());
    }
    	public void punchForward() {
    		punchSolenoid.set(DoubleSolenoid.Value.kForward);
    		
    	}
    	public void punchReverse() {
    		punchSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
}

