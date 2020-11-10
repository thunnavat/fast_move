package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels[0] = new Parcel(5.0,ParcelStatus.READY_TO_SHIP,new Location(25,10.0));
        parcels[1] = new Parcel(2.0,ParcelStatus.SHIPPING,new Location(20.0,15.0));
        parcels[2] = new Parcel(10.0,ParcelStatus.DELIVERED,new Location(27.0,14.0));
        parcels[3] = new Parcel(55.0,ParcelStatus.READY_TO_SHIP,new Location(19.0,14.0));
        parcels[4] = new Parcel(14.0,ParcelStatus.READY_TO_SHIP,new Location(14.0,19.0));
        parcels[5] = new Parcel(9.0,ParcelStatus.DELIVERED,new Location(55.0,12.0));
        parcels[6] = new Parcel(10.0,ParcelStatus.SHIPPING,new Location(2.0,20.0));
        parcels[7] = new Parcel(5.0,ParcelStatus.READY_TO_SHIP,new Location(10.0,15.0));
        parcels[8] = new Parcel(40.0,ParcelStatus.READY_TO_SHIP,new Location(6.0,1.0));
        parcels[9] = new Parcel(21.0,ParcelStatus.READY_TO_SHIP,new Location(12.0,19.0));

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
