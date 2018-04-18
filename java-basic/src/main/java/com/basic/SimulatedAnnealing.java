package com.basic;

import java.util.Random;
import java.lang.Math;
interface Quest{

    double process(double x);
}

// Poniżej zaimplementowałem algorytm wyżarzania symulowanego szukający
// globalnego minumum funkcji znajdujących się w dwóch zdefinowanych klasach
class DeadIslandQuest implements Quest{
    public double process(double x){
        return x+Math.pow(3, 2)+Math.pow(x,2)+Math.pow(2,3.40);


    }
}

class EliteKnightQuest implements Quest{
    public double process(double x){
        return x+Math.pow(3, 5)+Math.pow(x,2.4)+Math.pow(2,5);
    }
}

class Knight{

    public void simulatedAnnealing(Quest quest,double x,double alpha, double temperature, double delta,int maxIter){
        double x_s=x;
        boolean finished=false;
        int currIter=1;
        double f_opt=quest.process(x_s);
        double x_opt=x_s;
        double random_cs_seed;
        double random_activ_prob;
        while(!finished) {
            currIter=currIter+1;
            random_cs_seed = new Random().nextDouble();
            double x_c = x_s + (-delta + 2 * delta * random_cs_seed);
            double f_s = quest.process(x_s);
            double f_c = quest.process(x_c);
            double A = Math.min(1, Math.exp(-(f_c - f_s)/ temperature));
            random_activ_prob=new Random().nextDouble();
            if (random_activ_prob<A){
                x_s=x_c;

            }

            temperature=temperature*alpha;

            if (currIter<maxIter){
                if(f_s<f_opt){
                    f_opt=f_s;
                    x_opt=x_s;

                }
            }else {
                finished=true;
            }


        }
        System.out.println("Knight find "+ x_opt +" as best possible value for x argument of the given function which results in optimal solution equal to " + f_opt);
    }
}



class SimulatedAnnealing {
//    public static void main(String[] args){
//
//        Knight kn=new Knight();
//
//
//        kn.simulatedAnnealing(new DeadIslandQuest(),5.00,0.94,89,0.34,10000);
//
//
//        kn.simulatedAnnealing(new EliteKnightQuest(),5.00,0.94,89,0.34,10000);
//
//    }


    public static void main(String[] args) {
        String lam;
       lam= (a,b)-> System.out.println("Stop"+a);
    }


}