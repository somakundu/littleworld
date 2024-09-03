package com.littleworld.learning.designpattern.strategypattern.withoutstrategy

class SportsVehicle : Vehicle() {

    override fun drive(): String{
        println("this is a special drive method")
        return "this is a special drive method"
    }

}