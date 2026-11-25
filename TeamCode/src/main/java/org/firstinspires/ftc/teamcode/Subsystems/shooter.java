package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class shooter {
    private final DcMotor ShooterMotor;
    private final Servo BlockerServo;
    private final double power = 1;


    public shooter(HardwareMap hardwareMap) {
        ShooterMotor = hardwareMap.get(DcMotor.class, "shooterMotor");
        BlockerServo = hardwareMap.get(Servo.class, "blockerServo");
        ShooterMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void runMotor(double pow){
        ShooterMotor.setPower(pow);
    }

    public void stopMotor() {
        runMotor(0);
        BlockerServo.setPosition(0);
    }

    public void outtake(){
        runMotor(power);
        BlockerServo.setPosition(1);
    }
}
