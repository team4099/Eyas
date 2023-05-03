package com.team4099.robot

import edu.wpi.first.wpilibj.RobotBase
import org.littletonrobotics.junction.LoggedRobot
import kotlin.time.ExperimentalTime

class Main {
  companion object {
    @ExperimentalTime
    @JvmStatic
    fun main(args: Array<String>) {
      RobotBase.startRobot { object : LoggedRobot() {} }
    }
  }
}
