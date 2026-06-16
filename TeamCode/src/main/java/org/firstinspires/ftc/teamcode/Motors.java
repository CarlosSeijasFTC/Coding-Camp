package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Motor Tests")
public class Motors extends OpMode {

    //Create Motor Object
    DcMotor motor1;


    @Override
    public void init() {
        telemetry.addLine("Init started!");

        //Hardware Map recipe. Must match configuration
        motor1 = hardwareMap.get(DcMotor.class, "motor");

        //Set mode running with encoders
        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    @Override
    public void start(){
        telemetry.clearAll();
    }

    @Override
    public void loop() {
        telemetry.addLine("Loop Started!");

        motor1.setPower(-gamepad1.left_stick_y);
    }
}
