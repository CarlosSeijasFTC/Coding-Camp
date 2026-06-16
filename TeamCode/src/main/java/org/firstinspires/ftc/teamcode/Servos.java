package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Servo Test")
public class Servos extends OpMode {

    //create Servo object
    Servo servo1;

    @Override
    public void init() {
        //Hardware Map Servo
        servo1 = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop() {
        servo1.setPosition(-gamepad1.left_stick_y);
    }
}
