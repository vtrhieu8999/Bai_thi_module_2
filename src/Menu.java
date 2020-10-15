import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Menu {
    List<Directories> list;
    String group;

    public Menu(){
        this.list= new ArrayList<>();
        }

    public Menu(List<Directories> list, String group) {
        this.list = list;
        this.group= group;
    }
    public void add(){
//        String emailasd= "Pattern.compile(\"^.+Customer\\\\.+$\").matcher(path).matches()";
        String email;
        String phoneNumber;
        Scanner sc= new Scanner(System.in);
        System.out.println("Vui long nhap ten: ");
        String name= sc.nextLine();
        System.out.println("Vui long nhap gioi tinh");
        String sex= sc.nextLine();
        System.out.println("Vui long nhap dia chi");
        String address= sc.nextLine();
        System.out.println("Vui long nhap ngay sinh");
        String birtDate= sc.nextLine();
        while(true){
        System.out.println("Vui long nhap so dien thoai");
        phoneNumber= sc.nextLine();
            if(Pattern.compile("^[0-9]*$").matcher(phoneNumber).matches()) break;
        }
        while(true){
        System.out.println("Vui long nhap email");
        email= sc.nextLine();
        if(Pattern.compile("^.+(\\.\\w+)*@\\w*(\\.\\w+)$").matcher(email).matches()) break;
        }
        this.list.add(new Directories(name, sex, address, birtDate, phoneNumber, email));
    }
    public void show(int i){
        System.out.println("Sex: "+this.list.get(i).getSex());
        System.out.println("Address: "+this.list.get(i).getAddress());
        System.out.println("BirtDate: "+this.list.get(i).getBirtDate());
        System.out.println("Name: "+this.list.get(i).getName());
        System.out.println("Phonenumber: "+this.list.get(i).getPhoneNumber());
    }
    public void change(String phoneNumer){
        for(Directories number: this.list){
            if(phoneNumer.equals(number.getPhoneNumber()))
            {
                System.out.println("Vui long nhap thon tinn can sua");
                String email;
                String phoneNumber;
                Scanner sc= new Scanner(System.in);
                System.out.println("Vui long nhap ten: ");
                number.setName(sc.nextLine());
                System.out.println("Vui long nhap gioi tinh");
                number.setSex(sc.nextLine());
                System.out.println("Vui long nhap dia chi");
                number.setAddress(sc.nextLine());
                System.out.println("Vui long nhap ngay sinh");
                number.setBirtDate(sc.nextLine());
                while(true){
                    System.out.println("Vui long nhap so dien thoai");
                    number.setPhoneNumber(sc.nextLine());
                    if(Pattern.compile("^[0-9]*$").matcher(number.getPhoneNumber()).matches()) break;
                }
                while(true){
                    System.out.println("Vui long nhap email");
                    number.setEmail(sc.nextLine());
                    if(Pattern.compile("^.+(\\.\\w+)*@\\w*(\\.\\w+)$").matcher(number.getEmail()).matches()) break;
                }
                return;
            }
        }
        System.out.println("So dien thoai khong co trong danh sach");
    }
    public void delete(String number){
        for(int i=0; i<this.list.size(); i++){
            if(number.equals(this.list.get(i)))
                this.list.remove(i);
                return;
        }
        System.out.println("Khong tim thay nguoi can xoa");
    }
    public void findByName(String name){
        for(int i=0; i<this.list.size(); i++){
            if(name.equals(this.list.get(i).getName()))
                show(i);}
        System.out.println("khong tim thay nguoi dung");
        }

        public void findByPhoneNumber(String name){
            for(int i=0; i<this.list.size(); i++){
                if(name.equals(this.list.get(i).getPhoneNumber()))
                    show(i);}
            System.out.println("khong tim thay nguoi dung");
        }
    }

