import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                studenci();
                program();
                parzyste();
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static String getString(){
        return new Scanner(System.in).nextLine();
    }
    public static void studenci(){
            System.out.println("Podaj z ilu studentów składa sie grupa");
            int n = getInt();
            int tab[] = new int[n];
            int i = 0;
            double suma=tab[0];
            System.out.println("Podaj ile punktów uzyskał każdy ze studentów: ");
            while(i<n){
                tab[i] = getInt();
                suma = suma + tab[i];
                i++;
            }
            System.out.println("Średnia liczba punktów wynosi: "+(suma/n));
        }
        public static void program(){
            int tab[] = new int[10];
            int licznikU = 0, licznikD=0, sumaU = tab[0], sumaD = tab[0];
            System.out.println("Podaj 10 liczb: ");
            for(int i = 0; i<10; i++){
                tab[i] = getInt();
                if(tab[i]<0){
                    licznikU++;
                    sumaU = sumaU + tab[i];
                }
                else{
                    licznikD++;
                    sumaD = sumaD +tab[i];
                }
            }
            System.out.println("Ilośc liczb ujemnych wynosi: "+licznikU);
            System.out.println("Ilośc liczb dodatnich wynosi: "+licznikD);
            System.out.println("Suma liczb ujemnych wynosi: "+sumaU);
            System.out.println("Suma liczb dodatnich wynosi: "+sumaD);
        }
        public static void parzyste(){
            System.out.println("Podaj z ilu liczb ma sie składać tablica: ");
            int n = getInt();
            int tab[] = new int[n];
            int suma = 0;
            for(int i = 0; i<n; i++){
                tab[i] = getInt();
                if(tab[i]%2==0){
                    suma = suma + tab[i];
                }
            }
            System.out.println("Suma parzystych liczb w ciągu wynosi: "+suma);

        }

        }



