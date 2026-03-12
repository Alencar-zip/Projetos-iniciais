print("=====Bem vindo a calculadora de simples!=====")

print("")
print("APENAS NUMEROS!")
numA= float(input("Insira o primeiro numero: "))
numB= float(input("Insira o segundo numero: "))

operator= input("""selecione a operação a ser feita!
(A)SOMA 
(B)SUBTRAÇÃo
(C)MULTIPLICAÇÃO
(D)DIVISÃO

Digite: """).upper().strip()

while operator not in ["A","B","C","D"]:
    operator= input("Digite entre as opções listadas:")

if operator == "A":
    print("Resultado: ", numA + numB)
elif operator == "B":
    print("Resultado: ", numA - numB)
elif operator== "C":
    print("Resultado: ", numA * numB)
elif operator== "D":
            print("Resultado: ", numA / numB)





