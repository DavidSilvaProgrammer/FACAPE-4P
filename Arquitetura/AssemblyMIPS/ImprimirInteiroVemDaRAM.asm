.data
	
	idade: .word 56             #variavel idade, tipo inteiro, valor 56

.text

	li $v0, 1 #imprime inteiro
	lw $a0, idade   #load word
	syscall
	
