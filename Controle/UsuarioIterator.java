
package Controle;

import telas.Usuario;

public class UsuarioIterator implements Iterator{
    
    Usuario[] itens;
	int posicao = 0;
	
	public UsuarioIterator(Usuario[] itens) {
		this.itens = itens;
	}
	
	public Object next() { // retorna o próximo objeto da iteração.
		Usuario usuario = itens[posicao];
		posicao++;
		return usuario;
	}
	
	public boolean hasNext() { //determina se existem mais elementos para serem iterados. se existe um proximo  
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}
    
}
