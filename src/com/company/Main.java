package com.company;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
static void insert(){
    System.out.println("MARKS FOR CHEMISTRY \n");
    Scanner che = new Scanner(System.in);
    int ch = che.nextInt();

    System.out.println("MARKS FOR english \n");

    int en = che.nextInt();

    System.out.println("MARKS FOR biology \n");

    int bi = che.nextInt();

    System.out.println("MARKS FOR physics \n");

    int py = che.nextInt();

    System.out.println("MARKS FOR maths \n");
    int mat = che.nextInt();


}
static void show() {


        System.out.println("MARKS FOR CHEMISTRY \n");
        Scanner che = new Scanner(System.in);
        int ch = che.nextInt();

        System.out.println("MARKS FOR english \n");

        int en = che.nextInt();

        System.out.println("MARKS FOR biology \n");

        int bi = che.nextInt();

        System.out.println("MARKS FOR physics \n");

        int py = che.nextInt();

        System.out.println("MARKS FOR maths \n");
        int mat = che.nextInt();
int x;
x=(ch+en+bi+py+mat);
        System.out.println(x+"  is the total mark you obtained" );
    }
    static void average(){
        System.out.println("MARKS FOR CHEMISTRY \n");
        Scanner che = new Scanner(System.in);
        int ch = che.nextInt();

        System.out.println("MARKS FOR english \n");

        int en = che.nextInt();

        System.out.println("MARKS FOR biology \n");

        int bi = che.nextInt();

        System.out.println("MARKS FOR physics \n");

        int py = che.nextInt();

        System.out.println("MARKS FOR maths \n");
        int mat = che.nextInt();

        int avg;
        avg=((ch+en+bi+py+mat)/5);
        System.out.println(avg+"is the total average you obtained");
    }




    public static void main(String[] args) {


        String[] MENU = {"ENTER marks", "Total marks", "Find average", "exit"};


        System.out.println("\n\nMENU\n\n1.ENTER marks\n2.Display marks\n3.Find average\n4.exit\n");
        Scanner emarks = new Scanner(System.in);
        int em = emarks.nextInt();





        if (em == 1) {
            System.out.println("please " + MENU[0]);
            insert();
        }


                if (em == 2) {

                    System.out.println(" to show you the" + MENU[1]);
                }
                if (em == 2) {
                    System.out.println("Enter the marks" );
                    {
                        show();
                    }
                }
                if (em == 3) {
                    System.out.println("enter the marks you obtained to " + MENU[2]);
                    if (em==3){
                        average();
                    }

                    else
                        System.out.println("\n\nexit");


                    }
                }


            }




