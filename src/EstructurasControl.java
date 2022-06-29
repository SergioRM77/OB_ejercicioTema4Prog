public class EstructurasControl {
    public static void numIf(int numero){
        System.out.println("Sentencia if " + numero);
        if(numero > 0){
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println("negativo");
        }else {
            System.out.println("es 0");
        }
    }
    public static  void numWhile(int numero){
        System.out.println("Sentencia while " + numero);
        while (numero < 3){
            System.out.println(numero);
            numero++;
        }
    }
    public static  void numDoWhile(int numero){
        System.out.println("Sentencia do-while " + numero);
       do{
            System.out.println(numero);
            numero++;
        } while (numero < 3);
    }

    public static  void numFor(int numero){
        System.out.println("Sentencia for " + numero);
        for (int i = 0; numero <= 3; numero++){
            System.out.println(numero);
        }
    }

    public static void estacionM(String estacion){
        System.out.println("Sentencia switch " + estacion);
        switch (estacion){
            case "verano" :
                System.out.println("es verano");
                break;
            case  "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            default:
                System.out.println("no es una estación");

        }
    }



    public static void main(String[] args) {
        int numeroif, numeroWhile, numeroFor;
        String estacion;

        numeroif = 3;
        numIf(numeroif);
        numeroif = -3;
        numIf(numeroif);
        numeroif = 0;
        numIf(numeroif);

        numeroWhile = 1;
        numWhile(numeroWhile);
        numeroWhile = -3;
        numWhile(numeroWhile);

        numeroWhile = 1234;
        numDoWhile(numeroWhile);

        estacion = "primavera";
        estacionM(estacion);
        estacion = "otoño";
        estacionM(estacion);
        estacion = "invierno";
        estacionM(estacion);
        estacion = "coche";
        estacionM(estacion);

    }
}
