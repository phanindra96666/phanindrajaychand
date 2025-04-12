import java.util.*;
class J005{
static Scanner sc=new Scanner(System.in);
static J005 obj=new J005();
static void m1()
{
System.out.println("m1");
obj.n1();
}
//non static without (parameter and return type)
void n1()
{
System.out.println('@');
System.out.println(m2());
}

static int m2()
{
System.out.println("m2");
System.out.println(obj.n2());
return sc.nextInt();
}
//non static without parameter with return type
String n2()
{
System.out.println("Keerthi");
m3(sc.nextDouble());
return sc.next();
}


static void m3(double d)
{
System.out.println("m3");
obj.n3(sc.nextLong());
}
//non static with parameter without return type
void n3(long l)
{
System.out.println("n3");
System.out.println(m4(sc.next()));
}


static char m4(String s)
{
System.out.println(s+" "+"m4");
System.out.println(obj.n4(sc.nextInt()));
return sc.next().charAt(0);
}
//non static with parameter with return type
float n4(int a){
    System.out.println(a);
    System.out.println("n4");
    return sc.nextFloat();
}

//J005 method
    public static void J005(String[] args){
        m1();
    }
}