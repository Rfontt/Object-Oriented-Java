**Como chamamos, em orienta��o a objetos, as caracter�sticas de uma classe?**

Atributo

**O que � m�todo em JAVA?**

Os m�todos em java s�o as a��es realizadas pela class. Os m�todos s�o parecidos com as fun��es, mas eles possuem um objetivo que � totalmente voltado para a class em que ele � criado e servem para determinar uma a��o que pode ser invocada atrav�s de uma refer�ncia.

**This**

O this � uma palavra chave reservada opcional e se refere a atributos ou m�todos da refer�ncia que o chama.

### Atributos privados e encapsulamento.

Quando temos um atributo privado, isso nos diz que esse atributo n�o pode ser lido por ningu�m al�m de sua pr�pria class. Isso � um dos principais conceitos de encapsulamento, pois esconde das demais classes atributos que s� podem ser acessados pela class que o criou.

**Mas quando encapsulamos um atributo o deixamos restrito apenas a sua class e como podemos fazer para acess�-lo em outras classes?**

Para isso precisamos criar um m�todo que retorne esse atributo.

Private = o atributo vai ser privado.
Protected = o atributo est� no meio termo do p�blico e do privado, ele � privado para classes que n�o herdam seus atributos e p�blico para classes que herdam.

### GETTERS e SETTERS. 

O m�todo get serve para pegar um valor. J� o set serve para setar um valor.

### Construtor

O construtor n�o � um m�todo sintaticamente, por�m ele realiza uma a��o, essa a��o � sempre executada quando um objeto � instanciado.

No Java � poss�vel fazer a chamada de um construtor dentro de outro e faz-se isso para evitar 
duplica��es de c�digos e regras. Afinal uma regra aplicada em um construtor normalmente ser� a
mesma para o outro caso. Para isso usa-se o this( ) passando os par�metros correspondentes ao construtor que se queira chamar.

### Static

O **static** � como se fosse uma vari�vel global que n�o pertencer� a um objeto em si e sim a sua class.

### Heran�a(extends)

Quando temos uma class que pode e deve ser usada por outras classes utilizamos o que � chamado na programa��o orientada a objeto: heran�a. A heran�a � quando uma class
herda os m�todos atributos de outra class.

- Herda todas as caracter�sticas da classe(atributos);
- Herda todo o comportamento da classe(m�todos);
- Benef�cio da heran�a: Reutiliza��o do c�digo e polimorfismo;

**OBS:**

Quando herdamos de uma class, herdamos seus atributos e m�todos, por�m n�o herdamos seus contrutores e por isso devemos recriar o construtor
em nossa class que est� herdando.

**Quando queremos se referir a um atributo da class m�e usamos a palavra chave super.**

### Polimorfismo

Trata-se de um objeto que pode ser referenciado por uma refer�ncia de mesmo tipo,
ou gen�rica. Ou seja, se temos um objeto Gerente(), a refer�ncia pode ser tanto do tipo
Gerente, quanto do tipo Funcionario.

O polimorfismo significa que o objeto pode assumir diferentes formas.

Chamamos de objeto do tipo mais gen�rico um objeto que tem a refer�ncia da class em que ele herda.
Chamamos de objeto do tipo mais espec�fico um objeto que tem a refer�ncia da sua pr�pria class.

# Annotation

@Override => Indica que voc� ir� sobrescrever um m�todo.

Para criarmos uma annotation � parecido com uma interface, por�m tem um @ antes.

```
public @interface
```

Uma annotation precisa ter no m�nimo duas outras annotations. Uma delas � dizer aonde essa annotation ser� v�lida, se em um m�todo, atributo e etc...

# Classes abstratas

S�o classes que, geralmente, servem apenas para serem estendidas por outras classes, pelo fato de guardar algo comum entre elas,
mas que n�o faz sentido us�-la sozinha.

**Usamos a palavra chave ```abstract``` para referenciar uma classe abstrata.

Essas classes n�o podem ser instanciadas.

# M�todos abstratos

Esses m�todos servem apenas para que as classes filhas gerencie-o da maneira que desejam. � um m�todo obrigat�rio para 
todas as classes que estendem da classe que tem esse m�todo abstrato. 

Esses m�todo n�o possuem corpo.

Exemplo: 
```
public abstract double getBonus();
```

# Interface

� uma classe abstrata com todos os m�todos abstratos.
Todos que implementam uma interface precisam declarar os seus m�todos abstratos

# Explica��o final

**Heran�a:** trata-se de reutiliza��o de c�digo e polimorfismo.
**Composi��o:** trata-se apenas de reutiliza��o de c�digo.
**Interface:** trata-se apenas de polimorfismo.

# Enums

Servem para enumerar um conjunto de constantes; 
S�o implicitamente static e final, n�o podendo mudar o valor uma vez criado.


