/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Cellevator;
import frc.robot.Constants.CellevatorConstants;

public class HolderMotorManual extends CommandBase {

  private final Cellevator m_holder;
  /**
   * Creates a new HolderMotorManual.
   */
  public HolderMotorManual(Cellevator subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_holder = subsystem;
    addRequirements(m_holder);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_holder.runHolderMotor(CellevatorConstants.kHolderMotorSpeed); // runs the holder motor at a constant speed when the command starts 
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_holder.stopHolderMotor(); // stops the holder motor  
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
