# ProjetoInmetrics_RodrigoSantos
Projeto para o Processo seletivo Inmetrics

Respostas do processo da vaga de Analista de QA na Inmetrics. 
Candidato: Rodrigo Santos de Moraes  
Email: rsm.santos@live.com 

Índice: 

1 – Como Rodar os Testes Automatizados no Eclipse 
2- Escopo de Testes 
3– Suíte de Teste: Documentação 
4 – Suíte de Teste: API 


1 – Como Rodar os Testes Automatizados no Eclipse: 
1.1 - Definição do Pacote de execução do teste: 
Main: contém o 1 arquivos JUnit que tem por finalidade executar as rotinas de testes.   

Main_Class: 
Este é o arquivo de rotinas principal do projeto, nele esta todas as rotinas solicitadas na avaliação, contendo o “Cadastro de um Novo Cliente”, “Login na Plataforma”, “Pesquisa de Funcionários”, Cadastro de Funcionários”, “Edição do cadastro” e “Excluir o cadastro do Funcionário”. Tudo que foi pedido na avaliação esta automatizado nestas rotinas. 

OBS: os outros pacotes do projeto, possuem nas suas classes, todas as orientações e definições sobre a sua implementação e função no projeto. 

1.2 - Passos para “rodar” o Testes Automatizado. 
Ao abrir o projeto no eclipse, acesse o arquivo Main_Class: src -> main -> java-> package(br.com.test.run) 
Clique com o botão direito sobre o arquivo e selecione a opção RUN AS -> JUnit Test.  

OBS: O teste já está configurado para rodar todas as etapas e também já está programado para gerar um usuário aleatório para um novo cadastro. Ao final, será possível ver o retorno do teste nos logs do eclipse. O Diretório padrão do projeto é: C:\Inmetrics\ProjetoInmetrics_RodrigoSantos, assim, se for descompactado direto no C:/ verifique se o diretório acima está correspondendo. 

2- Escopo de Testes:  
Fazer login na plataforma, cadastrar um Funcionário, editar e excluir o cadastro. 

2.1 Suíte de Testes definidos (foram Automatizados no Eclipse): 
1 – Cadastrar usuário. 
2 – Fazer Login na Plataforma. 
3 – Cadastrar Novo Funcionário. 
4 – Pesquisar o Funcionário cadastrado.  
5 – Editar o cadastro deste Funcionário. 
6 – Excluir o cadastro. 

3– Suíte de Teste: Documentação  
Aqui vou descrever um caso de teste que faz parte da Suíte de Teste “Cadastrar Novo Funcionário”.   

3.1 - Forma Tradicional de Documentação de Testes. 

Suíte de Teste: Cadastrar Novo Funcionário na Plataforma. 
Caso de Teste:  Cadastrar Novo Funcionário. 
Etapas e Condições: Usuário “Logado” e visualizando a tela principal da plataforma. 

Passo 1: 
Ação: Usuário clica no campo “Novo Funcionário”. 
Sistema: seleciona o campo “Novo Funcionário” e redireciona para a tela de “Cadastro de Funcionário”. 
Passo2: 
Ação: Cliente digita os Dados do Funcionário e pressiona “Enviar”. 
Sistema: verifica e valida os dados informados, e realiza o cadastro redirecionando para a tela principal e exibindo uma mensagem de cadastro realizado com sucesso. 

3.2 - No formato BDD e Cucumber (Pronto para Automação). 
Conforme sugerido, vou acrescentar a forma que eu gosto de fazer hoje, pois, além de deixar os casos prontos para Automação dos Testes, também facilita muito o trabalho dos Desenvolvedores BackEnd na hora de criar seus testes unitários. 

Suíte de Teste: Cadastrar Novo Funcionário na Plataforma. 
Caso de Teste:  Pesquisar Funcionários 
Etapas e Condições: Cliente “Logado” e visualizando a tela principal da plataforma. 

Roteiro de Teste(Cucumber): 
Dado que o usuário está realizando uma busca por um funcionário 
E o mesmo digita o nome do funcionário no campo “pesquisar”. 
Quando solicitar para efetua a pesquisa 
Então o sistema deverá buscar as informações no BD 
E deverá exibir na tela o funcionário(s) relacionado(s) com a pesquisa feita pelo usuário. 

4 – Suíte de Teste: API (exemplo de documentação) 
Abaixo segue o roteiro para configurar a ferramenta e executar o teste. 

4.1 - Definições: 
Ferramenta: POSTMAN 
Suíte de Teste: Cadastrar Novo Funcionário na Plataforma. 
Caso de Teste:  Cadastrar Funcionário 

4.2 - Configuração para o teste no Postman (dados fictícios para ilustração) 
Nome Request: Cadastro de Funcionário 
Tipo Request: POST 
URL Resquest: http://xxx_diretorio/xxx_servico 

Na Aba Headers: 
Key: Content-Type  / Value: application/json 

Na Aba Body (segue o exemplo de alguns campos que contem na plataforma) 
{ 
   “nome” : “nome do cliente”, 
   “cpf” : “xxxxxxx”, 
   “sexo” : “xxxxxxxx”; 
   “addresses”: [ 
  { 
     “street" : “xxxxxxxx”, 
     “number” : “xx”, 
     “city” : “xxxxxxxx” 
  }  ] 
} 

4.3 - Resultado da Request: 
Status: 201 (pois foi realizado um cadastro) 
Body: Mensagem do cadastro realizado com sucesso 

 
