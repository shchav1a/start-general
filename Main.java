import java.util.Arrays;
import java.util.Random;
import java.util.function.IntSupplier;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Random r = new Random();

    int[][] sea = new int[5][5];
    sea[0] = r.ints(5,0,2).toArray();
    sea[1] = r.ints(5,0,2).toArray();
    sea[2] = r.ints(5,0,2).toArray();
    sea[3] = r.ints(5,0,2).toArray();
    sea[4] = r.ints(5,0,2).toArray();

    Arrays.stream(sea[0]).forEach(System.out::print);
    System.out.println();
    Arrays.stream(sea[1]).forEach(System.out::print);
    System.out.println();
    Arrays.stream(sea[2]).forEach(System.out::print);
    System.out.println();
    Arrays.stream(sea[3]).forEach(System.out::print);
    System.out.println();
    Arrays.stream(sea[4]).forEach(System.out::print);


  }
}