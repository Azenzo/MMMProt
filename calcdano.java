package main;


import java.util.Random;


public class calcdano extends main {
	
	private static final long serialVersionUID = 1L;
	
	
    public static void calculadora(Personagem Ataque, time Def, int alvo) {
    	
    	Personagem Defesa = Def.Get(alvo);
    	
    	
    	//CHECAGEM SE O ATACANTE E O DEFENSOR ESTÃO VIVOS, FUTURAMENTE MUDARÁ DE LUGAR
    	 if(Defesa.VIVO == false) {
       	  System.out.println(Ataque.nome + " ia atacar " + Defesa.nome + " mas o alvo morreu");
         }else if(Ataque.VIVO == false) {
       	  System.out.println(Ataque.nome + " morreu antes de atacar");
         }else{
        	 
     //SIMULANDO A SELEÇÃO DE UM GOLPE
      Random random = new Random();
      int golpe = random.nextInt(3);
      
      
      //EXECUTANDO O GOLPE
      Move temp = Ataque.Moveset.get(golpe); 
      int ATK = Ataque.ataque;
      int dano = temp.BASE;
      int DEF = Defesa.defesa;
      double CalcDano;
      
      
      int rand = random.nextInt((12-8) + 1) + 8;
     
      CalcDano = (dano + dano*(ATK-DEF)*0.1) * rand*0.1;
      int vida = Defesa.vida;
      Defesa.vida = Defesa.vida - (int) CalcDano;
      Ataque.contDANO = Ataque.contDANO + (int) CalcDano;
      
      
      System.out.println( Ataque.nome + " do time " + Ataque.time.nomeT +" ataca " + Defesa.nome + " do time " + Defesa.time.nomeT+" com " + temp.nome);
      //System.out.println("(" + dano + " + " + dano+ " * (" + ATK+ " - " +DEF+ ") * 0.1) * " + rand*0.1  );
      System.out.print( vida + " - " + (int) CalcDano + " = " + Defesa.vida);
      
      //checagem se o alvo morreu
      if(Defesa.vida <=0) {
    	  System.out.println("  " + Defesa.nome + " do time " + Defesa.time.nomeT+ " bateu as botas");
    	  Defesa.VIVO=false;
    	 
      }else {System.out.println(" ");
      
      }
    }

    



}
}
     

      

	
	
	
