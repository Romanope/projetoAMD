package list.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import list.impl.ListaEncadeada;

public class RandomUtils {

	/**
	 * return instance
	 * @return
	 */
	public static RandomUtils get () {
		return new RandomUtils();
	}
	
	@Deprecated
	public ListaEncadeada<Double> bubbleSort(List<Double> list) {
		
		
		Double[] array = list.toArray(new Double[list.size()]);
		
		double aux = 0;
		for (int i = 0; i < array.length; i++) {
			double valor1 = array[i];
			for (int j = i+1; j < array.length; j++) {
				double valor2 = array[j];
				if (valor1 > valor2) {
					aux = valor1;
					array[i] = valor2;
					array[j] = aux;
					valor1 = valor2;
				}
			}
		}
		return new ListaEncadeada<Double>(array);
	}
	
	private StringBuilder gerarNumerosAleatorios (int numeroElementos) {
		
		double menor = -10000000D;
		double maior = 10000000D;
		
		Map<Double, Double> values = new HashMap<Double, Double>(); 
		int cont = 0;
		StringBuilder builder = new StringBuilder();
		while (cont < numeroElementos) {
			double generatedDouble = menor + new Random().nextDouble() * (maior - menor);
			if (values.get(generatedDouble) == null) {
				builder.append(generatedDouble);
				cont++;
				if (cont < numeroElementos) {
					builder.append(",");
				}
			}
		}
		
		return builder;
	}
	
	public void criarCargaTrabalho (int numeroElementos) {
		
		StringBuilder valores = gerarNumerosAleatorios(numeroElementos);
		
		try {
			Util.writeFile(Util.DIRETORIO_CARGA_TRABALHO, "Carga de Trabalho.txt", valores.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
