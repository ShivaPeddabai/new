package Singleton;

import Decorator.*;
import Factory.*;
import main.*;


import java.util.ArrayList;
import java.util.Scanner;

public class CarpetOrder extends CarpetMakeDisplay {
    Scanner input;
    int carpetSelection;
    CarpetFactory carpetFactory;
    ArrayList<Integer> extras;

    public CarpetOrder() {
        this.input = new Scanner(System.in);
        this.carpetFactory = new CarpetFactory();
        this.extras = new ArrayList();
    }

    public void displayMenu() {
        System.out.println("Choose from menu");
        System.out.println("1.Green Carpet");
        System.out.println("2.Purpul carpet");
        System.out.println("3.red carpet");
        System.out.println("4.White carpet");
    }

    public void takeOrder() {
        System.out.print("Choice: ");
        int choice = this.input.nextInt();
        Carpet t;
        if (choice == 1) {
            t = this.carpetFactory.getCarpet("Green");
            t = this.displayIngredient(t);
            System.out.println(t.makeCarpet());
        } else if (choice == 2) {
            t = this.carpetFactory.getCarpet("PURPLE");
            t = this.displayIngredient(t);
            System.out.println(t.makeCarpet());
        } else if (choice == 3) {
            t = this.carpetFactory.getCarpet("WhITE");
            t = this.displayIngredient(t);
            System.out.println(t.makeCarpet());
        } else if (choice == 4) {
            t = this.carpetFactory.getCarpet("RED");
            t = this.displayIngredient(t);
            System.out.println(t.makeCarpet());
        } else {
            System.out.println("Wrong input");
        }

    }

    public void makeCarpet() {
        System.out.println(" carpet is made");
    }

    public Carpet displayIngredient(Carpet t) {
        boolean a = true;

        while(a) {
            System.out.println();
            if (this.extras.size() == 3) {
                break;
            }

            System.out.println("Choose cloth");
            System.out.println("1.Silk");
            System.out.println("2.Woolen");
            System.out.println("3.Nylon");
            System.out.println("4.None");
            System.out.print("Choice: ");
            int choice = this.input.nextInt();
            boolean x;
            int i;
            if (choice == 1) {
                x = true;

                for(i = 0; i < this.extras.size(); ++i) {
                    if ((Integer)this.extras.get(i) == 1) {
                        System.out.println("");
                        x = false;
                    }
                }

                if (x) {
                    t = new SilkCarpetDecorator((Carpet)t);
                    System.out.println("Silk selected");
                    this.extras.add(1);
                }
            } else if (choice == 2) {
                x = true;

                for(i = 0; i < this.extras.size(); ++i) {
                    if ((Integer)this.extras.get(i) == 2) {
                        System.out.println("woolen selected");
                        x = false;
                    }
                }

                if (x) {
                    t = new WoolenCarpetDecorator((Carpet)t);
                    System.out.println("woolen selected");
                    this.extras.add(2);
                }
            } else if (choice != 3) {
                if (choice == 4) {
                    a = false;
                } else {
                    System.out.println("Wrong input");
                }
            } else {
                x = true;

                for(i = 0; i < this.extras.size(); ++i) {
                    if ((Integer)this.extras.get(i) == 3) {
                        System.out.println("Nylon selected");
                        x = false;
                    }
                }

                if (x) {
                    System.out.println("Nylon selected");
                    t = new NylonCarpetDecorator((Carpet)t);
                    this.extras.add(3);
                }
            }
        }

        return (Carpet)t;
    }
}
