package abst;

import java.util.*;

//abstract class
abstract class Shape {
  //abstract methods
	abstract void area();
	abstract void volume();
}

class Cube extends Shape{
  int side;
  
  Cube(int s){
    side=s;
  }
  
  @Override
  public void area(){
    System.out.println("area of cube:"+(6*side*side));
  }
  
  @Override
  public void volume(){
    System.out.println("volume of cube:"+(side*side*side));
  }
}

public class Main {
    public static void main(String[] args) {
     Shape s1=new Cube(4);
     s1.area();
     s1.volume();
  }
}













