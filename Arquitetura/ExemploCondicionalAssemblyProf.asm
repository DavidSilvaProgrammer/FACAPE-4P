Codigo usando condicional

.data
operacao: .asciiz "Digite 1 para somar e 2 para subtrair"
numero: .asciiz "Digite um numero"
resultado: .asciiz "O resultado eh"

.text
#imprime "Digite 1 para somar e 2 para subtrair"
li $v0, 4
la $a0, operacao
syscall

#ler numero
li $v0,5
syscall
move $t0, $v0

#imprime "Digite um numero"
li $v0, 4
la $a0, numero
syscall

#ler numero
li $v0,5
syscall
move $t1, $v0

#imprime "Digite um numero"
li $v0, 4
la $a0, numero
syscall

#ler numero
li $v0,5
syscall
move $t2, $v0

#condicional

beq $t0, 1, SOMA
sub $s0, $t1, $t2
j SAIDA
SOMA:
    add $s0, $t1, $t2
SAIDA:

li $v0, 4
la $a0, resultado
syscall

li $v0, 1
move $a0, $s0
syscall


/*
Este é um programa em Assembly MIPS que realiza uma operação aritmética (adição ou subtração) em dois números, com base na escolha do usuário. Aqui está a interpretação do código:

    O programa começa declarando três strings na seção .data: “Digite 1 para somar e 2 para subtrair”, “Digite um número” e “O resultado é”.

    Na seção .text, o programa primeiro imprime a string “Digite 1 para somar e 2 para subtrair”.

    Em seguida, o programa lê um número do usuário e o armazena no registrador $t0. Este número determinará a operação a ser realizada (1 para adição, 2 para subtração).

    O programa então imprime a string “Digite um número” duas vezes, lendo um número do usuário após cada impressão. Estes números são armazenados nos registradores $t1 e $t2.

    O programa então verifica se o número no registrador $t0 é igual a 1 (indicando que a operação de adição deve ser realizada). Se for verdade, ele pula para o rótulo SOMA.

    Se o número no registrador $t0 não for 1, o programa subtrai o número no registrador $t2 do número no registrador $t1 e armazena o resultado no registrador $s0. Em seguida, ele pula para o rótulo SAIDA.

    No rótulo SOMA, o programa adiciona os números nos registradores $t1 e $t2 e armazena o resultado no registrador $s0.

    No rótulo SAIDA, o programa imprime a string “O resultado é” e, em seguida, imprime o número no registrador $s0 (o resultado da operação aritmética).

Por favor, note que este programa não inclui validações de entrada adicionais. Você pode querer adicionar mais validações conforme necessário. Além disso, este programa não fornece mensagens de erro para entradas inválidas (por exemplo, se o usuário digitar algo diferente de 1 ou 2 para a operação). Você pode querer adicionar isso também. Por fim, este programa assume que o usuário sempre fornecerá números quando solicitado. Se o usuário fornecer algo que não seja um número, o programa pode não se comportar como esperado. Você pode querer adicionar uma verificação para isso também.
*/
