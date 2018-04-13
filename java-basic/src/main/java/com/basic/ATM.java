package com.basic;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;
interface ATM {



    float withdraw(float availableFounds);

    float deposit();

    void enquiryBalance(float balance);

    int getAtmID();

    boolean checkPin(String pin);

    default void chooseEnglish(){
        System.out.println( "What would you like to do?\n" +
                "  Withdraw\n"+
                "  Deposit\n"+
                "  Balance\n"+
                "  Quit");
    }


    default void  createSession(){

        Random randInt=new Random();
        int session;
        session=randInt.nextInt(231231);
        System.out.println("Current session is " +session+"\nYou may shut down ATM inserting Exit \n");

    }
    static void  turnOff(){
        System.out.println("ATM is shutting down...");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.exit(0);
    }

}


class card{


    private float balance;

    public card(float balance){
        this.balance=balance;
    }

    public float getBalance(){
        return this.balance;
    }

    public void deposit(float payIn){
        this.balance=this.balance+payIn;
    }

    public void withdraw(float withdraw){
        this.balance = this.balance - withdraw;
    }


}



class ATMimpl implements ATM {
    Scanner sc= new Scanner(System.in);
    private int AtmID;


    public ATMimpl(int AtmID){
        this.AtmID=AtmID;

    }

    public int getAtmID() {
        return AtmID;
    }

    public boolean checkPin(String pin){
        boolean isInt=false;
        try {
            Integer.parseInt(pin);
            isInt = true;
        } catch (NumberFormatException e) {
        }


        return  pin.length()==4 && isInt;
    }


    public float withdraw(float availableFounds){
        System.out.println("How much would you like to withdraw?");
        float withdrowAmount =sc.nextFloat();
        if (availableFounds>=withdrowAmount) {
            System.out.println("Are you sure [y/n]?");
            String approval1 = sc.next();
            if (approval1.equals("y")) {
                System.out.println("Would you like to receive confirmation[y/n]?");
                String approval2 = sc.next();
                if (approval2.equals("y")) {
                    System.out.println("Collect your card and money");
                    try {
                        Thread.sleep(2500);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Collect confirmation");
                    try {
                        Thread.sleep(2500);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    return withdrowAmount;
                } else {
                    System.out.println("Collect your card and money");
                    try {
                        Thread.sleep(2500);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    return withdrowAmount;
                }
            } else {
                return 0;
            }
        } else {
            System.out.println("Insufficient funds");
            return 0;
        }




    }



    public float deposit(){
        System.out.println("How much would you like to pay in?");
        float deposite =sc.nextFloat();
        System.out.println("Are you sure [y/n]?");
        String approval3 =sc.next();
        if (approval3.equals("y")){
            System.out.println("Would you like to receive confirmation[y/n]?");
            String approval4 =sc.next();
            if (approval4.equals("y")){
                System.out.println("Insert your money into ATM and press Enter");
                try{System.in.read();}
                catch(Exception e){}
                System.out.println("Collect your card");
                try {
                    Thread.sleep(2500);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Collect confirmation");
                try {
                    Thread.sleep(2500);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                return deposite;
            } else {
                System.out.println("Insert your money into ATM and press Enter");
                try{System.in.read();}
                catch(Exception e){}
                System.out.println("Collect your card");
                try {
                    Thread.sleep(2500);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                return deposite;
            }
        } else {

            return 0;
        }
    }

    public void enquiryBalance(float balance){
        DecimalFormat df =new DecimalFormat("#####.##");
        System.out.println("Your current balance is "+ df.format(balance) + "$");

    }



}


class Application {
    public static void main(String[] args){


        Random rand =new Random();
        Scanner selectMenu = new Scanner(System.in);
        ATM myATM= new ATMimpl(rand.nextInt(7845));
        System.out.println("ATM " + myATM.getAtmID()+" has been started");
        myATM.createSession();
        card_insert:
        while(true) {

            System.out.println("Please insert your card, type any character and press Enter");
            String wait = selectMenu.next();
            if (wait.equals("Exit")) {
                ATM.turnOff();
            }
            card insertedCard = new card(new Random().nextInt(20000)+new Random().nextFloat());
            System.out.println("Please insert 4-digits PIN number");
            String getPin1;
            getPin1 = selectMenu.next();
            int errorPin =0;
            while (!myATM.checkPin(getPin1)) {
                errorPin=errorPin+1;
                System.out.println("Incorrect Pin. Please insert correct 4-digits PIN number.");
                getPin1 = selectMenu.next();
                if (errorPin==2){
                    System.out.println("Incorrect Pin entered three times, your card has been locked.");
                    continue card_insert;
                }
            }

            System.out.println("Accepted");
            menu:
            while (true) {
                myATM.chooseEnglish();
                String getSelection = selectMenu.next();
                switch (getSelection) {
                    case "Withdraw":
                        insertedCard.withdraw(myATM.withdraw(insertedCard.getBalance()));
                        System.out.println("Would you like to do any other operation[y/n]");
                        String cont = selectMenu.next();
                        System.out.println(cont);
                        if (cont.equals("y")){
                            continue menu;
                        }else{
                            System.out.println("Thank you, collect your card!");
                            break menu;
                        }
                    case "Deposit":
                        insertedCard.deposit(myATM.deposit());
                        System.out.println("Would you like to do any other operation[y/n]");
                        cont = selectMenu.next();
                        System.out.println(cont);
                        if (cont.equals("y")){
                            continue menu;
                        }else{
                            System.out.println("Thank you, collect your card!");
                            break menu;
                        }
                    case "Balance":
                        myATM.enquiryBalance(insertedCard.getBalance());
                        System.out.println("Would you like to do any other operation[y/n]");
                        cont = selectMenu.next();
                        System.out.println(cont);
                        if (cont.equals("y")){
                            continue menu;
                        }else{
                            System.out.println("Thank you, collect your card!");
                            break menu;
                        }
                    case "Quit":
                        System.out.println("Thank you, collect your card!");
                        break menu;
                    default:
                        System.out.println("Select valid option");
                }

            }
        }

    }


}

