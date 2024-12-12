# Desafio 2: Life Cycle

Este repositório contém um exercício de implementação do ciclo de vida (Life Cycle) dos beans `Item.java` e `Weapon.java` utilizando o Spring Framework. A solução segue a mesma abordagem implementada previamente para o bean `Character.java`.

## Funcionalidades
- **Suporte ao ciclo de vida completo** para os beans `Item` e `Weapon`, incluindo:
  - Configurações de métodos personalizados de inicialização e destruição.
  - Anotações `@PostConstruct` e `@PreDestroy`.
  - Implementação de interfaces como `BeanNameAware`, `ApplicationContextAware`, `InitializingBean` e `DisposableBean`.
- **BeanPostProcessor customizado** para adicionar mensagens durante o processamento dos beans no ciclo de vida.



### Descrição dos Arquivos Principais
- **`Character.java`**: Implementação do ciclo de vida do bean `Character`, usado como referência.
- **`Item.java` e `Weapon.java`**: Implementações com ciclo de vida completo, incluindo mensagens personalizadas para cada fase.
- **`MagicBeanPostProcessor.java`**: Classe que intercepta e adiciona lógica durante o processamento dos beans.

- **Java 17 ou superior**
- **Spring Boot 3.0 ou superior**
- Dependências Maven:
  ```xml
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter</artifactId>
  </dependency>
  <dependency>
      <groupId>jakarta.annotation</groupId>
      <artifactId>jakarta.annotation-api</artifactId>
  </dependency>
  ```

## Execução
Observe as mensagens no console para verificar as fases do ciclo de vida de `Item` e `Weapon`.

## Exemplos de Saída no Console
```plaintext
1. Instantiation: A new item has been created.
2. BeanNameAware: Setting bean name: item
3. BeanFactoryAware: Setting bean factory for Item: Magic Potion
4. ApplicationContextAware: Setting application context for Item.
5. BeanPostProcessor: Infusing magic into Item Magic Potion
6. @PostConstruct: Item Magic Potion is being initialized.
7. Initialization: Item Magic Potion is being prepared.
8. Custom Initialization: Executing custom init for Item: Magic Potion
9. BeanPostProcessor: Magical aura surrounds Item Magic Potion
...
```


