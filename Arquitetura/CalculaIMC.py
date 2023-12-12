def calcula_imc():
    altura = float(input("Digite sua altura em metros: "))
    peso = float(input("Digite seu peso em quilogramas: "))

    imc = peso / (altura ** 2)

    print("Seu Índice de Massa Corporal (IMC) é: {:.2f}".format(imc))
    
    if imc < 18.5:
        print("Você está com um peso abaixo do normal.")
    if 18.5 <= imc <= 24.9:
        print("Você está com um peso saudável.")
    if imc > 24.9:
        print("Você está com sobrepeso.")

calcula_imc()
