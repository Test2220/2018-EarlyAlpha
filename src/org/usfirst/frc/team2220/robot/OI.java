package org.usfirst.frc.team2220.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2220.robot.commands.ExampleCommand;

public class OI {

	

	Joystick driverStick = new Joystick(0);
	Joystick climberStick = new Joystick(1);
	
	
	Button tankDrive = new JoystickButton(driverStick, 5);
	Button climberButton = new JoystickButton(climberStick, 5);
	Button autoTurnButton = new JoystickButton(driverStick, 11);
	
	public Joystick getDriverStick() { 
		
		return driverStick;
		
	}
	
	public Joystick getClimberStick() {
		
		return climberStick;
		
	}


	
}
