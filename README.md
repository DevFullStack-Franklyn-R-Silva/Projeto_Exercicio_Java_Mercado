# Projeto Exercicio Java Mercado
Este projeto consiste em uma aplicação simples de gerenciamento de um mercado, desenvolvido em Java. O objetivo é criar uma classe modelo para produtos, uma classe utilitária com métodos auxiliares e uma classe principal para interação com o usuário.

## Classe Produto
A classe Produto representa um produto que pode ser comercializado no mercado. Possui os seguintes atributos:

- codigo: um número inteiro que representa o código do produto;
- nome: uma String que representa o nome do produto;
- preco: um número decimal que representa o preço do produto.
Além disso, a classe possui um construtor que inicializa o código do produto automaticamente e um método getCodigo() que retorna o código do produto.

## Classe Utils
A classe Utils contém métodos auxiliares que são utilizados em outras partes da aplicação. Ela possui os seguintes métodos:

- dateParaString(Date data): recebe uma data e retorna uma String no formato "dd/MM/yyyy";
- doubleParaString(Double valor): recebe um valor decimal e retorna uma String no formato "R$ #,##0.00";
- stringParaDouble(String valor): recebe uma String no formato "R$ #,##0.00" e retorna um valor decimal;
- pausar(int segundos): pausa a execução da aplicação por um determinado número de segundos.

## Classe Mercado
A classe Mercado é a classe principal da aplicação. Ela possui um menu interativo que permite ao usuário cadastrar produtos, listar produtos, comprar produtos e visualizar o carrinho de compras. Ela possui os seguintes atributos:

- produtos: um ArrayList que armazena os produtos cadastrados no mercado;
- carrinho: um Map que armazena os produtos que foram adicionados ao carrinho de compras.
Ao ser executada, a classe Mercado exibe um menu com as seguintes opções:

1. Cadastrar produto
2. Listar produtos
3. Comprar produto
4. Visualizar carrinho
5. Sair do sistema

Ao selecionar uma das opções, o usuário é redirecionado para um método específico que realiza a operação desejada. Por exemplo, ao selecionar a opção 1, o usuário é direcionado para o método cadastrarProduto() que solicita as informações do produto e o adiciona à lista de produtos.

## Como executar
Para executar a aplicação, é necessário ter o Java instalado na máquina. Em seguida, basta clonar este repositório e executar o arquivo Mercado.java. A partir daí, o menu interativo será exibido e o usuário poderá realizar as operações disponíveis.
