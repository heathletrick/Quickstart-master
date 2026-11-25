package org.firstinspires.ftc.teamcode.Teleops;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.intake;
import org.firstinspires.ftc.teamcode.Subsystems.shooter;

@TeleOp(name = "Shooter Test")
public class shooterTest extends OpMode {

    shooter shooter = new shooter(hardwareMap);

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if(gamepad1.right_trigger_pressed){
            shooter.outtake();
        }
        else {
            shooter.stopMotor();
        }

    }
}

