import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.FileWriter;
import java.io.IOException;

public class Vehiculo{

    public static Vehiculo[] vehiculos;
    public static int cantidad=0;
    private String placa;
    private String marca;
    private String color;
    private String date;
    private Date date2;
    private String tipoV;
    private int valorComercial;
    //Date date = new Date();    

    public Vehiculo(){

    }

    public Vehiculo(String p, String m, String c,String d,String t){       
        this(p,m,c,d,t,30000000);
    }

    public Vehiculo(String p, String m, String c, String d,String t,int v){
        this.placa=p;
        this.marca=m;
        this.color=c;
        this.date=d;
        this.date2=new Date();
        this.tipoV=t;
        this.valorComercial=v;
        this.cantidad=cantidad+1;
    }

    public String getPlaca(){
        return this.placa;
    }

    public String getDate(){
        return this.date;
    }
    
    public Date getDate2(){
        return this.date2;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getColor(){
        return this.color;
    }

    public String getTipoV(){
        return this.tipoV;
    }

    public int getValorComercial(){
        return this.valorComercial;
    }

    public void setPlaca(String p){
        this.placa=p;
    }

    public void setDate(String d){
        this.date=d;
    }

    public void setMarca(String m){
        this.marca=m;
    }

    public void setTipoV(String t){
        this.tipoV=t;
    }

    public void setColor(String c){
        this.color=c;
    }

    public void setValorComercial(int v){
        this.valorComercial=v;
    }

    public String toString(){
        return "PLACA: "+this.placa+"\nMARCA: "+this.marca+"\nCOLOR: "+this.color+"\nVALOR COMERCIAL: "+this.valorComercial+"\nFECHA DE INGRESO: "+this.date+"\nTIPO DE VEHICULO: "+this.tipoV+"\n";
    }

    public static String toStringVehiculos(){
        String placa;
        String marca;
        String color;
        int valorComercial;
        String d;
        String tipoV;
        String cadenaVehiculo="";
        for(int i=0; i<vehiculos.length; i++){
            if(vehiculos[i]!=null){
                placa=vehiculos[i].getPlaca();
                marca=vehiculos[i].getMarca();
                color=vehiculos[i].getColor();
                valorComercial=vehiculos[i].getValorComercial();
                d=vehiculos[i].getDate();
                tipoV=vehiculos[i].getTipoV();
                cadenaVehiculo=cadenaVehiculo+"\nCELDA "+(i+1)+"\nPLACA: "+placa+"\nMARCA: "+marca+"\nCOLOR: "+color+"\nVALOR COMERCIAL: "+valorComercial+"\nFECHA DE INGRESO: "+d+"\nTIPO VEHICULO: "+tipoV+"\n";
            }
        }
        return cadenaVehiculo;
    }

    public static void mostrarVehiculos(){
        for(int i=0; i<vehiculos.length; i++){
            System.out.println("Vehiculo "+Vehiculo.vehiculos[i].getPlaca()+" "+Vehiculo.vehiculos[i].getMarca()+" "+Vehiculo.vehiculos[i].getColor()+" "+Vehiculo.vehiculos[i].getValorComercial()+" "+vehiculos[i].getDate()+" "+vehiculos[i].getTipoV());
        }
    }

    public static void busquedaColor(String co){
        String color;
        String res="";
        int cont=0;
        for(int i=0; i<Vehiculo.vehiculos.length; i++){
            if(vehiculos[i]!=null){
                color=vehiculos[i].getColor();
                if (color.equalsIgnoreCase(co)){
                    System.out.println("\nCELDA "+(i++)+"\nPLACA: "+Vehiculo.vehiculos[i].getPlaca()+"\nMARCA: "+Vehiculo.vehiculos[i].getMarca()+"\nCOLOR: "+Vehiculo.vehiculos[i].getColor()+"\nVALOR COMERCIAL: "+Vehiculo.vehiculos[i].getValorComercial()+"\nFECHA DE INGRESO: "+vehiculos[i].getDate()+"TIPO DE VEHICULO"+vehiculos[i].getTipoV()+"\n");
                    cont++;
                }
            }
        }
        if (cont==0) {
            System.out.println("Ningun carro de ese color");
        }
    }

    public static void ordenar(){
        int temp, valCom1, valCom2, pos=0;
        Vehiculo[] vehiculosTemp =new Vehiculo[cantidad];
        Vehiculo[] vehiculosTemp1 =new Vehiculo[cantidad];
        for (int j=0;j<vehiculos.length; j++){
            if(vehiculos[j]!=null){
                vehiculosTemp[pos]=vehiculos[j];
                pos++;
            }
        }
        //Busqueda
        for (int i=1;i<vehiculosTemp.length; i++){
            for (int j=0;j<vehiculosTemp.length-i; j++){
                if(vehiculosTemp[j]!=null){
                    valCom1=vehiculosTemp[j].getValorComercial();
                    valCom2=vehiculosTemp[j+1].getValorComercial();
                    if(valCom1 > valCom2){
                        vehiculosTemp1[0] = vehiculosTemp[j];
                        vehiculosTemp[j]=vehiculosTemp[j+1];
                        vehiculosTemp[j+1]=vehiculosTemp1[0];
                    }
                }
            }   
        }
        for(int i = 0; i <vehiculosTemp.length; i++){
            System.out.println("Vehiculo "+(i+1)+": -PLACA:"+vehiculosTemp[i].getPlaca()+" -MARCA:"+vehiculosTemp[i].getMarca()+" -COLOR:"+vehiculosTemp[i].getColor()+" -VALOR COMERCIAL:"+vehiculosTemp[i].getValorComercial()+"\n-FECHA DE INGRESO: "+vehiculos[i].getDate()+"TIPO DE VEHICULO "+vehiculos[i].getTipoV()+"\n");
        }
    }

    public static int cantidadVehiculo(){
        return cantidad;
    }

    public static void escribirArchivo() throws IOException {
        String placa;
        String marca;
        String color;
        int valorComercial;
        String d;
        String tipoV;
        String cadenaVehiculo="";
        FileWriter writer = new FileWriter("Vehiculos.txt");        
        for(int i=0; i<vehiculos.length; i++){
            if(vehiculos[i]!=null){
                placa=vehiculos[i].getPlaca();
                marca=vehiculos[i].getMarca();
                color=vehiculos[i].getColor();
                valorComercial=vehiculos[i].getValorComercial();
                d=vehiculos[i].getDate();
                tipoV=vehiculos[i].getTipoV();
                cadenaVehiculo=cadenaVehiculo+"\nCELDA "+(i+1)+"\nPLACA: "+placa+"\nMARCA: "+marca+"\nCOLOR: "+color+"\nVALOR COMERCIAL: "+valorComercial+"\nFECHA DE INGRESO: "+d+"\nTIPO VEHICULO: "+tipoV+"\n";
            }
        }
        System.out.println(cadenaVehiculo);
        writer.write(cadenaVehiculo);
        writer.close();
        
    }

}