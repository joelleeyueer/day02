package src.sdf;

public class CarMain {

    public static void main(String[] args){
        Car c = new Car();

        c.setColour("grey");
        c.setRegistration("asdasdasd");
        c.start();
        System.out.println("Car stated?" + c.isStarted());

        c.blowHorn();

        Car d = new Car();
        //d.setColour("red");
        System.out.println("Colour of my car is " + d.getColour());

        Car e = new Car("black", "S10283092");
        System.out.println("e car plate is " + e.getRegistration());
        System.out.println("e car colour is " + e.getColour());

        Porsche f = new Porsche();
        System.out.println("f porsche colour is " + f.getColour());
        f.setColour("purple");
        System.out.println("f porsche colour is " + f.getColour());
    }
}
