import java.util.Scanner;

public class Ejercicio06Integrador {

    public static void main(String[] args) {
       Scanner d=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de bits");
        int numB=d.nextInt();
        if(numB<=5){
        int combinaciones=(int) Math.pow(2, numB);
        //Imprimir encabezado de la tabla
            switch (numB) {
                case 2:
                    System.out.print(" A "+"\t"+" B "+"\t");
                    break;
                case 3:
                    System.out.print(" A "+"\t"+" B "+"\t"+" C "+"\t");
                    break;
                case 4:
                    System.out.print(" A "+"\t"+" B "+"\t"+" C "+"\t"+" D "+"\t");
                    break;
                case 5:
                    System.out.print(" A "+"\t"+" B "+"\t"+" C "+"\t"+" D "+"\t"+" E "+"\t");
                    break;      
            }
        
        
        System.out.println("No. Salida");
        
        //Imprimir separador
        for(int i=0; i< numB + 1;i++){
        System.out.print("---------");
        }
        System.out.println();
        //Combinacion de bits posibles
        for(int i=0;i< combinaciones ;i++){
        for(int j=0;j< numB;j++){
        int bit=(i>>j)&1;
        System.out.print(bit+"\t");   
        }
        System.out.println(i);
        }
        System.out.println("Teclea la cantidad de salidas que deseas sean verdaderas(1)");
        int salidasC=d.nextInt();
        int [] salidas=new int [salidasC];
        for(int i=0;i< salidasC;i++){
        System.out.println("Teclea el numero de salida que deseas sea verdadera(1)");
        salidas[i]=d.nextInt();
        }
        System.out.println("La expresion es: ");
        switch(numB){
            case 2:{
           for(int i=0;i<salidasC;i++){
               if(salidas[i]==0){
                   System.out.print("A' B'");
               }
               if(salidas[i]==1){
                   System.out.print("A B'");
               }
               if(salidas[i]==2){
                   System.out.print("A' B");
               }
               if(salidas[i]==3){
                   System.out.print("A B");
               }
               if(i+1<salidasC){
                   System.out.print(" + ");
               }
            }
            System.out.println();
            }
            break;
            
            case 3:{
           for(int i=0;i<salidasC;i++){
               if(salidas[i]==0){
                   System.out.print("A' B' C'");
               }
               if(salidas[i]==1){
                   System.out.print("A B' C'");
               }
               if(salidas[i]==2){
                   System.out.print("A' B C'");
               }
               if(salidas[i]==3){
                   System.out.print("A B C'");
               }
               if(salidas[i]==4){
                   System.out.print("A' B' C");
               }
               if(salidas[i]==5){
                   System.out.print("A B' C");
               }
               if(salidas[i]==6){
                   System.out.print("A' B C");
               }
               if(salidas[i]==7){
                   System.out.print("A B C");
               }
               if(i+1<salidasC){
                   System.out.print(" + ");
               }
            }System.out.println();}
            break;
            
            case 4:{
           for(int i=0;i<salidasC;i++){
               if(salidas[i]==0){
                   System.out.print("¬A ¬B ¬C ¬D");
               }
               if(salidas[i]==1){
                   System.out.print("A ¬B ¬C ¬D");
               }
               if(salidas[i]==2){
                   System.out.print("¬A B ¬C ¬D");
               }
               if(salidas[i]==3){
                   System.out.print("A B ¬C ¬D");
               }
               if(salidas[i]==4){
                   System.out.print("¬A ¬B C ¬D");
               }
               if(salidas[i]==5){
                   System.out.print("A ¬B C ¬D");
               }
               if(salidas[i]==6){
                   System.out.print("¬A B C ¬D");
               }
               if(salidas[i]==7){
                   System.out.print("A B C ¬D");
               }
               if(salidas[i]==8){
                   System.out.print("¬A ¬B ¬C D");
               }
               if(salidas[i]==9){
                   System.out.print("A ¬B ¬C D");
               }
               if(salidas[i]==10){
                   System.out.print("¬A B ¬C D");
               }
               if(salidas[i]==11){
                   System.out.print("A B ¬C D");
               }
               if(salidas[i]==12){
                   System.out.print("¬A ¬B C D");
               }
               if(salidas[i]==13){
                   System.out.print("A ¬B C D");
               }
               if(salidas[i]==14){
                   System.out.print("¬A B C D");
               }
               if(salidas[i]==15){
                   System.out.print("A B C D");
               }
               if(i+1<salidasC){
                   System.out.print(" + ");
               }
            }System.out.println();}
            break;
            
            case 5:{
           for(int i=0;i<salidasC;i++){
               
               if(salidas[i]==0){
                   System.out.print("A' B' C' D' E'");
               }
               if(salidas[i]==1){
                   System.out.print("A B' C' D' E'");
               }
               if(salidas[i]==2){
                   System.out.print("A' B C' D' E'");
               }
               if(salidas[i]==3){
                   System.out.print("A B C' D' E'");
               }
               if(salidas[i]==4){
                   System.out.print("A' B' C D' E'");
               }
               if(salidas[i]==5){
                   System.out.print("A B' C D' E'");
               }
               if(salidas[i]==6){
                   System.out.print("A' B C D' E'");
               }
               if(salidas[i]==7){
                   System.out.print("A B C D' E'");
               }
               if(salidas[i]==8){
                   System.out.print("A' B' C' D E'");
               }
               if(salidas[i]==9){
                   System.out.print("A B' C' D E'");
               }
               if(salidas[i]==10){
                   System.out.print("A' B C' D E'");
               }
               if(salidas[i]==11){
                   System.out.print("A B C' D E'");
               }
               if(salidas[i]==12){
                   System.out.print("A' B' C D E'");
               }
               if(salidas[i]==13){
                   System.out.print("A B' C D E'");
               }
               if(salidas[i]==14){
                   System.out.print("A' B C D E'");
               }
               if(salidas[i]==15){
                   System.out.print("A B C D E'");
               }
               if(salidas[i]==16){
                   System.out.print("A' B' C' D' E");
               }
               if(salidas[i]==17){
                   System.out.print("A B' C' D' E");
               }
               if(salidas[i]==18){
                   System.out.print("A' B C' D' E");
               }
               if(salidas[i]==19){
                   System.out.print("A B C' D' E");
               }
               if(salidas[i]==20){
                   System.out.print("A' B' C D' E");
               }
               if(salidas[i]==21){
                   System.out.print("A B' C D' E");
               }
               if(salidas[i]==22){
                   System.out.print("A' B C D' E");
               }
               if(salidas[i]==23){
                   System.out.print("A B C D' E");
               }
               if(salidas[i]==24){
                   System.out.print("A' B' C' D E");
               }
               if(salidas[i]==25){
                   System.out.print("A B' C' D E");
               }
               if(salidas[i]==26){
                   System.out.print("A' B C' D E");
               }
               if(salidas[i]==27){
                   System.out.print("A B C' D E");
               }
               if(salidas[i]==28){
                   System.out.print("A' B' C D E");
               }
               if(salidas[i]==29){
                   System.out.print("A B' C D E");
               }
               if(salidas[i]==30){
                   System.out.print("A' B C D E");
               }
               if(salidas[i]==31){
                   System.out.print("A B C D E");
               }
               if(i+1<salidasC){
                   System.out.print(" + ");
               }
            } System.out.println();}
        }
        }else{
        System.out.println("Lo lamentamos mucho, este programa solo es capas de leer un maximo de 5 bits, lamentamos los inconvenientes, lo solucionaremos pronto");
        }
    }
    
}
