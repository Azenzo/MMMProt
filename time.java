package main;

import java.util.LinkedList;

public class time {

	LinkedList<Personagem> time = new LinkedList<Personagem>();
	String nomeT;//REVER COMO CADA TIME SERÁ RENOMEADO
	
	
	public void DefTime(String nomeT){
		this.nomeT=nomeT;
	}
	
	
	public void checatime() {
		
		if(time.size() == 0) {
			System.out.print("-------------\n"); 
			System.out.println("Morreu tudo do time " + this.nomeT);
			System.out.print("-------------\n"); 
		}else {
			System.out.print("-------------\n"); 
		System.out.println("Time " + this.nomeT);
		
		for(int i = 0; i < time.size(); i++) {
		
			Personagem hold = time.get(i);
			System.out.print("Nome:" + hold.nome);
			System.out.print(" Vida:" + hold.vida);
			System.out.print(" Ataque:" + hold.ataque);
			System.out.print(" Defesa:" + hold.defesa);
			System.out.print(" vel:" + hold.vel);
			System.out.print("|| Golpes || ");
			
			for(int ii = 0; ii < hold.Moveset.size();ii++) {
				Move temp = hold.Moveset.get(ii);
				System.out.print(temp.nome + " DB: " + temp.BASE + " || ");
			}
			System.out.println("Dano causado: " + hold.contDANO );
			}
		}
		System.out.print("-------------\n");
	}
	
	
	
	public void adcionando(Personagem A) {
		
		this.time.add(A);
		A.time = this;
	}
	
	
	public void retirando(Personagem A) {
		
		this.time.remove(A);
		
	}
	
	public Personagem Get(int a) {
		Personagem A = time.get(a);
		
		return A;
	}
	
	
	public int Nlef() {
		return  time.size();
	}

	public void limpar() {
		for(int i = 0; i<time.size();i++) {
			Personagem A = time.get(i);
			retirando(A);
		}
		}
	}
	


	
