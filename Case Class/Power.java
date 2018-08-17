package main;

public class Power extends Component {

    private int outPutPower;

        /////////Getter
    public int getOutPutPower() {
        return outPutPower;
    }

        /////////Setter
    public void setOutPutPower(int outPutPower) {
        this.outPutPower = outPutPower;
    }

            //////////Cunstructors
    public Power() {
    }

    public Power(String name, String manifacturer, int serialNumber, int outPutPower) {

        super(name, manifacturer, serialNumber);
        this.setOutPutPower(outPutPower);

    }
    
    public String toString (){
    
         String powerDetails=super.toString()+"OutPut Power : "+this.getOutPutPower()+"\n";
        return "Power Details \n\n"+powerDetails;
    
    }

}
