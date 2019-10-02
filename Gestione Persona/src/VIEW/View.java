package VIEW;
//Qui vanno i metodi Input/Output in Console.

import java.util.Scanner;

import MODEL.Persona;//importo Persona(Serve per l'array)

public class View {

	Persona[] prs;//Dichiarazione Array Persone

	Scanner s=new Scanner(System.in);
	Persona p= new Persona();//Per metodi su Tutta la classe
	int N1=0;//Variabile Numerica try Catch
	
//Menù
	
		public void listaMenu()
		{
			System.out.println("|-------------------Menù--------------------------|");
			System.out.println("Selezionare l'operazione da Startare: ");
			System.out.println(" 1 - Ricerca Persona");
			System.out.println(" 2 - Stampa Persona");			
			System.out.println(" 3 - Modifica Persona");
			System.out.println(" 4 - Esci dal Programma");
			System.out.println("|-------------------------------------------------|");
		}
	
//Leggi Stringa
		
	public String leggiStringa(String S1)
	{
		System.out.println(S1);//Stampa Stringa 
		return s.nextLine(); //Inserimento e Ritorno di Stringa
	}

//Leggi Intero
	
	public int leggiIntero(String S2)
	{
		boolean flag=false;
		
		do {
			
			flag=false;
			System.out.println(S2);//Stampa Stringa		
			
			try 
			{
				N1=Integer.parseInt(s.nextLine());//Inserimento e Ritorno Stringa con Conversione in intero.
			}
			catch(NumberFormatException e)
			{
				System.out.println("Error! Inserire solo valori Numerici!!");
				flag=true;
			}
			
		  }while(flag);
		
		return N1;
	}
	
	
// |---------------------------------------------------------------------------|	
// |---------------------------------------------------------------------------|
	
//  Inserimento e Dichiarazione Vettore PERSONA.
	
	
	public void inserisciPersona()
	{
			System.out.println("Benvenuto nel Esercizio del CONTROL / MODEL / VIEW");
			System.out.println("|------------------------------------------|");
			int NP = leggiIntero("Scegli quante Persone vuoi inserire: ");
			System.out.println("|------------------------------------------|");
				
			prs=new Persona[NP];
			
			for(int i=0; i<NP; i++)//Inserimento Persone
			{
		
				Persona p= new Persona();//Creazione Nuova Persona + Richiamo Metodi di Persona.
				
				p.setNome(leggiStringa("Inserisci Persona - Nome: "));
				p.setCognome(leggiStringa("Inserisci Persona - Cognome: "));
				p.setEta(leggiIntero("Inserisci Persona - Età: "));
				p.setID(i+1);
				System.out.println("|------------------------------------------|");
				
				prs[i]=p;
				//Inserimento di Persona in prs[0]..poi prs[1] etc.				
				//Spostamento dati da P(input) in vettore prs[i].		
				
			}
				
		}
								
	
// 	1 - Ricerca Persona 
	
	public void ricercaPersona()
	{
		
		int ID=leggiIntero("Inserisci l'ID della Persona da cercare - ID: ");
	
		boolean flag=false;
	
		for(int i=0; i<prs.length; i++) 
		{
			
			
			if(ID==(prs[i].getID()))
			{
				System.out.println("la Persona è stata trovata!");
				System.out.println("|---------------------------------|");
				System.out.println("Nome --> "+prs[i].getNome());
				System.out.println("Cognome --> "+prs[i].getCognome());
				System.out.println("Età --> "+prs[i].getEta());
				System.out.println("ID --> "+prs[i].getID());
				System.out.println("|---------------------------------|");
				flag=false;
				break;
	
			}
			else
			{
				flag=true;
			}
			
			if(!flag)
			{
				System.out.println("La Persona non è stata trovata!! UwU");
				System.out.println("|---------------------------------|");
				break;
				
			}
		
				
		}
				
	}
	
	
// 2 - Stampa Vettore Persone
	
	public void stampaVettorePersone()
	{
		int posizione=1;//Posizione Persona (N.1 - N.2 - N.3 etc.)
		
		for(int i=0; i<prs.length; i++)
		{
			System.out.println("|---------------------------------|");
			System.out.println("Persona N."+posizione);
			System.out.println("|---------------------------------|");
			System.out.println("Nome --> "+prs[i].getNome());
			System.out.println("Cognome --> "+prs[i].getCognome());
			System.out.println("Età --> "+prs[i].getEta());
			System.out.println("ID --> "+prs[i].getID());
			System.out.println("|---------------------------------|");
			posizione++;
			
		}
	}
	
// 3 - Modifica Vettore Persone
	
	public void modificaVettorePersone()
	{
		
		int ID=leggiIntero("Inserisci l'ID della Persona da Modificare - ID: ");
				
		int posizione = 0; //Inizializza Posizione
		boolean flag=false;
		
		for(int i=0; i<prs.length; i++) 
		{
			
			if(ID==(prs[i].getID()))
			{
				//Stampa Persona Trovata
				System.out.println("|---------------------------------|");
				System.out.println("Nome --> "+prs[i].getNome());
				System.out.println("Cognome --> "+prs[i].getCognome());
				System.out.println("Età --> "+prs[i].getEta());
				System.out.println("ID --> "+prs[i].getID());
				System.out.println("|---------------------------------|");
				
				posizione = i;//Variabile Utilizzata per Salvare la posizone della Persona tramite Indice
				System.out.println("la Persona è stata trovata!");
				System.out.println("Modifica la Persona Trovata:");
				System.out.println("|---------------------------------|");
				
				
				//Modifica Nome
				System.out.println("Nome [ "+prs[i].getNome()+" ]");
				System.out.println("Modificare? --> Invio=No");
				System.out.println("|--------------------|");
				String spazioNome=(leggiStringa("Inserire il Nuovo Nome: "));
				if(spazioNome.equals(""))
				{				
					System.out.println("Non Modificato");
					System.out.println("|--------------------|");					
				}
				else
				{
					prs[i].setNome(spazioNome);
					System.out.println("Modifcato!!");
					System.out.println("|--------------------|");
				}
			
				
				
				//Modifica Cognome
				System.out.println("Cognome [ "+prs[i].getCognome()+" ]");
				System.out.println("Modificare? Invio=No/Si");
				System.out.println("|--------------------|");
				String spazioCognome=(leggiStringa("Inserire il Nuovo Cognome: "));
				if(spazioCognome.equals(""))
				{
					System.out.println("Non Modificato");
					System.out.println("|--------------------|");
				}
				else
				{
					prs[i].setCognome(spazioCognome);
					System.out.println("Modifcato!!");
					System.out.println("|--------------------|");
				}
				
				
				//Modifica Età
				System.out.println("Età [ "+prs[i].getEta()+" ]");
				System.out.println("Modificare? Invio=No/Si");
				System.out.println("|--------------------|");
				String spazioEta=(leggiStringa("Inserire la Nuova Età: "));
				if(spazioEta.equals(""))
				{
					System.out.println("Non Modificato");
					System.out.println("|--------------------|");
				}
				else
				{
					prs[i].setEta(Integer.parseInt(spazioEta));
					System.out.println("Modifcato!!");
					System.out.println("|--------------------|");
				}
				
				flag=false;
				break;
				
				
			}
			else
			{
				flag=true;
			}
			
			if(!flag)
			{
				System.out.println("La Persona non è stata trovata!! UwU");	
				System.out.println("Per modificare la Persona, riprovare con una ID corretto");
			}
												
		}
		
			//Stampa Persona Modificata tramite Posizione
			System.out.println("Nome --> "+prs[posizione].getNome());
			System.out.println("Cognome --> "+prs[posizione].getCognome());
			System.out.println("Età --> "+prs[posizione].getEta());
			System.out.println("ID --> "+prs[posizione].getID());
		
	}

	
}
