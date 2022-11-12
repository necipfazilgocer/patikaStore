public  abstract class Device {
    private String name;
    private int price;
    private int discountRate;
    private int stock;
    private String mark;
    private int ram;
    private float screenSize;
    private int memory;
    private  int id;
    public Device(String name, int price, int discountRate, int stock, String mark, int ram, float screenSize, int memory,int id) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.mark = mark;
        this.ram = ram;
        this.screenSize = screenSize;
        this.memory = memory;
        this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
