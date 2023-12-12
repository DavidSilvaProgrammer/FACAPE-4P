.data
    prompt1: .asciiz "Digite a quantidade de discos: "
    prompt2: .asciiz "Digite o valor do menor disco em GB: "
    prompt3: .asciiz "Digite o número do RAID: "
    result: .asciiz "O resultado é: "
    buffer: .space 4
.text
.globl main
main:
    # Solicita a quantidade de discos
    li $v0, 4
    la $a0, prompt1
    syscall

    # Lê a quantidade de discos
    li $v0, 5
    syscall
    move $t0, $v0  # $t0 armazena a quantidade de discos

    # Solicita o valor do menor disco
    li $v0, 4
    la $a0, prompt2
    syscall

    # Lê o valor do menor disco
    li $v0, 6
    syscall
    mov.s $f12, $f0  # $f12 armazena o valor do menor disco

    # Solicita o número do RAID
    li $v0, 4
    la $a0, prompt3
    syscall

    # Lê o número do RAID
    li $v0, 5
    syscall
    move $t1, $v0  # $t1 armazena o número do RAID

    # Calcula o resultado com base no número do RAID
    beq $t1, 0, raid0
    beq $t1, 1, raid1
    beq $t1, 5, raid5
    beq $t1, 6, raid6
    beq $t1, 10, raid10

raid0:
    # RAID 0: quantidade * valor do menor disco
    cvt.s.w $f14, $t0
    mul.s $f12, $f12, $f14
    j print_result

raid1:
    # RAID 1: valor do menor disco
    j print_result

raid5:
    # RAID 5: (quantidade - 1) * valor do menor disco
    sub $t0, $t0, 1
    cvt.s.w $f14, $t0
    mul.s $f12, $f12, $f14
    j print_result

raid6:
    # RAID 6: (quantidade - 2) * valor do menor disco
    sub $t0, $t0, 2
    cvt.s.w $f14, $t0
    mul.s $f12, $f12, $f14
    j print_result

raid10:
    # RAID 10: (quantidade * valor do menor disco) / 2
    cvt.s.w $f14, $t0
    mul.s $f12, $f12, $f14
    li.s $f14, 2.0
    div.s $f12, $f12, $f14
    j print_result

print_result:
    # Imprime o resultado
    li $v0, 4
    la $a0, result
    syscall

    li $v0, 2
    syscall

    # Encerra o programa
    li $v0, 10
    syscall
