# Pet-Match
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/almeidapietra/pet-match/blob/main/LICENSE)

## Descrição do Projeto

Pet-Match é uma aplicação de gerenciamento para adoção de animais. O projeto permite que os usuários registrem, reservem e retirem pets da lista de adoção. O objetivo é facilitar o processo de adoção, tornando-o mais acessível e organizado.

Este projeto está em fase de desenvolvimento e será continuamente aprimorado ao longo dos módulos da formação Back-End ADA TECH - programa Santander Coders. O desenvolvimento do projeto segue a metodologia ágil e será atualizado conforme a conclusão de cada módulo

#Equipe
Este projeto foi desenvolvido pelo grupo CODE GIRLS como parte do projeto final do módulo de Lógica da Programação do curso de Back-End - Formação Ada Tech do Santander Coders. A equipe é composta por:

Pietra Almeida
Rosângela Batista
Maiara Santos

# Funcionalidades

- Cadastro de Pets: Permite adicionar novos pets à lista de adoção.
- Reserva de Pets: Os usuários podem reservar um pet para adoção.
- Retirada de Pets: Permite a retirada de um pet reservado e sua exclusão do sistema.

## Requisitos

- **Java** (versão 21.0.1)
- **IDE** (como IntelliJ IDEA, Eclipse ou VS Code)

## Istalação

```bash
 #Clone o repositório:
  git clone https://github.com/almeidapietra/pet-match.git
 #Navegue até o diretório do projeto:
  cd Pet-Match


#Compile o projeto::
Utilize um ambiente Java para compilar e executar o código. Certifique-se de ter o JDK instalado.

```

## Uso
A aplicação Pet-Match permite gerenciar o processo de adoção de pets. Abaixo estão os detalhes sobre como utilizar cada uma das funcionalidades disponíveis:

### Cadastrar Pet
- Como usar: Escolha a opção de cadastro no menu principal.
- Descrição: Permite adicionar um novo pet à lista de adoção, fornecendo informações como tipo (cachorro ou gato), nome, raça, idade e, no caso de cachorros, o porte. Se o nome do pet já estiver cadastrado, uma mensagem de erro será exibida.

- Estruturas e Métodos Utilizados:
         ArrayList<Pet>: Utilizada para armazenar a lista de pets.
         Método existePet: Verifica se um pet com o mesmo nome já está cadastrado na lista para evitar duplicidade.
         Scanner: Utilizado para capturar a entrada do usuário.

### Reservar Pet
- Como usar: Escolha a opção de reserva no menu principal e informe o nome do pet a ser reservado.
- Descrição: Permite reservar um pet para adoção. O pet será marcado como reservado e não estará disponível para outros usuários até ser retirado ou cancelado a reserva.
- Estruturas e Métodos Utilizados:
        ArrayList<Pet>: Utilizada para acessar a lista de pets.
        Método findPet: Localiza o pet pelo nome e verifica se ele está disponível para reserva.
        Método setReservado: Atualiza o status de reserva do pet.

### Retirar Pet
- Como usar: Escolha a opção de retirada no menu principal e informe o nome do pet a ser retirado.
- Descrição: Permite retirar um pet que foi reservado. O pet será removido da lista de adoção e excluído do sistema. Se o pet não estiver reservado ou não for encontrado, uma mensagem de erro será exibida.
- Estruturas e Métodos Utilizados:
     ArrayList<Pet>: Utilizada para acessar e remover o pet da lista.
     Método findPet: Localiza o pet pelo nome para garantir que ele está na lista.
     Método setReservado: Verifica se o pet está reservado e, se estiver, o remove da lista e marca como não reservado.

### Listar Pets
- Como usar: Escolha a opção de listar pets no menu principal.
- Descrição: Exibe uma lista de todos os pets cadastrados, mostrando informações como nome, raça, idade e status de reserva. Se nenhum pet estiver cadastrado, uma mensagem apropriada será exibida.
- Estruturas e Métodos Utilizados:
      ArrayList<Pet>: Utilizada para percorrer e exibir os dados dos pets.
       Método toString: Usado para formatar a exibição dos detalhes dos pets.

### Editar Pet
- Como usar: Escolha a opção de editar pet no menu principal e informe o nome do pet a ser editado.
- Descrição: Permite alterar informações de um pet existente, como nome e idade. Se o pet não for encontrado, uma mensagem de erro será exibida.
- Estruturas e Métodos Utilizados:
           ArrayList<Pet>: Utilizada para acessar e atualizar os dados dos pets.
           Método findPet: Localiza o pet pelo nome para permitir a edição.
            Método setNome e setIdade: Atualiza as informações do pet.

### Sair
- Como usar: Escolha a opção de sair no menu principal.
- Descrição: Encerra a aplicação.

## Agradecimentos

Agradecemos ao  [Santander](https://www.santander.com.br/ "Site do Banco Santander"), pela oportunidade de participar da formação Back-end através do programa Santander Coders, pelo investimento em nosso crescimento profissional, à [Ada Tech](https://ada.tech/ "Site da Ada tech") 

## Equipe Code Queens:


Mayara Santos </br>
Pietra Almeida </br>
Rosângela Batista</b>



## contatos Mayara Santos :
<div> 
    <a href = "mailto:mayarawasantos@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
    <a href="https://www.linkedin.com/in/mayarawas/" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>

## contatos Pietra Almeida :
<div> 
    <a href = "mailto:costapietra@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
    <a href="https://www.linkedin.com/in/almeidapietra" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>

## contatos Rosângela Batista :
<div> 
    <a href = "mailto:rosangela.almeida.1988@hotmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
    <a href="https://www.linkedin.com/in/rosangelaalmeidabatista/" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>
