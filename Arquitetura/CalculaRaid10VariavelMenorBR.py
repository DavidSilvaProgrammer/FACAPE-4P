def calcula_raid10():
    # Solicita ao usuário o número de discos
    num_discos = int(input("Digite o número de discos: "))

    # Solicita ao usuário a capacidade do menor disco

    menor = float('inf')
    
    for i in range(num_discos):
        disco = int(input(f"Digite o valor do disco {i+1}: "))
        if disco < menor:
            menor = disco

    # Calcula a capacidade total de armazenamento em RAID 10
    total_capacidade = menor * num_discos / 2

    # Imprime a capacidade total de armazenamento
    print(f"A capacidade total de armazenamento em RAID 10 é {total_capacidade}GB.")

# Chama a função
calcula_raid10()
