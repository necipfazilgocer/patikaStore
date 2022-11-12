import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        menu();
        int selectMenu=scanner.nextInt();
        switch (selectMenu){
            case 1: NoteBook.showNotebookList();
            break;
            case 2: MobilePhone.showPhoneList();
            break;
            case 3: Marks.showMarks();
            break;
            case 4:System.out.println("Çıkış yapıldı. ");
            break;
            default: {
                System.out.println("Hatalı giriş yapıldı.Tekrar deneyiniz.");
                menu();
                selectMenu = scanner.nextInt();
            }
        }
    }


    public static void menu(){
        System.out.println("Patika Store'a hoşgeldiniz.");
        System.out.println("1-NoteBook\n2-Cep telefonu\n3-Marka listele\n4-Çıkış");
    }




}