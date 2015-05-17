package gui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import main.Alarm;

import senzors.*;
import threads.*;

/**
 * Command line interface.
 *
 * @author      Matus Kislan
 *
 * create sensor, delete sensor, list of sensors
 */
public class CLI {
	
	
	public CLI(){
		uvod();
		try {
			vstup(Alarm.pole);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /**
     * show option for sensors.
     */
    public void ponuka(){

        System.out.println("1 - Oxygen sensor");
        System.out.println("2 - Fuel sensor");
        System.out.println("3 - Pressure sensor");
        System.out.println("4 - Speed sensor");
        System.out.println("5 - Water sensor");
        System.out.println("6 - Temperature sensor");
        System.out.println("7 - Hull sensor");
        System.out.println("8 - Motor sensor");
        System.out.println("9 - Mine sensor");
        System.out.println("10 - Missiles sensor");
        System.out.println("11 - Position sensor");
    }
    /**
     * delete sensor
     * @return true if sensor was successfully deleted
     * false if wrong ID was inserted
     *
     * @param id
     *         ID of sensor which is going to be deleted
     *
     *
     */        public boolean zmazsenzor(int id, ArrayList<Senzor> pole){
                 for(int i=0;i<pole.size();i++)
                 {
                     if(pole.get(i) !=null){
                         if(pole.get(i).get_id() == id)
                         {
                           pole.remove(i);
                           System.out.println("Sensor was successfully deleted");
                           return true;
                         }

                     }
                 }

                System.out.println("You have entered an invalid ID "+id);
                return false;

        }
    /**
     * create sensor with default value
     * @return true if sensor was successfully created
     *
     *
     * @param id
     *         ID of sensor which is going to be created
     *
     * @param typ
     *        defines which type of sensor is going to be created
     *
     */
        public boolean vytvorsenzor(int id,int typ, ArrayList<Senzor> pole){
            switch(typ){
                        case 1: {pole.add(new O2(id,80));break;}
                        case 2: {pole.add(new Palivo(id,50));break;}
                        case 3: {pole.add(new Tlak(id,1050));break;}
                        case 4: {pole.add(new Rychlost(id,80));break;}
                        case 5: {pole.add(new Voda(id,65));break;}
                        case 6: {pole.add(new Teplota(id,30));break;}
                        case 7: {pole.add(new Stav_lode(id,100));break;}
                        case 8: {pole.add(new Motory(id,100));break;}
                        case 9: {pole.add(new Miny(id,1));break;}
                        case 10: {pole.add(new Torpeda(id,1));break;}
                        case 11: {pole.add(new Senzor_polohy(id,1));break;}
                    }
                       return true;
            }
    /**
     * create sensor with own value
     * @return true if sensor was successfully created
     *
     *
     * @param id
     *         ID of sensor which is going to be created
     *
     * @param typ
     *        defines which type of sensor is going to be created
     * @param hodnota
     *        value added by user
     */
    public boolean vytvorsenzor(int id,int typ, ArrayList<Senzor> pole,int hodnota){
        switch(typ){
            case 1: {pole.add(new O2(id,hodnota));break;}
            case 2: {pole.add(new Palivo(id,hodnota));break;}
            case 3: {pole.add(new Tlak(id,hodnota));break;}
            case 4: {pole.add(new Rychlost(id,hodnota));break;}
            case 5: {pole.add(new Voda(id,hodnota));break;}
            case 6: {pole.add(new Teplota(id,hodnota));break;}
            case 7: {pole.add(new Stav_lode(id,hodnota));break;}
            case 8: {pole.add(new Motory(id,hodnota));break;}
        }
        return true;
    }
    /**
     * check for duplicated ID
     * @return true if there isn't duplicated ID
     *
     * false if there is duplicated ID
     *
     *
     * @param id
     *         ID of sensor which is going to be checked
     */
        public boolean check(ArrayList<Senzor> pole,int id){
            for (Senzor aPole : pole)
                if (aPole.get_id() == id) {
                    System.out.println("You have entered already used sensor's id" );
                    return false;
                }
            return true;
        }
    /**
     * First commands
     */
		public void uvod(){
            System.out.println("Nautilus Security System");
			System.out.println(" ");
			System.out.println("Enter the command");
			System.out.println("1 Create sensor");
			System.out.println("2 Delete sensor");
			System.out.println("3 List existing sensors");
            System.out.println("'start' - for starting simulation");
			System.out.println("x) End program");
			
		}
    /**
     * controls inputs
     *
     * main command line method
     *
     * @throws IOException
     */
		public void vstup(ArrayList<Senzor> pole) throws IOException{
			String vstup;
			vstup = br.readLine();
			
			if(vstup.equals("1")){
                System.out.println("Enter ID number:");
                int j = Integer.parseInt(br.readLine());
                if (!check(pole,j)) {
                vstup(pole);
                }

                System.out.println("What type of sensor do you want to create ? :");
                ponuka();
                int i= Integer.parseInt(br.readLine());
                if((i>=1) && (i<=8)){
                    System.out.println("Do you want to create sensor with (default value/own value)?:");
                    System.out.println("1) default value");
                    System.out.println("2) own value");
                    int p = Integer.parseInt(br.readLine());
                        if(p==1){
                        vytvorsenzor(j,i,pole);
                        }
                        else if(p==2){
                        hodnoty(i);
                        int hodnota=Integer.parseInt(br.readLine()) ;
                        vytvorsenzor(j,i,pole,hodnota);
                        }
                    else System.out.println("Wrong input");
                }
                else vytvorsenzor(j,i,pole);

                uvod();
                vstup(pole);
			}
            else if(vstup.equals("2")){
                System.out.println("Which sensor do you want to delete?");

                vypis(pole);
                System.out.println("Enter sensor's ID:");
                int i=Integer.parseInt(br.readLine());
                zmazsenzor(i,pole);

                uvod();
                vstup(pole);

            }
            else if (vstup.equals("3"))
            {
              vypis(pole);
              uvod();
              vstup(pole);

            }
            else if(vstup.equals("start")){
                new vrajnit().start();

                uvod();
                vstup(pole);
            }
            else if(vstup.equals("x")){
                System.exit(0);

            }
            else System.out.println("Wrong input");
                uvod();
                vstup(pole);
		}



    /**
     * prints list of sensors
     *
     *
     */
        public void vypis(ArrayList<Senzor> pole){
            String vypis = "";
            for (Senzor aPole : pole) {

                vypis = vypis + aPole.vypis_senzorov();


            }
            System.out.println(vypis);

        }
    /**
     * method for adding own values for sensors
     */
    public void hodnoty(int cislo){
        switch(cislo){
            case 1:   {System.out.println("Enter value (0-100):");break;}
            case 2:   {System.out.println("Enter value (0-100):");break;}
            case 3:   {System.out.println("Enter value (1000-1500):");break;}
            case 4:   {System.out.println("Enter value (0-100):");break;}
            case 5:   {System.out.println("Enter value (50-100):");break;}
            case 6:   {System.out.println("Enter value (22-100):");break;}
            case 7:   {System.out.println("Enter value (0-100):");break;}
            case 8:   {System.out.println("Enter value (0-100):");break;}
        }

    }
}
