package main;

public abstract class Component {

    private String name, manifacturer;
    private int serialNumber;

    //////////Getter Methods
    public String getName() {
        return name;
    }

    public String getManifacturer() {
        return manifacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    //////////Getter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setManifacturer(String manifacturer) {
        this.manifacturer = manifacturer;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    //////////Cunstructors
    public Component() {
    }

    public Component(String name, String manifacturer, int serialNumber) {

        this.setName(name);
        this.setManifacturer(manifacturer);
        this.setSerialNumber(serialNumber);

    }

    @Override
    public String toString() {

        String details = "Manifacturer : " + this.getManifacturer() + "\nName : " + this.getName() + "\nSerialNumber : " + this.getSerialNumber() + "\n";
        return details;

    }

}
