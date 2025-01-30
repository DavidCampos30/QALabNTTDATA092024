public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD

        Toyota toyo = new Toyota("PAS201"); //200
        toyo.encenderMotor();
        toyo.avanzar();
        System.out.println("Velocidad Máxima: " + toyo.getdVelocidadMaxima());

        Toyota toyo2 = new Toyota("ASP120");
        toyo2.setdVelocidadMaxima(300);
        System.out.println("Velocidad Máxima: " + toyo2.getdVelocidadMaxima());


        System.out.println("========================================== ");

        Nissan nis = new Nissan(); // 220
        nis.encenderMotor();
        nis.avanzar();

        System.out.println("Velocidad Máxima: " + nis.getdVelocidadMaxima());

/*
        Auto auto1 = new Auto();

        auto1.encenderMotor();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar(); auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        //auto1.frenarHastaDetener();
*/




=======
        String configTest[] = {"123.123.42.12", "jkbe", "21231"};
        String configProd[] = {"www.google.com", "jkbenites", "alalals"};
        String configDesa[] = {"123.123.42.10", "userdesa02", "1234"};

        int XPROD = 2;
        int XTEST = 1;
        int XDESA = 0;
        int CSERV = 0;
        int CUSER = 1;
        int CPASS = 2;
        int CAMB = 3;

        String config[][] = {
                {"123.123.42.10", "userdesa02", "1234", "DESA", "otro campo"},   //0
                {"123.123.42.12", "jkbe", "21231", "TEST"},        //1
                {"www.google.com", "jkbenites", "alalals", "PROD"} //2
        };


        //Hacer doble bucle for/for
        System.out.println(config[XTEST][CAMB]);

        //CLAVE: DESARROLLO

        //System.out.println(config[3][1]);
        //System.out.println(config[1][1]);
        System.out.println(config[XPROD][CPASS]); //...


>>>>>>> test
    }
}