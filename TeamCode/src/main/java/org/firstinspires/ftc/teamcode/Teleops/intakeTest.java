package org.firstinspires.ftc.teamcode.Teleops;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.intake;

@TeleOp(name = "Intake Test")
public class intakeTest extends OpMode {
    intake intake = new intake(hardwareMap);

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            intake.intake();
        }
        else if(gamepad1.b) {
            intake.outtake();
        }
        else if(gamepad1.left_bumper){
            intake.flowerIntake();
        }
        else {
            intake.stopMotor();
        }

    }
}


