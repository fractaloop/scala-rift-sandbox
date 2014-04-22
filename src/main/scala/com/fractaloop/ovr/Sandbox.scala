package com.fractaloop.ovr

import de.fruitfly.ovr.OculusRift

object Sandbox extends App {
  val or = new OculusRift
  or.init

  val hmdInfo = or.getHMDInfo

  println("HMD initialized? " + or.isInitialized)
  println(hmdInfo)

  while (or.isInitialized) {
    or.poll()

    println("Yaw: " + or.getYaw + " Pitch: " + or.getPitch + " Roll: " + or.getRoll)

    try {
      Thread.sleep(100)
    } catch {
      case e: InterruptedException => e.printStackTrace()
    }
  }

  or.destroy()

}
