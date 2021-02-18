package main;


public  class Move {
		String nome;
		//FUTURAMENTE TERÁ UMA DATABASE
		//NECESSÁRIO REVER COMO FAZER PELA DIFERENÇA DE GOLPES
		//EFEITO TALVEZ NÃO SEJA UTILIZADO AQUI, MAS QNDO O GOLPE É USADO
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
