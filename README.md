# Corvus - Projeto disciplina de compiladores da UFABC.

Esse projeto possui apenas fins ditáticos, sendo um requisito necessário para aprovação na disciplina de Compiladores da UFABC. O compilador foi implementado seguindo-se os conceitos teóricos e práticos que foram introduzidos durante as aulas. O compilador foi apelidado de "Corvus" e transpila um código em linguagem ".cor" para a linguagem Java.

#### Alunos:
 * **Eugenio Maria - RA: 11201720286**
 * **Gabriel Agostini - RA: 11201721571**

Caso haja o interesse de aprender mais sobre o funcionamento de um compilador, recomendamos fortemente o conteúdo 💯% gratuito oferecido pelo Professor Isidro, todas as aulas do curso de compiladores estão disponíveis no YouTube, **[acesse aqui.](https://www.youtube.com/watch?v=gxlxHYv-9oo&list=PLjcmNukBom6--0we1zrpoUE2GuRD-Me6W)**

#### Requisitos mínimos implementados ✅:

   - [X] Possuir dois tipos de variáveis (pelo menos 1 deles String)
      > Inicialmente criou-se os tipos ```int``` e ```string```. A declaração é feita conforme abaixo: 
   
  ```
          program {
          
            int a;
            string b;
          
          } end
          
 ```        
 
 
   - [X] Possuir a instrução if-else.
      > A instrução ```else``` é opcional, a condicional pode receber uma variável booleana, uma expressão booleana ou as palavras reservadas ```true``` e ```false```. Exemplo de uso:

  ```
          program {
          
            int a;
            boolean b;
            
            b = true;
            a = 2;
            
            if(b){
               if(a>=0){
                  write(a);
               }
            } else {
               if(true){
                  a = read();
               }
            }
          
          } end
          
 ```

   - [X] Possuir ao menos uma estrutura de repetição.
      > A estrutura de repetição inicial escolhida foi o ```while```, a condicional pode receber uma variável booleana, uma expressão booleana ou as palavras reservadas ```true``` e ```false```. Exemplo de uso:

```
             program {
               int a;
               boolean b;

               b = true;
               
               while(b){
                  write("Digite um número\n");
                  a = read();
                  write("Todos os números positivos menores são:\n");
                  while(a>0){
                     a = a -1;
                     write(a);
                     write("\n");
                  }
               }

             } end

```
   - [X] Verificar atribuição de variáveis (erro semântico) - compatibilidade de tipos.
      > Não há conversão automática, caso ocorra a atribuição de tipos inválidos o compilador irá disparar uma Semantic Exception ❗.
  
   - [X] Possuir operações de entrada e saída.
      > Exemplo de uso:  
```
             program {
               int a;
               a = read();
               write(a);
             } end

```    
   - [X] Aceitar números decimais.
      > Números são considerados decimais apenas se possuirem pontuação e ao menos uma casa decimal. Exemplo:
```
             program {
               float a;
               a = 7.90 
             } end

``` 
   - [X] Verificar se uma variável foi ou não declarada.
      > Caso ocorra a atribuição ou uso de uma variável não declarada o compilador irá disparar uma Semantic Exception ❗.
    
   - [X] Verificar se uma variável foi declarada mas não foi usada.
     > Essa validação apenas dispara um Warning ⚠ no final da compilação.
  
   - [X] Linguagem Destino (C/Java/Python)
      > Neste caso escolheu-se como linguagem de destino o Java ✔

#### Requisitos adicionais implementados ✅:
   - [X] Mais tipos de dados.
      > Introduziu-se os tipos ```boolean``` e ```float```.

   - [X] Verificação se uma variável declarada e atribuída é utilizada ou não.
      > Essa validação apenas dispara um Warning ⚠ no final da compilação.

   - [X] Mais estruturas de repetição.
      > Adicionou-se a instrução ```for```. Exemplo de uso:
 ```
             program {
               int a;
               for(a = 0 ; a<10 ; a+2){
                    write(a);
                    write("\n");
               }
               write("Fim");
            } end

``` 
     
   - [X] Multíplo encadeamento de condicionais e laços de repetição.
      > Foi adicionado a possibilidade do encadeamento de condicionais e laços. Exemplo:
 ```
             program {
               int a;
               int b;
               b = 3
               for(a = 0 ; a<10 ; a+2){
                    write(a);
                    write("\n");
                    if(a==4){
                      while(b>0){
                        b = b - 1;
                        write(b);
                        write("\n");
                      }
                    }
               }
               write("Fim");
            } end

``` 
   - [X] Identação do código.
      > Alteração para que a identação de comandos encadeados esteja correta.



