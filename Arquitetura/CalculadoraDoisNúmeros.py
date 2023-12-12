def calculadora():
    print("Escolha a operação:")
    print("1. Adição")
    print("2. Subtração")
    print("3. Multiplicação")
    print("4. Divisão")

    operacao = int(input("Digite o número da operação desejada: "))

    num1 = float(input("Digite o primeiro número: "))
    num2 = float(input("Digite o segundo número: "))

    if operacao == 1:
        resultado = num1 + num2
        print("O resultado da adição é: ", resultado)
    elif operacao == 2:
        resultado = num1 - num2
        print("O resultado da subtração é: ", resultado)
    elif operacao == 3:
        resultado = num1 * num2
        print("O resultado da multiplicação é: ", resultado)
    elif operacao == 4:
        if num2 != 0:
            resultado = num1 / num2
            print("O resultado da divisão é: ", resultado)
        else:
            print("Erro! Divisão por zero não é permitida.")
    else:
        print("Operação inválida. Por favor, escolha uma operação entre 1 e 4.")

calculadora()
