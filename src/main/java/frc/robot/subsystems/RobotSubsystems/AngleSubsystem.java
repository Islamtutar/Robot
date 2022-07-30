// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.RobotSubsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AngleSubsystem extends SubsystemBase {

  WPI_VictorSPX angleMotor = new WPI_VictorSPX(12);

  /** Creates a new AngleSubsystem. */
  public AngleSubsystem() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setAngleMotor(double speed) {
    angleMotor.set(speed);
  }
}
