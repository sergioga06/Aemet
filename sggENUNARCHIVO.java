public class sggENUNARCHIVO {
    static final int SGGNDIAS = 7;
    static final int SGGNTEMP = 3;
    static int sggtmax = 40;
    static int sggtmin = -1;
    static String sggciudad = "";
    static  String[] sggprovincias = {"Almeria", "Granada", "Cadiz", "Malaga", "Jaen", "Cordoba", "Huelva", "Sevilla" };
    static String[] sggdias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    static int[][] sggtemperaturas = new int[SGGNDIAS][SGGNTEMP];
    public static void main(String[] args) {
        sggENUNARCHIVO.sgggenerarTemps();
        sggENUNARCHIVO.sggimprimirDatos();
    }

    public static int [][] sgggenerarTemps(){
        int temp;
        for (int i=0; i<SGGNDIAS; i++){
            for(int j=0; j<SGGNTEMP;j++){
                temp =((int)(Math.random()*41)-1);// numeros del -1 al 40
                sggtemperaturas[i][j] = temp;
            }
        }
        return sggtemperaturas;
    }
    public static void sggimprimirDatos(){

        System.out.printf("%100s", " ");
        System.out.println("------ TEMPERATURAS ------");
        System.out.printf("%20s", " ");
        for (int i=0; i<SGGNDIAS; i++ ){
            System.out.printf("%20s", sggENUNARCHIVO.sggdias[i]);
        }
        System.out.println();
        System.out.println();
        for (int j=0; j<SGGNTEMP; j++){
            System.out.printf("%-20s", sggprovincias[j] + "   ");
            for (int i=0; i<SGGNDIAS;i++){
                System.out.printf("%20.2s", sggENUNARCHIVO.sggtemperaturas[i][j]);
            }
            System.out.println();
            System.out.println();
        }
        

    }    
}
    

