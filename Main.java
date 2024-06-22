
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        
        

        Scanner scanner = new Scanner(System.in);
        int Count1 = 0;

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        do {
            Count1++;
        if ( randomNumber > number ) {
            System.out.println (" Я сам в шоке, но, загаданное число больше, брат "  );
            System.out.print("Введите целое число: ");
            number = scanner.nextInt();
        } 
        else if ( randomNumber < number )  { 
            System.out.println ("Не ожидал от тебя такого. Загаданное число меньше, брат" );
            System.out.print("Введите целое число: ");
            number = scanner.nextInt();
            
            
            
            
        } 

            1
        

    
    }   while ( number != randomNumber); {
            File file = new File( "C:\\Users\\Пользователь\\Documents\\Main\\count1.txt");   
            PrintWriter outputFile = new PrintWriter(new FileWriter(file, true));
        
            outputFile.println(Count1);
            outputFile.close();
            System.out.println ( "Количество попыток: " + Count1 + " Загаданое число " + randomNumber + " Умничка "); } 

        
}

}




