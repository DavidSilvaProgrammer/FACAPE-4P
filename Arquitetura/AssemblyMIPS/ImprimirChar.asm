.data
	
	banana: .byte 'A'

.text

	li $v0, 4 #imprime string e char
	la $a0, banana
	syscall
	
