import java.util.Scanner;
public class piramide_pascal
{
    Scanner tec = new Scanner(System.in);
    public static void main ()
    {
        piramide_pascal obj;
        obj = new piramide_pascal();
        obj.crearmatriz();
    }
    public void crearmatriz()
    {
        System.out.print("Ingrese un número impar para las columnas");
        int col = tec.nextInt();
        if (col%2 == 0)
        {
            System.out.println("Escriba un número impar");
        }
        else
        {
            int fil = (col+1)/2;
            int matr[][] = new int [fil][col];
            matr[0][(col-1)/2]=1;
            for(int i=1; i<matr.length; i++)
            {
                for(int e=0; e<matr[i].length; e++)
                {
                    if(e==0)
                    {
                        matr[i][e] = matr[i-1][e+1];
                    }
                    else
                    if (e==col-1)
                    {
                       matr[i][e] = matr[i-1][e] + matr[i-1][e-1]; 
                    }
                    else
                    if (matr[i-1][e-1] >= 0 && matr[i-1][e+1] >= 0)
                    {
                        matr[i][e] = matr[i-1][e-1] + matr[i-1][e+1];
                    }
                }
            }
            for (int i=0; i<matr.length; i++)
            {
                for(int e=0; e<matr[i].length; e++)
                {
                    System.out.print(matr[i][e]);
                }
                System.out.println();
            }
        }
        System.out.println("esta será su matriz");
        
    }
}