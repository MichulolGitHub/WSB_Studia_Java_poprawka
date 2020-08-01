package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Animal Dog = new Animal("Dog");

        Dog.feed();
        Dog.takeForAWalk();
        System.out.println("###########################");
        Dog.feed();
        Dog.feed();
        Dog.feed();
        Dog.feed();
        Dog.feed();
        Dog.feed();
        Dog.feed();
        System.out.println("###########################");
        Dog.takeForAWalk();
        Dog.takeForAWalk();
        Dog.takeForAWalk();
        Dog.takeForAWalk();
        Dog.takeForAWalk();
        System.out.println("###########################");
        System.out.println("###########################");
        Animal Cat = new Animal("Cat");
        Cat.takeForAWalk();
        Cat.takeForAWalk();
        Cat.takeForAWalk();
        Cat.takeForAWalk();
        Cat.takeForAWalk();
        Cat.takeForAWalk();
        Cat.feed();

        System.out.println("---------------------------------");
        Human me = new Human("Tom","XYZ");
        Car car = new Car ("A7","Audi",2019);
        Car car1 = new Car ("A7","Audi",2019);
        Car car2 = new Car ("A7","Audi",2019);
        me.car = car;
        System.out.println(me.car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        System.out.println(me);
        System.out.println(me.car);
        System.out.println(Dog);


    }
}
