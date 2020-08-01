package com.company;

public class Animal {


    final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;


        if (species.equals("Dog")){
            System.out.println("Species: Dog");
            weight = 20.0;

        } else if (species.equals("Lion")){
            System.out.println("Species: Lion");
            weight = 11.0;
        } else {
            System.out.println("Other Species");
            weight = 5.0;
        }


    }

public void feed(){

        if (weight > 0){
            System.out.println("Thank you for feeding me.");
            weight = weight +1;
            System.out.println("My acctual weight: " + weight);
        } else {
            System.out.println("You cant feed dead animal, sorry.");
        }


}

public void takeForAWalk(){

        if (weight > 0 ){
            System.out.println("What a nice trip.");
            weight = weight -1;

                if ( weight == 0){
                System.out.println("Your animal die, sorry.");
                 } else {
                System.out.println("My acctual weight: " + weight);

            }
        } else {
            System.out.println("You cant take for a walk your pet, sorry.");
        }

}

    public String toString(){
        return "Its: "+species+" Current weight: "+weight;
    }
}
