import java.util.Scanner;
public class Parquear
{

    public void parquearCarro() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de la celda donde desea parquear: ");
        int se=scan.nextInt();
        if (Sensor.buscarVehiculo(se) == 1) 
        {           
            System.out.println("Placa del carro: ");
            String pl=scan.next();
            System.out.println("Marca del carro: ");
            String ma=scan.next();
            System.out.println("Color del carro: ");
            String co=scan.next();
            Vehiculo.vehiculos[se]= new Vehiculo(pl, ma, co);
            Sensor.sensores[se]=new Sensor(0);
            System.out.println("\nEl carro fue parqueado exitosamente.\n");
            System.out.println(Vehiculo.vehiculos[se].toString());
        }
        else 
        {
            System.out.println("Ya hay un carro parqueado con esa placa.");
        }
    }

   
    public void parquearCarroV() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de la celda donde desea parquear: ");
        int se=scan.nextInt();
        if (Sensor.buscarVehiculo(se) == 1) 
        {           
            System.out.println("Placa del carro: ");
            String pl=scan.next();
            System.out.println("Marca del carro: ");
            String ma=scan.next();
            System.out.println("Color del carro: ");
            String co=scan.next();
            System.out.println("Valor del carro: ");
            int vl=scan.nextInt();
            Vehiculo.vehiculos[se]= new Vehiculo(pl, ma, co,vl);
            Sensor.sensores[se]=new Sensor(0);
            System.out.println("\nEl carro fue parqueado exitosamente.\n");
            System.out.println(Vehiculo.vehiculos[se].toString());
        }
        else 
        {
            System.out.println("Ya hay un carro parqueado con esa placa.");
        }
    }

}
