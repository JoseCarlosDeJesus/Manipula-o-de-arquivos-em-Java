package br.com.pc2.semana9;

import java.util.ArrayList;
import java.util.List;

public class CadastraFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		f1.setSalario(1500.56);
		f2.setSalario(1000.00);
		f3.setSalario(8000.89);
		f1.bonus(10);
		f2.bonus(12);
		f3.bonus(9);
		
		List<Funcionario> funcionarios = new ArrayList<>();//Object
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		//funcionarios.add(123);
		
		for(int i = 0; i < funcionarios.size(); i++) {
			Funcionario f = (Funcionario)funcionarios.get(i);
			System.out.println(f.getSalario());
		}
		
		for(Funcionario f : funcionarios) {
			System.out.println(f.getSalario());
		}

	}

}
