package main;

public class Hdd extends Component {

    private int capacity;
    private int diskSpeed;

            /////////Getter
    public int getCapacity() {
        return capacity;
    }

    public int getDiskSpeed() {
        return diskSpeed;
    }

                /////////Setter
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDiskSpeed(int diskSpeed) {
        this.diskSpeed = diskSpeed;
    }

            //////////Cunstructors
    public Hdd(int capacity, int diskSpeed, String name, String manifacturer, int serialNumber) {
        super(name, manifacturer, serialNumber);
        this.capacity = capacity;
        this.diskSpeed = diskSpeed;
    }
    
    public String toString (){
    
        String ramDetails=super.toString()+"Capacity : "+this.getCapacity()+"\n"+"Disk Speed : "+this.getDiskSpeed()+"\n"+"*************************";
        return "HDD Details \n\n"+ramDetails;
    
    
    }
    
    

}
