public class Variable
{
  public static void main (String[] args)
  {
    /*int m = 5;
    int n = 6;

    System.out.println("M=" +m+ " N=" + n); // M = 5; N = 6;
    swap(m, n);
    System.out.println("M=" +m+ " N=" + n); // M = 5; N = 6;
  }

//this metod don't see m and n
  private static void swap(int a, int b)
  {
    int c = a;
    a = b;
    b = c;*/

    int m = 5;
    int n = 6;

    System.out.println("M=" +m+ " N=" + n); // M = 5; N = 6;
    int a = m, b = n; // a = 5; b = 6;

// value change : a = 6; b = 5 (helps them variable c).
    int c = a; // c = a = 5 
    a = b; // a = 6
    b = c; // b = c = a = 5

    System.out.println("M=" +m+ " N=" + n); // M = 5; N = 6;
  }
}