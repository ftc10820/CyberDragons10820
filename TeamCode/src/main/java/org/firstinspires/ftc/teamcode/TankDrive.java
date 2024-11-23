package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class TankDrive implements Drivetrain{
    //When you call new TankDrive it activates this, the constructor first, you can overload it too.
    public TankDrive (){
        public DcMotorEx left;
        public DcMotorEx right;

        left = hardwareMap.get(DcMotor.class, "left");
        right = hardwareMap.get(DcMotor.class, "right");
    }




    //MAX_SPEED used if the max speed is too fast.
    final private float MAX_SPEED = 1;

    @Override
    public void move(double x, double y) {

    }

    @Override
    public void stop() {

    }
}
