package org.firstinspires.ftc.teamcode.Subsystems;

import android.util.Log;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class feeder {
    private final DcMotor FeederMotor;

    private final double power = 1;
    private final double openPose = 0;
    private final double closePose = 1;

    public feeder(HardwareMap hardwareMap) {
        FeederMotor = hardwareMap.get(DcMotor.class, "feederMotor");
        FeederMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void runMotor(double pow) {
        FeederMotor.setPower(pow);
    }

    public void stopMotor() {
        runMotor(0);

    }

    public void feedForward(){
        runMotor(power);
    }

    public void feedBackward(){
        runMotor(-power);
    }
}
