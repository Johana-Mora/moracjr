
class Fibonacci {
    public static void main (string args[])
    {
        Scanner teclado=new Scanner(System.in);
        int numero1=0, numero2=1, interaciones, numero3;
        System.out.print("¿Cuantas iteraciones desea?");
         interaciones=teclado.nextInt(); 
         System.out.print(numero1);
         System.out.print(numero2);
         do 
         {
             numero3=numero1+numero2;
             System.out.print(numero3);
             numero1=numero2;
             numero2=numero3;

         } while(numero2<=interaciones);




         //  int numero1=0, numero2=1, numero3;
         //System.out.print(numero1);
         //System.out.print(numero2);
        // do 
        // {
        //     numero3=numero1+numero2;
        //     System.out.print(numero3);
         //    numero1=numero2;
         //    numero2=numero3;

         //} while(numero2<=10);


    }
}