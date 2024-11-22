package aemet;
public class sggRegCiudad {
    final int SGGNDIAS = 7;
    final int SGGNTEMP = 3;
    int sggtmax = 40;
    int sggtmin = -1;
    String sggciudad = "";
    String[] sggdias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    int[][] sggtemperaturas = new int[SGGNDIAS][SGGNTEMP];


    public sggRegCiudad (String sggciudad, int sggtmax, int sggtmin){
        this.sggciudad= sggciudad;
        this.sggtmax = sggtmax;
        this.sggtmin = sggtmin;


    }

    // public void sggsettmax(int sggtmax){
    //     this.sgg
    // }

    // public int sggtmax(){

    // }

    public int [][] sgggenerarTemps(){
        int temp;
        for (int i=0; i<SGGNDIAS; i++){
            for(int j=0; j<SGGNTEMP;j++){
                temp =((int)(Math.random()*41)-1);// numeros del -1 al 40
                sggtemperaturas[i][j] = temp;
            }
        }
        return sggtemperaturas;
    }
    public int sggtempMax(){
        int max = 0;
        for(int i=0; i<SGGNDIAS; i++){
            for(int j=0; j<SGGNTEMP; j++){
            if (sggtemperaturas[i][j]>max) {
                max = sggtemperaturas[i][j];
            }
        }
        }
        return max;
    }
    public  
    public void sggimprimirDatos(){

        System.out.printf("%27s", " ");
        System.out.println("------ TEMPERATURAS ------");
        System.out.printf("%2s", " ");
        for (int i=0; i<SGGNDIAS; i++ ){
            System.out.printf("%10s", this.sggdias[i]);
        }
        System.out.println();
        System.out.println();
        for (int j=0; j<SGGNTEMP; j++){
            for (int i=0; i<SGGNDIAS;i++){
                System.out.printf("%10.2s", this.sggtemperaturas[i][j]);
            }
            System.out.println();
            System.out.println();
        }
        

    }    
}