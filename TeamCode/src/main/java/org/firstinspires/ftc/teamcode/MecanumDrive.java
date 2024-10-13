package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;

import java.util.concurrent.ExecutionException;


public class MecanumDrive implements Drivetrain{


    public DcMotorEx frontLeft;
    public DcMotorEx frontRight;
    public DcMotorEx backLeft;
    public DcMotorEx backRight;

    final private float MAX_SPEED = 1;

    //FORWARD

    public void forward(){
        forward(MAX_SPEED, 0);
    }
    //Moves forward at a certain speed without stopping
    public void forward(double speed){
        forward(speed, 0);
    }
    //Moves forward at a certain speed for a certain time
    public void forward(double speed, int time){
        speed = Math.abs(speed);
        frontLeft.setPower(speed);
        frontRight.setPower(speed);
        backLeft.setPower(speed);
        backRight.setPower(speed);
        if(time != 0){
            try{
                Thread.sleep(Math.abs(time));
            }
            catch (Exception e){
                //Stops anyway
                //TODO: Put error detection on screen
            }
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
    }
    //Move forward a distance (using roadrunner)
    public void forward(float distance){
        //Would use roadrunner
    }

    //BACKWARDS

    //Moves backwards without stopping at max speed
    public void backward(){
        backward(MAX_SPEED, 0);
    }
    //Moves backwards at a certain speed without stopping
    public void backward(double speed){
        backward(speed, 0);
    }
    //Moves backwards at a certain speed for a certain time
    public void backward(double speed, int time){
        speed = Math.abs(speed);
        frontLeft.setPower(-speed);
        frontRight.setPower(-speed);
        backLeft.setPower(-speed);
        backRight.setPower(-speed);
        if(time != 0) {
            try {
                Thread.sleep(Math.abs(time));
            } catch (Exception e) {
                //Stops anyway
                //TODO: Put error detection on screen
            }
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
    }
    //Move backwards a distance (using roadrunner)
    public void backward(float distance){
        //Would use roadrunner
    }

    //LEFT

    //Moves left without stopping at max speed
    public void left(){
        left(MAX_SPEED, 0);
    }
    //Moves left at a certain speed without stopping
    public void left(double speed){
        left(speed, 0);
    }
    //Moves left at a certain speed for a certain time
    public void left(double speed, int time) {
        speed = Math.abs(speed);
        frontLeft.setPower(-speed);
        frontRight.setPower(speed);
        backLeft.setPower(-speed);
        backRight.setPower(speed);
        if (time != 0) {
            try {
                Thread.sleep(Math.abs(time));
            } catch (Exception e) {
                //Stops anyway
                //TODO: Put error detection on screen
            }
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
    }
    //Move left a distance (using roadrunner)
    public void left(float distance){
        //Would use roadrunner
    }

    //RIGHT

    //Moves right without stopping at max speed
    public void right(){
        right(MAX_SPEED, 0);
    }
    //Moves right at a certain speed without stopping
    public void right(double speed){
        right(speed, 0);
    }
    //Moves left at a certain speed for a certain time
    public void right(double speed, int time){
        speed = Math.abs(speed);
        frontLeft.setPower(speed);
        frontRight.setPower(-speed);
        backLeft.setPower(speed);
        backRight.setPower(-speed);
        if(time != 0) {
            try {
                Thread.sleep(Math.abs(time));
            } catch (Exception e) {
                //Stops anyway
                //TODO: Put error detection on screen
            }
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
    }
    //Move left a distance (using roadrunner)
    public void right(float distance){
        //Would use roadrunner
    }
}
