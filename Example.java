import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    var numbers = new ArrayList<Integer>();
      numbers.add(300);
      numbers.add(54);
      numbers.add(-235);
      numbers.add(8);
      numbers.add(789);
      numbers.add(7789);
      numbers.add(30251);
      numbers.add(75);
      numbers.add(568);
      numbers.add(256872);
      numbers.add(12);
      numbers.add(8896);
      numbers.add(4);
      numbers.add(20);

      numbers
        .stream()
        .filter(n -> n % 2 == 0)
        .skip(5)
        .limit(3)
        .forEach(x -> Print(x));
  }
  public static void Print(int number) {
      System.out.println(number);
  }
}


  
/*
Easy: Create an integer ArrayList, skip the first 5 numbers. And then with the rest of them, print them out.
Medium: Create an integer ArrayList, make sure they divide by 2, skip the first 5, limit to three and print them out from another function.


Extra: Read about Streams and the actions you can do with it.
  */
Can write here for sure ( Hanna )
  
