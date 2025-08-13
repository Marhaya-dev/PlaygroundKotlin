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

