import java.util.Scanner;
public class Ride {
    private static int counter=1;
    public static vehicle getvehicle(String type){
        switch(type.toLowerCase()){
            case "car":
             return (vehicle) new Car()
            case "bike"
             return new Bike();
            case "auto":
             return new Auto();
            default:
             return null;

        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String continuebooking;
        do{
            System.out.println("Enter vehicle type(Lorry/Bike/Auto):");
            String vehicleType=sc.nextLine();
            vehicle vehicle=getvehicle(vehicleType);
            if(vehicle==null){
                System.out.println("unexpected");
            }else{
                System.out.println("enter no of hours");
            
            int hours=sc.nextInt();
            sc.nextLine();
            int fare=vehicle.book(hours);
            String bookingid="BKG"+counter++;
            System.out.println("booking successful");
            System.out.println("bookingid:"+bookingid);
            System.out.println("Fare:"+fare);
        }
        System.out.println("Do you want to book another ride?(yes/no):");
        continuebooking=sc.nextLine();
    }
    while(continuebooking.equalsIgnoreCase("yes"));
            
        }
    }
interface vehicle{
    int book(int hours);
}
class Car implements vehicle{
    public int book(int hours){
        return 100*hours;
    }

    @Override
    public String toString() {
        return "Car []";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class Bike implements vehicle{
    public int book(int hours){
        return 50 *hours;  
     }
}
class Auto implements vehicle{
    public int book(int hours){
        return 70*hours;
    }
}


    

