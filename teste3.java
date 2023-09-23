package teste;

import java.util.Scanner;

public class teste3 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva sua palavra: ");
		String str = in.nextLine();
		
		System.out.println("O número de vogais é: "+ contar_vogais(str) + "\n");
	}	

public static int contar_vogais(String str) {
	int count= 0;
	for (int i = 0; i< str.length(); i++)
        {
		
		if (str.charAt(i) == 'a' ||
			str.charAt(i) == 'A' ||
			str.charAt(i) == 'e' ||
			str.charAt(i) == 'E' ||
			str.charAt(i) == 'i' ||
			str.charAt(i) == 'I' ||
			str.charAt(i) == 'o' ||
			str.charAt(i) == 'O' ||
			str.charAt(i) == 'u' ||
			str.charAt(i) == 'U' )
		{
			count++;
		}
			
			}
	return count;
		}
}