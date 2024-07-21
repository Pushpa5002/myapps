class Box
{
  public static void main (String x[])
   {
     int i = 4;
     Integer I = i;
     System.out.println("Autoboxing of interger is "+I);
     
     Integer I1=1256;
     int i1=I1;
     System.out.println("hello this is the purpose of doing the changes in the git hub commit and moving it Unboxing of integer is "+i1);
     System.out.println();

     float a=23.15f;
     Float A=a;
     System.out.println("Autoboxing of float is "+A);

     Float A1=42.23f;
     float a1=A1;
     System.out.println("Unautoboxing of float is "+a1);
     System.out.println();

     char o='k';
     Character O=o;
     System.out.println("Autoboxing of character is "+O);

     Character O1='P';
     char o1=O1;
     System.out.println("Unautoboxing of character is "+o1);
     System.out.println();

     double r=11.2233d;
     Double R=r;
     System.out.println("Autoboxing of double is "+R);

     Double R1=66.6621d;
     double r1=R1;
     System.out.println("Unautoboxing of double is "+r1);
     System.out.println();

     boolean b= true;
     Boolean B=b;
     System.out.println("Autoboxing of boolean is "+B);

     Boolean B1= false;
     boolean b1=B1;
     System.out.println("Autoboxing of boolean is "+b1);
     System.out.println();
    }
}