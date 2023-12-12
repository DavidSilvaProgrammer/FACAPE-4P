.data
    prompt1: .asciiz "Digite o número de discos: "
    prompt2: .asciiz "Digite o valor do disco "
    prompt3: .asciiz ": "
    result: .asciiz "A capacidade total de armazenamento em RAID 10 é "
    buffer: .space 4
    menor: .float 3.4028235E+38
    num_discos: .word 0
    total_capacidade: .word 0

.text
main:
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
