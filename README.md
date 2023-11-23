# Introdução à Programação (IP) - Trabalho Final

Algumas anotações feitas na aula: [aula.md](./aula.md "aula.md")  

Prazo máximo para definir as equipes: 23/11/2023.  
Prazo máximo para apresentação do trabalho: 04/12/2023 (segunda).  
Equipes: mínimo de dois, e máximo com quatro alunos.  

## Definições

- Só é permitido o uso de comandos estudados em sala de aula até o momento.  
- é permitido o uso do tipo String, mas **não é permitido** o uso de nenhum dos seus métodos.  
- O conteúdo necessário para desenvolver este trabalho em sua grande maioria são conteúdos já abordados nas aulas, mas algumas partes serão explicadas durante as aulas destinadas ao desenvolvimento do trabalho.  
- As dúvidas referente a este trabalho serão respondidas SOMENTE durante os dias/horários das nossas aulas.  
- Lembre de consultar o repositório desta disciplina para ajudar no desenvolvimento deste trabalho.  
- Os trabalhos podem ser desenvolvidos em equipe, mas as avaliações serão individuais, podendo gerar notas diferentes para cada integrante da equipe.  
- Uma vez apresentado o trabalho para avaliação, este não poderá ser reapresentado.  
- A ordem de apresentação dos trabalhos serão definidos pelo professor, e poderão ser somente apresentados durante os dias/horários de aula definidos no cronograma.  
<!-- - O professor criar uma chamada com TODOS os integrantes da equipe, e num primeiro momento vai conversar individualmente com cada integrante da equipe, e no final com todos integrantes juntos.   -->
<!-- - O professor vai conversar individualmente com cada integrante da equipe, e no final com todos integrantes juntos.  
- Durante a chamada o aluno precisará compartilhar sua tela e, eventualmente, abrir sua câmera para conversar com o professor. No caso do compartilhamento de tela, o aluno deverá mostrar o código desenvolvido na IDE VSCode (ou outra da sua escolha) para permitir editar e executar o referido código se for preciso.   -->
- Durante a apresentação do trabalho o aluno deverá mostrar o código desenvolvido na IDE VSCode (ou outra da sua escolha) para permitir editar e executar o referido código se for preciso.  
<!-- - Assim que quiserem fazer a apresentação do trabalho final avisem para o professor usando o seu canal individual no MS-Teams.   -->
- Assim que a equipe quiser fazer a apresentação do trabalho final deve avisar para o professor.  
- A apresentação só poderá ser feita após a equipe postar os fontes (.java) do trabalho no AVA3.  
- O código postado/apresentado não pode ter erros de execução (use comentários para tirar possíveis erros).  

Com base nas seguintes descrições, implemente o problema do: **Caça Palavras**.  

**ATENÇÃO**: deve seguir fielmente a descrição seguinte. Implementações a mais do descrito no código serão descontadas na nota.  

Ter uma classe descrita a seguir …  

![diagrama](imgs/diagrama.png)

## CacaPalavras

- o único import que deve ser usado é *java.util.Scanner*;  
- o construtor declara a única ocorrência do objeto *teclado* da classe *Scanner* para permitir ler dados do console usando o teclado;
- o método main só instância o construtor desta classe;  
- o construtor declara todas as matrizes (*palavras* e *mapa*);  
- a matriz *palavras* tem o tamanho 5 por 2;  
- a matriz *mapa* tem o tamanho 10 por 5;  
- o construtor chama o método *palavrasEntrada* para atribuir as palavras a matriz *palavras*;  
- o construtor chama o método *mapaEntrada* para atribuir os caráteres a matriz *mapa*;  
- o construtor chama o método *mapaPesquisa* para fazer a pesquisa das *palavras* no *mapa* e armazenar em *palavras* se achou a palavra no *mapa*;  
- o construtor controla o "_____ Menu: Caça Palavras _____", que deve ser implementado usando um ```Do/While``` e seguir as mensagens como demostrado no exemplo de execução. As opções deste menu são:  
  - opção 1: chamar o método *palavrasImprimir*;  
  - opção 2: chamar o método *mapaImprimir*;  
  - opção 3: chamar o método *palavrasRespostas*;  
  - opção 4: sair;  
  - consistir se foi digitado uma opção errada "Opção ERRADA, tente novamente!...".

O método *palavrasEntrada* deve atribuir as palavras abaixo à matriz *palavras*:

    palavras[0][0] = "IFELSE";  
    palavras[1][0] = "FORA";  
    palavras[2][0] = "WHILE";  
    palavras[3][0] = "OBJETO";  
    palavras[4][0] = "VETOR";  

O método *palavrasImprimir* deve imprimir as palavras da matriz *palavras*.  

O método *palavrasRespostas* usa a segunda coluna da matriz *palavras* e se a palavra não foi encontrada imprime "Palavra NÃO encontrada". Mas se a palavra foi encontrada deve-se imprimir a linha e coluna do mapa do primeiro caratere da palavra (conforme demostrado no exemplo de execução).  

O método *mapaEntrada* deve atribuir os caracteres abaixo à matriz *mapa*:

    mapa[ 0][ 0]='D';  mapa[ 0][ 1]='C';  mapa[ 0][ 2]='Q';  mapa[ 0][ 3]='W';  mapa[ 0][ 4]='E';
    mapa[ 1][ 0]='I';  mapa[ 1][ 1]='X';  mapa[ 1][ 2]='F';  mapa[ 1][ 3]='O';  mapa[ 1][ 4]='R';
    mapa[ 2][ 0]='F';  mapa[ 2][ 1]='F';  mapa[ 2][ 2]='R';  mapa[ 2][ 3]='G';  mapa[ 2][ 4]='F';
    mapa[ 3][ 0]='E';  mapa[ 3][ 1]='L';  mapa[ 3][ 2]='I';  mapa[ 3][ 3]='H';  mapa[ 3][ 4]='W';
    mapa[ 4][ 0]='L';  mapa[ 4][ 1]='S';  mapa[ 4][ 2]='F';  mapa[ 4][ 3]='O';  mapa[ 4][ 4]='U';
    mapa[ 5][ 0]='S';  mapa[ 5][ 1]='D';  mapa[ 5][ 2]='G';  mapa[ 5][ 3]='T';  mapa[ 5][ 4]='S';
    mapa[ 6][ 0]='E';  mapa[ 6][ 1]='J';  mapa[ 6][ 2]='H';  mapa[ 6][ 3]='E';  mapa[ 6][ 4]='T';
    mapa[ 7][ 0]='I';  mapa[ 7][ 1]='I';  mapa[ 7][ 2]='I';  mapa[ 7][ 3]='J';  mapa[ 7][ 4]='M';
    mapa[ 8][ 0]='X';  mapa[ 8][ 1]='C';  mapa[ 8][ 2]='K';  mapa[ 8][ 3]='B';  mapa[ 8][ 4]='G';
    mapa[ 9][ 0]='V';  mapa[ 9][ 1]='E';  mapa[ 9][ 2]='T';  mapa[ 9][ 3]='O';  mapa[ 9][ 4]='R';

O método *mapaImprimir* deve imprimir os caracteres da matriz *mapa* conforme demostrado no exemplo de execução.  

O método *mapaPesquisa* faz a pesquisa para verificar se as palavras da matriz *palavras* se encontram na matriz *mapa*.  

**Observações**:  

- caso julgue necessário podem ser criados novos métodos *private* para serem chamados pelo método *mapaPesquisa*;  
- a busca por palavras no mapa (método *mapaPesquisa*) só precisam tratar de palavras que podem aparecer na horizontal (da esquerda para direita e da direita para esquerda) e na vertical (de cima para baixo e de baixo para cima).  

## Manipular Strings

Como mencionado no inicio do enunciado, "Só é permitido o uso de comandos estudados em sala de aula até o momento.". Bom, para poder pegar um caractere específico ou mesmo a quantidade de caracteres em uma ```String``` pode-se usar os comandos abaixo. Observe, NÃO é permitido mais nenhum tipo de comando que manipule uma String além destes (os que existem no conteúdo da nossa disciplina).  

![Uso do String](imgs/UsoString.png "Uso do String")  

## Exemplo da execução

As mensagens mostradas ao executar o código deste trabalho devem seguir o que é mostrado ao executar o [TrabalhoFinal.jar](TrabalhoFinal.jar "TrabalhoFinal.jar").  

### Como executar um JAR

- Abra o console do Windows pressionando a tecla Windows e depois digitando ```cmd``` e pressionar ```enter```. Se for Linux ou MacOS abra o “terminal"  
![cmd Windows](imgs/cmdWindows.png "cmd Windows")  

- Agora mude de pasta, para pasta que tem o **TrabalhoFinal.jar**. No meu caso para pasta de Download  
![pasta download](imgs/pastaDownload.png "pasta download")  

- E para executar digitar

  > java -jar TrabalhoFinal.jar

- Pronto, é só usar ... e ver como deve ficar as saídas.

## Gabarito

[Gabarito](gabarito.md "Gabarito")  

<!-- 
Extender o Trabalho Final

Seria só para deixar como pesquisa a mais a ser disponibilizado depois da entrega do trabalho.
Poderias usar o fonte que tem mais classes, e é otimizado, e imprime colorido e extender:
1) ler palavras digitadas
  Já associar uma cor para cada palavra, e quando mostrar as palavras mostrar na cor certa. E no mapa usar a cor da palavra para mostrar a respectiva palavra.
2) criar o mapa dinâmico:
  2.1) pedir o tamanho do mapa (cuidar para não ser um mapa pequeno)
  2.2) preencher todo o mapa com letras aleatórias
  2.3) criar um novo mapa boolean, e preencher com true tudo
  2.4) sortear uma linha e coluna dentro do mapa, e tentar colocar a palavra tentando se todas as posições da nova palavra estão livres no mapa (se são true). Se der mudar todas as posições ocupadas pela nova palavra para false. Assim já testar se está tentando colocar um carácter da palavra fora do mapa. Senão conseguir, sortear novamente linha e coluna do inicio da palavra no mapa.
3) permitir que o usuário indique a palavra no mapa, se acertar avança.
    Já vai marcando com cores as palavras
4) se acertar tudo termina e mostra a resposta
-->