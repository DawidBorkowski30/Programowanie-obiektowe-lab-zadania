
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                  porzadkowanie(5,4,3);
                  czyPada();
                  premia();
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static String getString(){
        return new Scanner(System.in).nextLine();
    }

        public static void porzadkowanie(int x, int y, int z){
            if(x> y &&x> z && y > z){
                System.out.println(z +", "+ y +", "+x);
            }
            else if(x> y &&x> z && z > y){
                System.out.println(y +", "+ z +", "+x);
            }
            else if(y >x&& y > z &&x> z){
                System.out.println(z +", "+x+", "+ y);
            }
            else if(y >x&& y > z && z >x){
                System.out.println(x+", "+ z +", "+ y);
            }
            else if(z >x&& z > y &&x> y){
                System.out.println(y +", "+x+", "+ z);
            }
            else{
                System.out.println(x+", "+ y +", "+ z);
            }
        }
        public static void czyPada(){
            System.out.println("W zależności od tego czy pada napisz tak lub nie: ");
            String deszcz = getString();
            System.out.println("W zależności od tego czy jest autobus napisz tak lub nie: ");
            String autobus = getString();
            if(!(deszcz.equals("nie"))  && !(autobus.equals("nie"))){
                System.out.println("Weź parasol, dostaniesz sie na uczelnie");
            }
            else if(!(deszcz.equals("nie")) && !(autobus.equals("tak"))){
                System.out.println("Nie dostaniesz sie na uczelnie");
            }
            else if (!(deszcz.equals("tak")) && !(autobus.equals("nie"))){
                System.out.println("Dostaniesz sie na uczelnie, miłego dnia i pięknej pogody!");
            }
        }
        public static void premia(){
            System.out.println("W zależności, czy masz zniżke na samochód napisz tak lub nie: ");
            String znizka = getString();
            System.out.println("W zależności, czy otrzymałeś premię napisz tak lub nie: ");
            String premia = getString();
            if(!(znizka.equals("tak")) || !(premia.equals("nie"))){
                System.out.println("Możesz kupić samochód, zniżki na samochód nie ma!");
            }
            else if(!(znizka.equals("tak")) || !(premia.equals("tak"))){
                System.out.println("Zakup samochodu trzeba odłożyć na później, zniżki na samochód nie ma");
            }
            else if(!(znizka.equals("nie")) || !(premia.equals("nie"))){
                System.out.println("Możesz kupic samochód!");
            }
        }

}

