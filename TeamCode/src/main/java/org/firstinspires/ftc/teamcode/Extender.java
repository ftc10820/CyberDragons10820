package org.firstinspires.ftc.teamcode;

public interface Extender {

    /*
     *MOVING THE EXTENDER PARAMETERS
     * 1. Speed
     * 2. Distance
     * 3. Time
     */

    public void up(double speed);
    public void up(double speed, double distance);
    public void up(double speed, int time);

    public void down(double speed);
    public void down(double speed, double distance);
    public void down(double speed, int time);

}
