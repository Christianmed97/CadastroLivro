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

import br.edu.infnet.AppChristian.model.domain.Biblioteca;
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
		
		System.err.println("Biblioteca");
		
		int contador=0;
		while(linha!=null) {	
			
		campos= linha.split(";");
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setId(++contador);
		biblioteca.setEndereco(campos[0]);
		biblioteca.setNome(campos[1]);
		bibliotecaService.incluir(biblioteca);
		
		linha=br.readLine();
		}
		for(Biblioteca biblioteca: bibliotecaService.obterLista()) {
			System.out.println("lista"+biblioteca);
		}
		
		br.close();
	}

}
