import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
public class Marks {
    private  int id;
    private String name;
    public Marks(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static Marks m1=new Marks(1,"SAMSUNG");
    public static Marks m2=new Marks(2,"LENOVA");
    public static Marks m3=new Marks(3,"APPLE");
    public static Marks m4=new Marks(4,"Huawei");
    public static Marks m5=new Marks(5,"Casper");
    public static Marks m6=new Marks(6,"Asus");
    public static Marks m7=new Marks(7,"HP");
    public static Marks m8=new Marks(8,"Xiomi");
    public static Marks m9=new Marks(9,"Monster");

    ArrayList<Integer> abc=new ArrayList<>();



    public static void showMarks(){
        System.out.println("Markalar");
        ArrayList<Marks> marks=new ArrayList<Marks>();
        marks.add(m1);
        marks.add(m2);
        marks.add(m3);
        marks.add(m4);
        marks.add(m5);
        marks.add(m6);
        marks.add(m7);
        marks.add(m8);
        marks.add(m9);


        for (Marks marks1:marks){
            System.out.println("ID: "+marks1.getId()+" Marka: "+ marks1.getName());
            System.out.println("Marka kodu: "+marks1.hashCode());
        }
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
