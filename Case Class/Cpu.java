package main;

public class Cpu extends Component {

    private double frequency;
    private int core;

    /////////Getter
    public double getFrequency() {
        return frequency;
    }

    public int getCore() {
        return core;
    }

        /////////Setter
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setCore(int core) {
        this.core = core;
    }

        //////////Cunstructors
    public Cpu(String name, String manifacturer, int serialNumber, int core, double frequency) {

        super(name, manifacturer, serialNumber);

        this.setCore(core);
        this.setFrequency(frequency);
    }

    @Override
    public String toString (){
    
        String cpuDetails=super.toString()+"NumberOfcores : "+this.getCore()+"\n"+"Frequency : "+this.getFrequency()+"\n"+"*************************";
        return "CPU Details \n\n"+cpuDetails;
    
    }
}
