/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import Controle.Iterator;
import Controle.UsuarioIterator;
import telas.Usuario;

/**
 *
 * @author a1520598
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario [] usuarios = new Usuario[4];
  
        usuarios[0] = new Usuario("c123","123","Marcos","07/04/1984");
        usuarios[1] = new Usuario("d123","123","João","09/04/1990");
        usuarios[2] = new Usuario("e123","123","Maria","22/10/1996");

        Iterator usuarioIterator = new UsuarioIterator(usuarios);
		
		while (usuarioIterator.hasNext()) {
			Usuario usuario = (Usuario)usuarioIterator.next();
			System.out.println(usuario.getRa()+","+usuario.getNome()+","+usuario.getDataNasc());
                        
		}
        
        
    }
    
}
