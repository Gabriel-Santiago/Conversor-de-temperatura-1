import java.util.Scanner;

public class mudanca_temperatura2 {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String RESET = "\033[0m";

    public static void celsius(float temp){

        float fahr = ((temp * 9) / 5) + 32;
        double kel = temp + 273.15;

        System.out.print(ANSI_BLUE+ANSI_WHITE_BACKGROUND+"A temperatura em Fahrenheit: " + fahr +"°F"+RESET);
        System.out.println(ANSI_RED+ANSI_WHITE_BACKGROUND+"\nA temperatura em Kelvin: " + kel + "K"+RESET);
    }

    public static void fahrenheit(float temp){

        double cel = (temp - 32)*5/9;
        double kelv = (temp - 32)*5/9 + 273.15;
                
        System.out.print(ANSI_BLUE+ANSI_WHITE_BACKGROUND+"A temperatura em Celsius: " + cel +"°C"+RESET);
        System.out.println(ANSI_RED+ANSI_WHITE_BACKGROUND+"\nA temperatura em Kelvin: " + kelv + "K"+RESET);
    }

    public static void kelvin(float temp){

        double cels = temp - 273.15;
        double fah = (temp - 273.15)*9/5 + 32;
                
        System.out.print(ANSI_BLUE+ANSI_WHITE_BACKGROUND+"A temperatura em Celsius: " + cels +"°C"+RESET);
        System.out.println(ANSI_RED+ANSI_WHITE_BACKGROUND+"\nA temperatura em Fahrenheit: " + fah + "°F"+RESET);
    }

    public static void conversion(){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor da sua temperatura: ");
        float temp = input.nextFloat();
        
        System.out.println("Diga qual unidade de medida está a sua temperatura!");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        System.out.println("3 - Kelvin");

        int unit = input.nextInt();

         switch(unit){
            
            case 1 -> {
                celsius(temp);
            }
            
            case 2 -> {
                fahrenheit(temp);
            }
            
            case 3 -> {
                kelvin(temp);
            }
            
            default -> System.out.println(ANSI_RED+"Número inválido");
            }
    }
 
    public static void main(String[] args) throws Exception {
        
        conversion();
    }
}