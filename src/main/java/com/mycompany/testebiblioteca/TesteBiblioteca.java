/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testebiblioteca;

/**
 *
 * @author 20251303.MTC0058
 */
public class TesteBiblioteca {

    public static void main(String[] args) {
        
        AcervoBiblioteca biblioteca = new AcervoBiblioteca();
        
        try{
            String livro = biblioteca.buscarLivro("LIV-001");
            System.out.println("Livor encontrado: " + livro);
            
            livro = biblioteca.buscarLivro("LIV-999");
            System.out.println("Livor encontrado: " + livro);
        } catch (LivroNaoEncontradoException e){
            System.out.println(e.getMessage());
        }
        
    }
}
