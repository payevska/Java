public class Variable2
{
  public static void main(String[] args)
  {
    /*// the link to object Student assigned variable olga
    Student olga = new Student(); 
    olga.name = "Olga"; // value "Olga" assigned property name (class Student)
    olga.age = 21; // value 21 assigned property age (class Student)

    Student vera = new Student();
    vera.name = "Veronika";
    vera.age = 15;

    System.out.println("Olga is " + olga.age);
    System.out.println("Vera is " + vera.age);

// call the method ageSwap() with params olga and vera
    ageSwap(olga, vera);

// in the method ageSwap() change value 
    System.out.println("Olga is " + olga.age); // Olga is 15
    System.out.println("Vera is " + vera.age); // Vera is 21
  }

  private static void ageSwap(Student a,
                                    Student b)
  {
    int c = a.age; // c = a.age = 21
    a.age = b.age; // a.age = b.age = 15 olga
    b.age = c; // b.age = c = 21 vera
  }*/

  Student olga = new Student();
    olga.name = "Olga";
    olga.age = 21;

    Student vera = new Student();
    vera.name = "Veronika";
    vera.age = 15;

    System.out.println("Olga is " + olga.age);
    System.out.println("Vera is " + vera.age);

    Student a = olga, b = vera;

    int c = a.age;
    a.age = b.age;
    b.age = c;

    System.out.println("Olga is " + olga.age); // Olga is 15
    System.out.println("Vera is " + vera.age); // Vera is 21
  }
// class Student have property: the primitive variable and linking variable
  static class Student
  {
    String name;
    int age;
  }
}