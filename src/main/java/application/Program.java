package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Pessoa;

public class Program {

	private static final Scanner SC = new Scanner(System.in);
	private static List<Pessoa> pessoas = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("## Get Data ##");
		System.out.println();
		gettingDataFromUser();
		groupingByGenre(pessoas);
		SC.close();
	}

	private static void gettingDataFromUser() {
		System.out.println(
				"Entre com nomes e gênero de pessoas separadando nome-genero e as pessoas por víruglas (ex: Jhon-M,Ana-F): ");
		String nomesEntrada = SC.nextLine();

		String[] arrNomesGeneros = nomesEntrada.split(",");
		List<String[]> arrNomeGenero = new LinkedList<>();

		for (String NomeGenero : arrNomesGeneros) {
			arrNomeGenero.add(NomeGenero.split("-"));
		}

		for (String[] p : arrNomeGenero) {
			pessoas.add(new Pessoa(p[0], p[1]));
		}
	}
	
	public static List<Pessoa> groupingByGenre(List<Pessoa> pessoas) {
		List<Pessoa> pessoasF = new ArrayList<>();
		return pessoasF = pessoas.stream().filter(p -> p.getGender().equalsIgnoreCase("F")).collect(Collectors.toList());
	}
}
