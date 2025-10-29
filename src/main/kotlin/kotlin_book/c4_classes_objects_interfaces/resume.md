# Kotlin – Classes, objetos e interfaces

- **Modificadores de acesso em uma classe**:

  | Modificador | Membro correspondente                                        | Comentários                                                                                                        |
  |-------------|--------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|
  | final       | Não pode ser sobrescrito                                     | Usado por padrão para membros da classe                                                                            |
  | open        | Pode ser sobrescrito                                         | Deve ser especificado explicitamente                                                                               |
  | abstract    | Deve ser sobrescrito                                         | Pode ser usado somente em classes abstratas; membros abstratos não podem ter uma implementação                     |
  | override    | Sobrescreve um membro de uma superclasse ou de uma interface | O membro sobrescrito é aberto por padrão caso não esteja marcado com `final`                                       |

- **Modificadores de visibilidade**:

    | Modificador      | Membro da classe                | Declaração de nível superior |
    |------------------|---------------------------------|------------------------------|
    | public (default) | Visível em todos os lugares     | Visível em todos os lugares  |
    | internal         | Visível em um módulo            | Visível em um módulo         |
    | protected        | Visível em subclasses           | ---                          |
    | private          | Visível em uma classe           | Visível em um arquivo        |

- **Classes aninhadas e internas**:

  | Classe A declarada em outra classe B                                     | Em Java               | Em Kotlin          |
  |--------------------------------------------------------------------------|-----------------------|--------------------|
  | Classe aninhada (não armazena uma referência para uma classe externa)    | `static class A`      | `class A`          |
  | Classe interna (armazena uma referência a uma classe externa)            | `class A`             | `inner class A`    |

- **Interfaces com implementação padrão**: Em Kotlin, interfaces podem conter implementações `default`, recurso que só foi adicionado ao Java a partir da versão 8.

- **Visibilidade e modificadores padrão**:  
  Todas as declarações são `final` e `public` por padrão.  
  Para permitir herança, use o modificador `open`.

- **Escopo de visibilidade `internal`**:  
  Declarações marcadas como `internal` são visíveis apenas dentro do mesmo módulo.

- **Classes aninhadas e `inner`**:  
  Classes aninhadas não são internas por padrão.  
  Para que armazenem uma referência à classe externa, use a palavra-chave `inner`.

- **Classes `sealed`**:  
  Podem ter subclasses aninhadas apenas dentro de sua própria declaração.  
  *(A partir do Kotlin 1.1, passou a ser possível declará-las em qualquer lugar do mesmo arquivo).*

- **Inicialização de classes**:  
  Blocos de inicialização e construtores secundários fornecem flexibilidade para inicializar instâncias.

- **Campo de apoio (`backing field`)**:  
  Use o identificador `field` dentro dos métodos de acesso (`get`/`set`) para referenciar o campo de apoio de uma propriedade.

- **Classes de dados (`data classes`)**:  
  Geram automaticamente os métodos `equals`, `hashCode`, `toString`, `copy` e outros, reduzindo boilerplate.

- **Delegação de classe**:  
  Facilita a reutilização de comportamentos, evitando a necessidade de escrever múltiplos métodos de delegação semelhantes.

- **Declaração de objeto (`object`)**:  
  É o modo Kotlin de definir **singletons** de forma nativa e segura.

- **Objetos companheiros (`companion objects`)**:  
  Substituem os métodos e campos estáticos do Java.  
  Podem implementar interfaces e conter funções ou propriedades de extensão.

- **Expressões de objeto (`object expressions`)**:  
  São equivalentes às classes internas anônimas do Java, porém mais poderosas — permitem implementar várias interfaces e acessar variáveis do escopo em que foram criadas.