// Amrit Gill
// February 12, 2024
// Period 5
// TTT with 2D arrays

import java.util.Scanner;

public class Player{
  private String name;

  public Player(String pos){
    getName(pos);
  }

  public String getName(String posi){
    System.out.println("What is your name?");
    Scanner n = new Scanner(System.in);
    name = n.nextLine();
    System.out.println();
    System.out.println(name + ", you are " + posi);

    return name;
  }
}