# Corvus - Projeto disciplina de compiladores da UFABC.

Esse projeto possui apenas fins ditáticos, sendo um requisito necessário para aprovação na disciplina de Compiladores da UFABC. O compilador foi implementado seguindo-se os conceitos teóricos e práticos que foram introduzidos durante as aulas. O compilador foi apelidado de "Corvus" e transpila um código em linguagem ".cor" para a linguagem Java.

#### Alunos: Eugenio Maria - RA:  e  Gabriel Agostini - RA: 11201721571

Caso haja o interesse de aprender mais sobre o funcionamento de um compilador, recomendamos fortemente o contéudo 💯% gratuito oferecido pelo Professor Isidro, todas as aulas do curso de compiladores estão disponíveis no YouTube, **[acesse aqui](https://www.youtube.com/watch?v=gxlxHYv-9oo&list=PLjcmNukBom6--0we1zrpoUE2GuRD-Me6W)**

#### Requisitos mínimos implementados:
- [X] Possuir dois tipos de variáveis (pelo menos 1 deles String)
> Inicialmente criou-se os tipos ```int``` e ```string```

- [X] Possuir a instrução if-else

- [X] Possuir ao menos uma estrutura de repetição.
> A estrutura de repetição inicial escolhida foi o ```while```

- [X] Verificar atribuição de variáveis (erro semântico) - compatibilidade de tipos
> Não há conversão automática, caso ocorra a atribuição de tipos inválidos o compilador irá disparar uma Semantic Exception ❗.

- [X] Possuir operações de entrada e saída.

- [X] Aceitar números decimais.

- [X] Verificar se uma variável foi ou não declarada.

- [X] Verificar se uma variável foi declarada mas não foi usada.

- [X] Linguagem Destino (C/Java/Python)
> Neste caso escolheu-se como linguagem de destino o Java ✔

#### Requisitos adicionais implementados:
- [X] Mais tipos de dados.
> Introduziu-se os tipos ```boolean``` e ```float```

- [X] Verificação se uma variável declarada e atribuída é utilizada ou não.
> Essa validação apenas dispara um Warning ⚠.

- [X] Mais estruturas de repetição.
> Adicionou-se a instrução ```for```.

- [X] Multíplo encadeamento de condicionais e laços de repetição.
> Foi adicionado a possibilidade do encadeamento de condicionais e laços.

- [X] Identação do código.
> Alteração para que a identação de comandos encadeados esteja correta.



