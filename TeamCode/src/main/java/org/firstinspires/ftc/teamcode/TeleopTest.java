/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/*
 * This OpMode executes a Tank Drive control TeleOp a direct drive robot
 * The code is structured as an Iterative OpMode
 *
 * In this mode, the left and right joysticks control the left and right motors respectively.
 * Pushing a joystick forward will make the attached motor drive forward.
 * It raises and lowers the claw using the Gamepad Y and A buttons respectively.
 * It also opens and closes the claws slowly using the left and right Bumper buttons.
 *
 * Use Android Studio to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this OpMode to the Driver Station OpMode list
 */

@TeleOp(name="Robot: Object Oriented Test", group="Robot")

public class TeleopTest extends OpMode {


    //"Building" the robot
    Robot_DeepDive robot;
    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {

        //Setting the different things on the robot
        robot = new Robot_DeepDive(hardwareMap.get(Servo.class, "wrist"), hardwareMap.get(DcMotor.class, "pivot"), hardwareMap.get(DcMotor.class, "arm"), hardwareMap.get(CRServo.class, "intake"), hardwareMap.get(Servo.class, "elbow"), telemetry);
        robot.setDriveTrain(new MecanumDrivetrain(hardwareMap.get(DcMotorEx.class, "frontLeft"), hardwareMap.get(DcMotorEx.class, "frontRight"), hardwareMap.get(DcMotorEx.class, "backLeft"), hardwareMap.get(DcMotorEx.class, "backRight")));
        // Send telemetry message to signify robot waiting;
        telemetry.addData(">", "Robot Ready.  Press START.");
    }


        @Override
        public void loop() {
        double xGP1Left;
        double yGP1Left;

        double xGP1Right;
        double yGP1Right;

        double xGP2left;
        double yGP2left;
        double xGP2right;
        double yGP2right;


        xGP1Left = gamepad1.left_stick_x;
        yGP1Left = gamepad1.left_stick_y;

        xGP1Right = gamepad1.right_stick_x ;
        yGP1Right = gamepad1.right_stick_y;

        xGP2left = gamepad2.left_stick_x;
        yGP2left = gamepad2.left_stick_y;
        xGP2right = gamepad2.right_stick_x;
        yGP2right = gamepad2.right_stick_y;

        robot.move(xGP1Left, yGP1Left);
        robot.rotate(xGP1Right, yGP1Right);

        robot.extendArm(yGP2right);
        robot.liftArm(xGP2right);
        //robot.liftGrabberRelative(yGP2left);
        //robot.rotateGrabberRelative(xGP2left);

        //Gamepad 2 controls

        if (gamepad2.b)
            robot.intake();
        else if (gamepad2.x)
            robot.outtake();
        else
            robot.stopIntake();

        if(gamepad2.left_bumper){
            robot.rotateGrabber(.5);
            robot.liftGrabber(.65);
            //wrist.setPosition(.5);
            //elbow.setPosition(.65);
        } else if (gamepad2.right_bumper) {
            robot.rotateGrabber(0);
            robot.liftGrabber(1);
            //wrist.setPosition(0);
            //elbow.setPosition(1);
        }


        //MAY NEED TO REVISIT IN THE FUTURE
        if (gamepad2.dpad_left){
            //wrist.setPosition(0);
            robot.rotateGrabberRelative(1);
        }
        else if (gamepad2.dpad_right) {
            //wrist.setPosition(1);
            robot.rotateGrabberRelative(-1);
        }


        if (gamepad2.dpad_up){
            robot.liftGrabberRelative(1);
        }
        else if (gamepad2.dpad_down) {
            robot.liftGrabberRelative(-1);
        }


    }


    @Override
    public void stop() {
    }

}
