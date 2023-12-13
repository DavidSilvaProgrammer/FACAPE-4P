.data
	msg1: .asciiz "Informe a quantidade de discos: "
	msg2: .asciiz "Informe o menor disco: "
	msg3: .asciiz "Informe o tipo do RAID (0, 1, 5, 6 ou 10): "
	msgR0: .asciiz "O resultado do RAID 0 é: "
	msgR1: .asciiz "O resultado do RAID 1 é: "
	msgR5: .asciiz "O resultado do RAID 5 é: "
	msgR6: .asciiz "O resultado do RAID 6 é: "
	msgR10: .asciiz "O resultado do RAID 10 é: "

.text
	li $v0, 4
	la $a0, msg1
	syscall
	
	li $v0, 5
	syscall

	move $t0, $v0

	li $v0, 4
	la $a0, msg2
	syscall
	
	li $v0,5
	syscall

	move $t1, $v0
	
	li $v0, 4
	la $a0, msg3
	syscall
	
	li $v0,5
	syscall

	move $t6, $v0
	
	#realizando a operação escolhida pelo usuário
	
	beq $t6, 0, raid0
	beq $t6, 1, raid1
	beq $t6, 5, raid5
	beq $t6, 6, raid6
	beq $t6, 10, raid10
	
raid0:
	mul $t2, $t0, $t1
	
	li $v0, 4
	la $a0, msgR0
	syscall
	
	li $v0, 1
	move $a0, $t2
	syscall	
	
	j end
	
raid1:
	li $v0, 4
	la $a0, msgR1
	syscall
	
	li $v0, 1
	move $a0, $t1
	syscall	
	
	j end
	
raid5:
	sub $t3, $t0, 1
	mul $t3, $t3, $t1
	
	li $v0, 4
	la $a0, msgR5
	syscall
	
	li $v0, 1
	move $a0, $t3
	syscall	
	
	j end
	
raid6:
	sub $t4, $t0, 2
	mul $t4, $t4, $t1
	
	li $v0, 4
	la $a0, msgR6
	syscall
	
	li $v0, 1
	move $a0, $t4
	syscall	
	
	j end
	
raid10:
	mul $t5, $t0, $t1
	div $t5, $t5, 2
	
	li $v0, 4
	la $a0, msgR10
	syscall
	
	li $v0, 1
	move $a0, $t5
	syscall	
	
	j end
	
end:
