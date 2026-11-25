package org.firstinspires.ftc.teamcode.Teleops;

import com.pedropathing.drivetrain.DrivePowers;
import com.pedropathing.follower.Follower;
import com.pedropathing.follower.ManualDrive;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.pedropathing.math.Pose;

import org.firstinspires.ftc.teamcode.pedro.Constants;
import org.firstinspires.ftc.teamcode.Subsystems.intake;
import org.firstinspires.ftc.teamcode.Subsystems.feeder;
import org.firstinspires.ftc.teamcode.Subsystems.shooter;
import org.firstinspires.ftc.teamcode.Subsystems.powerSwitch;


// This code will include drivetrain code, shooter code, and intermediary code
@TeleOp(name = "Full Teleop 1")
public class fullTeleopTest extends OpMode {

    powerSwitch powerSwitch = new powerSwitch();
    intake intake = new intake(hardwareMap);
    feeder feeder = new feeder(hardwareMap);
    shooter shooter = new shooter(hardwareMap);
    private Follower follower;
    double batteryVoltage;

    @Override
    public void init() {
        follower = Constants.create(hardwareMap);
    }

    @Override
    public void loop() {
        // Pedro Pathing's
        DrivePowers powers = ManualDrive.fieldCentric(
                gamepad1.left_stick_y,
                gamepad1.left_stick_x,
                -gamepad1.right_stick_x,
                follower.pose().heading()
        );

        follower.manual(powers);
        follower.update();
        Pose robotPose = follower.pose(); // returns a Pose object

        double batteryVoltage = powerSwitch.getVoltage();

        telemetry.addData("Battery Voltage", batteryVoltage);
        telemetry.addData("Robot X", robotPose.x());
        telemetry.addData("Robot Y", robotPose.y());
        telemetry.addData("Robot Heading", Math.toDegrees(robotPose.heading()));

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

        if(gamepad1.y){
            feeder.feedForward();
        }
        else if(gamepad1.x){
            feeder.feedBackward();
        }
        else{
            feeder.stopMotor();
        }

        if(gamepad1.right_trigger_pressed){
            shooter.outtake();
        }
        else{
            shooter.stopMotor();
        }
    }
}
