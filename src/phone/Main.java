package phone;

public class Main {
    public static void main(String[]args){
        phonefirst phone1=new phonefirst();
        phonefirst phone2=new phonefirst();
        if(phone1.equals(phone2)){
            System.out.println("same");
        }else{
            System.out.println("diffent");
        }
    }
}
