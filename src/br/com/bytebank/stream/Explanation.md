# Estabelecendo a entrada.

No mundo da web, o funcionamento é feito através de input e output(entrada e saída);
Por isso o java possui a biblioteca java.io.

# Exemplo de fluxo de entrada:

- Arquivo;
- Rede;
- Teclado;

# Decorator:

É um padrão de projeto de software que permite adicionar um comportamento a um objeto já existente
em tempo de execução, ou seja, agrega dinamicamente responsabilidades adicionais a um objeto.

Exemplo:

```java
    FileInputStream fileInputStream = new FileInputStream("tec.txt");
    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

```

Um objeto melhora o comportamento do outro.

# Stream

Ler bits e bytes

# Reader

Ler caracteres.