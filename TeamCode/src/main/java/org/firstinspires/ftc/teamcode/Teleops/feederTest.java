package org.firstinspires.ftc.teamcode.Teleops;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.feeder;

@TeleOp
public class feederTest extends OpMode {

    feeder feeder = new feeder(hardwareMap);

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if(gamepad1.x){
            feeder.feedForward();
        }
        else if (gamepad1.y) {
           feeder.feedBackward();
        }
        else{
            feeder.stopMotor();
        }
    }
}
