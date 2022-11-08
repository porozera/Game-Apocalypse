public class GameOOP {
    String[] element = {"Manusia","Zombie", "Robot"};
    void anda(Integer pilihan){

        if (pilihanUser == 1){
            anda = element[0];
        }

        else if (pilihanUser == 2){
            anda = element[1];
        }

        else if (pilihanUser == 3){
            anda = element[2];
        }
    }

    void menangKalah(){
        String result;
        if (pilihanUser == 1 && komputer == 1){
            result = "Seri";
        }
        else if (anda == 1 && komputer == 2 ){
            result = "Anda Kalah";
        }
        else if (anda == 1 && komputer == 3){
            result = "Anda Menang";
        }
        else if (anda == 2 && komputer == 1){
            result = "Anda Menang";
        }
        else if (anda == 2 && komputer == 2){
            result = "Seri";
        }
        else if (anda == 2 && komputer == 3){
            result = "Anda Kalah";
        }
        else if (anda == 3 && komputer == 1){
            result = "Anda Kalah";
        }
        else if (anda == 3 && komputer == 2){
            result = "Anda menang";
        }
        else if (anda == 3 && komputer == 3){
            result = "Seri";
        }

    }
}


