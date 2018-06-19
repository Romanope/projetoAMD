package list.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import list.impl.ListasDesordenadas;
import list.impl.ListaEncadeada;
import list.impl.Time;
import list.util.RandomUtils;
import list.util.Util;

public class ControladorLista<T> {
	
	
	private static final int NUMERO_ELEMENTOS_TOTAL = 250000;
	private static ListasDesordenadas listasDesordenadas;
	
	public static void start (int numeroElementos, int quantidadeExecucoes, boolean tpExecImplementada) throws IOException {
		
		// Inicializa lista com valores aleatórios que serão utilizados para ordenação
		init();
		
		if (tpExecImplementada) {
			executarExperimentoComListaImplementada(quantidadeExecucoes, numeroElementos);
		} else {
			executarExperimentoComListaNativa(quantidadeExecucoes, numeroElementos);
		}
	}

	private static void executarExperimentoComListaNativa (int quantidadeExecucoes, int numeroElementos) throws IOException {
		
		List<Time> timesNative = new ArrayList<>();
		List<Double> nativa = null;
		for (int i = 0; i < quantidadeExecucoes; i++) {
			nativa = listasDesordenadas.getListaNativa(numeroElementos, i + 1);
			timesNative.add(ordernarListaNativa(nativa));
		}
		
		Util.criarArquivoDuracoes(timesNative, Util.DIRETORIO_NATIVA, Util.obterNomeArquivo(numeroElementos, quantidadeExecucoes, Boolean.TRUE));
	}

	private static void executarExperimentoComListaImplementada (int quantidadeExecucoes, int numeroElementos) throws IOException {
		
		List<Time> timesImplementada = new ArrayList<>();
		ListaEncadeada<Double> implementada = null;
		for (int i = 0; i < quantidadeExecucoes; i++) {
			implementada = listasDesordenadas.getListaImplementada(numeroElementos, i+1);
			timesImplementada.add(ordernarListaImplementada(implementada));
		}
		Util.criarArquivoDuracoes(timesImplementada, Util.DIRETORIO_IMPLEMENTADA, Util.obterNomeArquivo(numeroElementos, quantidadeExecucoes, Boolean.FALSE));
	}
	
	private static void init () throws IOException {
		if (!Util.existsFile(Util.DIRETORIO_CARGA_TRABALHO.concat("\\Carga de Trabalho.txt"))) {
			RandomUtils.get().criarCargaTrabalho(NUMERO_ELEMENTOS_TOTAL);
		}
		
		if (listasDesordenadas == null) {
			listasDesordenadas = new ListasDesordenadas();
			listasDesordenadas.inicializarListas();
		}
	}
	
	private static Time ordernarListaNativa (List<Double> lista) {
		
		long start = System.nanoTime();
		Collections.sort(lista, new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return o1.compareTo(o2);
			}
		});
		long end = System.nanoTime();
		
		return new Time(start, end);
	}

	private static Time ordernarListaImplementada (ListaEncadeada<Double> lista) {
		long start = System.nanoTime();
		lista.sort();
		long end = System.nanoTime();
		return new Time(start, end);
	}
	
	public static void main(String[] args) {
		RandomUtils.get().criarCargaTrabalho(NUMERO_ELEMENTOS_TOTAL);
		System.out.println("Arquivo atualizado");
	}
}
