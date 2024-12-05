package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class Robot {

    //Robot Classes
    private Drivetrain driveTrain;
    private HashMap<String, Vision> visions;
    private HashMap<String, Sensor> sensors = new HashMap<>();
    //private Graber graber;

    //Setters and getters
    //DRIVETRAIN
    public void setDriveTrain(Drivetrain driveTrain){
        this.driveTrain = driveTrain;
    }
    public Drivetrain getDriveTrain(){
        return driveTrain;
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
    public void move (double x, double y) {
        if(getDriveTrain() == null){
            telemetry.addLine("No drive train found | Add drive train type");
            telemetry.update();
        }else{
            driveTrain.move(x,y);
        }
    }
    public void rotate (double x, double y) {
        if(getDriveTrain() == null){
            telemetry.addLine("No drive train found | Add drive train type");
            telemetry.update();
        }else{
            driveTrain.rotate(x,y);
        }
    }
    public void stop () {
        if(getDriveTrain() == null){
            telemetry.addLine("No drive train found | Add drive train type");
            telemetry.update();
        }else{
            driveTrain.stop();
        }
    }

    //SENSOR FUNCTIONS
    public void sense (String key) {
        if(getSensor(key) == null){
            telemetry.addLine("No sensor found | Add sensor type");
            telemetry.update();
        }else{
            sensors.get(key).sense();
        }
    }

    //VISION FUNCTIONS
    public void see(String key) {
        if(getSensor(key) == null){
            telemetry.addLine("No camera found | Add camera type");
            telemetry.update();
        }else{
            visions.get(key).see();
        }
    }
}
