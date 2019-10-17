import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.*;
import lejos.hardware.port.*;
import lejos.robotics.Color;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.hardware.Keys;
import lejos.utility.Delay;

class Bil6 {
	// Venstre
    static EV3ColorSensor Sensor2 = new EV3ColorSensor(SensorPort.S2);
    // Høyre
    static EV3ColorSensor Sensor3 = new EV3ColorSensor(SensorPort.S3);

    public static void main(String [] args) {

        float[] Sample2 = new float[Sensor2.sampleSize()];
        float[] Sample3 = new float[Sensor3.sampleSize()];
        Multithreading object = new Multithreading();

       	System.out.println("Ready");
        Button.waitForAnyPress();
        object.start();

        Motor.A.setSpeed(900);
        Motor.D.setSpeed(900);
        Motor.A.forward();
        Motor.D.forward();

        float black = 7;

        boolean keepGoing = true;

        while(keepGoing) {
            Sensor2.fetchSample(Sample2, 0);
            Sensor3.fetchSample(Sample3, 0);
            while(Sample2[0] == black && Sample3[0] != black) {
                Motor.A.setSpeed(700);
        		Motor.D.setSpeed(400);
        		Motor.A.forward();
        		Motor.D.forward();
                System.out.println("Left");
                Sensor2.fetchSample(Sample2, 0);
            	Sensor3.fetchSample(Sample3, 0);
            }
            while(Sample3[0] == black && Sample2[0] != black) {
                Motor.A.setSpeed(450);
        		Motor.D.setSpeed(700);
        		Motor.A.forward();
        		Motor.D.forward();
                System.out.println("Right");
                Sensor2.fetchSample(Sample2, 0);
            	Sensor3.fetchSample(Sample3, 0);
            }
        if(Button.readButtons() != 0){
			Motor.A.stop();
			Motor.D.stop();
			break;
		}
        }
	}
}