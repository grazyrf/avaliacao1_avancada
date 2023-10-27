Descri��o das Classes Java no Projeto Mobility Company

1. Company.java

      A classe Company representa a empresa de mobilidade que controla um conjunto de rotas a serem executadas por carros. Ela atua como um servidor para carros e um cliente para o servidor AlphaBank para gerenciar pagamentos. A classe tamb�m cria inst�ncias de BotPayment para calcular pagamentos aos motoristas.

2. Route.java

      A classe Route representa uma rota espec�fica que um carro seguir�. Ela cont�m um conjunto de pontos (edges) que formam a trajet�ria da rota. As rotas s�o organizadas em listas, incluindo rotas a serem executadas, em execu��o e j� executadas.

3. Car.java

      A classe Car representa os carros que seguem as rotas. Os carros podem gerar sinais durante a execu��o da rota, que s�o usados para calcular pagamentos. Cada carro � executado como uma thread independente.

4. AlphaBank.java

      A classe AlphaBank atua como o servidor AlphaBank e permite que a empresa de mobilidade gerencie suas contas correntes. � respons�vel por lidar com transa��es financeiras.

5. BotPayment.java

      A classe BotPayment � uma thread respons�vel por calcular pagamentos para motoristas com base na dist�ncia percorrida. Ela � acionada durante a execu��o das rotas pelos carros.

6. Config.json

      O arquivo Config.json cont�m informa��es de configura��o para o projeto, como detalhes da empresa, configura��es de seguran�a e outros par�metros necess�rios.

7. TestCar.java

      O arquivo TestCar.java cont�m classes de teste unit�rio JUnit para a classe Car. Os testes garantem que a classe Car funcione corretamente em v�rias situa��es.

8. TestRoute.java

      O arquivo TestRoute.java cont�m classes de teste unit�rio JUnit para a classe Route. Os testes verificam o comportamento correto da classe Route em diferentes cen�rios.

9. TestBotPayment.java

      O arquivo TestBotPayment.java cont�m classes de teste unit�rio JUnit para a classe BotPayment. Os testes garantem que o c�lculo de pagamentos seja preciso e adequado.

10. TestAlphaBank.java

      O arquivo TestAlphaBank.java cont�m classes de teste unit�rio JUnit para a classe AlphaBank. Os testes verificam o correto processamento de transa��es financeiras.
      
      
