package main;
import java.util.*;

import senzors.*;
import gui.*;
import threads.*;

/**
 * Main class
 *
 * @author Matus Kislan
 *
 *
 */
public class Alarm {

   public static simulacia sim = new simulacia();
   public static Hodnoty hodnota = new Hodnoty();
   public static ArrayList<Senzor> pole = new ArrayList<Senzor>();
    /**
     * create default sensors
     * ,
     * create command line interface
     */
		Alarm(){
            vytvor();
            new CLI();
        }
    /**
     * Printing status of the submarine and status of sensors
     * ,
     * @param gui
     *      gui for printing text on textareas
     *
     * @throws InterruptedException
     */
    static void statistika(BasicGui gui) throws InterruptedException {
        String hodnoty= "";
        for(int i=1;i<=8;i++){
            switch(i){
                case 1:{hodnoty=hodnoty +"Hull: "+ hodnota.getHull()+"%\n";break;}
                case 2:{hodnoty=hodnoty +"Motors: "+hodnota.getMotor()+"%\n";break;}
                case 3:{hodnoty=hodnoty +"Oxygen: "+hodnota.getOxygen()+"%\n";break;}
                case 4:{hodnoty=hodnoty +"Fuel: "+hodnota.getFuel()+"%\n";break;}
                case 5:{hodnoty=hodnoty +"Water: "+hodnota.getWater()+"%\n";break;}
                case 6:{hodnoty=hodnoty +"Temperature: "+hodnota.getTemperature()+"\n";break;}
                case 7:{hodnoty=hodnoty +"Pressure: "+hodnota.getPressure()+"\n";break;}
                case 8:{hodnoty=hodnoty +"Speed: "+hodnota.getSpeed()+"\n";break;}
            }
        }
        hodnoty= hodnoty +"\n\n";
        for (Senzor aPole : pole) {
            String stav = "BROKEN";
            if (aPole.get_funkcny()) {
                stav = "OK";
            }
            hodnoty = hodnoty +""+ aPole.getMeno() + " Sensor with ID number: " + aPole.get_id() + " is " + stav + "  \n";
        }

        gui.setText(kontrola(hodnoty));
    }

    /**
     * This method checks if submarine is able to work
     * ,
     * @param gui
     *      gui for printing text on textareas
     *
     */
    static boolean konec(BasicGui gui){
        if(hodnota.getTemperature()>=100 || hodnota.getPressure()>=1600 || hodnota.getHull()== 0 || hodnota.getOxygen()==0 || hodnota.getWater()==100){gui.end(); return false;}

        return true;
    }
    /**
     * This method checks if values of sensors and submarine and then it will cause Alarm
     * ,
     * @param hodnoty
     *      string used in method before
     *
     * @return string which will be printed on textarea
     *
     */
    static String kontrola(String hodnoty){
        hodnoty=hodnoty + "\n\n";
        for (Senzor aPole : pole) {
            if (aPole.get_funkcny()) {

                    hodnoty = hodnoty + aPole.check(hodnota);
            }
        }

        return hodnoty;
    }
    /**
     * Starts whole submarine simulation
     *
     *
     *
     * @throws InterruptedException
     */
    public static void spusti() throws InterruptedException {
        Random generator;
        BasicGui gui = new BasicGui(sim, pole, hodnota);
        int random;
        generator = new Random();
        
        statistika(gui);

        while(konec(gui))
        {

            random = generator.nextInt(20)+1;
                //                                                                                  1.moznost
                if(random >= 1 && random <= 3)
                {
                    sim.break_senzor(gui,pole);
                }
               //                                                                                    2.moznost
                else if(random >=4 && random <=6)
                {
                    sim.check_sub(hodnota,gui);
                }
                //																				    3.moznost
                else if(random >=7 && random <=10)
                {
                    sim.position_check(gui,pole,hodnota);
                }
                //																					4.moznost
                else if(random >=11 && random <=14)
                {
                    sim.mines_check(gui,pole,hodnota);
                }
                //																				5.moznost
                else if(random >=15 && random <= 18)
                {
                   sim.missiles_check(gui,pole,hodnota);
                }
                //																				6.moznost
                else if ( random >=19 )
                {
                    sim.repair_senzors(gui,pole);
                }



            gui.setappend("\n");

            hodnota.decrease();

            statistika(gui);

            try {
                vrajnit.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
}


		private void vytvor(){	

				pole.add(new O2(1));
			    pole.add(new Palivo(2));
                pole.add(new Tlak(3));
                pole.add(new Rychlost(4));
                pole.add(new Voda(5));
                pole.add(new Teplota(6));
                pole.add(new Stav_lode(7));
                pole.add(new Motory(8));
                pole.add(new Miny(9));
                pole.add(new Torpeda(10));
                pole.add(new Senzor_polohy(11));

			}


    public static void main(String[] args){
     new Alarm();
    }
}