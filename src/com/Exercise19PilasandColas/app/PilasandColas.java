package com.Exercise19PilasandColas.app;

import java.util.Scanner;
import java.util.Stack;


public class PilasandColas {

	public static void main(String[] args) 
	{
		
		
		//Variables declaration
		
		String cad="De Acuerdo a Greimas, es un enunciado ya sea gr�fico o f�nico que nos permite "
				+ "visualizar las palabras que escuchamos y que es utilizado para manifestar el proceso "
				+ "ling��stico. Mientras Hjelmslev usa ese t�rmino para designar el todo de una cadena ling��stica "
				+ "ilimitada ";
		
		Stack<Character> letters = new Stack<Character>();
		
		char[] lettersArray = cad.toCharArray();
		
		for(Character c: lettersArray)
		{
			if(Character.toUpperCase(c)=='A')
			{
				letters.push(c);
			}
			
		}
		
		while(!letters.isEmpty())
		{
			System.out.println(letters.pop());
		}
		
		
		
		
		

	}

}
