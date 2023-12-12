.data

  


.text
	
addi $t0,$t0,1 #somar regitrador com número e adicionar no registrador

li $v0,1 #comando para imprimir inteiro
move $a0,$t0 #para imprimir inteiro tem que colocar no registrador $a0
syscall
