package org.firstinspires.ftc.teamcode;


public interface Drivetrain {

    public void move(double x, double y);
    /*
    * If y = 0, the all motors = x
    * If x = 0, set the top left/bottom right to y and bottom left/top right to -y
    * If above is false and +x & +y then top left and bottom right = average of x + y
    * If above is false and +x & -y then bottom left and top right = average of -(x + abs(y))
    * If above is false and -x & +y
    * If above is false and -x & -y
    * If all is false then the robot shouldn't move (x = 0, y = 0)
    */

    public void rotate(double x, double y);
    public void stop();
}



