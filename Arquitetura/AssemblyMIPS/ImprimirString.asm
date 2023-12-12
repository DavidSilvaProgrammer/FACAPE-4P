.data
	#area para dados na memória principal
 	msg: .asciiz "Olá, mundo!"

.text
	#área para instruções do programa
	
	li $v0,4 #instrução para impressão de String
	
	la $a0, msg                #load address carrega endereço da memória principal para o programa
	syscall
	
	
