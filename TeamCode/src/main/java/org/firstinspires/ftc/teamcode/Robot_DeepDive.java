package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class Robot_DeepDive extends RobotGeneric {
    Servo wrist;
    DcMotor pivot;
    DcMotor linearSlide;
    CRServo intake;
    Servo elbow;
    public Robot_DeepDive(String Wrist, String Pivot, String LinearSlide, String Intake, String Elbow){
        wrist = hardwareMap.get(Servo.class, Wrist);
        pivot = hardwareMap.get(DcMotor.class, Pivot);
        linearSlide = hardwareMap.get(DcMotor.class, LinearSlide);
        intake = hardwareMap.get(CRServo.class, Intake);
        elbow = hardwareMap.get(Servo.class, Elbow);
    }
    private Robot_DeepDive(){

    }

    //LINEAR SLIDE
    public void moveLinearSlide(double y){
        linearSlide.setPower(y);
    }
    public void stopLinearSlide(){
        moveLinearSlide(0);
    }
    public void verticalLinearSlide(double x){
        pivot.setPower(x);
    }
    public void stopVerticalLinearSlide(){
        verticalLinearSlide(0);
    }

    //"GRABBER"
    public void rotateGrabberTele(double x){ //"wrist"
        wrist.setPosition(wrist.getPosition()+(x/1000));
    }
    public void rotateGrabber(double position){//"wrist"
        wrist.setPosition(position);
    }
    public void moveGrabberTele(double y){//"elbow"
        elbow.setPosition(elbow.getPosition() + (y/1000));
    }
    public void moveGrabber(double position){//"elbow"
        elbow.setPosition(position);
    }
    public void stopGrabber(){
        moveGrabber(0);
    }

    //INTAKE
    public void intake(double speed){
        intake.setPower(speed);
    }
}
