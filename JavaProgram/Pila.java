import java.util.*;
public class Pila {
    
Vector <Integer> pila;
private int buffer = 0;

    Pila(){
        pila = new Vector<Integer>();
    }

    //stato della pila (empity)
    public boolean pilaVuota(){
        if(pila.size()>0) 
            return false;
        else
            return true;
    }

    //inserimeto top [push]
    public void push(int num){
        pila.addElement(num);
        System.out.println("Elemento inserito!");
    }

    //estrazione dal peek [pop]
    public int pop(){
    
        if(!pilaVuota()){
            buffer = pila.elementAt(pila.size()-1);
            pila.removeElementAt(pila.size()-1);
        }

        stampaPila();
        return buffer;
    }

    //peek 
    public int top(){

        if(!pilaVuota()){
            buffer = pila.elementAt(pila.size()-1);
        }
        else
            System.out.println("La pila è vuota!");

        return buffer;
    }

    //lunghezza pila
    public String totElementi(){
        if(!pilaVuota()){
            String tot = String.valueOf(pila.size());
            return tot;
        }
        else 
            return "Vuota";
    }

    //ricerca
    public void ricercaElemento(int elementoCercato){
        boolean trovato = false;
        if(!pilaVuota()){
            for(int i=0;i<pila.size();i++){

                if(elementoCercato == pila.elementAt(i)){
                    trovato = true;
                    System.out.println("Elemento trovato alla posizione " + i);
                }

            }
            if(trovato==false){
                System.out.println("Elemento non presente all'interno della pila");
            }
        }
        else 
            System.out.println("Pila vuota impossibile continuare con la ricerca! ");

    }

    //rimuove tutti gli elementi nella pila
    public void resetPila(){
        if(!pilaVuota()){
            do{
                pila.removeElementAt(pila.size()-1);
                System.out.println("ELEMENTO ALLA POSIZIONE  " + pila.size() + " ELIMINATO DEFINITIVAMENTE.");
            }while(pila.size()!=0);
        }
        else    
            System.out.println("Impossibile resettare la pila in quanto è gia vuota");
    }

    //stampo
    public void stampaPila(){
        System.out.println("Stato attuale della pila: \n");
    if(!pilaVuota())
        for(int i=0;i<pila.size();i++)
        {
            //System.out.println("Elemento in posizione " + i + " ----> " + pila.elementAt(i));
            System.out.println("Posizione: " + i + "\t|\t" + pila.elementAt(i) + "\t|\t");
            System.out.println("---------------------------------");
        }
    else
        System.out.println("PILA VUOTA!");
     }


}
