.data
	pulaLinha: .asciiz "\nPulando linha\n"


.text

	li $t0, 12         #load immediate
	addi $t1,$zero,10
	
	#$s0 terá o resultado da multiplicação
	mul $s0,$t0,$t1
	
	li $v0,1
	move $a0,$s0
	syscall
	
	li $v0,4
	la $a0,pulaLinha
	syscall
	
	
	li $t0,5
	sll $s1,$t0,3  #shift left logical potência de 2
	li $v0,1
	move $a0, $s1
	syscall
	
	#está dando 405 porque está sem o espaço
	
	li $t0,5
	move $a0,$t0
	syscall
	
	
	
	
