.data
    prompt1: .asciiz "Digite a quantidade de discos: "
    prompt2: .asciiz "Digite o valor do disco "
    prompt3: .asciiz ": "
    result: .asciiz "A capacidade de armazenamento é: "
    buffer: .space 4
    menor: .float 3.4028235E+38
    quantidade_discos: .word 0
    capacidade_armazenamento: .word 0

.text
main:
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
