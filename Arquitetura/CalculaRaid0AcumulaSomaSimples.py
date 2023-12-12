def calculate_raid0_storage():
    # Solicita ao usuário o número de discos
    num_disks = int(input("Digite o número de discos: "))

    # Inicializa a soma das capacidades
    sum_capacity = 0

    # Solicita ao usuário a capacidade de cada disco
    for i in range(num_disks):
        capacity = float(input(f"Digite a capacidade do disco {i+1} em TB: "))
        # Adiciona a capacidade ao total
        sum_capacity += capacity


    # Imprime a capacidade total de armazenamento em RAID 0
    print(f"A capacidade total de armazenamento em RAID 0 é {sum_capacity}TB.")

# Chama a função
calculate_raid0_storage()

