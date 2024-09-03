package com.littleworld.learning.designpattern.strategypattern.withstrategy

import com.littleworld.learning.designpattern.strategypattern.withoutstrategy.Vehicle

class SportsCar : Car(CustomDriveStrategy()) {

}