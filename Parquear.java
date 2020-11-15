import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Parquear
{

    public void parquearCarro() 
    {
        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        String fec=hourdateFormat.format(date);
        System.out.println("Ingrese el numero de la celda donde desea parquear: ");
        int se=scan.nextInt();
        System.out.println("Ingrese Tipo de Vehiculo que desea parquear (1-Carro 2-Moto): ");
        int opcv=scan.nextInt();
        if (Sensor.buscarVehiculo(se) == 1) 
        {           
            if (opcv==1) {
                System.out.println("Placa del carro: ");
                String pl=scan.next();
                System.out.println("Marca del carro: ");
                String ma=scan.next();
                System.out.println("Color del carro: ");
                String co=scan.next();
                Vehiculo.vehiculos[se]= new Vehiculo(pl, ma, co,fec,"Carro");
                Sensor.sensores[se]=new Sensor(0);
                System.out.println("\nEl carro fue parqueado exitosamente.\n");
                System.out.println(Vehiculo.vehiculos[se].toString());            
            }else{
                System.out.println("Placa de la moto: ");
                String pl=scan.next();
                System.out.println("Marca de la moto: ");
                String ma=scan.next();
                System.out.println("Color de la moto: ");
                String co=scan.next();
                Vehiculo.vehiculos[se]= new Vehiculo(pl, ma, co,fec,"Moto");
                Sensor.sensores[se]=new Sensor(0);
                System.out.println("\nLa moto fue parqueada exitosamente.\n");
                System.out.println(Vehiculo.vehiculos[se].toString());  
            }
        }
        else 
        {
            System.out.println("Ya hay un carro parqueado con esa placa.");
        }
    }

    public void parquearCarroV() 
    {
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        String fec=hourdateFormat.format(date);
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de la celda donde desea parquear: ");
        int se=scan.nextInt();
        System.out.println("Ingrese Tipo de Vehiculo que desea parquear (1-Carro 2-Moto): ");
        int opcv=scan.nextInt();
        if (Sensor.buscarVehiculo(se) == 1) 
        {           
            if (opcv==1) {
                System.out.println("Placa del carro: ");
                String pl=scan.next();
                System.out.println("Marca del carro: ");
                String ma=scan.next();
                System.out.println("Color del carro: ");
                String co=scan.next();
                System.out.println("Valor del carro: ");
                int vl=scan.nextInt();
                Vehiculo.vehiculos[se]= new Vehiculo(pl, ma, co,fec,"Carro",vl);
                Sensor.sensores[se]=new Sensor(0);
                System.out.println("\nEl carro fue parqueado exitosamente.\n");
                System.out.println(Vehiculo.vehiculos[se].toString());
            }else{
                System.out.println("Placa de la moto: ");
                String pl=scan.next();
                System.out.println("Marca de la moto: ");
                String ma=scan.next();
                System.out.println("Color de la moto: ");
                String co=scan.next();
                System.out.println("Valor de la moto: ");
                int vl=scan.nextInt();
                Vehiculo.vehiculos[se]= new Vehiculo(pl, ma, co,fec,"Moto",vl);
                Sensor.sensores[se]=new Sensor(0);
                System.out.println("\nLa moto fue parqueada exitosamente.\n");
                System.out.println(Vehiculo.vehiculos[se].toString());

            }
        }
        else 
        {
            System.out.println("Ya hay un carro parqueado con esa placa.");
        }
    }

}
