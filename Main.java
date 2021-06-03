import java.util.Scanner;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Menu menu = new Menu();
    Shoes_Plus shoes_p = new Shoes_Plus();
    Shoes_Minus shoes_m = new Shoes_Minus();
    Shoes_Stock shoes_s = new Shoes_Stock();
    int num = 0;

    menu.menu();
    
    switch(num)
    {
      case 1: 
      shoes_p.Shoes_plus();
      break;

      case 2:
      shoes_m.Shoes_Minus();
      break;

      case 3:
      shoes_s.Shoes_Stock();
      break;
    }
  }
}