package com.littleworld.learning.designpattern.strategypattern.withstrategy

class CustomDriveStrategy: DriveStrategy {
    override fun drive(): String {
        println("custom drive strategy")
        return "custom drive strategy"
    }
}