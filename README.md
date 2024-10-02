# iPhone - Simulação de Funcionalidades

Este projeto simula as funcionalidades básicas do iPhone, conforme apresentado no lançamento do dispositivo em 2007. Ele modela três funcionalidades principais do iPhone: reprodutor musical, aparelho telefônico e navegador de internet, utilizando o paradigma de programação orientada a objetos em Java. O projeto inclui tanto o diagrama UML conceitual quanto a implementação das interfaces e classes.

## Funcionalidades

### Reprodutor Musical
Simula as funções de um reprodutor de música com os seguintes métodos:
- `tocar()`: Inicia a reprodução de uma música.
- `pausar()`: Pausa a música em execução.
- `selecionarMusica(String musica)`: Permite selecionar uma música específica para tocar.

### Aparelho Telefônico
Simula as operações de um telefone, incluindo:
- `ligar(String numero)`: Faz uma chamada para o número fornecido.
- `atender()`: Atende uma chamada recebida.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador de Internet
Simula as funções de um navegador web, oferecendo:
- `exibirPagina(String url)`: Exibe uma página web a partir de um URL.
- `adicionarNovaAba()`: Abre uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página exibida.

## Estrutura do Projeto

- **Interfaces**: Cada funcionalidade é representada por uma interface (`ReprodutorMusical`, `AparelhoTelefonico`, `NavegadorInternet`), garantindo uma separação clara de responsabilidades.
- **Classe iPhone**: Esta classe implementa as três interfaces, simulando as operações combinadas do iPhone.

## Diagrama UML

O diagrama UML do projeto está disponível para ilustrar as relações entre as interfaces e a classe principal, mostrando a estrutura do código de maneira visual.

## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/D2Cabral/iphone
    ```

2. Compile os arquivos Java:
    ```bash
    javac iPhone.java
    ```

3. Execute o programa:
    ```bash
    java iPhone
    ```

## Contribuição

Sinta-se à vontade para contribuir com melhorias, adicionar novas funcionalidades ou refatorar o código. Fork o repositório e envie seu Pull Request!

![Diagrama](https://github.com/user-attachments/assets/e2867ff0-55dd-42d9-bf38-1a7a8434711d)
