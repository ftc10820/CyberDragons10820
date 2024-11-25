package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import static java.lang.Math.abs;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class MecanumDrive implements Drivetrain{

    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;

    //When you call new TankDrive it activates this, the constructor first, you can overload it too.
    //Initiates the movement motors

    //TODO: Figure out deviceName parameter
    public MecanumDrive (){
        frontLeft = hardwareMap.get(DcMotor.class, "");
        frontRight = hardwareMap.get(DcMotor.class, "");
        backLeft = hardwareMap.get(DcMotor.class, "");
        backRight = hardwareMap.get(DcMotor.class, "");
    }
    /*
    * If y = 0, the all motors = x
    * If x = 0, set the top left/bottom right to y and bottom left/top right to -y
    * If above is false and +x & +y then top left and bottom right = average of x + y
    * If above is false and +x & -y then bottom left and top right = average of -(x + abs(y))
    * If above is false and -x & +y
    * If above is false and -x & -y
    * If all is false then the robot shouldn't move (x = 0, y = 0)
    */
    @Override
    public void move(double x, double y) {
        final double THRESHOLD = .1;
        if (x < THRESHOLD && x > -THRESHOLD) { // x ~= 0 (forward)
            frontLeft.setPower(y);
            frontRight.setPower(-y);
            backLeft.setPower(-y);
            backRight.setPower(y);
        } else if (y < THRESHOLD && y > -THRESHOLD) { // y ~= 0 (strafe)
            frontLeft.setPower(x);
            frontRight.setPower(x);
            backLeft.setPower(x);
            backRight.setPower(x);
        } else if (x > 0 && y > 0){ // +x & +y (↗)
            frontLeft.setPower((x+y)/2);
            backRight.setPower((x+y/2));
        } else if (x > 0 && y < 0){ // +x & -y (↘)
            frontRight.setPower(-((x+abs(y))/2));
            backLeft.setPower(-((x+abs(y))/2));
        } else if (x < 0 && y > 0){ // -x & +y (↖)
            frontRight.setPower((abs(x)+y)/2);
            backLeft.setPower((abs(x)+y)/2);
        } else if (x < 0 && y < 0){ // -x & -y (↙)
            frontLeft.setPower(-((abs(x)+abs(y))/2));
            backRight.setPower(-((abs(x)+abs(y))/2));
        }
    }

    /*
     * Only listen to Y
     * Left is +y
     * Right is -y
     */
    @Override
    public void rotate(double x, double y) {
        frontLeft.setPower(y);
        backLeft.setPower(y);
        frontRight.setPower(-y);
        backRight.setPower(-y);
    }

    @Override
    public void stop() {
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }
}