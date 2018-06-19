package list.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import list.impl.Time;

public class Util {

	public static final String DIRETORIO_IMPLEMENTADA = "D:\\projetoAMD\\java\\implementada";

	public static final String DIRETORIO_NATIVA = "D:\\projetoAMD\\java\\nativa";
	
	public static final String DIRETORIO_CARGA_TRABALHO = "D:\\projetoAMD\\carga_trabalho";
	
	
	public static void criarArquivoDuracoes (List<Time> times, String diretorio, String nomeArquivo) {
		
		StringBuilder builder = new StringBuilder();
		Iterator<Time> iTimes = times.iterator();
		
		builder.append("Start".concat(",").concat("End").concat(",").concat("Duration").concat("\n"));
		while (iTimes.hasNext()) {
			Time time = iTimes.next();
			builder.append(String.valueOf(time.getInicio()).concat(",").concat(String.valueOf(time.getFim())).concat(",").concat(String.valueOf(time.getDuration())));
			if (iTimes.hasNext())
				builder.append("\n");
		}
		
		try {
			writeFile(diretorio, nomeArquivo, builder.toString());
		} catch (IOException e) {
			System.out.println("Erro durante a criação do arquivo de duraçöes.");
			e.printStackTrace();
		}
	}
	
	public static void writeFile (String diretorio, String nomeArquivo, String conteudo) throws IOException {

		File file = new File(diretorio);
		if (!file.exists()) {
			file.mkdirs();
		}

		file = new File(diretorio.concat("\\").concat(nomeArquivo));
		
		FileOutputStream out = new FileOutputStream(file);
		out.write(conteudo.getBytes());
		out.close();
	}
	
	public static boolean existsFile (String diretorioComNomeArquivo) {
		File file = new File(diretorioComNomeArquivo);
		return file.exists();
	}
	
	public static String obterNomeArquivo (Integer quantidadeElementos, Integer quantidadeColetas, boolean nativo) {
		
		String nomeArquivo;
		if (nativo) {
			nomeArquivo = "nativo_";
		} else {
			nomeArquivo = "implementada_";
		}
		
		return nomeArquivo += quantidadeElementos + "E_" + quantidadeColetas + "C.txt";
	}
	
	public static String obterConteudoArquivo(String diretorio, String nomeArquivo) throws IOException {

		StringBuilder builder = new StringBuilder();
		FileReader arq = new FileReader(diretorio.concat("\\").concat(nomeArquivo));
		BufferedReader br = new BufferedReader(arq);
		
		String line = br.readLine();
		while (line != null) {
			builder.append(line);
			line = br.readLine();
		}
		br.close();
		
		return builder.toString();
	}
}
