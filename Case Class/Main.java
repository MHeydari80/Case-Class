package main;

public class Main {

    public static void main(String[] args) {

        Nic nic[] = new Nic[2];
        nic[0] = new Nic("Edimax WLan NIC EW-7728In", "Edimax", 915486611, 100);
        nic[1] = new Nic("Edimax WLan NIC EW-5413Iu", "Adata", 32897113, 1000);
        
        Cpu cpu = new Cpu("Pentium G4400", "Intel", 122348745, 4, 2.78);

        Ram ram []= new Ram[2];
        
        ram[0]=new Ram ("premie 288pin", "Adata", 457891214, 8, 2133);
        ram[1]=new Ram("king 486p", "kingstone", 56987113, 4, 1600);

        MotherBoard motherBoard = new MotherBoard("H81MHV3", "Asus", 87945613, 1151, "DDR4", true);

        GraphicCard graphicCard = new GraphicCard("Quadro P5000 ", "Pny", 46567821, 2, 4, true);

        Hdd hdd[] = new Hdd[2];
       
        hdd [0]=new Hdd(1024, 6, "Seagate SkyHawk ", "Seagate", 45613215);
        hdd [1]=new Hdd(500, 6, "WD ms13800 ", "WD", 54156413);

        Power power = new Power("GP480A-ES ", "Green", 45312312, 350);

        Case _case = new Case("Oraman", "Green", 12348711, 20.59, 16.38, motherBoard, ram, cpu, graphicCard, hdd, nic, power);

        System.out.println(_case);
        
    }

}
