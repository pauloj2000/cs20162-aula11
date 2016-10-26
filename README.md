Aluno - Paulo Junio Sales Rodrigues - 201602510

# ordemServico1

Este repositório tem como objetivo realizar as atividades do professor Fábio Nogueira de Lucena.

# Contexto do problema

O Projeto Parser (https://github.com/kyriosdata/parser) implementa um analisador léxico, um analisador sintático e um avaliador de expressões matemáticas. O cliente (autor do projeto) possui uma necessidade: um programa na linha de comandos para avaliar expressões matemáticas. Em tempo, o código do projeto identificado acima é uma biblioteca que realiza as funções indicadas e não inclui o programa requisitado nessa ordem de serviço. 

# Requisitos

Requisitos 
O programa deve estar implementado em Calcular.jar de tal forma que, para executá-lo, será suficiente executar o comando java -jar Calcular.jar no diretório onde esse arquivo está localizado. Observe que, nesse diretório, podem existir outros jar files empregados pelo Calcular.jar. Pelo menos um deles está previsto: aquele gerado pelo projeto Parser. 
Ao ser executado o programa produz como retorno o valor 0 ou o valor 1. O valor 0 indica sucesso, enquanto o valor 1 indica a ocorrência de situação excepcional. Em Java seu programa terá que retornor System.Exit(0) ou System.Exit(1) para fornecer o código de retorno, conforme o cenário. 
Em ambiente Windows você pode verificar o retorno da execução de um programa com o comando echo %errorlevel%. Em Linux ou Mac, execute echo $?.
O programa trata o argumento fornecido como uma expressão matemática e produz, na saída, o resultado da avaliação dessa expressão. Por exemplo, o comando java -jar Calcular.jar “1 - 3” deverá exibir na saída padrão o resultado -2 e terminar retornando o valor 0 (observe que o valor 0 não é exibido, apenas retornado). Se a expressão é inválida o programa exibe mensagem na saída padrão e também termina ao retornar o valor 1 (que, novamente, não é exibido, apenas retornado por meio de System.Exit(1).

