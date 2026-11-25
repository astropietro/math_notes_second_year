/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author Prieto
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    // preguntar por el numero de filas y columnas
    int nFilas = scan.nextInt();
    int nColumnas = scan.nextInt();
    // nombrar matriz
    int[][] mat = new int[nFilas][nColumnas];
    // cambiar contenido, para eso nombremos j
    int k = 0;
    for (int i = 0; i<mat[0].length; i++){
        for (int j = 0; j<mat[i].length; j++){
            mat[i][j] = k;
            k++;
            System.out.print(mat[i][j] + "\t");
        }
        System.out.println();       
    }   
    }
    
}
