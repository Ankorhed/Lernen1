package campus02.beispiel1;

public class WinterreifenDemo {

    public static void main(String[] args) {

        printWinterreifen(isWinterreifenPflicht(12, false));
        printWinterreifen(isWinterreifenPflicht(5,true));

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean schneeFahrbahn){

        if (temperatur < 6 && schneeFahrbahn)
            return true;
            if (temperatur < 0)
                return true;
            else
                return false;
    }

    public static void printWinterreifen(boolean winterreifen){
        if (winterreifen)
            System.out.println("Bitte Winterreifen verwenden");
        else
            System.out.println("Winterreifen sind nicht erforderlich");

    }



}
