/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testebiblioteca;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 20251303.MTC0058
 */
public class AcervoBiblioteca {
   
    private Map<String, String> acervo;

    public AcervoBiblioteca() {
        
       acervo = new HashMap<String, String>();
        
       acervo.put("LIV-001", "Dom Cosmurro");
       acervo.put("LIV-002", "O Cortico");
       acervo.put("LIV-003", "Memorias Postumas de Bras Cubas");
    }

    public String buscarLivro(String codigo)
       throws LivroNaoEncontradoException{
        
            if(!acervo.containsKey(codigo)){
                throw new LivroNaoEncontradoException("Livro não encontrado"
                        + " no acervo para ocódigo: " + codigo);            
            }
            
            return acervo.get(codigo);
        }
       
     public void adicionarLivro(String codigo, String titulo){  
       acervo.put(codigo, titulo);
    }
}
