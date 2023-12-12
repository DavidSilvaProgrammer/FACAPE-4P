def calcular_raid0():
    # Solicita ao usuário a quantidade de discos
    quantidade_discos = int(input("Digite a quantidade de discos: "))
    
    # Inicializa a variável 'menor' com um valor muito alto
    menor = float('inf')
    
    # Solicita ao usuário o valor de cada disco
    for i in range(quantidade_discos):
        disco = int(input(f"Digite o valor do disco {i+1}: "))
        if disco < menor:
            menor = disco
    
    # Calcula a capacidade de armazenamento
    capacidade_armazenamento = quantidade_discos * menor
    
    # Imprime a capacidade de armazenamento
    print(f"A capacidade de armazenamento é: {capacidade_armazenamento} GB")

# Chama a função
calcular_raid0()
