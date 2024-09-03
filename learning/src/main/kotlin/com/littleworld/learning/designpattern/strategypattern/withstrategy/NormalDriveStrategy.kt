package com.littleworld.learning.designpattern.strategypattern.withstrategy

class NormalDriveStrategy: DriveStrategy {
    override fun drive(): String {
        println("Normal Drive Strategy")
        return "Normal Drive Strategy"
    }
}