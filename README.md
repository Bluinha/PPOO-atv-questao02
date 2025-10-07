# Prompts Utilizados para a Atividade

---

## Prompt 1

> Possuo um código em Java de um telefone que simula a digitação de um número de telefone, assim ele possui uma classe keypad que gera números aleatórios de 0 a 11 e os adiciona a o PhoneModel que é a classe que guarda os dígitos digitados pelo keypad num arraylist e os retorna. por fim temos a ui chamada screen que simplesmente imprime os números que estão sendo pressionados na tela. O objetivo é que o padrão observer seja adicionado a esse código da seguinte forma: dois observadores serão adicionados, um imprime o digito mais recentes na tela e o segundo imprime "agora discando [número completo do PhoneModel] faça isso. 

A solução demonstrada pela ia para a interface foi satisfatória, ela sugeriu a criação de uma interface observer e de duas classes de observer que iriam imprimir na tela suas determinadas mensagens e o PhoneaModel agora iria ter funções de informar o 
ultimo Digito e de implementar, implementar a classe observer e notificar o observer, entretanto, ter essas classes feriria as restrições do enunciado de que apenas a UI deveria imprimir informações na tela, assim submeti um segundo prompt.
ela também manteve o PhoneModel retornando a lista de dígitos de forma direta, o que deixa exposto o estado interno, então  optei por criar uma cópia de segurança.  

---

## Prompt 2

> ok, o programa agora possui as restrições de que somente a UI, que é a nossa classe screen, pode imprimir na tela e o telefone deve ser desacoplado da UI.

A IA sugeriu mudar o modelo que tínhamos antes de duas classes de observer que imprimiam suas observações na tela para sua implementação diretamente no Screen.  
Este último foi satisfatório, a única modificação necessária foi adicionar uma estrutura condicional no Screen para que a saída ficasse o mais próxima possível do exemplo de saída do enunciado, apenas exibindo "Agora discando" quando o número estivesse completo.
