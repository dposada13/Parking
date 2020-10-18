public class Vehiculo{

    public static Vehiculo[] vehiculos;
    public static int cantidad=0;
    private String placa;
    private String marca;
    private String color;
    private int valorComercial;

    public Vehiculo(){

    }

    public Vehiculo(String p, String m, String c){       
        this(p,m,c,30000000);
    }

    public Vehiculo(String p, String m, String c, int v){
        this.placa=p;
        this.marca=m;
        this.color=c;
        this.valorComercial=v;
        this.cantidad=cantidad+1;
    }

    public String getPlaca(){
        return this.placa;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getColor(){
        return this.color;
    }

    public int getValorComercial(){
        return this.valorComercial;
    }

    public void setPlaca(String p){
        this.placa=p;
    }

    public void setMarca(String m){
        this.marca=m;
    }

    public void setColor(String c){
        this.color=c;
    }

    public void setValorComercial(int v){
        this.valorComercial=v;
    }

    public String toString(){
        return "PLACA: "+this.placa+"\nMARCA: "+this.marca+"\nCOLOR: "+this.color+"\nVALOR COMERCIAL: "+this.valorComercial;
    }

    public static String toStringVehiculos(){
        String placa;
        String marca;
        String color;
        int valorComercial;
        String cadenaVehiculo="";
        for(int i=0; i<vehiculos.length; i++){
            if(vehiculos[i]!=null){
                placa=vehiculos[i].getPlaca();
                marca=vehiculos[i].getMarca();
                color=vehiculos[i].getColor();
                valorComercial=vehiculos[i].getValorComercial();
                cadenaVehiculo=cadenaVehiculo+"\nCELDA "+(i+1)+"\nPLACA: "+placa+"\nMARCA: "+marca+"\nCOLOR: "+color+"\nVALOR COMERCIAL: "+valorComercial+"\n";
            }
        }
        return cadenaVehiculo;
    }

    public static void mostrarVehiculos(){
        for(int i=0; i<vehiculos.length; i++){
            System.out.println("Vehiculo "+Vehiculo.vehiculos[i].getPlaca()+" "+Vehiculo.vehiculos[i].getMarca()+" "+Vehiculo.vehiculos[i].getColor()+" "+Vehiculo.vehiculos[i].getValorComercial());
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
                        System.out.println("\nCELDA "+(i++)+"\nPLACA: "+Vehiculo.vehiculos[i].getPlaca()+"\nMARCA: "+Vehiculo.vehiculos[i].getMarca()+"\nCOLOR: "+Vehiculo.vehiculos[i].getColor()+"\nVALOR COMERCIAL: "+Vehiculo.vehiculos[i].getValorComercial());
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
            System.out.println("Vehiculo "+(i+1)+": -PLACA:"+vehiculosTemp[i].getPlaca()+" -MARCA:"+vehiculosTemp[i].getMarca()+" -COLOR:"+vehiculosTemp[i].getColor()+" -VALOR COMERCIAL:"+vehiculosTemp[i].getValorComercial());
        }
    }

    public static int cantidadVehiculo(){
        return cantidad;
    }

}