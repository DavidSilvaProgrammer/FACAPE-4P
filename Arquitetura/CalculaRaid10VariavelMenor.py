def calculate_raid10_storage():
    # Solicita ao usuário o número de discos
    num_disks = int(input("Digite o número de discos: "))

    # Solicita ao usuário a capacidade do menor disco

    menor = float('inf')
    
    for i in range(num_disks):
        disco = int(input(f"Digite o valor do disco {i+1}: "))
        if disco < menor:
            menor = disco

    # Calcula a capacidade total de armazenamento em RAID 10
    total_capacity = menor * num_disks / 2

    # Imprime a capacidade total de armazenamento e a capacidade reservada para segurança
    print(f"A capacidade total de armazenamento em RAID 10 é {total_capacity}TB.")

# Chama a função
calculate_raid10_storage()
