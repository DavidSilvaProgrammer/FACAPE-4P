def calcula_raid0():
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

def calcula_raid5():
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
    capacidade_armazenamento = (quantidade_discos - 1) * menor
    
    # Imprime a capacidade de armazenamento
    print(f"A capacidade de armazenamento é: {capacidade_armazenamento} GB")

def calcula_raid6():
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
    capacidade_armazenamento = (quantidade_discos - 2) * menor
    
    # Imprime a capacidade de armazenamento
    print(f"A capacidade de armazenamento é: {capacidade_armazenamento} GB")

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



opcaoRaid = int (input("Digite o numero do RAID: (0,1,5,6 ou 10: "))

if opcaoRaid == 0:
    calcula_raid0()
elif opcaoRaid == 1:
    calcula_raid1()
elif opcaoRaid == 5:
    calcula_raid5()
elif opcaoRaid == 6:
    calcula_raid6()
elif opcaoRaid == 6:
    calcula_raid6()
elif opcaoRaid == 10:
    calcula_raid10()
else:
    print("Opção inválida. Digitos permitidos somente 0, 1, 5, 6 ou 10.")

