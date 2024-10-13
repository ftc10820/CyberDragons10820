package org.firstinspires.ftc.teamcode;


public interface Drivetrain {

    //FORWARD

    //Moves forward without stopping at max speed
    public void forward();
    //Moves forward at a certain speed without stopping
    public void forward(double speed);
    //Moves forward at a certain speed for a certain time
    public void forward(double speed, int time);
    //Move forward a distance (using roadrunner)
    public void forward(float distance);

    //BACKWARDS

    //Moves backwards without stopping at max speed
    public void backward();
    //Moves backwards at a certain speed without stopping
    public void backward(double speed);
    //Moves backwards at a certain speed for a certain time
    public void backward(double speed, int time);
    //Move backwards a distance (using roadrunner)
    public void backward(float distance);

    //LEFT

    //Moves left without stopping at max speed
    public void left();
    //Moves left at a certain speed without stopping
    public void left(double speed);
    //Moves left at a certain speed for a certain time
    public void left(double speed, int time);
    //Move left a distance (using roadrunner)
    public void left(float distance);

    //RIGHT

    //Moves right without stopping at max speed
    public void right();
    //Moves right at a certain speed without stopping
    public void right(double speed);
    //Moves left at a certain speed for a certain time
    public void right(double speed, int time);
    //Move left a distance (using roadrunner)
    public void right(float distance);
}



