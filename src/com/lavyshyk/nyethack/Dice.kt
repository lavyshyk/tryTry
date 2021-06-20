package com.lavyshyk.nyethack

class Dice {
    /**
     *
     */
    val rolledValue
        get() = (1..6).shuffled().first()
}