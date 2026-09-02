import java.util.*;
class Cmp{
    int real;
    int cmp;
    void setNumber(int a,int b){
        real=a;
        cmp=b;
    }
    void getNumber(){
        System.out.printf("The complex number is: %d+%di",real,cmp);
    }
}
class Complex{
    public static void main(){
        Cmp n=new Cmp();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the real and complex components: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        n.setNumber(x,y);
        n.getNumber();
    }
}