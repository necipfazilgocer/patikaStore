import java.util.ArrayList;
public class NoteBook extends Device {
    public NoteBook(String name, int price, int discountRate, int stock, String mark, int ram, float screenSize, int memory, int id) {
        super(name, price, discountRate, stock, mark, ram, screenSize, memory, id);
    }
    public static ArrayList<NoteBook> notebooks = new ArrayList<>();
    public static ArrayList<NoteBook> makeNoteBookList() {
        NoteBook nb1=new NoteBook("Makebook 14",15000,12,50, Marks.m4.getName(), 8,14,1024,1);
        NoteBook nb2=new NoteBook("TUF gaming",17000,15,70, Marks.m6.getName(), 216,16,1024,2);
        NoteBook nb3=new NoteBook("V14 IGL",3699,25,150,Marks.m2.getName(),8,15,1024,3 );
        notebooks.add(nb1);
        notebooks.add(nb2);
        notebooks.add(nb3);
        return notebooks;
    }
    public static void showNotebookList() {
        System.out.println("Notebook işlemleri");
        if(notebooks.isEmpty()){
            makeNoteBookList();
        }
        String leftAlignFormat = "| %-2s | %-12s | %-8s TL | %-8s | %-8d GB | %-8s | %-5d GB |%n";
        String line = "+--------------------------------------------------------------------------------+%n";
        System.out.format(line);
        System.out.format("| ID | Ürün Adı     | Fiyat       | Marka    | Depolama    | Ekran inch| RAM      |%n");
        System.out.format(line);
        for (NoteBook noteBook : notebooks) {
            System.out.format(leftAlignFormat,noteBook.getId(),noteBook.getName(),noteBook.getPrice(),
                    noteBook.getMark(),noteBook.getMemory(),noteBook.getScreenSize(),noteBook.getRam());
        }
    }
}








