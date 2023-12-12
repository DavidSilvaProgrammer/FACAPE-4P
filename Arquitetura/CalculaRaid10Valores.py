def calculate_raid10_storage():
    # Solicita ao usuário o número de discos
    num_disks = int(input("Digite o número de discos: "))

    # Solicita ao usuário as capacidades dos discos
    capacities = []
    for i in range(num_disks):
        capacity = float(input(f"Digite a capacidade do disco {i+1} em TB: "))
        capacities.append(capacity)

    # Calcula a capacidade total de armazenamento em RAID 10
    total_capacity = min(capacities) * num_disks / 2

    # Imprime a capacidade total de armazenamento e a capacidade reservada para segurança
    print(f"A capacidade total de armazenamento em RAID 10 é {total_capacity}TB.")
    print(f"A capacidade reservada para segurança é {total_capacity}TB.")

# Chama a função
calculate_raid10_storage()

