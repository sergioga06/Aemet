package aemet;
public class sggRegCiudad {
    final int SGGNDIAS = 7;
    final int SGGNTEMP = 3;
    int sggtmax;
    int sggtmin;
    String[] sggdias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    int[][] sggtemperaturas = new int[SGGNDIAS][SGGNTEMP];


    public sggciudad(int sggtmax, int sggtmin){
        this.

    }
    // public void sggsettmax(int sggtmax){
    //     this.sgg
    // }

    public int sggtmax(){

    }

    public int [][] generarTemps(){
        int temp;
        for (int i=0; i<SGGNDIAS; i++){
            for(int j=0; j<SGGNTEMP;j++){
                temp =((int)(Math.random()*41)-1);
                sggtemperaturas[i][j] = temp;
            }
        }
        return sggtemperaturas;
    }
    public void imprimirDatos(){
        System.out.println("------ TEMPERATURAS ------");
        System.out.printf("%20s", " ");
        for (int i=0; i<SGGNDIAS; i++ ){
            System.out.printf("%10s", this.sggdias[i]);
        }
        System.out.println();
        System.out.println();
        for (int j=0; j<SGGNTEMP; j++){
            // System.out.printf("%20s", this.sgg[j]);
            for (int i=0; i<SGGNDIAS;i++){
                System.out.printf("%10.2f", this.sggtemperaturas[i][j]);
            }
            System.out.println();
            System.out.println();
        }
        

    }    
}