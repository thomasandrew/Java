package controller;

import util.ListaArray;

public class CtrlPrograma {
    public static void main(String[] args) {
        ListaArray minhaLista = new ListaArray();
        minhaLista.adicionar("primeiro");
        minhaLista.adicionar("segundo");
        minhaLista.adicionar("terceiro");
        minhaLista.adicionar("quarto");
        minhaLista.adicionar("Novo", 1);
        
        for (int i = 0; i < minhaLista.obterNumElementos(); i++) {
        	System.out.println(minhaLista.obter(i));
        }
        
        int pos = minhaLista.posicaoDe("quarto");
        System.out.println(pos);
        
        System.out.println("--------------//--------------");
        
        minhaLista.remover(3);
        
        for (int i = 0; i < minhaLista.obterNumElementos(); i++) {
        	System.out.println(minhaLista.obter(i));
        }
    }
}
