.data
    prompt: .asciiz "Digite dois números e a operação (1 para adição, 2 para subtração, 3 para multiplicação, 4 para divisão): "
    result: .asciiz "O resultado é: "

.text
.globl main
main:
    # Imprime o prompt
    li $v0, 4
    la $a0, prompt
    syscall

    # Lê o primeiro número
    li $v0, 6
    syscall
    mov.s $f12, $f0

    # Lê o segundo número
    li $v0, 6
    syscall
    mov.s $f14, $f0

    # Lê a operação
    li $v0, 5
    syscall
    move $t0, $v0

    # Realiza a operação
    beq $t0, 1, add
    beq $t0, 2, sub
    beq $t0, 3, mul
    beq $t0, 4, div

add:
    add.s $f16, $f12, $f14
    j print_result

sub:
    sub.s $f16, $f12, $f14
    j print_result

mul:
    mul.s $f16, $f12, $f14
    j print_result

div:
    div.s $f16, $f12, $f14

print_result:
    # Imprime o resultado
    li $v0, 4
    la $a0, result
    syscall

    li $v0, 2
    mov.s $f12, $f16
    syscall

    # Fim do programa
    li $v0, 10
    syscall
