//Manuela Franco Orozco - 1001367953
//José David Gómez Zapata - 1000203851
//Daniel ALberto Posada Murillo - 71265203
import java.util.Scanner;
public class Principal
{
    public static void main(String [] args)
    {
        mostrarMenu();  

    }
    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        int cantCeldas=0, accion=1,contceldas=10, anotacion=0, generico=0, celdas=0,n;
        System.out.println("Bienvenido al programa de gestion de parqueaderos de la Universidad EAFIT ");
        System.out.println("Ingrese la cantidad de celdas a asignar al parqueadero ");
        cantCeldas=scan.nextInt();
        Vehiculo.vehiculos = new Vehiculo[cantCeldas];
        Sensor.sensores=new Sensor[cantCeldas];        
        //declaracion de arreglos de sensores y vehiculos
        while (accion>0){
            System.out.println(" ");
            System.out.println("¿Desea realizar una nueva acción? Escriba 1 para si y 0 para no");
            accion=scan.nextInt();
            System.out.println(" ");
            if (accion==1){
                System.out.println("Ingrese el numeral de la acción que desea realizar ");
                System.out.println(" ");
                System.out.println("1 - Mostrar las celdas disponibles"); //Ok
                System.out.println("2 - Registrar el ingreso de un vehiculo"); //OK
                System.out.println("3 - Registrar el ingreso de un vehiculo con valor"); //OK
                System.out.println("4 - Mostrar vehiculo Activos");//OK
                System.out.println("5 - Mostrar cantidad vehiculos");//OK
                System.out.println("6 - Mostrar estado de la celda de parqueo");
                System.out.println("7 - Mostrar estado del parqueadero");
                System.out.println("8 - Buscar vehiculos por Color");
                System.out.println("9 - Mostrar vehiculos por costo Ordenado");
                System.out.println("0 - Salir");
                n=scan.nextInt();
                System.out.println(" ");
                Parquear par=new Parquear();
                //Sensor se= new Sensor();
                //Vehiculo vh=new Vehiculo();
                switch (n) {
                    case 1: 
                    //SENSORES DESOCUPADOS
                    System.out.print(Sensor.sensorLibre());
                    break;
                    case 2: 
                    par.parquearCarro();
                    break;
                    case 3: 
                    par.parquearCarroV();
                    break;
                    case 4: 
                    System.out.print(Vehiculo.toStringVehiculos());
                    break;
                    case 5:
                    System.out.print("CANTIDAD DE VEHICULOS PARQUEADOS: "+Vehiculo.cantidadVehiculo());
                    //Vehiculo.mostrarVehiculos();
                    break;
                    case 6:
                    System.out.println("Ingrese el numero de la celda consultar: ");
                    int c=scan.nextInt();
                    if (Sensor.buscarVehiculo(c)==1){
                        System.out.println("LA CELDA SE ENCUENTRA OCUPADA");
                    }else{
                        System.out.println("LA CELDA SE ENCUENTRA DISPONIBLE");
                    }
                    break;
                    case 7:
                    System.out.println(Sensor.sensoresEstado());
                    break;
                    case 8: 
                    System.out.println("Ingrese el color del vehiculo que desea consultar: ");
                    String color=scan.next();
                    Vehiculo.busquedaColor(color);
                    break;
                    case 9: 
                    Vehiculo.ordenar();
                    break;
                    case 0: 
                    break;
                    default: System.out.println("Comando Incorrecto"); 
                    break;
                }
                // if (celdas<1){
                // System.out.println("No hay celdas disponibles");
                // }
                System.out.println(" ");
            }
        }
    }

}
