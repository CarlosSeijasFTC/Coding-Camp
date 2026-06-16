package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "sample")
public class SampleOpMode extends OpMode {

    @Override
    public void init() {
        telemetry.addLine("Init started!");
    }

    @Override
    public void start(){
        telemetry.clearAll();
    }

    @Override
    public void loop() {
        telemetry.addLine("Loop Started!");
    }
}
