.data
    prompt1: .asciiz "Digite o número de discos: "
    prompt2: .asciiz "Digite a capacidade do disco "
    prompt3: .asciiz " em GB: "
    result: .asciiz "A capacidade total de armazenamento em RAID 1 é "
    buffer: .space 4
    min_capacidade: .float 3.4028235E+38
    num_discos: .word 0

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


/*

Este programa em Assembly MIPS é uma implementação de um algoritmo que calcula a capacidade total de armazenamento em um sistema RAID 1. Aqui está o que o programa faz, passo a passo:

    Solicita ao usuário o número de discos: O programa pede ao usuário para inserir o número de discos no sistema RAID 1.

    Inicializa a capacidade mínima com um valor muito alto: O programa define a variável min_capacidade para o maior valor possível para um número de ponto flutuante de precisão simples. Isso é feito porque o programa está procurando o menor valor de capacidade entre todos os discos, e inicializar min_capacidade com um valor muito alto garante que qualquer valor de capacidade inserido pelo usuário será menor que min_capacidade.

    Solicita ao usuário a capacidade de cada disco: O programa entra em um loop, que se repete num_discos vezes. Em cada iteração do loop, o programa pede ao usuário para inserir a capacidade do disco atual.

    Atualiza a capacidade mínima, se necessário: Se a capacidade do disco inserida pelo usuário for menor que o valor atual de min_capacidade, o programa atualiza min_capacidade para ser igual à capacidade do disco.

    Imprime a capacidade total de armazenamento em RAID 1: Após o término do loop, o programa imprime a capacidade total de armazenamento em RAID 1, que é igual à min_capacidade. Isso ocorre porque, em um sistema RAID 1, todos os discos são espelhos uns dos outros, então a capacidade total de armazenamento é igual à capacidade do menor disco.

*/
