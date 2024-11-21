package org.firstinspires.ftc.teamcode;


public interface Drivetrain {

    //FORWARD

    public void forward();
    public void forward(double speed);
    public void forward(double speed, int time);
    public void forward(float distance);

    //BACKWARDS

    public void backward();
    public void backward(double speed);
    public void backward(double speed, int time);
    //Move backwards a distance (using roadrunner)
    public void backward(float distance);

    //LEFT

    public void left();
    public void left(double speed);
    public void left(double speed, int time);
    public void left(float distance);

    //RIGHT

    public void right();
    public void right(double speed);
    public void right(double speed, int time);
    public void right(float distance);
}



