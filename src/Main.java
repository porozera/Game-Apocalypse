import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        int pilihanUser;
        String komputer;
        String player;
        String[] element = {"Manusia","Zombie", "Robot"};
        System.out.println("=================================");
        System.out.println("APOCALYPSE DAY GAME ");
        System.out.println(" 1.MANUSIA \n 2.ZOMBIE \n 3.ROBOT ");
        System.out.println("=================================");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nomor Jagoan Anda: ");
            pilihanUser = input.nextInt();
        } 
        if(pilihanUser == 1){
            player = element[0];
            System.out.println("Pilihan anda : "+ element[0]);
            }
        else if(pilihanUser == 2){
            player = element[1];
            System.out.println("Pilihan anda : "+ element[1]);
            }
        else if(pilihanUser == 3){
            player = element[2];
            System.out.println("Pilihan anda : "+ element[2]);
            }
        else {
            player = "tidak ada";
            System.out.println("Tidak ada pilihan");
        }
            


        int generate = (int) (Math.random()*3+1);

        if(generate==1){
            komputer = element[0];
            System.out.println("Pilihan Komputer : " + komputer);
        }
        else if(generate==2){
            komputer = element[1];
            System.out.println("Pilihan Komputer : " + komputer);
        }
        else{
            komputer = element[2];
            System.out.println("Pilihan Komputer : " + komputer);
        }

        Hasil hasil = new Hasil(player, komputer);
        hasil.menangKalah();
    }

}
