public class Hasil {

    public String player;
    public String komputer;

    public Hasil (String player , String komputer){
        this.player = player;
        this.komputer = komputer;
    }

    public void menangKalah(){
        if (player == "Manusia" && komputer == "Manusia"){
           System.out.println("Hasil : Seri");
        }
        if (player == "Manusia" && komputer == "Manusia"){
            System.out.println("Hasil : Seri");
        }
        else if (player == "Manusia" && komputer == "Zombie" ){
            System.out.println("Hasil : Kalah");
        }
        else if (player == "Manusia" && komputer == "Robot"){
            System.out.println("Hasil : Menang");
        }
        else if (player == "Zombie" && komputer == "Manusia"){
            System.out.println("Hasil : Menang");
        }
        else if (player == "Zombie" && komputer == "Zombie"){
            System.out.println("Hasil : Seri");
        }
        else if (player == "Zombie" && komputer == "Robot"){
            System.out.println("Hasil : Kalah");
        }
        else if (player == "Robot" && komputer == "Manusia"){
            System.out.println("Hasil : Kalah");
        }
        else if (player == "Robot" && komputer == "Zombie"){
            System.out.println("Hasil : Menang");
        }
        else if (player == "Robot" && komputer == "Robot"){
            System.out.println("Hasil : Seri");
        }

    }
}