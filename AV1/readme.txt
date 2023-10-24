Descrição das Classes Java no Projeto Mobility Company

1. Company.java

      A classe Company representa a empresa de mobilidade que controla um conjunto de rotas a serem executadas por carros. Ela atua como um servidor para carros e um cliente para o servidor AlphaBank para gerenciar pagamentos. A classe também cria instâncias de BotPayment para calcular pagamentos aos motoristas.

2. Route.java

      A classe Route representa uma rota específica que um carro seguirá. Ela contém um conjunto de pontos (edges) que formam a trajetória da rota. As rotas são organizadas em listas, incluindo rotas a serem executadas, em execução e já executadas.

3. Car.java

      A classe Car representa os carros que seguem as rotas. Os carros podem gerar sinais durante a execução da rota, que são usados para calcular pagamentos. Cada carro é executado como uma thread independente.

4. AlphaBank.java

      A classe AlphaBank atua como o servidor AlphaBank e permite que a empresa de mobilidade gerencie suas contas correntes. É responsável por lidar com transações financeiras.

5. BotPayment.java

      A classe BotPayment é uma thread responsável por calcular pagamentos para motoristas com base na distância percorrida. Ela é acionada durante a execução das rotas pelos carros.

6. Config.json

      O arquivo Config.json contém informações de configuração para o projeto, como detalhes da empresa, configurações de segurança e outros parâmetros necessários.

7. TestCar.java

      O arquivo TestCar.java contém classes de teste unitário JUnit para a classe Car. Os testes garantem que a classe Car funcione corretamente em várias situações.

8. TestRoute.java

      O arquivo TestRoute.java contém classes de teste unitário JUnit para a classe Route. Os testes verificam o comportamento correto da classe Route em diferentes cenários.

9. TestBotPayment.java

      O arquivo TestBotPayment.java contém classes de teste unitário JUnit para a classe BotPayment. Os testes garantem que o cálculo de pagamentos seja preciso e adequado.

10. TestAlphaBank.java

      O arquivo TestAlphaBank.java contém classes de teste unitário JUnit para a classe AlphaBank. Os testes verificam o correto processamento de transações financeiras.
      
      
