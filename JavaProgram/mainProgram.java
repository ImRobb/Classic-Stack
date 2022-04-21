import java.io.*;
public class mainProgram{
    public static void main(String[] args) {
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        Pila oggettoPila = new Pila();
        int scelta =0;
        boolean erroreTrovato = false;

    do{
        
        do{
            erroreTrovato=false;
            System.out.println("\n\n\t---MENU AZIONI PILA---\n\n ATTENZIONE: La pila inizialmente è vuota.\n1) Aggiungi un elemento nella pila [PUSH];\n2) Rimuovi e mostra l'elemento rimosso della pila [POP];\n3) Mostra il valore in cima alla pila SENZA rimuoverlo [PEEK];\n4) Mostra il numero degli elementi contenuti attualmente nella pila [SIZE];\n5) Stampa la pila nello stato corrente [PRINT];\n6) Ricerca un elemento nella pila [RICERCA];\n7) Rimuovi tutti gli elementi dalla pila [RESET].\n---------------------------------------------------\n0 ) EXIT\nFai la tua scelta:");
            try{
            String valore = tastiera.readLine();
            scelta = Integer.valueOf(valore).intValue();
            }catch(Exception e){
                System.out.println("\nErrore di digitazione");
                erroreTrovato = true;
            }
        }while(erroreTrovato==true);
    

        //--

    int elemento = 0;
    String conferma ="";

        switch (scelta) {
            case 1:

        do{
            try{
                erroreTrovato = false;
                System.out.println("Inserisci l'elemento da inserire nella pila: ");
                String valore = tastiera.readLine();
                elemento = Integer.valueOf(valore).intValue();
            }catch(Exception e){
                    System.out.println("Errore di digitazione");
                    erroreTrovato = true;
            }

        }while(erroreTrovato==true);
             oggettoPila.push(elemento);
                break;


            //--

            case 2:
    
            System.out.println("\nElemento : " + oggettoPila.pop() + " RIMOSSO\nLa pila è composta attualmente da:  " + oggettoPila.totElementi() + " elementi");
            
            break;
            //--
            case 3:

            System.out.println("\nL'elemento in cima alla pila è " + oggettoPila.top());
            break;

            case 4: 

            System.out.println("\nIl numero degli elementi contenuti attualmente nella pila è " + oggettoPila.totElementi());
            break;

            case 5: 
            System.out.println("");
            oggettoPila.stampaPila();
            break;

            case 6: 

            int elementoRicercato=0;

            do{
                try{
                    erroreTrovato = false;
                    System.out.println("\nInserisci l'elemento che vuoi ricercare: ");
                    String valore = tastiera.readLine();
                    elementoRicercato = Integer.valueOf(valore).intValue();
                }catch(Exception e){
                        System.out.println("Errore di digitazione");
                        erroreTrovato = true;
                }
        }while(erroreTrovato==true);

            oggettoPila.ricercaElemento(elementoRicercato);
            break;
    //--
            case 7: 
            
            System.out.println("\nVuoi davvero procedere con il reset della pila? (si o no)");
            
            conferma = "";
            try{
                conferma = tastiera.readLine();
            }catch(Exception e){}

            if(conferma.equals("Si") || conferma.equals("si") || conferma.equals("SI") ){
                oggettoPila.resetPila();
            }
            else{
                System.out.println("L'operazione è stata annullata");
            }
            break;

            default:
                break;
        }


    }while(scelta!=0);


    }
}