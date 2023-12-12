.data
prompt: .asciiz "Digite o numero do RAID: (0,1,5,6 ou 10: "
invalid: .asciiz "Opção inválida. Digitos permitidos somente 0, 1, 5, 6 ou 10."

.text
main:
    # Imprime o prompt
    li $v0, 4
    la $a0, prompt
    syscall

    # Lê a entrada do usuário
    li $v0, 5
    syscall

    # Verifica a entrada do usuário e chama a função apropriada
    beq $v0, 0, raid0
    beq $v0, 1, raid1
    beq $v0, 5, raid5
    beq $v0, 6, raid6
    beq $v0, 10, raid10

    # Se nenhuma das condições acima for verdadeira, imprime uma mensagem de erro
    li $v0, 4
    la $a0, invalid
    syscall
    j end

raid0:
    # Código para RAID 0 vai aqui
    j end

raid1:
    # Código para RAID 1 vai aqui
    j end

raid5:
    # Código para RAID 5 vai aqui
    j end

raid6:
    # Código para RAID 6 vai aqui
    j end

raid10:
    # Código para RAID 10 vai aqui
    j end

end:
    # Termina o programa
    li $v0, 10
    syscall
