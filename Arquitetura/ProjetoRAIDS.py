opcaoRaid = int (input("Digite o numero do RAID: (0,1,5,6 ou 10"))

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

