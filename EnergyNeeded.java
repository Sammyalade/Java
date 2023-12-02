import java.util.Scanner;

public class EnergyNeeded{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Amount Of Water: ");
int amountOfWater = input.nextInt();

System.out.print("Enter Initial Temperature: ");
int initialTemperature = input.nextInt();

System.out.print("Enter Final Temperature: ");
int finalTemperature = input.nextInt();

int calculation = amountOfWater * (finalTemperature - initialTemperature) * 4184;

System.out.printf("Energy needed is %d%n", calculation);

}

}