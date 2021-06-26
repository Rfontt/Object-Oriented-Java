**Como chamamos, em orientação a objetos, as características de uma classe?**

Atributo

**O que é método em JAVA?**

Os métodos em java são as ações realizadas pela class. Os métodos são parecidos com as funções, mas eles possuem um objetivo que é totalmente voltado para a class em que ele é criado e servem para determinar uma ação que pode ser invocada através de uma referência.

**This**

O this é uma palavra chave reservada opcional e se refere a atributos ou métodos da referência que o chama.

### Atributos privados e encapsulamento.

Quando temos um atributo privado, isso nos diz que esse atributo não pode ser lido por ninguém além de sua própria class. Isso é um dos principais conceitos de encapsulamento, pois esconde das demais classes atributos que só podem ser acessados pela class que o criou.

**Mas quando encapsulamos um atributo o deixamos restrito apenas a sua class e como podemos fazer para acessá-lo em outras classes?**

Para isso precisamos criar um método que retorne esse atributo.

Private = o atributo vai ser privado.
Protected = o atributo está no meio termo do público e do privado, ele é privado para classes que não herdam seus atributos e público para classes que herdam.

### GETTERS e SETTERS. 

O método get serve para pegar um valor. Já o set serve para setar um valor.

### Construtor

O construtor não é um método sintaticamente, porém ele realiza uma ação, essa ação é sempre executada quando um objeto é instanciado.

No Java é possível fazer a chamada de um construtor dentro de outro e faz-se isso para evitar 
duplicações de códigos e regras. Afinal uma regra aplicada em um construtor normalmente será a
mesma para o outro caso. Para isso usa-se o this( ) passando os parâmetros correspondentes ao construtor que se queira chamar.

### Static

O **static** é como se fosse uma variável global que não pertencerá a um objeto em si e sim a sua class.

### Herança(extends)

Quando temos uma class que pode e deve ser usada por outras classes utilizamos o que é chamado na programação orientada a objeto: herança. A herança é quando uma class
herda os métodos atributos de outra class.

- Herda todas as características da classe(atributos);
- Herda todo o comportamento da classe(métodos);
- Benefício da herança: Reutilização do código e polimorfismo;

**OBS:**

Quando herdamos de uma class, herdamos seus atributos e métodos, porém não herdamos seus contrutores e por isso devemos recriar o construtor
em nossa class que está herdando.

**Quando queremos se referir a um atributo da class mãe usamos a palavra chave super.**

### Polimorfismo

Trata-se de um objeto que pode ser referenciado por uma referência de mesmo tipo,
ou genérica. Ou seja, se temos um objeto Gerente(), a referência pode ser tanto do tipo
Gerente, quanto do tipo Funcionario.

O polimorfismo significa que o objeto pode assumir diferentes formas.

Chamamos de objeto do tipo mais genérico um objeto que tem a referência da class em que ele herda.
Chamamos de objeto do tipo mais específico um objeto que tem a referência da sua própria class.

# Annotation

@Override => Indica que você irá sobrescrever um método.

Para criarmos uma annotation é parecido com uma interface, porém tem um @ antes.

```
public @interface
```

Uma annotation precisa ter no mínimo duas outras annotations. Uma delas é dizer aonde essa annotation será válida, se em um método, atributo e etc...

# Classes abstratas

São classes que, geralmente, servem apenas para serem estendidas por outras classes, pelo fato de guardar algo comum entre elas,
mas que não faz sentido usá-la sozinha.

**Usamos a palavra chave ```abstract``` para referenciar uma classe abstrata.

Essas classes não podem ser instanciadas.

# Métodos abstratos

Esses métodos servem apenas para que as classes filhas gerencie-o da maneira que desejam. É um método obrigatório para 
todas as classes que estendem da classe que tem esse método abstrato. 

Esses método não possuem corpo.

Exemplo: 
```
public abstract double getBonus();
```

# Interface

É uma classe abstrata com todos os métodos abstratos.
Todos que implementam uma interface precisam declarar os seus métodos abstratos

# Explicação final

**Herança:** trata-se de reutilização de código e polimorfismo.
**Composição:** trata-se apenas de reutilização de código.
**Interface:** trata-se apenas de polimorfismo.

# Enums

Servem para enumerar um conjunto de constantes; 
São implicitamente static e final, não podendo mudar o valor uma vez criado.


