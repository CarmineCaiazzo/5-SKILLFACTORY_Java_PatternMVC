package MODEL;

public class Persona {
		
		
		
		//Dichiarazione Attributi Privati.
	
		private String Nome; 
		private String Cognome;
		private int Eta;
		private int ID;
		
		
//Inizializzazione Attributi con SET.
// |----------------------------------------------------------------------------------------------|

//Senza queste Inizializzazioni non potremmo richiamare nome, cognome ed età.
//Ma Abbiamo bisogno di creare dei metodi.
		
//Inizializzazione Name
		
		public void setNome(String Nome)
		{	
			this.Nome=Nome;
		// Con THIS - intediamo this.nome=private String Nome;
		// Mente il Nome dopo = è inerente al valore passato tra parentesi del metodo SET.
				
		}
		
//Inizializzazione Cognome
		
		public void setCognome(String Cognome)
		{
			this.Cognome=Cognome;
		}
		
//Inizializzazione Età
		
		public void setEta(int Eta)
		{
			this.Eta=Eta;
		}
		
//Inizializzazione ID

		public void setID(int ID)
		{
			this.ID=ID;
		}

// |----------------------------------------------------------------------------------------------|

//Stampa Attributi con GET
// |----------------------------------------------------------------------------------------------|

//Stampa Nome
		
		public String getNome()
		{
			return Nome;
		}
		
//Stampa Cognome
		
		public String getCognome()
		{
			return Cognome;
		}
		
//Stampa Eta
		
		public int getEta()
		{
			return Eta;
		}
	
//Stampa ID
		
		public int getID()
		{
			return ID;
		}
		
//|-----------------------------------------------------------------------------------------|
//|-----------------------------------------------------------------------------------------|
		

	
}


