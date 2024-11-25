//TODO: Unfinished | Not used this year, if needed later use this class.

package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class TankDrive implements Drivetrain{
    public DcMotor left;
    public DcMotor right;

    //When you call new TankDrive it activates this, the constructor first, you can overload it too.
    //Initiates the movement motors
    public TankDrive (){
        left = hardwareMap.get(DcMotor.class, "left");
        right = hardwareMap.get(DcMotor.class, "right");
    }




    //MAX_SPEED used if the max speed is too fast.
    final private float MAX_SPEED = 1;
    /*
    *If x = 0 all wheels = y
    * If y = 0, each wheel is x is opposite direction (rotate)
    * If neither of them are 0, then
     */
    @Override
    public void move(double x, double y) {
        final double THRESHHOLD = .3;
        if (x < THRESHHOLD && x > -THRESHHOLD) {
            left.setPower(y);
            right.setPower(y);
        } else if (y < THRESHHOLD && y > -THRESHHOLD) {
            left.setPower(x);
            right.setPower(-x);
        } else{

        }
    }

    @Override
    public void rotate(double x, double y) {

    }

    @Override
    public void stop() {
        left.setPower(0);
        right.setPower(0);
    }
}
