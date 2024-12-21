package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import static java.lang.Math.abs;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrivetrain implements Drivetrain{

    public DcMotorEx frontLeft;
    public DcMotorEx frontRight;
    public DcMotorEx backLeft;
    public DcMotorEx backRight;


    //When you call new TankDrive it activates this, the constructor first, you can overload it too.
    //Initiates the movement motors

    //TODO: Figure out deviceName parameter
    public MecanumDrivetrain(boolean brakeOn, DcMotorEx frontLeft, DcMotorEx frontRight, DcMotorEx backLeft, DcMotorEx backRight){
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
        // To drive forward, most robots need the motor on one side to be reversed, because the axles point in opposite directions.
        // Pushing the left and right sticks forward MUST make robot go forward. So adjust these two lines based on your first test drive.
        this.frontRight.setDirection(DcMotorEx.Direction.REVERSE);
        this.backRight.setDirection(DcMotorEx.Direction.REVERSE);
        this.frontLeft.setDirection(DcMotorEx.Direction.FORWARD);
        this.backLeft.setDirection(DcMotorEx.Direction.FORWARD);

        if(brakeOn){
            this.backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            this.backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            this.frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            this.frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }

    }

    public MecanumDrivetrain(DcMotorEx frontLeft, DcMotorEx frontRight, DcMotorEx backLeft, DcMotorEx backRight){
        this(false, frontLeft, frontRight, backLeft, backRight);
    }
    private MecanumDrivetrain(){

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
        double frontLeftPower;
        double backLeftPower;
        double frontRightPower;
        double backRightPower;
        y = Math.pow(y, 3);
        x = Math.pow(x, 3);
        double denominator = Math.max(Math.abs(y) + Math.abs(x), 1);
        frontLeftPower = (y - x) / denominator;
        backLeftPower = (y + x) / denominator;
        frontRightPower = (y + x) / denominator;
        backRightPower = (y - x) / denominator;
        frontLeft.setPower(frontLeftPower);
        frontRight.setPower(frontRightPower);
        backLeft.setPower(backLeftPower);
        backRight.setPower(backRightPower);

    }

    /*
     * Only listen to Y
     * Left is +y
     * Right is -y
     */
    @Override
    public void rotate(double x, double y) {
        frontLeft.setPower(-x);
        backLeft.setPower(-x);
        frontRight.setPower(x);
        backRight.setPower(x);
    }

    @Override
    public void stop() {
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }

    public void setBrake(boolean brakeOn){
        if(brakeOn){

        }
    }
}