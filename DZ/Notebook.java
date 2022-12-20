


public class Notebook{
    private String name;
    private String cpu;
    private int rom;
    private int hdd;
    private String video;
    private String color;
    private int price;
    
    public Notebook(String name, String cpu, int rom, int hdd, String video, String color, int price) {
        this.name = name;
        this.cpu = cpu;
        this.rom = rom;
        this.hdd = hdd;
        this.video = video;
        this.color = color;
        this.price = price;
        
    }

    @Override
    public String toString() {
        return String.format("\nNotebook:\nbrand - %s\ncpu - %s\nrom - %dgb\nhdd" +
        " - %dgb\nvideo - %s\ncolour - %s\nprice - $%s\n\n", name, cpu, rom, hdd, video, color, price);
    }


    public void setCpu(String cpu) {
        this.cpu = cpu;
    }


    public void setRom(int rom) {
        this.rom = rom;
    }


    public void setHdd(int hdd) {
        this.hdd = hdd;
    }


    public void setVideo(String video) {
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRom() {
        return rom;
    }

    public int getHdd() {
        return hdd;
    }

    public String getVideo() {
        return video;
    }

    public String getColour() {
        return color;
    }

    
    
}
