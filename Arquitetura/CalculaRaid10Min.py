def calculate_raid10_storage():
    # Solicita ao usuário o número de discos
    num_disks = int(input("Digite o número de discos: "))

    # Solicita ao usuário a capacidade do menor disco
    min_capacity = float(input("Digite a capacidade do menor disco em TB: "))

    # Calcula a capacidade total de armazenamento em RAID 10
    total_capacity = min_capacity * num_disks / 2

    # Imprime a capacidade total de armazenamento e a capacidade reservada para segurança
    print(f"A capacidade total de armazenamento em RAID 10 é {total_capacity}TB.")
    print(f"A capacidade reservada para segurança é {total_capacity}TB.")

# Chama a função
calculate_raid10_storage()
