package main;

public class Nic extends Component {

    int speed;

        /////////Getter


    public int getSpeed() {
        return speed;
    }

            /////////Setter
 

    public void setSpeed(int speed) {
        this.speed = speed;
    }

        //////////Cunstructors
    public Nic(String name, String manifacturer, int serialNumber,  int speed) {

        super(name, manifacturer, serialNumber);
        this.setSpeed(speed);

    }
    
    
    @Override
    public String toString (){
    
        String nicDetails=super.toString()+"Speed : "+this.getSpeed()+"\n"+"*************************";
        return "NIC Details \n\n"+nicDetails;
    
    }

}
