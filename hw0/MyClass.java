abstract class FirstClass{
 public abstract String sayHello();
}


public class MyClass {
 public static void main(String[] args){

 ExtendedClass objectToSayHello = new ExtendedClass(); 
String message = objectToSayHello.sayHello();
 System.out.println(message);
 }
}

