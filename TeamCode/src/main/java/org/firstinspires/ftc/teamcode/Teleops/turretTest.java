package org.firstinspires.ftc.teamcode.Teleops;

import com.pedropathing.follower.Follower;
import com.pedropathing.math.Pose;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.pedro.Constants;

import com.pedropathing.drivetrain.DrivePowers;
import com.pedropathing.follower.ManualDrive;
import com.qualcomm.robotcore.hardware.DcMotor;

/*
@TeleOp(name = "Turret Test")
public class turretTest extends OpMode {

    private Follower follower;
    DcMotor turret; 

// Define the robot pose at the start of the match
    Pose robotPose;


    @Override
    public void init() {
        follower = Constants.create(hardwareMap);
        turret = hardwareMap.get(DcMotor.class, "turretMotor");
    }
    Pose origin = new Pose(0,0,0);

    @Override
    public void loop() {
        DrivePowers powers = ManualDrive.fieldCentric(
                gamepad1.left_stick_y,
                gamepad1.left_stick_x,
                -gamepad1.right_stick_x,
                follower.pose().heading()
        );
        follower.manual(powers);
        follower.update();
        robotPose = follower.pose();

        telemetry.addData("Robot X", robotPose.y());
        telemetry.addData("Robot Y", robotPose.x());
        telemetry.addData("Robot Heading", Math.toDegrees(robotPose.heading()));
        telemetry.update();

        if (gamepad1.right_trigger_pressed){
            aimToObject(72, 72);
        }
    }

    public double scalingFactor = 4.10735294445;

    public double encoderTicksToAngle(int ticks){
        return (ticks*scalingFactor);
    }

    public double angleToEncoderTicks(double degrees){
        return (degrees/scalingFactor);
    }

    public void turnTurretBy(double degrees){
       
        double currentPosition = turret.getCurrentPosition();
        double TARGET_TICK_VALUE = angleToEncoderTicks(degrees) + currentPosition;

        turret.setTargetPosition((int) TARGET_TICK_VALUE);
        turret.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        turret.setPower(1);
    }


    // you would call aimtoobject when you want the turret to move.
    public void aimToObject(int objectX, int objectY){
       
        double robotYPosition = robotPose.x(), robotXPosition = robotPose.y();
        double destinationAngle = Math.atan2(objectY - robotYPosition,
                objectX - robotXPosition);

        double turretAngle = encoderTicksToAngle(turret.getCurrentPosition());
        double robotAngle = Math.toDegrees(robotPose.heading());

        double toTurn = destinationAngle - (turretAngle + robotAngle);
        turnTurretBy(toTurn%360); // take the mod/remainder of toTurn/360
        // to keep the angle in the range of [0,360]
    }
}
*/