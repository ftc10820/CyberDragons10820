package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class TankDrive implements Drivetrain{

    public DcMotorEx left;
    public DcMotorEx right;


    //MAX_SPEED used if the max speed is too fast.
    final private float MAX_SPEED = 1;

    //FORWARD

    /*
     *OVERLOADED FUNCTIONS:
     *Functions with the same name but with different implementations, or different parameters
     */

    public void forward(){ //Moves forward without stopping at MAX_SPEED (1)
        forward(MAX_SPEED, 0);
    }
    public void forward(double speed){ //Moves forward at a certain speed without stopping
        forward(speed, 0);
    }
    public void forward(double speed, int time){ //Moves forward at a certain speed for a certain time
        speed = Math.abs(speed);
        left.setPower(speed);
        right.setPower(speed);
        /*
         *If the time is set to 0 then it will run forever, that way in the forward() or forward(speed)
         *functions, you don't have to re-write the same code.
         */
        if(time != 0){
            try{
                Thread.sleep(Math.abs(time));
            }
            catch (Exception e){
                //Stops anyway
                //TODO: Put error detection on screen
            }
            left.setPower(0);
            right.setPower(0);
        }
    }
    public void forward(float distance){ //Move forward a distance (using roadrunner)
        //TODO: Implement Roadrunner
    }

    //BACKWARDS

    public void backward(){ //Moves backwards without stopping at MAX_SPEED (1)
        backward(MAX_SPEED, 0);
    }
    public void backward(double speed){ //Moves backwards at a certain speed without stopping
        backward(speed, 0);
    }
    public void backward(double speed, int time){ //Moves backwards at a certain speed for a certain time
        speed = Math.abs(speed);
        left.setPower(-speed);
        right.setPower(-speed);
        if(time != 0) {
            try {
                Thread.sleep(Math.abs(time));
            } catch (Exception e) {
                //Stops anyway
                //TODO: Put error detection on screen
            }
            left.setPower(0);
            right.setPower(0);
            
            
        }
    }
    public void backward(float distance){ //Move backwards a distance (using roadrunner)
        //TODO: Implement Roadrunner
    }

    //LEFT

    public void left(){ //Moves left without stopping at MAX_SPEED (1)
        left(MAX_SPEED, 0);
    }
    public void left(double speed){ //Moves left at a certain speed without stopping
        left(speed, 0);
    }
    public void left(double speed, int time) { //Moves left at a certain speed for a certain time
        speed = Math.abs(speed);
        left.setPower(-speed);
        right.setPower(speed);
        if (time != 0) {
            try {
                Thread.sleep(Math.abs(time));
            } catch (Exception e) {
                //Stops anyway
                //TODO: Put error detection on screen
            }
            left.setPower(0);
            right.setPower(0);
            
            
        }
    }
    public void left(float distance){ //Move left a distance (using roadrunner)
        //TODO: Implement Roadrunner
    }

    //RIGHT


    public void right(){ //Moves right without stopping at MAX_SPEED (1)
        right(MAX_SPEED, 0);
    }
    public void right(double speed){ //Moves right at a certain speed without stopping
        right(speed, 0);
    }
    public void right(double speed, int time){ //Moves right at a certain speed for a certain time
        speed = Math.abs(speed);
        left.setPower(speed);
        right.setPower(-speed);
        if(time != 0) {
            try {
                Thread.sleep(Math.abs(time));
            } catch (Exception e) {
                //Stops anyway
                //TODO: Put error detection on screen
            }
            left.setPower(0);
            right.setPower(0);
            
            
        }
    }
    public void right(float distance){ //Move right a distance (using roadrunner)
        //TODO: Implement Roadrunner
    }
}
