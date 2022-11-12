import java.util.ArrayList;
import java.util.Scanner;
public class MobilePhone extends Device {
    private int battery;
    private String colour;
    public MobilePhone(String name, int price, int discountRate, int stock, String mark, int ram, float screenSize, int memory, int id, int battery, String colour) {
        super(name, price, discountRate, stock, mark, ram, screenSize, memory, id);
        this.battery = battery;
        this.colour = colour;
    }
    public static ArrayList<MobilePhone> phones = new ArrayList<>();
    public static ArrayList<MobilePhone> makePhoneList() {
        MobilePhone mp1 = new MobilePhone("İphone 11", 1000, 10, 100,Marks.m3.getName(), 4, 6 , 64, 1, 4000, "Black");
        MobilePhone mp2=new MobilePhone("GALAXY A51",8000,20,200,Marks.m1.getName(), 4,7,64,2,5000,"White");
        MobilePhone mp3=new MobilePhone("Redmi Note10",5000,18,300,Marks.m9.getName(),8,8,128,3,4500,"Ross" );
        phones.add(mp1);
        phones.add(mp2);
        phones.add(mp3);
        return phones;
    }
    public static void showPhoneList() {
        System.out.println("Cep telefonu işlemleri");
        if(phones.isEmpty()){
            makePhoneList();
        }
        String leftAlignFormat = "| %-2s | %-12s | %-8s TL | %-8s | %-8d GB | %-8s | %-8s | %-5d GB | %-8s |%n";
        String line = "+------------------------------------------------------------------------------------------------------+%n";
        System.out.format(line);
        System.out.format("| ID | Ürün Adı     | Fiyat       | Marka    | Depolama    | Ekran    | Pil      | RAM      | Renk     |%n");
        System.out.format(line);


        for (MobilePhone phone : phones) {
            System.out.format(leftAlignFormat,phone.getId(),phone.getName(),phone.getDiscountRate(),
                    phone.getMark(),phone.getMemory(),phone.getScreenSize(),phone.getBattery(),
                    phone.getRam(), phone.getColour());
        }
    }


    public int getBattery() {return battery;}
    public void setBattery(int battery) {this.battery = battery;}
    public String getColour() {return colour;}
    public void setColour(String colour) {this.colour = colour;}
}





