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
    public Robot_DeepDive(Servo Wrist, DcMotor Pivot, DcMotor LinearSlide, CRServo Intake, Servo Elbow){
        wrist = Wrist;
        pivot = Pivot;
        linearSlide = LinearSlide;
        intake = Intake;
        elbow = Elbow;
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
