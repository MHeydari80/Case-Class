package main;

public class Case extends Component {

    private double width;
    private double height;
    private MotherBoard motherBoard;
    private Ram[] ram;
    private Cpu cpu;
    private GraphicCard graphicCard;
    private Hdd hdd[];
    private Nic nic[];
    private Power power;

    /////////Getter
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Ram[] getRam() {
        return ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public Hdd[] getHdd() {
        return hdd;
    }

    public Nic[] getNic() {
        return nic;
    }

    public Power getPower() {
        return power;
    }

    /////////Setter
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setRam(Ram[] ram) {
        this.ram = ram;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setHdd(Hdd[] hdd) {
        this.hdd = hdd;
    }

    public void setNic(Nic[] nic) {
        this.nic = nic;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public Case() {
    }

    public Case(String name, String manifacturer, int serialNumber, double width, double height, MotherBoard motherBoard, Ram[] ram, Cpu cpu, GraphicCard graphicCard, Hdd hdd[], Nic nic[], Power power) {

        super(name, manifacturer, serialNumber);

        this.setWidth(width);
        this.setHeight(height);
        this.setRam(ram);
        this.setCpu(cpu);
        this.setGraphicCard(graphicCard);
        this.setHdd(hdd);
        this.setNic(nic);
        this.setPower(power);
        this.setMotherBoard(motherBoard);

    }

    public String caseDitails() {

        return String.format("Case ditails \n\nHeight : %.3f\nWidth : %.3f\n*************************", this.getHeight(), this.getWidth());

    }

    public String toString() {

        String str = this.caseDitails();

        for (int i = 0; i < getRam().length;) {

            str += String.format("\n" + "[%d]" + ram[i], ++i);

        }
        for (int i = 0; i < getNic().length;) {

            str += String.format("\n" + "[%d]" + nic[i], ++i);

        }
        for (int i = 0; i < getHdd().length;) {

            str += String.format("\n" + "[%d]" + hdd[i], ++i);

        }
        
        str += "\n" + getMotherBoard() + "\n" + cpu.toString() + "\n" + graphicCard + "\n" + power;

        return str;
    }

}
