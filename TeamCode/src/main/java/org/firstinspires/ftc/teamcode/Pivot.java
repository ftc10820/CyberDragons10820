package org.firstinspires.ftc.teamcode;
//Importing Modules

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.hardware.kauailabs.NavxMicroNavigationSensor;

public class Pivot {

    //defining pivot and NavX variables
    private DcMotor pivot;
    private NavxMicroNavigationSensor NavX;

    //adding functionality
    public void calibrateNavX(){
        //TODO: Calibrate NavX
    }

    public Pivot(DcMotor pivotMotor, NavxMicroNavigationSensor NavX){
        //TODO: initialize the pivot and calibrate NavX
    }

    public void turnPivot(){
        //TODO: Turn pivot based on NavX
    }

    private double readNavX(){
        //TODO: Read NavX
        double degrees = 0;
        return degrees;
    }
}
