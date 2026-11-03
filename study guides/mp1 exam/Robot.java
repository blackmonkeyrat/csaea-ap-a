//CLASS: Blueprint / template that will CREATE objects. Is a category that stores methods/functions and data, etc.
//CLASS HEADER
public class Robot {
    
    //ATTRIBUTES / DATA: Private instance variables.
    private String name;
    private String serial;
    private double battery;
    private boolean isOn;

    //CONSTRUCTOR: Special method; starting point for new objects. No return type, same name as class.
    //PARAMETERS: name, serial, battery.
    public Robot(String name, String serial, double battery) {

        //THIS: Instance variables vs. parameter.
        this.name = name;
        this.serial = serial;
        this.battery = battery;

        //DEFAULT STATE: every Robot starts off.
        this.isOn = false;

    }

    //GETTER / ACCESSOR: Return type matches variable.
    public String getName() {
        return name;
    }

    public double getBattery() {
        return battery;
    }

    public boolean isOn() {
        return isOn;
    }

    //SETTERS / MUTATORS: Always void. PARAMETER recieves an ARGUMENT.
    public void setName(String newName) {
        name = newName;
    }

    public String toString() {
        return name + " [" + serial + "]";
    }

    public boolean serialContains(String part) {
        return serial.indexOf(part) != -1;
    }

}