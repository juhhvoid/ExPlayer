
package player;

public class Lista {
    //atributos da classe
	private No inicio;
	private No fim;
	
	//construtor
	public Lista()
	{
		inicio=null;
		fim=null;
	}
	
	// metodos da classe
	
	// inserir o elemento em um novo Nó
	public void insere(String elemento){
		No caixa = new No(inicio,null,elemento);
		if (inicio==null)//se lista estiver vazia
			inicio = fim = caixa;
		else{
			fim.setProximo(caixa);
			fim = caixa;
		}
	}
	
	public void exibeMusica()
	{
		No aux;
		aux=inicio;
		if (inicio == null) {
            System.out.println("Nada a exibir - a lista está vazia!");
        } else {

				System.out.print(aux.getElemento() + " ");

        }
		System.out.println();
	}
        
        public void pause(){
            System.out.println("Player pausado");
            System.out.println("");
        }
        

   }

