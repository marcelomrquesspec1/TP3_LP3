//Marcelo Marques Araujo CB3005631


import java.util.Scanner;



public class Hora {
    private int hora;
    private int min;
    private int seg;

    private Scanner scan = new Scanner(System.in);
    
// + Hora()

    public Hora() {
       this.setHor();
       this.setMin();
       this.setSeg();
    }

    
 //+ Hora(int h, int m, int s)
    public Hora(int h, int m, int s){
        
        this.setHor(h);
        this.setMin(m);
        this.setSeg(s);
    }

//+ setHor(int h)
    public void setHor(int h){
        
        if(h < 0 || h > 23){
            System.out.println("A hora deve ser um valor positivo menor que 24");
            return;
        }

        this.hora = h;
    }

//+setMin(int m)
    
    public void setMin(int m){
        if(m < 0 || m > 59){
            System.out.println("O minuto deve ser positivo menor que 60");
            return;
        }
        

        this.min = m;
    }
    
    
//+ setSeg(int s)

    public void setSeg(int s){
        if(s < 0 || s > 59){
            System.out.println("O segundo deve ser positivo menor que 60");
            return;
        }

        this.seg = s;
    }

//+ setHor()
    public void setHor(){
        int h;

        do{
            System.out.print("Digite a hora: ");
            h = scan.nextInt();

            if(h < 0 || h > 23){
                System.out.println("A hora deve ser positivo menor que 24");
            }
            
        }while(h < 0 || h > 23);

        this.hora = h;
    }


//+setMin()

    public void setMin(){
        int m;

        do{
            System.out.print("Digite os minutos: ");
            m = scan.nextInt();

            if(m < 0 || m > 59){
                System.out.println("O minuto deve ser um valor positivo menor que 60");
            }
            
        }while(m < 0 || m > 59);

        this.min = m;
    }
    
    
    
//+setSeg()
    public void setSeg(){
        int s;

        do{
            System.out.print("Digite os segundos: ");
            s = scan.nextInt();

            if(s < 0 || s > 59){
                System.out.println("O segundos deve ser positivo menor que 60");
            }
            
        }while(s < 0 || s > 59);

        this.seg = s;
    }

    
    
//+ getHor(): int
    public int getHor(){
        return this.hora;
    }

//+ getMin(): int
    public int getMin(){
        return this.min;
    }
 
    
//+getSeg(): int
    public int getSeg(){
        return this.seg;
    }
   
    
    
//+ getHora1(): String
    public String getHora1()
    {
        return formatarData(this.hora, this.min, this.seg);
    }
    
    
//+ getHora2(): String
    public String getHora2()
    {
        int horaPeriodo = this.hora;
        String periodo = horaPeriodo < 12 ? "AM" : "PM";

        if(horaPeriodo == 0){
            horaPeriodo = 12;
        }

        if(horaPeriodo > 12){
            horaPeriodo -= 12;
        }


        return formatarData(horaPeriodo, this.min, this.seg) + " " + periodo;
    }
    
    //+ getSegundos(): int
    public int getSegundos()
    {
        final int SEGUNDOS_EM_1_HORA = 3600;
        final int SEGUNDOS_EM_1_MINUTO = 60;

        int qtdSegundos = 0;

        qtdSegundos += this.hora * SEGUNDOS_EM_1_HORA;
        qtdSegundos += this.min * SEGUNDOS_EM_1_MINUTO;
        qtdSegundos += this.seg;

        return qtdSegundos;
    }
    

    private String formatarData(int hora, int min, int seg){
        return String.format("%02d", hora) + ":" +
            String.format("%02d", min) + ":" +
            String.format("%02d", seg);
    }
}