/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

import javax.swing.JOptionPane;

/**
 *
 * @author MAC
 */
public class GitHub {
int num1,num2;

int sum,res,mult,div;
  public void leerDatos(){
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
     num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
     
      
  }
  public void Sumar(){
      sum = num1+num2;

  }
  public void Restar(){
      res = num1-num2;
      
      
      
  }
  public void Multiplicar(){
      
    mult = num1*num2;  
      
  }
  public void Dividir(){
      div = num1/num2;
      
      
  }
  
  public void MostrarLosResultados(){
      
      System.out.println("La suma: "+sum);
      System.out.println("La resta es: "+res);
      System.out.println("La Multiplicaion es: "+mult);
      System.out.println("La division es: "+div);
  }
    public static void main(String[] args) {
     GitHub gt = new GitHub();
     gt.leerDatos();
     gt.Sumar();
     gt.Restar();
     gt.Multiplicar();
     gt.Dividir();
     gt.MostrarLosResultados();
    }
    
}
