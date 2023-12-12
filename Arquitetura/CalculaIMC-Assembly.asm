.data
altura_msg: .asciiz "Digite sua altura em metros: "
peso_msg: .asciiz "Digite seu peso em quilogramas: "
imc_msg: .asciiz "Seu Índice de Massa Corporal (IMC) é: "
abaixo_msg: .asciiz "Você está com um peso abaixo do normal."
saudavel_msg: .asciiz "Você está com um peso saudável."
sobrepeso_msg: .asciiz "Você está com sobrepeso."

.text
.globl main
main:
    # Solicita altura
    li $v0, 4
    la $a0, altura_msg
    syscall

    # Lê altura
    li $v0, 6
    syscall
    mov.s $f12, $f0

    # Solicita peso
    li $v0, 4
    la $a0, peso_msg
    syscall

    # Lê peso
    li $v0, 6
    syscall

    # Calcula IMC = peso / (altura * altura)
    mul.s $f12, $f12, $f12
    div.s $f12, $f0, $f12

    # Imprime IMC
    li $v0, 4
    la $a0, imc_msg
    syscall

    li $v0, 2
    syscall

    # Verifica se IMC < 18.5
    li.s $f0, 18.5
    c.lt.s $f12, $f0
    bc1t abaixo

    # Verifica se 18.5 <= IMC <= 24.9
    li.s $f0, 24.9
    c.le.s $f12, $f0
    bc1t saudavel

    # Se IMC > 24.9
    li $v0, 4
    la $a0, sobrepeso_msg
    syscall
    j fim

abaixo:
    li $v0, 4
    la $a0, abaixo_msg
    syscall
    j fim

saudavel:
    li $v0, 4
    la $a0, saudavel_msg
    syscall

fim:
    # Fim do programa
    li $v0, 10
    syscall



/*
Na linguagem assembly MIPS, .globl main é uma diretiva que torna o rótulo main visível para outras 
partes do programa ou outros arquivos de código. Isso é útil quando você tem um programa grande 
dividido em vários arquivos e precisa que certas funções ou variáveis sejam acessíveis em todo o programa.

O rótulo main: é onde o programa começa a executar. É o ponto de entrada do programa. 
No seu código, main: é seguido pelas instruções que compõem o corpo principal do seu programa. 
Essas instruções são executadas sequencialmente quando o programa é executado.
*/
