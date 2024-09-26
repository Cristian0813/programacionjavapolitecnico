package DeclaraciónBreak;

public class DeclaraciónBreak {
    public static void main (String [] args){
        
        int diaNum = 3;
        String diaLab;
        switch(diaNum){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                diaLab = "día laborable";
                break;
            case 6:
            case 7:
                diaLab = "fin de semana";
                break;
            default: diaLab = "Tipo de día invalido";
        }
        System.out.println(diaNum + " es un " + diaLab );
    }
}
