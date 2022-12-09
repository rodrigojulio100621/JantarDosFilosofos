/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantardosfilosofos;

import java.util.Random;

/**
 *
 * @author rodri
 */
public class Filosofos {
    
    
    public class Garfos extends Thread{
    
        private final int garfoEsquerda;
        private final int garfoDireira;
        
        
        public Garfos(int garfoEsqueda,int garfoDireita){
        
            this.garfoEsquerda = garfoEsqueda;
            this.garfoDireira = garfoDireita;
        
        
        }

        @Override
        public void run() {
        
            while(true){
             
              try{
                sorteioDireita();
                sorteiroEsquerda();
                Thread.sleep(1000);
              }catch(InterruptedException ex){
              
                  System.out.println(ex);
              
              }
              }
        }
        
        
        public void sorteioDireita(){
         
            int garfoDireita;
            Random d = new Random();
            garfoDireita = d.nextInt(5);
            
            System.out.println("o garfo da direita sorteado " + garfoDireita);
        
        }
        
        public void sorteiroEsquerda(){ 
        
        int garfoEsquerda;
        Random e = new Random();
        garfoEsquerda = e.nextInt(5);
        
            System.out.println("o garfo da esqueda sorteado " + garfoEsquerda);
        
        }
        
        
        
        
    
    
    }
    
    
    public class Filosofo extends Thread{
    
    String nome;
    Garfos garfo;
    int lugarNaMesa;
    
    public Filosofo(String nome,Garfos garfo,int lugarNaMesa){
    
        this.nome = nome;
        this.garfo = garfo;
        this.lugarNaMesa = lugarNaMesa; 
        
        
        System.out.println("O Filosofo "+ nome + " Sentou na mesa.");
    
    }
    
    public void pensar() throws InterruptedException{
    
        System.out.println("O Filosofo " + nome + " está pensando.");
        Thread.sleep(1000);
    }

        @Override
        public void run() {
        
            while(true){
            
            
                if(garfo.garfoDireira == 5){
                
                    System.out.println("O Filosofo " + nome + " Pegou o garfo " + garfo.garfoDireira);
                    
                    if(garfo.garfoEsquerda == 1){
                    
                        System.out.println("O Filosofo " + nome + " Pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O Filosofo " + nome +  " esta comendo");
                        System.out.println("O Filosofo " + nome + " largou o garfo da direita");
                        System.out.println("O Filosofo " + nome + " largou o garfo da esquerda");
                        
                    }else{
                        System.out.println("O Filosofo " + nome + " largou o garfo " + garfo.garfoDireira);
                    }
                
                }else{
                
                    try{
                      pensar();
                    }catch(InterruptedException ex){
                     
                        System.out.println(ex);
                    
                    }
                
                
                }
                
                if(garfo.garfoDireira == 1){
                
                    System.out.println("O Filosofo " + nome + " pegou o garfo " + garfo.garfoDireira);
                    
                    if(garfo.garfoEsquerda == 2){
                    
                         System.out.println("O Filosofo " + nome + " Pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O Filosofo " + nome +  " esta comendo");
                        System.out.println("O Filosofo " + nome + " largou o garfo da direita");
                        System.out.println("O Filosofo " + nome + " largou o garfo da esquerda");
                        
                        
                    }else{
                    
                          System.out.println("O Filosofo " + nome + " largou o garfo " + garfo.garfoDireira);
                   
                    }
                
                }else{
                
                     try{
                     pensar();
                    }catch(InterruptedException ex){
                     
                         System.out.println(ex);
                    
                    }
                
                }
                ///
                 if(garfo.garfoDireira == 2){
                
                    System.out.println("O Filosofo " + nome + " pegou o garfo " + garfo.garfoDireira);
                    
                    if(garfo.garfoEsquerda == 3){
                    
                         System.out.println("O Filosofo " + nome + " Pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O Filosofo " + nome +  " esta comendo");
                        System.out.println("O Filosofo " + nome + " largou o garfo da direita");
                        System.out.println("O Filosofo " + nome + " largou o garfo da esquerda");
                        
                        
                    }else{
                    
                          System.out.println("O Filosofo " + nome + " largou o garfo " + garfo.garfoDireira);
                   
                    }
                
                }else{
                
                     try{
                     pensar();
                    }catch(InterruptedException ex){
                     
                         System.out.println(ex);
                    
                    }
                
                }
                 /////////////////////////////////////
                 
                    if(garfo.garfoDireira == 3){
                
                    System.out.println("O Filosofo " + nome + " pegou o garfo " + garfo.garfoDireira);
                    
                    if(garfo.garfoEsquerda == 4){
                    
                         System.out.println("O Filosofo " + nome + " Pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O Filosofo " + nome +  " esta comendo");
                        System.out.println("O Filosofo " + nome + " largou o garfo da direita");
                        System.out.println("O Filosofo " + nome + " largou o garfo da esquerda");
                        
                        
                    }else{
                    
                          System.out.println("O Filosofo " + nome + " largou o garfo " + garfo.garfoDireira);
                   
                    }
                
                }else{
                
                     try{
                     pensar();
                    }catch(InterruptedException ex){
                     
                         System.out.println(ex);
                    
                    }
                
                }
                    
                     if(garfo.garfoDireira == 4){
                
                    System.out.println("O Filosofo " + nome + " pegou o garfo " + garfo.garfoDireira);
                    
                    if(garfo.garfoEsquerda == 5){
                    
                         System.out.println("O Filosofo " + nome + " Pegou o garfo " + garfo.garfoEsquerda);
                        System.out.println("O Filosofo " + nome +  " esta comendo");
                        System.out.println("O Filosofo " + nome + " largou o garfo da direita");
                        System.out.println("O Filosofo " + nome + " largou o garfo da esquerda");
                        
                        
                    }else{
                    
                          System.out.println("O Filosofo " + nome + " largou o garfo " + garfo.garfoDireira);
                   
                    }
                
                }else{
                
                     try{
                     pensar();
                    }catch(InterruptedException ex){
                     
                         System.out.println(ex);
                    
                    }
                
                }
                
            
            }
        
        
        }
    
   
    
    }
    
    public void executar(){
    
        Garfos g1 = new Garfos(1, 5);
        Garfos g2 = new Garfos(2, 1);
        Garfos g3 = new Garfos(3, 2);
        Garfos g4 = new Garfos(4, 3);
        Garfos g5 = new Garfos(5, 4);
        
        
        Filosofo filosofo1 = new Filosofo("Platão", g1, 1);
        Filosofo filosofo2 = new Filosofo("Aristoteles", g2, 2);
        Filosofo filosofo3 = new Filosofo("Socrates", g3, 3);
        Filosofo filosofo4 = new Filosofo("Descartes", g4, 4);
        Filosofo filosofo5 = new Filosofo("Euclides", g5, 5);
        
        new Thread(filosofo1).start();
        new Thread(filosofo2).start();
        new Thread(filosofo3).start();
        new Thread(filosofo4).start();
        new Thread(filosofo5).start();
        
    
    }
    
    
}
