package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "gamepads")
public class GamePads extends OpMode {

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
        telemetry.addData("LSX1", gamepad1.left_stick_x);
        telemetry.addData("LSY1", gamepad1.left_stick_y);
        telemetry.addData("A1", gamepad1.a);
    }
}
