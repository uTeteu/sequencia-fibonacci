package application;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite qual a quantidade de números da sequência de Fibonacci deseja: ");
		int n = sc.nextInt();
		
		Stream<Long> stream = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		//stream.limit é para limitar a quantidade de número. Caso tirar, ele irá imprimir 
		System.out.println(Arrays.toString(stream.limit(n).toArray()));
		
		sc.close();
	}
}
