package main;
/**
 * Class contains status of submarine
 *
 * @author Matus Kislan
 */
public class Hodnoty {

   private int hull;
    private int motor;
    private int oxygen;
    private int fuel;
    private int speed;
    private int temperature;
    private int pressure;
    private int water;

    /**
     * Creating values for variables of submarine status
     *
     */
  public Hodnoty(){
      //100%
    hull = 100;
    motor = 100;
    oxygen = 100;
    fuel = 100;
    water = 50;

    //normalne hodnoty
    speed = 100;
    temperature = 22;
    pressure = 1000;
  }
    /**
     * get Hull
     *
     * @return int Hull
     */
    public int getHull(){
        return hull;
    }
    /**
     * get Motor
     *
     * @return int Motors
     */
    public int getMotor(){
        return motor;
    }
    /**
     * get Oxygen
     *
     * @return int Oxygen
     */
    public int getOxygen(){
        return oxygen;
    }
    /**
     * get Fuel
     *
     * @return int Fuel
     */
    public int getFuel(){
        return fuel;
    }
    /**
     * get Speed
     *
     * @return int Speed
     */
    public int getSpeed(){
        return speed;
    }
    /**
     * get Temperature
     *
     * @return int Temperature
     */
    public int getTemperature(){
        return temperature;
    }
    /**
     * get Pressure
     *
     * @return int Pressure
     */
    public int getPressure(){
        return pressure;
    }
    /**
     * get water
     *
     * @return int water
     */
    public int getWater(){
        return water;
    }
    /**
     * set Hull
     *
     * @param i
     *      hull - i
     */
     void setHull(int i){
        hull= hull-i;
    }

    /**
     * set motor
     *
     * @param i
     *      motor - i
     */
     void setMotor(int i) {
        motor = motor-i;
    }
    /**
     * set oxygen
     *
     * @param i
     *      oxygen - i
     */
     void setOxygen(int i) {
        oxygen = oxygen-i;
    }
    /**
     * set fuel
     *
     * @param i
     *      fuel - i
     */
     void setFuel(int i) {
        fuel = fuel-i;
    }
    /**
     * set speed
     *
     * @param i
     *      speed - i
     */
     void setSpeed(int i) {
        speed = speed-i;
    }
    /**
     * set temperature
     *
     * @param i
     *      temperature - i
     */
     void setTemperature(int i) {
        temperature = temperature+i;
    }
    /**
     * set water
     *
     * @param i
     *      water - i
     */
     void setWater(int i) {
        water = water+i;
    }
    /**
     * set pressure
     *
     * @param i
     *      pressure - i
     */
     void setPressure(int i) {
         pressure = pressure + i;
    }
    /**
     * method which will call setters when values of submarine will be low
     */
     void decrease(){
        if(getHull() <=40){
            setWater(2);
        }
        else if(getHull() <=60){
            setWater(1);
        }
        if(getMotor() <=40){
            setSpeed(2);
            setFuel(3);
            setTemperature(1);
        }
        else if(getMotor() <=60){
            setSpeed(1);
            setFuel(2);
        }
        if(getHull() <= 35){
            setPressure(10);
            setTemperature(2);
        }
        else if(getHull() <=65){
            setPressure(5);
        }
        if(getHull() < 50){
            setOxygen(1);
        }
        setFuel(1);
        setOxygen(1);

    }
    /**
     * set values to normal
     */
     void normal()
    {
        hull=100;
        motor=100;
        water=50;
        pressure=1000;
        temperature=22 ;
        speed=100 ;
    }
}
