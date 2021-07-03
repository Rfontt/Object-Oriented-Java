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