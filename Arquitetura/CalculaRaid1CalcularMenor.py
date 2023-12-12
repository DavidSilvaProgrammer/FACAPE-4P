def calculate_raid1_storage():
    # Solicita ao usuário o número de discos
    num_disks = int(input("Digite o número de discos: "))

    # Inicializa a capacidade mínima com um valor muito alto
    min_capacity = float('inf')

    # Solicita ao usuário a capacidade de cada disco
    for i in range(num_disks):
        capacity = float(input(f"Digite a capacidade do disco {i+1} em TB: "))
        # Atualiza a capacidade mínima, se necessário
        if capacity < min_capacity:
            min_capacity = capacity

    # Imprime a capacidade total de armazenamento em RAID 1
    print(f"A capacidade total de armazenamento em RAID 1 é {min_capacity}TB.")

# Chama a função
calculate_raid1_storage()
