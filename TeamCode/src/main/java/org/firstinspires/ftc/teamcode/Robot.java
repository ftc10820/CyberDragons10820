package org.firstinspires.ftc.teamcode;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class Robot {

    private Drivetrain driveTrain;
    private HashMap<String, Vision> visions;
    //private HashMap<String, Sensor> sensors;
    //private Graber graber;
    private Extender extender;

    //Setters and getters
    public void setDriveTrain(Drivetrain driveSystem){
        driveTrain = driveSystem;
    }
    public Drivetrain getDriveTrain(){
        return driveTrain;
    }
//Would continue for each variable type
//Adders for the hashmaps


    public void forward() throws Exception {
        if(driveTrain != null) {
            driveTrain.forward();
        }else{
            throw new Exception("No drive train set in robot | Set drive train after instantiating");
        }

    }
    public void forward(double speed) throws Exception{
        if(driveTrain != null) {
            driveTrain.forward();
        }else{
            throw new Exception("No drive train set in robot | Set drive train after instantiating");
        }
    }
    public void forward(int or double speed, int time){}
        if(driverTrain != null){
            driveTrain.forward(speed, time);
        }else{
            //error notifying that there is no drivetrain set
        }
    }

    public void forward(int or double distance);

    public void back(int or double speed);

}
