package src.sdf;

public class Car {

    private String registration;
    private String colour;
    private int year;
    private boolean started;

    public Car(String colour, String registration) {
        this.registration = registration;
        this.colour = colour;
    }

    public Car(){
        this.colour = "white";
    }

    public String getRegistration(){
        return this.registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStarted() {
        return started;
    }

    //methods
    public void start(){
        this.started = true;
    }

    public void stop(){
        this.started = false;
    }

    public void blowHorn(){
        System.out.println("Honk!");
    }
}