package org.usfirst.frc.team3575.robot.subsystems;

import org.usfirst.frc.team3575.robot.commands.PunchForward;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Punch extends Subsystem {
	public DoubleSolenoid punchSolenoid = new DoubleSolenoid(1,0);
	public Compressor compressor = new Compressor(0);
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new PunchForward());
    }
    	public void punchForward() {
    		punchSolenoid.set(DoubleSolenoid.Value.kForward);
    		
    	}
    	public void punchReverse() {
    		punchSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
}

