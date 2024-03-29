package org.firstinspires.ftc.teamcode.utilities;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
public class Hardware {
    HardwareMap hardwareMap = null;

    public DcMotorEx FLD = null;
    public DcMotorEx FRD = null;
    public DcMotorEx BLD = null;
    public DcMotorEx BRD = null;

    public DcMotorEx DWR = null;
    public DcMotorEx DWL = null;
    public DcMotorEx DWC = null;

    public DcMotorEx LL = null;
    public DcMotorEx RL = null;
    public DcMotorEx IN = null;

    public Servo RFS = null;
    public Servo LFS = null;

    public Servo FPS = null;
    public Servo BPS = null;

    public Servo AP = null;

    // Define a constructor that allows the OpMode to pass a reference to itself.
    public Hardware() {}

    public void init(HardwareMap initialMap) {
        hardwareMap = initialMap;

        // Motors
        FLD  = hardwareMap.get(DcMotorEx.class, "FLD");
        FRD = hardwareMap.get(DcMotorEx.class, "FRD");
        BLD = hardwareMap.get(DcMotorEx.class, "BLD");
        BRD = hardwareMap.get(DcMotorEx.class, "BRD");

        LL = hardwareMap.get(DcMotorEx.class, "LL");
        RL = hardwareMap.get(DcMotorEx.class, "RL");
        IN = hardwareMap.get(DcMotorEx.class, "IN");

        // Dead Wheels (Odometry Wheels/Encoders)
        DWR = hardwareMap.get(DcMotorEx.class, "FRD");
        DWL = hardwareMap.get(DcMotorEx.class, "BLD");
        DWC = hardwareMap.get(DcMotorEx.class, "FLD");

        // Servos
        LFS = hardwareMap.get(Servo.class, "LFS");
        RFS = hardwareMap.get(Servo.class, "RFS");
        FPS = hardwareMap.get(Servo.class, "FPS");
        BPS = hardwareMap.get(Servo.class, "BPS");
        AP = hardwareMap.get(Servo.class, "AP");

        // To drive forward, most robots need the motor on one side to be reversed, because the axles point in opposite directions.
        // Pushing the left stick forward MUST make robot go forward. So adjust these two lines based on your first test drive.
        // Note: The settings here assume direct drive on left and right wheels.  Gear Reduction or 90 Deg drives may require direction flips

        FLD.setDirection(DcMotorEx.Direction.REVERSE);
        FRD.setDirection(DcMotorEx.Direction.FORWARD);
        BLD.setDirection(DcMotorEx.Direction.REVERSE);
        BRD.setDirection(DcMotorEx.Direction.FORWARD);

        FLD.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        FRD.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        BLD.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        BRD.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);

        LL.setDirection(DcMotorEx.Direction.REVERSE);
        RL.setDirection(DcMotorEx.Direction.FORWARD);
        IN.setDirection(DcMotorEx.Direction.REVERSE);
    }

    public HardwareMap getHardwareMap() {
        return hardwareMap;
    }
}
