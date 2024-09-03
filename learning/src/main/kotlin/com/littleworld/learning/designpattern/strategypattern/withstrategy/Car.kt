package com.littleworld.learning.designpattern.strategypattern.withstrategy

open class Car(val driveStrategy: DriveStrategy) {
//    var driveStrategy: DriveStrategy ?= null

    //fun Car(driveStrategy: DriveStrategy){
      //  this.driveStrategy = driveStrategy
    //}

    fun drive(){
        println(driveStrategy.drive())
    }

}