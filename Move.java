package main;


public  class Move {
		String nome;
		//FUTURAMENTE TER� UMA DATABASE
		//NECESS�RIO REVER COMO FAZER PELA DIFEREN�A DE GOLPES
		//EFEITO TALVEZ N�O SEJA UTILIZADO AQUI, MAS QNDO O GOLPE � USADO
		protected int BASE, TIPO, ORIGEM, PRIORITY, EFEITO;

		public Move(String nome, int tipo,int base, int origem, int priority) {
			this.nome = nome;
			this.BASE = base;
			this.TIPO = tipo;
			this.ORIGEM = origem;
			this.PRIORITY = priority;
			//this.efeito = efeito;
			
		}
}
