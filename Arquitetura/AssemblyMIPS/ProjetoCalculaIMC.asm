.data
altura: .float 0
peso: .float 0
imc: .float 0
msg_altura: .asciiz "Digite a altura: "
msg_peso: .asciiz "Digite o peso: "
msg_imc: .asciiz "O IMC é: "

.text
main:
    # Pede a altura
    li $v0, 4
    la $a0, msg_altura
    syscall

    # Lê a altura
    li $v0, 6
    syscall
    mov.s $f0, $f0
    swc1 $f0, altura

    # Pede o peso
    li $v0, 4
    la $a0, msg_peso
    syscall

    # Lê o peso
    li $v0, 6
    syscall
    mov.s $f0, $f0
    swc1 $f0, peso

    # Calcula o IMC
    lwc1 $f12, altura
    lwc1 $f14, peso
    mul.s $f12, $f12, $f12
    div.s $f14, $f14, $f12
    swc1 $f14, imc

    # Escreve o resultado
    li $v0, 4
    la $a0, msg_imc
    syscall

    li $v0, 2
    lwc1 $f12, imc
    syscall

    # Termina o programa
    li $v0, 10
    syscall
