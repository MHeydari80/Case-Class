package main;

public class Ram extends Component {

    int capacity;
    int frequency;

    /////////Getter
    public int getCapacity() {
        return capacity;
    }

    public int getFrequency() {
        return frequency;
    }

    /////////Setter
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

        //////////Cunstructors
    public Ram(String name, String manifacturer, int serialNumber, int capacity, int frequency) {

        super(name, manifacturer, serialNumber);
        this.setCapacity(capacity);
        this.setFrequency(frequency);

    }
    
    
    @Override
    public String toString (){
    
        String ramDetails=super.toString()+"Capacity : "+this.getCapacity()+"\n"+"Frequency : "+this.getFrequency()+"\n"+"*************************";
        return "Ram Details \n\n"+ramDetails;
    
    }

}
