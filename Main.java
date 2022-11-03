import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Wypisz();
        System.out.println(getName()+" "+getWiek());
        Obliczenia();
        System.out.println(CzyParzysta(5));
        System.out.println(CzyPodzielna(15));
        System.out.println(doTrzeciej(3));
        System.out.println(pierwiastek(100));
        System.out.println(trojakt());
    }
    public static void Wypisz() {
         int a = -2, b = 23;
         Scanner input = new Scanner(System.in);
        System.out.println("Podaj c: ");
        int c = getInt();
        System.out.println("a  = " + a + ", b = " + b+", c = "+c);
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static String getName(){
        return "Dawid";
    }
    public static int getWiek(){
        return 37;
    }
    public static void Obliczenia(){
        System.out.println("Podaj dwie liczby: ");
        int a = getInt();
        int b=  getInt();
        System.out.println("Suma = "+a+" + "+b+" = "+(a+b));
        System.out.println("Różnica = "+a+" - "+b+" = "+(a-b));
        System.out.println("Iloczyn = "+a+" * "+b+" = "+(a*b));
    }

    public static boolean CzyParzysta(int a){
        if(a%2==0)return true;
        return false;
    }
    public static boolean CzyPodzielna(int a){
        if((a%3==0)&&(a%5==0))return true;
        return false;
    }
    public static int doTrzeciej(int a){
        return a*a*a;
    }
    public static double pierwiastek(int a){
        return Math.sqrt(a);
    }

    public static boolean trojakt(){
        int x = getInt();
        int y = getInt();
        Random rand = new Random();
        int a = rand.nextInt(y-x+1)+x;
        int b = rand.nextInt(y-x+1)+x;
        int c = rand.nextInt(y-x+1)+x;
        System.out.println("Wylosowane liczby to: "+a+", "+b+", "+c);
        if(a+b>c && a+c>b && b+c>a) return true;
        else return false;
    }

}