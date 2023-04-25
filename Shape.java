package Polymorphism;

public class Shape
{
    public void Draw(){
        System.out.println("Drawing a shape");
    }}
    class Circlee extends Shape{
    @Override
        public void Draw(){
            System.out.println("Drawing a circle");
        }
    }
    class Squaree extends Shape{
    @Override
       public void Draw(){
            System.out.println("Drawing a Square");
        }
    }
    class Main3{
        public static void main(String[] args) {
            Shape s1=new Squaree();
            Shape s2=new Circlee();
            s1.Draw();
            s2.Draw();

        }
    }


