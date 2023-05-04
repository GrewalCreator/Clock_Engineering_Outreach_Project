/**
 * Basic Car Object Example
 */

public class Car {

    // IDENTITY
    private int MAX_SPEED;
    private String bodyColor;
    private String carMake;
    private String carModel;

    // STATE
    private boolean isRunning;
    private int currentSpeed;


    // SETUP
    Car(String bodyColor, String carMake, String carModel, int maxSpeed){
        MAX_SPEED = maxSpeed;
        this.isRunning = false;
        this.bodyColor = bodyColor;
        this.carMake = carMake;
        this.carModel = carModel;
        this.currentSpeed = 0;
    }


    // BEHAVIOUR
    public void accelerate(int speedIncrease){
        if(isRunning) {
            currentSpeed += speedIncrease;
            if (currentSpeed > MAX_SPEED) currentSpeed = MAX_SPEED;
            return;
        }

        System.err.println("Cannot Accelerate Car When Not Running!");
    }

    public void decelerate(int speedDecrease){
        if(isRunning){
            currentSpeed -= speedDecrease;
            if(currentSpeed < 0) currentSpeed = MAX_SPEED;
            return;
        }

        System.err.println("Cannot decelerate Car When Not Running!");
    }
    public int getMaxSpeed(){return MAX_SPEED;}

    public void turnOn(){if(!isRunning) isRunning = true;}

    public void turnOff(){if(isRunning) isRunning = false;}

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
