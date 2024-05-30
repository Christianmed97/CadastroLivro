package br.edu.infnet.AppChristian;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppChristian.model.domain.Academico;
import br.edu.infnet.AppChristian.model.domain.Biblioteca;
import br.edu.infnet.AppChristian.model.domain.Literario;
import br.edu.infnet.AppChristian.model.domain.Livro;
import br.edu.infnet.AppChristian.model.service.AcademicoService;
import br.edu.infnet.AppChristian.model.service.LiterarioService;
import br.edu.infnet.AppChristian.model.service.LivroService;

@Component
public class LivroLoader implements ApplicationRunner{
	
	@Autowired
	public LivroService livroService;
	@Autowired
	public AcademicoService academicoService;
	@Autowired
	public LiterarioService literarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("arquivos/livro.txt");
		BufferedReader br=new BufferedReader(fr);
		String linha = br.readLine();
		String[] campos = null;
		Livro livro = null;
		System.err.println("Livro");
		int contador=0;
		while(linha!=null) {	
			
			campos= linha.split(";");
		switch (campos[0]) {
		case "A": 
				Academico academico = new Academico();
				academico.setId(++contador);
				academico.setAutor(campos[1]);
				academico.setNome(campos[2]);
				academico.setNumeroPaginas(Integer.valueOf(campos[3]));
				academico.setPreco(Float.valueOf(campos[4]));
				academico.setSinopse(campos[5]);
				academico.setArea(campos[6]);
				academico.setVolume(campos[7]);
				livroService.incluir(academico);
			break;
		case "L":				
				campos= linha.split(";");
				
				Literario literario = new Literario();
				literario.setId(++contador);
				literario.setAutor(campos[1]);
				literario.setNome(campos[2]);
				literario.setNumeroPaginas(Integer.valueOf(campos[3]));
				literario.setPreco(Float.valueOf(campos[4]));
				literario.setSinopse(campos[5]);
				literario.setTema(campos[6]);
				literario.setInfantil(Boolean.valueOf(campos[7]));
				literario.setTipo(campos[8]);
				livroService.incluir(literario);		
			break;
		default:
			System.out.println("tipoInvalido");
			break;
		}
		
		linha=br.readLine();
		
		}
		for(Livro livro2: livroService.obterLista()) {
			System.out.println(livro2);
		}
		br.close();
	}

}
