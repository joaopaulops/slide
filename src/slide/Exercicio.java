package slide;

import java.util.Scanner;

import java.lang.Math;

public class Exercicio {

	public static void main(String[] args) {
		
		
		   
		   Scanner ft = new Scanner(System.in);
		   
			System.out.print("informe seu Nome:");
			String nome = ft.next();
			System.out.print("Informe seu peso(kg):");
			float peso = ft.nextFloat();
			System.out.print("Informe sua Altura(Metros):");
			float altura = ft.nextFloat();
			
			
			Double imc = peso / (Math.pow(altura, 2));
			
			System.out.printf(nome + " " + "Seu IMC é:%.2f %n",imc);


			if (imc < 19) {
				
				System.out.println("Abaixo do Peso");
				
			}else if(imc >= 19 && imc < 25){
				
				System.out.println("Peso Normal");
				
			}else if(imc >=25 && imc < 30){
				
				System.out.println("Sobrepeso");
				
			}else if(imc >=30 && imc < 40){
				
				System.out.println("Obesidade Tipo 1");
				
			}else if(imc >= 40){
				
				System.out.println("Obesidade Morbida");
			}
		
			
		}
	
	}
		


