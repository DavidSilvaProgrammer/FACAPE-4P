.data
    prompt: .asciiz "Digite o numero do RAID: (0,1,5,6 ou 10: "
    invalid: .asciiz "Opção inválida. Digitos permitidos somente 0, 1, 5, 6 ou 10."
    prompt1: .asciiz "Digite a quantidade de discos: "
    prompt2: .asciiz "Digite o valor do disco "
    prompt3: .asciiz ": "
    result: .asciiz "A capacidade de armazenamento é: "
    buffer: .space 4
    menor: .word 2147483647
    quantidade_discos: .word 0
    capacidade_armazenamento: .word 0

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
    # Solicita ao usuário a quantidade de discos
    li $v0, 4
    la $a0, prompt1
    syscall

    # Lê a quantidade de discos
    li $v0, 5
    syscall
    sw $v0, quantidade_discos

    li $t0, 0x7FFFFFFF     # Carrega o valor mais alto para um número inteiro de 32 bits no registrador $t0
    sw $t0, menor          # Armazena o valor do registrador $t0 na posição de memória referenciada por 'menor'

    # Solicita ao usuário o valor de cada disco
    la $t1, quantidade_discos
    lw $t1, 0($t1)
    li $t0, 0

loop:
    beq $t0, $t1, end_loop

    # Imprime o prompt
    li $v0, 4
    la $a0, prompt2
    syscall

    # Imprime o número do disco
    move $a0, $t0
    li $v0, 1
    syscall

    # Imprime o prompt
    li $v0, 4
    la $a0, prompt3
    syscall

    # Lê o valor do disco
    li $v0, 5
    syscall

    # Verifica se o valor do disco é menor que 'menor'
    la $t2, menor
    lw $t2, 0($t2)
    slt $t3, $v0, $t2
    beqz $t3, next

    # Atualiza 'menor'
    sw $v0, menor

next:
    addiu $t0, $t0, 1
    j loop

end_loop:
    # Calcula a capacidade de armazenamento
    la $t1, quantidade_discos
    lw $t1, 0($t1)
    la $t2, menor
    lw $t2, 0($t2)
    mul $t0, $t1, $t2
    sw $t0, capacidade_armazenamento

    # Imprime o resultado
    li $v0, 4
    la $a0, result
    syscall

    la $a0, capacidade_armazenamento
    lw $a0, 0($a0)

    j end
raid1:
    # Implemente a lógica para RAID 1 aqui

raid5:
    # Implemente a lógica para RAID 5 aqui

raid6:
    # Implemente a lógica para RAID 6 aqui

raid10:
    # Implemente a lógica para RAID 10 aqui

end:
    # Termina o programa
    li $v0, 10
    syscall
