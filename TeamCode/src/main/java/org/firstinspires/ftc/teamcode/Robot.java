package org.firstinspires.ftc.teamcode;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class Robot {

    //Robot Classes
    private Drivetrain driveTrain;
    private HashMap<String, Vision> visions;
    private HashMap<String, Sensor> sensors = new HashMap<>();
    //private Graber graber;
    private Extender extender;

    //Setters and getters
    //DRIVETRAIN
    public void setDriveTrain(Drivetrain drivetrainType){
        driveTrain = drivetrainType;
    }
    public Drivetrain getDriveTrain(){
        return driveTrain;
    }

    //EXTENDER
    public void setExtender(Extender extenderType){
        extender = extenderType;
    }
    public Extender getExtender(){
        return extender;
    }

    //SENSOR
    public void setSensor(String key, Sensor sensorType){
        sensors.put(key, sensorType);
    }
    public Sensor getSensor(String key){
        return sensors.get(key);
    }

    //VISION
    public void setVision(String key, Vision visionType){
        visions.put(key, visionType);
    }
    public Vision getVision(String key){
        return visions.get(key);
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
    public void rotate (double x, double y) throws Exception{
        if(getDriveTrain() == null){
            throw new Exception("No drive train found | Add drive train type");
        }else{
            driveTrain.rotate(x,y);
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
    public void sense (String key) throws Exception{
        if(getSensor(key) == null){
            throw new Exception("No sensor found in hashmap | Make sure you have the right key");
        }else{
            sensors.get(key).sense();
        }
    }

    //VISION FUNCTIONS
    public void see(String key) throws Exception{
        if(getSensor(key) == null){
            throw new Exception("No camera found i  n hashmap | Make sure you have the right key");
        }else{
            visions.get(key).see();
        }
    }
}
