# 📚 Documentação do Código: Contador

##  Descrição

O código apresentado é um programa Java que solicita dois números ao usuário e verifica se o segundo número é maior que o primeiro. Se for, o programa imprime uma contagem de números a partir do primeiro número até o segundo número.

## Funcionalidades
1. O programa começa criando um objeto Scanner para ler a entrada do usuário.
2. Ele solicita ao usuário que digite o primeiro número.
3. Em seguida, solicita o segundo número.
4. O método comparar é chamado, que verifica se o segundo número é maior que o primeiro.
5. Se o segundo número for menor ou igual ao primeiro, uma exceção ParametrosInvalidosException é lançada e uma mensagem de erro é exibida.
6. Caso contrário, o programa calcula a diferença entre os dois números e imprime uma contagem de 1 até essa diferença.

## Classe 

 * Contador: Classe principal que contém o método _main_.

 * **Método** _main_:
  * Cria um objeto _Scanner_.
  * Solicita ao usuário que digite o primeiro número.
  * Solicita ao usuário que digite o segundo número.
  * Chama o método _comparar_.
* _ParametrosInvalidosException_: Classe de exceção personalizada.

 * **Método** _comparar_:
 * Verifica se o segundo número é maior que o primeiro.
 * Se não for, lança a exceção _ParametrosInvalidosException_.
 * Caso contrário, calcula a diferença entre os dois números e imprime uma contagem.




**************************************************************************************

**************************************************************************************


## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
