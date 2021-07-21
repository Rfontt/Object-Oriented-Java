# Arrays em Java

- Um array é uma estrutura de dados e serve para guardar elementos (valores primitivos ou referências);
- Arrays usam colchetes ([]) sintaticamente;
- Arrays têm um tamanho fixo;
- Um array também é um objeto;
- Arrays são zero-based (o primeiro elemento se encontra na posição 0);
- Um array é sempre inicializado com os valores padrões;
- Ao acessar uma posição inválida recebemos a exceção ArrayIndexOutOfBoundException;
- Arrays possuem um atributo length para saber o tamanho;
- A forma literal de criar uma Array é com o uso de chaves {}.

# ArrayList:

- A classe java.util.ArrayList encapsula o uso do array e oferece vários métodos de mais alto nível;
- É possível usar os generics(<>) para definir tipos ao ArrayList;
- Guarda referências;
- É do pacote java.util;
- Usa internamente um array.

# Autoboxing

O compilador realiza um autoboxing quando transforma um primitivo em objeto.

# Lambda

Uma expressão Lambda é uma função anônima que você pode usar para criar delegados ou tipos de árvore de expressão. Ao usar expressões lambda,
você pode escrever funções locais que podem ser passadas como argumentos ou retornadas como o valor de chamadas de função.

Uma expressão Lambda permite definir uma interface funcional (novamente, um método abstrato) que o compilador identifica pela estrutura. 