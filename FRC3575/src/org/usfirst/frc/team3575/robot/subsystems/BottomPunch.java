package org.usfirst.frc.team3575.robot.subsystems;

import org.usfirst.frc.team3575.robot.commands.BottomPunchReverse;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BottomPunch extends Subsystem {
	private DoubleSolenoid bottomPunchSolenoid;
		public Compressor compressor;
		
		public BottomPunch() {
			bottomPunchSolenoid = new DoubleSolenoid(2,3);
			compressor = new Compressor(0);
		
		}

public void initDefaultCommand() {
	setDefaultCommand(new BottomPunchReverse()); 
}
	public void bottomPunchForward() {
		bottomPunchSolenoid.set(DoubleSolenoid.Value.kForward);	
	}
	public void bottomPunchReverse() {
		bottomPunchSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
}