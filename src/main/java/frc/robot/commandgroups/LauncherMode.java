/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commandgroups;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.LauncherTestPID;
import frc.robot.commands.VisionAlign;
import frc.robot.subsystems.Cellevator;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Hopper;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Launcher;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class LauncherMode extends SequentialCommandGroup {
  /**
   * Creates a new LauncherMode.
   */
  public LauncherMode(Launcher launcher, Drivetrain drivetrain, Intake intake, Hopper hopper, Cellevator cellevator) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new VisionAlign(drivetrain).withTimeout(1.5), new LauncherTestPID(launcher), new PowerCellFlow(launcher, intake, hopper, cellevator));
  }
}
