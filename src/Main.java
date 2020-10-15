
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Menu menu= new Menu();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap 1 de them danh ba");
        System.out.println("Nhap 2 de in danh ba");
        System.out.println("Nhap 3 de sua danh ba");
        System.out.println("Nhap 4 de xoa danh ba");
        System.out.println("Nhap 5 de tim kiem theo ten");
        System.out.println("Nhap 6 de tim kiem theo so dien thoai");
        System.out.println("Nhap 0 de ket thuc");
        while(true){
            String inPut= sc.nextLine();
            switch(inPut){
                case"1":{menu.add();}
                case"2":{
                    for(int i=0; i < menu.list.size(); i++)
                        menu.show(i);
                }
                case"3":{
                    System.out.println("Vui long nhap so dien thoai");
                    String number= sc.nextLine();
                    menu.change(number);
                }
                case"4":{
                    System.out.println("Vui long nhap so dien thoai");
                    String number= sc.nextLine();
                    menu.delete(number);
                }
                case"5":{
                    System.out.println("Vui long nhap ten");
                    String name= sc.nextLine();
                    menu.findByName(name);
                }
                case"6":{
                    System.out.println("Vui long nhap so dien thoai");
                    String number= sc.nextLine();
                    menu.findByPhoneNumber(number);
                }
                case"0":{return;}
                default:
                    System.out.println("Lenh khong hop le");

            }
        }
    }
}
