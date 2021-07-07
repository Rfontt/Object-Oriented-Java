# Modificadores de acesso

Existem 4 níveis de visibilidade (de menor para maior):

- private: (visível apenas na classe)
- <<package private>>(quando deixamos de declarar): (visível na classe E em qualquer outro membro do mesmo pacote, podendo ser chamado de default)
- protected: (visível na classe E em qualquer outro membro do mesmo pacote E para qualquer filho)
- public: (visível em qualquer pacote) os modificadores podem ser usados na definição da classe, atributo, construtor e método

# JavaDOC

Já vimos nessa aula algumas tags (ou anotações) do javadoc como @version ou @author. Segue a lista completa:

- @author (usado na classe ou interface)
- @version (usado na classe ou interface)
- @param (usado no método e construtor)
- @return (usado apenas no método)
- @exception ou @throws (no método ou construtor)
- @see
- @since
- @serial
- @deprecated

# Java Lang

O java.lang é um pacote, ele é o único que não precisa ser importado.
A String e o System vem desse pacote.

# String

A class String possui imutabilidade quando referenciada, caso for preciso usar um de seus métodos para modificar essa String é preciso declarar outra referência de String guardando esse novo valor.

# System

```
System.out.println();
```

- System: class, pertence ao java.lang, tem acesso público(public);
- out: atributo, público, é uma referência, static.
- println: método, público, não static, possui uma sobrecarga no método(aceita vários tipos), não joga exceções do tipo checked; 

# Class Object

Essa class é herdada automaticamente quando uma class é criada e todas herdam dela.