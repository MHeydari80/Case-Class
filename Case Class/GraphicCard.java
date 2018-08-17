package main;

public class GraphicCard extends Component {

    private int capacity;
    private double frequency;
    boolean hdmiPort;

    /////////Getter
    public int getCapacity() {
        return capacity;
    }

    public double getFrequency() {
        return frequency;
    }

    public boolean getHdmiPort() {
        return hdmiPort;
    }

    /////////Setter
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setHdmiPort(boolean hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    public GraphicCard(String name, String manifacturer, int serialNumber, int capacity, double frequency, boolean hdmiPort) {

        super(name, manifacturer, serialNumber);

        this.setCapacity(capacity);
        this.setFrequency(frequency);
        this.setHdmiPort(hdmiPort);

    }

    public String toString() {

        String graphicCardDetails = super.toString() + "Capacity : " + this.getCapacity() +"\n"+ "Frequency : " + this.getFrequency() + "\n" + "HDMI Port : " + this.getHdmiPort()+"\n"+"*************************";

        return "Graphic Card Details \n\n" + graphicCardDetails;

    }

}
