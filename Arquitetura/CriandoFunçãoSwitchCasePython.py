def switch_case(valor):
    return {
        'a': "Você escolheu 'a'",
        'b': "Você escolheu 'b'",
        'c': "Você escolheu 'c'",
    }.get(valor, "Opção inválida")

# Testando a função
print(switch_case('a'))  # Saída: Você escolheu 'a'
print(switch_case('d'))  # Saída: Opção inválida


/*
Neste exemplo, a função switch_case recebe um valor como argumento. O dicionário mapeia 
cada caso (chave do dicionário) para a sua ação correspondente (valor do dicionário). 
A função get do dicionário é usada para retornar o valor correspondente à chave fornecida, 
ou “Opção inválida” se a chave não estiver no dicionário. Isso é semelhante ao comportamento 
de um switch-case com um default em outras linguagens.
*/
