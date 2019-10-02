package CONTROL;

import VIEW.View;//Importo View

public class Main {

	public static void main(String[] args) {
	

		View v=new View(); //Costruttore View per Richiamare Metodi.
				
		String ripeti=null;
		
		v.inserisciPersona();
		
		do {
			
		v.listaMenu();
		int scelta = v.leggiIntero("Scegli l'Operazione da Eseguire: ");		
		
		switch(scelta) {
		case 1:
			do {
			v.ricercaPersona();
			ripeti=v.leggiStringa("Vuoi ripetere la Ricerca?? Si/No ");
			}while( ripeti.equals("Si") );
			break;
		case 2:
			do {
			v.stampaVettorePersone();
			ripeti=v.leggiStringa("Vuoi ripetere la Stampa?? Si/No ");
			}while( ripeti.equals("Si") );
			break;
		case 3:
			do {
			v.modificaVettorePersone();
			ripeti=v.leggiStringa("Vuoi ripetere o effettuare un altra Modifica?? Si/No " );
			}while( ripeti.equals("Si") );	
			break;
		case 4:
			System.out.println("Sei Uscito dal Programma UwU");
			break;
			
		}
		

		if(scelta!=5)
		{
		ripeti=v.leggiStringa("Vuoi effettuare un altra Operazione?? Si/No ");
		}
		else
		{
			ripeti="No";
		}
		
		}while(ripeti.equals("Si") );

	}

}
