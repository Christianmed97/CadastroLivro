package br.edu.infnet.AppChristian;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppChristian.model.domain.Academico;
import br.edu.infnet.AppChristian.model.domain.Biblioteca;
import br.edu.infnet.AppChristian.model.domain.Literario;
import br.edu.infnet.AppChristian.model.service.BibliotecaService;

@Component
public class BibliotecaLoader implements ApplicationRunner{
	
	@Autowired
	public BibliotecaService bibliotecaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		

		
		FileReader fr=new FileReader("arquivos/biblioteca.txt");
		BufferedReader br=new BufferedReader(fr);
		String linha = br.readLine();
		String[] campos = null;
		Biblioteca biblioteca = null;
		System.err.println("Biblioteca");
		
		int contadorBiblioteca=0;
		int contadorProduto=0;
		while(linha!=null) {	
			
		campos= linha.split(";");
		switch(campos[0].toUpperCase()) {
		case "B":
			biblioteca = new Biblioteca();
			biblioteca.setId(++contadorBiblioteca);
			biblioteca.setEndereco(campos[1]);
			biblioteca.setNome(campos[2]);
			bibliotecaService.incluir(biblioteca);
			break;
		case "A": 
			Academico academico = new Academico();
			academico.setId(++contadorProduto);
			academico.setAutor(campos[1]);
			academico.setNome(campos[2]);
			academico.setNumeroPaginas(Integer.valueOf(campos[3]));
			academico.setPreco(Float.valueOf(campos[4]));
			academico.setSinopse(campos[5]);
			academico.setArea(campos[6]);
			academico.setVolume(campos[7]);
			biblioteca.getLivro().add(academico);
		break;
	case "L":
			Literario literario = new Literario();
			literario.setId(++contadorProduto);
			literario.setAutor(campos[1]);
			literario.setNome(campos[2]);
			literario.setNumeroPaginas(Integer.valueOf(campos[3]));
			literario.setPreco(Float.valueOf(campos[4]));
			literario.setSinopse(campos[5]);
			literario.setTema(campos[6]);
			literario.setInfantil(Boolean.valueOf(campos[7]));
			literario.setTipo(campos[8]);
			biblioteca.getLivro().add(literario);
		break;
		}
		
		linha=br.readLine();
		}
		for(Biblioteca biblioteca1: bibliotecaService.obterLista()) {
			System.out.println("lista "+biblioteca1);
		}
		
		br.close();
	}

}
