opcaoRaid = int(input("Digite o numero do RAID: (0,1,5,6 ou 10): "))

if opcaoRaid == 0:
    print("Você digitou 0")
elif opcaoRaid == 1:
    print("Você digitou 1")
elif opcaoRaid == 5:
    print("Você digitou 5")
elif opcaoRaid == 6:
    print("Você digitou 6")
elif opcaoRaid == 10:
    print("Você digitou 10")
else:
    print("Opção inválida. Por favor, digite 0, 1, 5, 6 ou 10.")

