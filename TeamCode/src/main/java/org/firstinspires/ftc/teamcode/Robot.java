package org.firstinspires.ftc.teamcode;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class Robot {

    private Drivetrain driveTrain;
    //private HashMap<String, Vision> visions;
    private HashMap<String, Sensor> sensors = new HashMap<>();
    //private Graber graber;
    private Extender extender;

    //Setters and getters
    public void setDriveTrain(Drivetrain drivetrainType){
        driveTrain = drivetrainType;
    }
    public Drivetrain getDriveTrain(){
        return driveTrain;
    }

    public void setExtender(Extender extenderType){
        extender = extenderType;
    }
    public Extender getExtender(){
        return extender;
    }
//Would continue for each variable type
//Adders for the hashmaps

    //DRIVETRAIN FUNCTIONS
    public void move (double x, double y) throws Exception{
        if(getDriveTrain() == null){
            throw new Exception("No drive train found | Add drive train type");
        }else{
            driveTrain.move(x,y);
        }
    }
    public void stop () throws Exception{
        if(getDriveTrain() == null){
            throw new Exception("No drive train found | Add drive train type");
        }else{
            driveTrain.stop();
        }
    }

    //EXTENDER FUNCTIONS

    public void up(double speed) throws Exception{
        if(getDriveTrain() == null){
            throw new Exception("No extender found | Add extender type");
        }else{
            extender.up(speed);
        }
    }
    public void up(double speed, double distance) throws Exception{
        if(getDriveTrain() == null){
            throw new Exception("No extender found | Add extender type");
        }else{
            extender.up(speed, distance);
        }
    }
    public void up(double speed, int time) throws Exception{
        if(getDriveTrain() == null){
            throw new Exception("No extender found | Add extender type");
        }else{
            extender.up(speed, time);
        }
    }

    public void down(double speed) throws Exception{
        if(getDriveTrain() == null){
            throw new Exception("No extender found | Add extender type");
        }else{
            extender.down(speed);
        }
    }
    public void down(double speed, double distance) throws Exception{
        if(getDriveTrain() == null){
            throw new Exception("No extender found | Add extender type");
        }else{
            extender.down(speed, distance);
        }
    }
    public void down(double speed, int time) throws Exception{
        if(getDriveTrain() == null){
            throw new Exception("No extender found | Add extender type");
        }else{
            extender.down(speed, time);
        }
    }

    //SENSOR FUNCTIONS
    
    //VISION FUNCTIONS
}
