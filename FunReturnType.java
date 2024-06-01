class FunReturnType
{ 
  //static void show(int z)
  //static int show(int x)
   static void show(char y)
 {
 System.out.println("No Return Type Arguments :");
  //return x;
 }
  //static void show(int z)
 //static long show(long z)
 static int show(int z)
 {
 System.out.println("With Return Type  Arguments :");
 return z;
 }
 public static void main(String[] args)
 {
   show('a');
   //show(200)
/*   
   int b = show(200);
   System.out.println(b);
   long c = show(10123456L);;
   System.out.println(c);
*/
    int a = show(10);
    System.out.println(a);
 }
}