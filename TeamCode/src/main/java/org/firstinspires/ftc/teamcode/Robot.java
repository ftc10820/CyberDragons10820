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


    void move (double x, double y) throws Exception{
        driveTrain.move(x,y);
        throw new Exception("You need to put what type of drive train is needed");
    }
    void stop() throws Exception{
        driveTrain.stop();
        throw new Exception("You need to put what type of drive train is needed");
    }

}
