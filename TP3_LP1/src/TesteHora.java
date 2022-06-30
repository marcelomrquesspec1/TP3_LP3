//Marcelo Marques Araujo CB3005631



public class TesteHora {
    public static void main(String[] args){
        Hora meiaNoiteAM = new Hora(1, 32, 11);
        
        System.out.println("Meia Noite AM: ");
        System.out.println(meiaNoiteAM.getHora1());
        System.out.println(meiaNoiteAM.getHora2());
        System.out.println(meiaNoiteAM.getSegundos());

        Hora meioDiaPM = new Hora(12, 41, 11);
        System.out.println("Meio dia PM: ");
        System.out.println(meioDiaPM.getHora1());
        System.out.println(meioDiaPM.getHora2());
        System.out.println(meioDiaPM.getSegundos());
    }
}