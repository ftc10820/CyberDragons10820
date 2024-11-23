package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;

//TODO: Unfinished | Not used this year, if needed later use this class.

public class MecanumDrive implements Drivetrain{

    public DcMotorEx frontLeft;
    public DcMotorEx frontRight;
    public DcMotorEx backLeft;
    public DcMotorEx backRight;


    //MAX_SPEED used if the max speed is too fast.
    final private float MAX_SPEED = 1;

    @Override
    public void move(double x, double y) {

    }

    @Override
    public void stop() {

    }
}