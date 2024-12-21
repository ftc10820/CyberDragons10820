package org.firstinspires.ftc.teamcode;

import android.sax.StartElementListener;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Robot_DeepDive extends RobotGeneric {
    Servo wrist;
    DcMotor pivot;
    DcMotor linearSlide;
    CRServo intake;
    Servo elbow;
    Telemetry telemetry;

    public Robot_DeepDive(Servo wrist, DcMotor pivot, DcMotor linearSlide, CRServo intake, Servo elbow, Telemetry telemetry){
        this.wrist = wrist;
        this.pivot = pivot;
        this.linearSlide = linearSlide;
        this.intake = intake;
        this.elbow = elbow;

        this.pivot.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.linearSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        this.telemetry = telemetry;
    }
    private Robot_DeepDive(){

    }

    //LINEAR SLIDE
    public void extendArm(double y){
        linearSlide.setPower(y);
    }
    public void stopExtendArm(){
        extendArm(0);
    }
    public void liftArm(double x){
        pivot.setPower(x);
    }
    public void stopLiftArm(){
        liftArm(0);
    }

    //"GRABBER"
    public void rotateGrabberRelative(double x){ //"wrist"
        wrist.setPosition(wrist.getPosition()+(x/1000));
    }
    public void rotateGrabber(double position){//"wrist"
        wrist.setPosition(position);
    }
    public void liftGrabberRelative(double y){//"elbow"
        elbow.setPosition(elbow.getPosition() + (-y/1000));
        telemetry.addData("Elbow Data: ", elbow.getPosition());
        telemetry.addData("Wrist Data: ", wrist.getPosition());

    }
    public void liftGrabber(double position){//"elbow"
        elbow.setPosition(position);
    }

    //INTAKE
    public void intake(double speed){
        intake.setPower(speed);
    }
    public void outtake(double speed){
        intake.setPower(-speed);
    }
    public void intake(){
        intake(1.0);
    }
    public void outtake(){
        outtake(1.0);
    }
    public void stopIntake(){
        intake.setPower(0.0);
    }
}
