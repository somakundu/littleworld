package com.littleworld.learning.designpattern.strategypattern.withoutstrategy

/*this is an open class because by default kotlin classes are final and cannot be inherited*/
public open class Vehicle {
    public open fun drive(): String{
        println("Plain Vehicle drive")
        return "Plain Vehicle drive"
    }


}