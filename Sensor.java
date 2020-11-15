public class Sensor
{
    public static Sensor[] sensores;
    private int sensor;

    public Sensor (int e){
        this.sensor=e;
    }

    public void sensor(int e){
        this.sensor=e;    
    }

    public void setSensor(int e){
        this.sensor=e;
    }

    public int getSensor(){
        return this.sensor;
    }

    public String toString(){
        String msj="";
        if (this.sensor==0){
            msj= "CELDA OCUPADA";
        }else if (this.sensor == 1) {
            msj= "CELDA LIBRE";
        }
        return msj;
    }
    

    public static String sensorLibre(){
        String sensorDispo="";
        for (int i=0;i<sensores.length;i++){
            if(sensores[i]== null){
                sensorDispo=sensorDispo+"Parqueadero "+(i+1)+" Libre"+"\n";                
            }        
        } 
        return sensorDispo;
    }

    public static String sensoresEstado(){
        String estadoSensores="";
        for (int i=0;i<sensores.length;i++){
            estadoSensores=estadoSensores+sensores[i]+"\n";   
        } 
        return estadoSensores;    
    }

    public static int buscarVehiculo(int p){
        int estado = 0;
            if (sensores[p] == null){
                estado = 1;           
            }else{
                estado = 0;            
            }
        return estado;    
    }
    
    
    public static void desactivarSensor(int ds){
         
    }
}
