/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradocesarprueba;

import java.util.Scanner;

/**
 *
 * @author Angie Castañeda
 */
public class CifradoCesarPrueba {
    
     int codig;
     Scanner cadena = new Scanner(System.in);
     StringBuilder txt = new StringBuilder();
     Scanner op = new Scanner(System.in);
     String lec, cod, opc;
            
    public CifradoCesarPrueba() {
        cifra();
        decifra();
    }
    public void pideDatos(){
        
            System.out.println("DIGITE LA CADENA A CODIFICAR");
            lec = cadena.nextLine();
            System.out.println("DIGITE CODIGO A USAR ");
            codig = cadena.nextInt();
            System.out.print("ESCOJA LA ACCION QUE DESEA, CIFRAR 1 DESCIFRAR 0");
            opc = op.nextLine();
        
    }

    public void cifra(){ //Cifra e imprime la cadena ingresada
        codig = codig % 26;
        for (int i = 0; i < lec.length(); i++) {
            if(lec.charAt(i)>= 'a' && lec.charAt(i)<= 'z'){
            txt.append((char) (lec.charAt(i) + codig - 26 ));
            }else{
                txt.append((char) (lec.charAt(i) + codig ));
            }
        System.out.println("Cadena codificada..." + txt);
}


    public void decifra(){
        codig = codig % 26;
        for (int i = 0; i < lec.length(); i++) {
            if(lec.charAt(i)>= 'a' && lec.charAt(i)<= 'z'){
                if((lec.charAt(i) - codig) <'a'){
                        txt.append((char) (lec.charAt(i) - codig + 26 ));
            }else{
                txt.append((char) (lec.charAt(i) - codig ));
            }
        }
          System.out.println("Cadena Decodificada..." + txt);
        }
    } 
    


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            CifradoCesarPrueba cifradoCesar = new CifradoCesarPrueba();
         // TODO code application logic here
    }
}
