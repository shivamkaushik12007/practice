import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
    String a = scanner.next ();
    String b = scanner.next ();
    int c = a.length ();
    int d = b.length ();
    if (c > d)
      {
	int i = 0;
	for (i = 0; i < d; i++)
	  {
	    System.out.print (a.charAt (i));
	    System.out.print (b.charAt (i));
	  }
	for (i = d; i < c; i++)
	  {
	    System.out.print (a.charAt (i));
	  }
      }
    else if (c < d)
      {
	int i = 0;
	for (i = 0; i < c; i++)
	  {
	    System.out.print (a.charAt (i));
	    System.out.print (b.charAt (i));
	  }
	for (i = c; i < d; i++)
	  {
	    System.out.print (b.charAt (i));
	  }
      }
    else if (c == d)
      {
	for (int i = 0; i < c; i++)
	  {
	    System.out.print (a.charAt (i));
	    System.out.print (b.charAt (i));
	  }
      }
  }
}
