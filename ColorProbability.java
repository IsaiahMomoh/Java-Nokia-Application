import java.util.Scanner;
public class ColorProbability { 
   public static void main(String[] args) {

//Scanner.input = new.Scanner(System.in);
Scanner input = new Scanner(System.in);
boolean repeat = true;



//System.out.println("Enter an integer: ")
while(repeat){
System.out.print("Enter favorite color:");
String color= input.next();

if(color.equalsIgnoreCase("Green")){
System.out.println("Go");

}
else
if(color.equalsIgnoreCase("Yellow")){
System.out.println("Get Ready");

}
else
if(color.equalsIgnoreCase("Red")){
System.out.println("Stop");

}
else{
System.out.println("Invalid, please try again");
}
}
}
}









