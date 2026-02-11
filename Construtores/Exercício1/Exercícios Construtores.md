# **Exercícios Construtores**





**Nível Fácil: Inicialização Básica (5 Exercícios)**

O foco é entender a diferença entre um construtor com e sem parâmetros e a sintaxe de inicialização.



1\. Classe Animal

Crie uma classe Animal com um atributo String especie.



Crie um construtor que receba a espécie e a inicialize.



Crie um método exibirEspecie() para imprimir a espécie.



2\. Classe Livro

Crie uma classe Livro com um atributo String titulo.



Crie um construtor padrão que inicialize o titulo com o valor "Título Desconhecido".



No main, instancie um objeto usando este construtor e imprima o título.



3\. Classe Retangulo

Crie uma classe Retangulo com atributos double largura e double altura.



Crie um construtor que receba a largura e a altura.



Crie um método calcularArea() que retorne a área.



4\. Classe Carro

Crie uma classe Carro com atributos String marca e int ano.



Crie um construtor que inicialize apenas a marca. O ano deve ser inicializado com 0.



Crie um método setter para o ano para que ele possa ser definido mais tarde.



5\. Classe Ponto

Crie uma classe Ponto com atributos int x e int y.



Crie um construtor que inicialize ambos os atributos.



Crie um segundo construtor que inicialize x e y com o valor padrão 0 (o construtor padrão).



Nível Médio: Sobrecarga e Regras (5 Exercícios)

O foco é usar a sobrecarga de construtores (this()) e começar a usar o encapsulamento (private e getters).



6\. Classe Aluno (Sobrecarga)

Crie uma classe Aluno com atributos private String nome e private int matricula.



Crie um construtor que receba somente o nome. O matricula deve ser inicializado como 0.



Crie um segundo construtor que receba ambos (nome e matricula).



Implemente getters para ambos os atributos.



7\. Classe Data (Inicialização Segura)

Crie uma classe Data com atributos private int dia, private int mes, private int ano.



Crie um construtor que receba os três parâmetros e inicialize os atributos.



Crie um construtor padrão que use o this() para chamar o primeiro construtor, inicializando a data como a data de hoje (por exemplo: this(17, 11, 2025)).



8\. Classe Produto (Validação Mínima)

Crie uma classe Produto com atributos private String nome e private double preco.



Crie um construtor que receba nome e preco.



Dentro do construtor, adicione uma validação: se o preco passado for negativo, inicialize o preco com 0.0 em vez do valor negativo.



9\. Classe ID (Atributo final)

Crie uma classe ID com um atributo private final int id. O final garante que o valor não mude.



Crie um construtor que receba o id e o inicialize.



Crie um construtor padrão que inicialize o id com um número aleatório (você pode usar (int) (Math.random() \* 1000)).



Crie um getter para o id.



10\. Classe Triangulo (Sobrecarga de Lógica)

Crie uma classe Triangulo com atributos double lado1, double lado2, double lado3.



Crie um construtor para um triângulo equilátero (todos os lados iguais) que receba apenas um parâmetro double lado e inicialize os três atributos com este valor.



Crie um segundo construtor que receba três parâmetros diferentes.



Nível Avançado: Flexibilidade e Encadeamento (5 Exercícios)

O foco é no uso avançado de this(), construtores privados e controle de fluxo.



11\. Classe Configuracao (Construtor Privado)

Crie uma classe Configuracao com atributos String tema e int volume.



Torne o construtor privado (private Configuracao()). Isso impede que a classe seja instanciada diretamente.



Crie um método estático público chamado criarConfiguracaoPadrao() que chame o construtor privado internamente e retorne uma nova instância com tema = "Claro" e volume = 50.



Este é um passo para o padrão Singleton, que garante que apenas uma instância da classe exista.



12\. Classe Usuario (Construtores Encadeados com this())

Crie uma classe Usuario com atributos String email, String nome e int nivelAcesso.



Construtor 1 (Completo): Recebe email, nome e nivelAcesso.



Construtor 2 (Básico): Recebe apenas email e nome. Use this() para chamar o Construtor 1, definindo nivelAcesso como 1 (padrão).



Construtor 3 (Mínimo): Recebe apenas email. Use this() para chamar o Construtor 2, definindo o nome como "Usuário Anônimo".



13\. Classe Conversor (Inicialização Imutável)

Crie uma classe Conversor com atributos final double fator e final String unidade.



Crie um único construtor para inicializar esses dois atributos.



Crie um método converter(double valor) que use o fator e retorne o resultado.



No main, crie duas instâncias: uma para conversão de Dólar para Real (fator = 5.0) e outra para Km para Milhas (fator = 0.621371). O uso de final garante que esses fatores nunca mudarão após a criação.



14\. Classe Intervalo (Validação de Ordem)

Crie uma classe Intervalo com atributos private int inicio e private int fim.



Crie um construtor que receba inicio e fim.



Dentro do construtor, adicione uma lógica para garantir que inicio seja sempre menor ou igual a fim.



Se o valor de inicio for maior que fim (ex: new Intervalo(10, 5)), inverta os valores.



15\. Classe Venda (Fluxo Condicional)

Crie uma classe Venda com atributos double valorTotal e int parcelas.



Crie um construtor que receba apenas o valorTotal. O número de parcelas deve ser definido com a seguinte regra dentro do construtor:



Se valorTotal for maior que 1000.00, parcelas = 12.



Caso contrário, parcelas = 3.



Crie um segundo construtor que receba o valorTotal e o número desejado de parcelas.



Crie um método exibirVenda() para imprimir os detalhes.

