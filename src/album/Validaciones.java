
package album;

import java.util.Scanner;

public class Validaciones 
{
    static Scanner sc = new Scanner(System.in);
    
    
 /* este metodo retorna un entero mayor que cero con las
       validaciones respectivas */
    public static int LeerInt(String mensaje) {
        int num = 0; // variable de retorno
        do { // obliga al usuario a digitar lo que necesito
            try { // maneja las excepciones que se salen de las manos
                System.out.println(mensaje);
                num = sc.nextInt(); // se pide el entero a validar
                sc.nextLine(); // limpiar ENTER
                if (num <= 0) // solo es para mostrar mensaje de error
                    System.out.println("Debe digitar número mayor que cero");
            } catch (Exception err) { // no ingresa lo pedido
                System.out.println("Debe digitar Números");
                sc.nextLine(); // limpiar el buffer
            }
            // se sale con el numero mayor que cero, de lo contrario se queda    
        } while (num <= 0);
        return num;
    } // fin de leer enteros
    
    /* este metodo retorna un real mayor o igual a cero con las
       validaciones respectivas */
    public static double LeerDouble(String mensaje) {
        double num = 0; // variable de retorno
        do { // obliga al usuario a digitar lo que necesito
            try { // maneja las excepciones que se salen de las manos
                System.out.println(mensaje);
                num = sc.nextDouble(); // se pide el real a validar
                sc.nextLine(); // limpiar ENTER
                if (num < 0) // solo es para mostrar mensaje de error
                    System.out.println("Debe digitar número mayor o igual que cero");
            } catch (Exception err) { // no ingresa lo pedido
                System.out.println("Debe digitar NUMEROS");
                sc.nextLine(); // limpiar el buffer
            }
            // se sale con el numero mayor o igual que cero, de lo contrario se queda    
        } while (num < 0);
        return num;
    } // fin de leer reales
    
     /*este metodo retorna un string o cadena con las
    validaciones respectivas, no lo deja en blanco*/
    public static String LeerString(String mensaje)
    {
    String txt="";//variable de retorno
    do{//obliga al usuario a digitar lo que necesito
       try{//maneja las excepciones que se salen de las manos
           System.out.println(mensaje);
           txt= sc.nextLine();//se pide el string a validar
           
           if(txt.equals(""))//solo es para mostrar mensaje de error
               System.out.println("Debe digitar informacion");
          }catch(Exception err)
          {//no ingresa lo pedido
             System.out.println("Debe digitar informacion");
             sc.nextLine(); // limpiar el buffer
          }
         //se sale con algun tipo de entrada de lo contrario se queda    
        }while(txt.equals("")); 
    return txt;
    }//fin de leer cadena o texto
    
}
