package list.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import list.util.Util;

public class ListasDesordenadas {

	private static final int VALOR_LISTA_10 = 10000;
	private static final int VALOR_LISTA_20 = 20000;
	private static final int VALOR_LISTA_30 = 30000;
	private static final int VALOR_LISTA_40 = 40000;
	private static final int VALOR_LISTA_50 = 50000;
	private static final int VALOR_LISTA_60 = 60000;
	private static final int VALOR_LISTA_70 = 70000;
	private static final int VALOR_LISTA_80 = 80000;
	private static final int VALOR_LISTA_90 = 90000;
	private static final int VALOR_LISTA_100 = 100000;
	private static final int VALOR_LISTA_150 = 150000;
	private static final int VALOR_LISTA_200 = 200000;
	private static final int VALOR_LISTA_250 = 250000;
	
	private List<Double> listaDezMilNativa;
	private List<Double> listaVinteMilNativa;
	private List<Double> listaTrintaMilNativa;
	private List<Double> listaQuarentaMilNativa;
	private List<Double> listaCinquentaMilNativa;
	private List<Double> listaSessentaMilNativa;
	private List<Double> listaSetentaMilNativa;
	private List<Double> listaOitentaMilNativa;
	private List<Double> listaNoventaMilNativa;
	private List<Double> listaCemMilNativa;
	private List<Double> listaCentoCinquentaMilNativa;
	private List<Double> listaDuzentosMilNativa;
	private List<Double> listaDuzentosCinquentaMilNativa;

	private ListaEncadeada<Double> listaDezMilImplementada;
	private ListaEncadeada<Double> listaVinteMilImplementada;
	private ListaEncadeada<Double> listaTrintaMilImplementada;
	private ListaEncadeada<Double> listaQuarentaMilImplementada;
	private ListaEncadeada<Double> listaCinquentaMilImplementada;
	private ListaEncadeada<Double> listaSessentaMilImplementada;
	private ListaEncadeada<Double> listaSetentaMilImplementada;
	private ListaEncadeada<Double> listaOitentaMilImplementada;
	private ListaEncadeada<Double> listaNoventaMilImplementada;
	private ListaEncadeada<Double> listaCemMilImplementada;
	private ListaEncadeada<Double> listaCentoCinquentaMilImplementada;
	private ListaEncadeada<Double> listaDuzentosMilImplementada;
	private ListaEncadeada<Double> listaDuzentosCinquentaMilImplementada;

	public ListasDesordenadas () {
		listaDezMilNativa = new ArrayList<Double>();
		listaVinteMilNativa = new ArrayList<Double>();
		listaTrintaMilNativa = new ArrayList<Double>();
		listaQuarentaMilNativa = new ArrayList<Double>();
		listaCinquentaMilNativa = new ArrayList<Double>();
		listaSessentaMilNativa = new ArrayList<Double>();
		listaSetentaMilNativa = new ArrayList<Double>();
		listaOitentaMilNativa = new ArrayList<Double>();
		listaNoventaMilNativa = new ArrayList<Double>();
		listaCemMilNativa = new ArrayList<Double>();
		listaCentoCinquentaMilNativa = new ArrayList<Double>();
		listaDuzentosMilNativa = new ArrayList<Double>();
		listaDuzentosCinquentaMilNativa = new ArrayList<Double>();
		
		listaDezMilImplementada = new ListaEncadeada<Double>();
		listaVinteMilImplementada = new ListaEncadeada<Double>();
		listaTrintaMilImplementada = new ListaEncadeada<Double>();
		listaQuarentaMilImplementada = new ListaEncadeada<Double>();
		listaCinquentaMilImplementada = new ListaEncadeada<Double>();
		listaSessentaMilImplementada = new ListaEncadeada<Double>();
		listaSetentaMilImplementada = new ListaEncadeada<Double>();
		listaOitentaMilImplementada = new ListaEncadeada<Double>();
		listaNoventaMilImplementada = new ListaEncadeada<Double>();
		listaCemMilImplementada = new ListaEncadeada<Double>();
		listaCentoCinquentaMilImplementada = new ListaEncadeada<Double>();
		listaDuzentosMilImplementada = new ListaEncadeada<Double>();
		listaDuzentosCinquentaMilImplementada = new ListaEncadeada<Double>();
	}
	
	public void inicializarListas() throws IOException {
		
		String valores = Util.obterConteudoArquivo(Util.DIRETORIO_CARGA_TRABALHO, "Carga de Trabalho.txt");
		if (valores == null || valores.length() == 0) {
			throw new IllegalArgumentException("Não foi encontrado nenhum valor no arquivo de carga de trabalho");
		}
		double[] totalValores = toDoubleArray(valores.split(","));
		
		System.out.println("Inicianlizando listas... Favor aguarde");
		for (int i = 0; i < totalValores.length; i++) {
			double valorCorrente = totalValores[i];
			if (i < VALOR_LISTA_10) {
				listaDezMilNativa.add(valorCorrente);
				listaDezMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_20) {
				listaVinteMilNativa.add(valorCorrente);
				listaVinteMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_30) {
				listaTrintaMilNativa.add(valorCorrente);
				listaTrintaMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_40) {
				listaQuarentaMilNativa.add(valorCorrente);
				listaQuarentaMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_50) {
				listaCinquentaMilNativa.add(valorCorrente);
				listaCinquentaMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_60) {
				listaSessentaMilNativa.add(valorCorrente);
				listaSessentaMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_70) {
				listaSetentaMilNativa.add(valorCorrente);
				listaSetentaMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_80) {
				listaOitentaMilNativa.add(valorCorrente);
				listaOitentaMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_90) {
				listaNoventaMilNativa.add(valorCorrente);
				listaNoventaMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_100) {
				listaCemMilNativa.add(valorCorrente);
				listaCemMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_150) {
				listaCentoCinquentaMilNativa.add(valorCorrente);
				listaCentoCinquentaMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_200) {
				listaDuzentosMilNativa.add(valorCorrente);
				listaDuzentosMilImplementada.add(valorCorrente);
			}
			if (i < VALOR_LISTA_250) {
				listaDuzentosCinquentaMilNativa.add(valorCorrente);
				listaDuzentosCinquentaMilImplementada.add(valorCorrente);
			}
		}
		
		System.out.println("Lista inicializadas...\n\n");
		System.out.println("Tamanho das listas nativa");
		System.out.println(listaDezMilNativa.size());
		System.out.println(listaVinteMilNativa.size());
		System.out.println(listaTrintaMilNativa.size());
		System.out.println(listaQuarentaMilNativa.size());
		System.out.println(listaCinquentaMilNativa.size());
		System.out.println(listaSessentaMilNativa.size());
		System.out.println(listaSetentaMilNativa.size());
		System.out.println(listaOitentaMilNativa.size());
		System.out.println(listaNoventaMilNativa.size());
		System.out.println(listaCemMilNativa.size());

		System.out.println("\n\nTamanho das listas implementada");
		System.out.println(listaDezMilImplementada.size());
		System.out.println(listaVinteMilImplementada.size());
		System.out.println(listaTrintaMilImplementada.size());
		System.out.println(listaQuarentaMilImplementada.size());
		System.out.println(listaCinquentaMilImplementada.size());
		System.out.println(listaSessentaMilImplementada.size());
		System.out.println(listaSetentaMilImplementada.size());
		System.out.println(listaOitentaMilImplementada.size());
		System.out.println(listaNoventaMilImplementada.size());
		System.out.println(listaCemMilImplementada.size());
	}
	
	public List<Double> getListaNativa (int numeroElementos, int iteracao) throws IOException {
		
		String valores = Util.obterConteudoArquivo("D:\\projetoAMD\\carga_trabalho\\" + numeroElementos, "carga_" + numeroElementos + "_" + iteracao + ".txt");
		if (valores == null || valores.length() == 0) {
			throw new IllegalArgumentException("Não foi encontrado nenhum valor no arquivo de carga de trabalho");
		}
		return toDoubleList(valores.split(","));
	}

	public ListaEncadeada<Double> getListaImplementada (int numeroElementos, int iteracao) throws IOException {
		
		String valores = Util.obterConteudoArquivo("D:\\projetoAMD\\carga_trabalho\\" + numeroElementos, "carga_" + numeroElementos + "_" + iteracao + ".txt");
		if (valores == null || valores.length() == 0) {
			throw new IllegalArgumentException("Não foi encontrado nenhum valor no arquivo de carga de trabalho");
		}
		return toDoubleListaEncadeada(valores.split(","));
	}
	
	private List<Double> toDoubleList (String[] arrayVlrsStr) {
		List<Double> lista = new ArrayList<Double>();
		for (int i = 0; i < arrayVlrsStr.length; i++) {
			lista.add(Double.valueOf(arrayVlrsStr[i]));
		}
		return lista;
	}

	private ListaEncadeada<Double> toDoubleListaEncadeada (String[] arrayVlrsStr) {
		ListaEncadeada<Double> lista = new ListaEncadeada<Double>();
		for (int i = 0; i < arrayVlrsStr.length; i++) {
			lista.add(Double.valueOf(arrayVlrsStr[i]));
		}
		return lista;
	}
	
	private double[] toDoubleArray(String[] arrayVlrsStr) {
		double[] vlrs = new double[arrayVlrsStr.length];
		for (int i = 0; i < arrayVlrsStr.length; i++) {
			vlrs[i] = Double.valueOf(arrayVlrsStr[i]);
		}
		return vlrs;
	}
	
	public List<Double> getListaNativaPorQuantidadeElementos (int quantidadeElementos) {
		
		switch(quantidadeElementos) {
			case VALOR_LISTA_10: 
				return new ArrayList<Double>(listaDezMilNativa);
			case VALOR_LISTA_20: 
				return new ArrayList<Double>(listaVinteMilNativa);
			case VALOR_LISTA_30: 
				return new ArrayList<Double>(listaTrintaMilNativa);
			case VALOR_LISTA_40: 
				return new ArrayList<Double>(listaQuarentaMilNativa);
			case VALOR_LISTA_50: 
				return new ArrayList<Double>(listaCinquentaMilNativa);
			case VALOR_LISTA_60: 
				return new ArrayList<Double>(listaSessentaMilNativa);
			case VALOR_LISTA_70: 
				return new ArrayList<Double>(listaSetentaMilNativa);
			case VALOR_LISTA_80: 
				return new ArrayList<Double>(listaOitentaMilNativa);
			case VALOR_LISTA_90: 
				return new ArrayList<Double>(listaNoventaMilNativa);
			case VALOR_LISTA_100: 
				return new ArrayList<Double>(listaCemMilNativa);
			case VALOR_LISTA_150: 
				return new ArrayList<Double>(listaCentoCinquentaMilNativa);
			case VALOR_LISTA_200: 
				return new ArrayList<Double>(listaDuzentosMilNativa);
			case VALOR_LISTA_250: 
				return new ArrayList<Double>(listaDuzentosCinquentaMilNativa);
			default: 
				throw new IllegalArgumentException("Argunmento inesperado " + quantidadeElementos);
		}
	}

	public ListaEncadeada<Double> getListaImplementadaPorQuantidadeElementos (int quantidadeElementos) {
		
		switch(quantidadeElementos) {
		
		case VALOR_LISTA_10: 
			return new ListaEncadeada<Double>(listaDezMilImplementada);
		case VALOR_LISTA_20: 
			return new ListaEncadeada<Double>(listaVinteMilImplementada);
		case VALOR_LISTA_30: 
			return new ListaEncadeada<Double>(listaTrintaMilImplementada);
		case VALOR_LISTA_40: 
			return new ListaEncadeada<Double>(listaQuarentaMilImplementada);
		case VALOR_LISTA_50: 
			return new ListaEncadeada<Double>(listaCinquentaMilImplementada);
		case VALOR_LISTA_60: 
			return new ListaEncadeada<Double>(listaSessentaMilImplementada);
		case VALOR_LISTA_70: 
			return new ListaEncadeada<Double>(listaSetentaMilImplementada);
		case VALOR_LISTA_80: 
			return new ListaEncadeada<Double>(listaOitentaMilImplementada);
		case VALOR_LISTA_90: 
			return new ListaEncadeada<Double>(listaNoventaMilImplementada);
		case VALOR_LISTA_100: 
			return new ListaEncadeada<Double>(listaCemMilImplementada) ;
		case VALOR_LISTA_150: 
			return new ListaEncadeada<Double>(listaCentoCinquentaMilImplementada) ;
		case VALOR_LISTA_200: 
			return new ListaEncadeada<Double>(listaDuzentosMilImplementada) ;
		case VALOR_LISTA_250: 
			return new ListaEncadeada<Double>(listaDuzentosCinquentaMilImplementada) ;
		default: 
			throw new IllegalArgumentException("Argunmento inesperado " + quantidadeElementos);
		}
	}
	
	private List<Double> randomList (int numeroElementos) {
		Random random = new Random();
		List<Double> listaSelecionada = this.getListaNativaPorQuantidadeElementos(numeroElementos);
		for (int i = 0; i < numeroElementos; i++) {
			int indiceOrigem = random.nextInt(numeroElementos);
			int indiceDestino = random.nextInt(numeroElementos);
			
			Double itemOrigem = listaSelecionada.get(indiceOrigem);
			Double itemDestino = listaSelecionada.get(indiceDestino);
			
			listaSelecionada.set(indiceDestino, itemOrigem);
			listaSelecionada.set(indiceOrigem, itemDestino);
		}
		
		return listaSelecionada;
	}
	
	public static void main(String[] args) throws IOException {
		
		ListasDesordenadas listas = new ListasDesordenadas();
		for (int i = 1; i < 15; i++) {
			List<Double> lista = listas.getListaNativa(10000, i);
			System.out.println(lista);
		}
	}
	
	public void iniciarListasSeperadas () throws IOException {
		
		int numeroElementos = 250000; 
		for (int i = 1; i < 15; i++) {
			List<Double> randomList = this.randomList(numeroElementos);
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < randomList.size(); j++) {
				addSeparador(builder);
				builder.append(randomList.get(j));
			}
			Util.writeFile("D:\\projetoAMD\\carga_trabalho\\" + numeroElementos, "carga_" + numeroElementos + "_" + i + ".txt", builder.toString());
		}
	}
	
	private static void addSeparador (StringBuilder builder) {
		if (builder.length() > 0) {
			builder.append(", ");
		}
	}
}
