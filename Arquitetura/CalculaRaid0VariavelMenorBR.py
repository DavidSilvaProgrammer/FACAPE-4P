def calcula_raid1():
    # Solicita ao usuário o número de discos
    num_discos = int(input("Digite o número de discos: "))

    # Inicializa a capacidade mínima com um valor muito alto
    min_capacidade = float('inf')

    # Solicita ao usuário a capacidade de cada disco
    for i in range(num_discos):
        capacidade = float(input(f"Digite a capacidade do disco {i+1} em GB: "))
        # Atualiza a capacidade mínima, se necessário
        if capacidade < min_capacidade:
            min_capacidade = capacidade

    # Imprime a capacidade total de armazenamento em RAID 1
    print(f"A capacidade total de armazenamento em RAID 1 é {min_capacidade}GB.")

# Chama a função
calcula_raid1()
