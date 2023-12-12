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
    # Solicita ao usuário o número de discos
    li $v0, 4
    la $a0, prompt1
    syscall

    # Lê o número de discos
    li $v0, 5
    syscall
    sw $v0, num_discos

    # Solicita ao usuário a capacidade de cada disco
    la $t1, num_discos
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

    # Lê a capacidade do disco
    li $v0, 6
    syscall

    # Verifica se a capacidade do disco é menor que 'min_capacidade'
    la $t2, min_capacidade
    l.s $f1, 0($t2)
    c.lt.s $f0, $f1
    bc1f next

    # Atualiza 'min_capacidade'
    s.s $f0, min_capacidade

next:
    addiu $t0, $t0, 1
    j loop

end_loop:
    # Imprime o resultado
    li $v0, 4
    la $a0, result
    syscall

    la $a0, min_capacidade
    l.s $f12, 0($a0)
    li $v0, 2
    syscall

    # Termina o programa
    li $v0, 10
    syscall

    j end

raid5:
    # Solicita ao usuário a quantidade de discos
    li $v0, 4
    la $a0, prompt1
    syscall

    # Lê a quantidade de discos
    li $v0, 5
    syscall
    sw $v0, quantidade_discos

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
    l.s $f1, 0($t2)
    mtc1 $v0, $f0
    c.lt.s $f0, $f1
    bc1f next

    # Atualiza 'menor'
    s.s $f0, menor

next:
    addiu $t0, $t0, 1
    j loop

end_loop:
    # Calcula a capacidade de armazenamento
    la $t1, quantidade_discos
    lw $t1, 0($t1)
    la $t2, menor
    l.s $f2, 0($t2)
    mtc1 $t1, $f1
    li.s $f3, 1
    sub.s $f1, $f1, $f3
    mul.s $f0, $f1, $f2
    swc1 $f0, capacidade_armazenamento

    # Imprime o resultado
    li $v0, 4
    la $a0, result
    syscall

    la $a0, capacidade_armazenamento
    l.s $f12, 0($a0)
    li $v0, 2
    syscall

    # Termina o programa
    li $v0, 10
    syscall
    j end

raid6:
    # Solicita ao usuário a quantidade de discos
    li $v0, 4
    la $a0, prompt1
    syscall

    # Lê a quantidade de discos
    li $v0, 5
    syscall
    sw $v0, quantidade_discos

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
    l.s $f1, 0($t2)
    mtc1 $v0, $f0
    c.lt.s $f0, $f1
    bc1f next

    # Atualiza 'menor'
    s.s $f0, menor

next:
    addiu $t0, $t0, 1
    j loop

end_loop:
    # Calcula a capacidade de armazenamento
    la $t1, quantidade_discos
    lw $t1, 0($t1)
    la $t2, menor
    l.s $f2, 0($t2)
    mtc1 $t1, $f1
    li.s $f3, 2
    sub.s $f1, $f1, $f3
    mul.s $f0, $f1, $f2
    swc1 $f0, capacidade_armazenamento

    # Imprime o resultado
    li $v0, 4
    la $a0, result
    syscall

    la $a0, capacidade_armazenamento
    l.s $f12, 0($a0)
    li $v0, 2
    syscall

    # Termina o programa
    li $v0, 10
    syscall
    j end

raid10:
    # Solicita ao usuário o número de discos
    li $v0, 4
    la $a0, prompt1
    syscall

    # Lê o número de discos
    li $v0, 5
    syscall
    sw $v0, num_discos

    # Solicita ao usuário o valor de cada disco
    la $t1, num_discos
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
    l.s $f1, 0($t2)
    mtc1 $v0, $f0
    c.lt.s $f0, $f1
    bc1f next

    # Atualiza 'menor'
    s.s $f0, menor

next:
    addiu $t0, $t0, 1
    j loop

end_loop:
    # Calcula a capacidade total de armazenamento em RAID 10
    la $t1, num_discos
    lw $t1, 0($t1)
    la $t2, menor
    l.s $f2, 0($t2)
    mtc1 $t1, $f1
    div.s $f0, $f1, $f2
    swc1 $f0, total_capacidade

    # Imprime o resultado
    li $v0, 4
    la $a0, result
    syscall

    la $a0, total_capacidade
    l.s $f12, 0($a0)
    li $v0, 2
    syscall

    # Termina o programa
    li $v0, 10
    syscall
    j end

end:
    # Termina o programa
    li $v0, 10
    syscall
