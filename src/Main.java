import java.util.Scanner;

public class Main{
public int pilihanUser;
    public static void main(String[] args){
        
        System.out.println("=================================");
        System.out.println("APOCALYPSE DAY GAME ");
        System.out.println(" 1.MANUSIA \n 2.ZOMBIE \n 3.ROBOT ");
        System.out.println("=================================");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nomor Jagoan Anda: ");
            GameOOP.anda(input.nextInt());
        }
    
        int generate = (int) (Math.random()*3+1);
        if(generate==1);


     
    }
}