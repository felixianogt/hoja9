/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 7 
Autor: Eduardo Castellanos

Descripción: WordSetFactory. Clase  utilizada para instanciar los diferentes tipos de sets. 
*/
class WordSetFactory {
    private static Comparable comparable;
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo:         
	//                         2 = implementado con Red black tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
                            
	    if (tipo == 1)
		    return new SimpleSet();
            else{
                if (tipo==2)
                    return new RedBlackTree();
            }
            if(tipo==4)
                return new hashTable();
            if(tipo==5)
                return new treeMap();

                    
                                  
            

            // if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
                if (tipo == 3)
                    return new SplayTree();
                            // if tipo == 4 cree una instancia para un Wordset impelementdo con Hash table
                        return null;
           
     
        }
}
