package org.firstinspires.ftc.teamcode.Subsystems;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class intake {
    private final DcMotor IntakeMotor;
    private final Servo FlowerServo;
    final double power = 1;

    public intake(HardwareMap hardwareMap) {
        IntakeMotor = hardwareMap.get(DcMotor.class,"intakeMotor");
        FlowerServo = hardwareMap.get(Servo.class, "flowerServo");
        IntakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void runMotor(double pow){
        IntakeMotor.setPower(pow);
    }
    public void stopMotor(){
        runMotor(0);
        FlowerServo.setPosition(0);
    }
    public void intake(){
        runMotor(power);
    }

    public void flowerIntake(){
        FlowerServo.setPosition(1);
        runMotor(power);
    }
    public void outtake(){
        runMotor(-1);
    }
}

