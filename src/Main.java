import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        int pilihanUser;
        String komputer;
        String pilihan;
        String[] element = {"Manusia","Zombie", "Robot"};
        System.out.println("=================================");
        System.out.println("APOCALYPSE DAY GAME ");
        System.out.println(" 1.MANUSIA \n 2.ZOMBIE \n 3.ROBOT ");
        System.out.println("=================================");

        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan Nomor Jagoan Anda: ");
        pilihanUser = input.nextInt();


        if(pilihanUser == 1){
            pilihan = element[0];
            System.out.println("Pilihan anda : "+ pilihan);
            }
        else if(pilihanUser == 2){
            pilihan = element[1];
            System.out.println("Pilihan anda : "+ pilihan);
            }
        else if(pilihanUser == 3){
            pilihan = element[2];
            System.out.println("Pilihan anda : "+ pilihan);
            }
        else {
            System.out.println("Tidak ada pilihan");
        }
            


        int generate = (int) (Math.random()*3+1);

        if(generate==1){
            komputer = "Manusia";
            System.out.println("Pilihan Komputer : " + komputer);
        }
        else if(generate==2){
            komputer = "Zombie";
            System.out.println("Pilihan Komputer : " + komputer);
        }
        else{
            komputer = "Robot";
            System.out.println("Pilihan Komputer : " + komputer);
        }




        if (pilihanUser == 1 && komputer == "Manusia"){
            System.out.println("Hasil : Seri");
        }
        else if (pilihanUser == 1 && komputer == "Zombie" ){
            System.out.println("Hasil : Kalah");
        }
        else if (pilihanUser == 1 && komputer == "Robot"){
            System.out.println("Hasil : Menang");
        }
        else if (pilihanUser == 2 && komputer == "Manusia"){
            System.out.println("Hasil : Menang");
        }
        else if (pilihanUser == 2 && komputer == "Zombie"){
            System.out.println("Hasil : Seri");
        }
        else if (pilihanUser == 2 && komputer == "Robot"){
            System.out.println("Hasil : Kalah");
        }
        else if (pilihanUser == 3 && komputer == "Manusia"){
            System.out.println("Hasil : Kalah");
        }
        else if (pilihanUser == 3 && komputer == "Zombie"){
            System.out.println("Hasil : Menang");
        }
        else if (pilihanUser == 3 && komputer == "Robot"){
            System.out.println("Hasil : Seri");
        }

    }
}
