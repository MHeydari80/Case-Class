package main;

public class MotherBoard extends Component {

    int cpuSocketType;
    String memoryType;
    boolean usb3;

        /////////Getter
    public int getCpuSocketType() {
        return cpuSocketType;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public boolean isUsb3() {
        return usb3;
    }

            /////////Setter
    public void setCpuSocketType(int cpuSocketType) {
        this.cpuSocketType = cpuSocketType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public void setUsb3(boolean usb3) {
        this.usb3 = usb3;
    }

        //////////Cunstructors
    public MotherBoard(String name, String manifacturer, int serialNumber, int cpuSocketType, String memoryType, boolean usb3) {

        super(name, manifacturer, serialNumber);

        this.setCpuSocketType(cpuSocketType);
        this.setMemoryType(memoryType);
        this.setUsb3(usb3);

    }
    
    @Override
    public String toString (){
    
        String motherBoardDetails=super.toString()+"CPU Socket : "+this.getCpuSocketType()+"\n"+"Memoy Type : "+this.getMemoryType()+"\n"+"USB3 Support : "+this.isUsb3()+"\n"+"\n"+"*************************";
        return "Motherboard Details \n\n"+motherBoardDetails;
    
    }

}
