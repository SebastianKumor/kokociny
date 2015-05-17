package main;


import gui.BasicGui;
import senzors.Miny;
import senzors.Senzor;
import senzors.Senzor_polohy;
import senzors.Torpeda;
import threads.vrajnit;

import java.util.ArrayList;
import java.util.Random;
/**
 * Simulation class contains methods which are used in simulation of submarine
 *
 * @author Matus Kislan
 */
public class simulacia {

    private Random generator;

    public simulacia() {
        generator = new Random();
    }
    /**
     * situation of broken sensor
     *
     * @param gui
     *      for printing outputs on textarea
     */
    public void break_senzor(BasicGui gui,ArrayList<Senzor> pole) throws InterruptedException {
        int pocet=0;
        int random;
        int option=generator.nextInt(pole.size());
        for (Senzor aPole : pole) {

            pocet++;
            if (pocet == option) {
                gui.setappend("Sensor with ID number " + aPole.get_id() + " is BROKEN\n");
                gui.setappend("Trying to repair...\n");
                vrajnit.sleep(2000);
                random = generator.nextInt(3);
                if (random == 1) {
                    gui.setappend("Sensor was successfully repaired\n");
                }
                else {
                    gui.setappend("Sensor failed to repair\n");
                    aPole.setfunkcny();
                }
            }
        }

    }
    /**
     * situation of repairing submarine
     *
     * @param gui
     *      for printing outputs on textarea
     *
     * @param hodnota
     *      for comparing values
     */
    public void check_sub(Hodnoty hodnota,BasicGui gui) throws InterruptedException {
        gui.setappend("Checking status of submarine...\n");

        if(hodnota.getHull() <100 || hodnota.getMotor() < 100){
            gui.setappend("Repairing submarine...\n");
            hodnota.normal();
            vrajnit.sleep(3000);
        }
        else{
            gui.setappend("Submarine is 100% OK\n");
        }
    }
    /**
     * situation of incoming ship
     *
     * @param gui
     *      for printing outputs on textarea
     * @param hodnota
     *      for comparing values
     */
    public void position_check(BasicGui gui,ArrayList<Senzor> pole,Hodnoty hodnota) throws InterruptedException {
        int random1,random;
        int cislo=0;
        boolean stav =false;
        for (Senzor aPole : pole) {
            if(aPole instanceof Senzor_polohy){
                if(aPole.get_funkcny()){
                    stav=true;
                    cislo=pole.indexOf(aPole);
                    break;
                }
            }
        }
        if(stav){
            gui.setappend("Position sensor with ID number: " + pole.get(cislo).get_id() + " noticed a boat/submarine approaching to submarine!!!\n");
            gui.setappend("Trying to avoid impact...\n");
            vrajnit.sleep(5000);
            random = generator.nextInt(3) + 1;
            if (random > 1) {
                gui.setappend("You have successfully avoided boat/submarine\n");
            } else {
                gui.setappend("You have been hit by boat/submarine, damage done to motors: " + (random = generator.nextInt(15) + 10) + " to hull: " + (random1 = generator.nextInt(20) + 10) + "\n");
                hodnota.setHull(random1);
                hodnota.setMotor(random);
            }
        }
        else{
            gui.setappend("You have been hit by boat/submarine, damage done to motors: " + (random = generator.nextInt(10) + 10) + " to hull: " + (random1 = generator.nextInt(15) + 10) + "\n");
            hodnota.setHull(random1);
            hodnota.setMotor(random);
            gui.setappend("There is no functional Position sensor!!!\n");
        }
    }
    /**
     * situation of mines
     *
     * @param gui
     *      for printing outputs on textarea
     * @param hodnota
     *      for comparing values
     */
    public void mines_check(BasicGui gui,ArrayList<Senzor> pole,Hodnoty hodnota) throws InterruptedException {
        int random1,random;
        int cislo=0;
        boolean stav =false;
        for (Senzor aPole : pole) {
            if(aPole instanceof Miny){
                if(aPole.get_funkcny()){
                    stav=true;
                    cislo=pole.indexOf(aPole);
                    break;
                }
            }
        }
       if(stav){
                    gui.setappend("Mines sensor with ID number: " + pole.get(cislo).get_id() + " noticed mine near submarine!!!\n");
                    gui.setappend("Trying to avoid impact...\n");
                    vrajnit.sleep(5000);
                    random = generator.nextInt(3) + 1;
                    if (random > 1) {
                        gui.setappend("You have successfully avoided mine\n");
                    }
                    else {
                        gui.setappend("You have hit mine, damage done to motors: " + (random = generator.nextInt(15) + 10) + " to hull: " + (random1 = generator.nextInt(20) + 10) + "\n");
                        hodnota.setHull(random1);
                        hodnota.setMotor(random);
                    }
                }
        else{
           gui.setappend("You have hit mine, damage done to motors: " + (random = generator.nextInt(15) + 10) + " to hull: " + (random1 = generator.nextInt(20) + 10) + "\n");
           hodnota.setHull(random1);
           hodnota.setMotor(random);
           gui.setappend("There is no functional Mines sensor!!!\n");
            }

        }
    /**
     * situation of incoming missile
     *
     * @param gui
     *      for printing outputs on textarea
     * @param hodnota
     *      for comparing values
     */
    public void missiles_check(BasicGui gui,ArrayList<Senzor> pole,Hodnoty hodnota) throws InterruptedException {
        int random1,random;
        int cislo=0;
        boolean stav =false;
        for (Senzor aPole : pole) {
            if(aPole instanceof Torpeda){
                if(aPole.get_funkcny()){
                    stav=true;
                    cislo=pole.indexOf(aPole);
                    break;
                }
            }
        }
        if(stav){
                        gui.setappend("Missiles sensor with ID number: " + pole.get(cislo).get_id() + " noticed torpedo approaching to submarine!!!\n");
                        gui.setappend("Trying to avoid impact...\n");
                        vrajnit.sleep(5000);
                        random = generator.nextInt(3) + 1;
                        if (random > 2) {
                            gui.setappend("You have successfully avoided torpedo\n");
                        }
                        else {
                            gui.setappend("You have been hit by torpedo, damage done to motors: " + (random = generator.nextInt(10) + 10) + " to hull: " + (random1 = generator.nextInt(10) + 10) + "\n");
                            hodnota.setHull(random1);
                            hodnota.setMotor(random);
                        }
                    }
        else{
            gui.setappend("You have been hit by torpedo, damage done to motors: " + (random = generator.nextInt(10) + 10) + " to hull: " + (random1 = generator.nextInt(10) + 10) + "\n");
            hodnota.setHull(random1);
            hodnota.setMotor(random);
            gui.setappend("There is no functional Missiles sensor!!!\n");
        }

    }
    /**
     * situation of repairing sensors
     *
     * @param gui
     *      for printing outputs on textarea
     */
    public void repair_senzors(BasicGui gui,ArrayList<Senzor> pole) throws InterruptedException {
        boolean stav=true;
        gui.setappend("Checking for BROKEN sensors...\n");
        for (Senzor aPole : pole) {
            if(!(aPole.get_funkcny())){
                stav=false;
                break;
            }
        }

        if(!stav){
            for (Senzor aPole : pole) {
                if (!aPole.get_funkcny()){
                    gui.setappend("Repairing BROKEN sensors...\n");
                    vrajnit.sleep(5000);
                    for(Senzor bPole : pole){
                        bPole.oprava();
                    }
                    gui.setappend("All sensors were repaired\n");
                    break;
                }
            }

        }
        else{
            gui.setappend("No BROKEN sensors found\n");
        }

    }

    /**
     * method for repairing submarine for button
     *
     * @param hodnota
     *      for comparing values
     */
    public void button_repairsub(Hodnoty hodnota) throws InterruptedException {

        if(hodnota.getHull() <100 || hodnota.getMotor() < 100){
            hodnota.normal();
        }
    }
    /**
     * method for repairing sensors for button
     *
     */
    public void button_repairsensors(ArrayList<Senzor> pole) throws InterruptedException {
            for (Senzor aPole : pole) {
                  aPole.oprava();

                }
    }




}
