#Determinar valores
print("")
print("Apenas numeros e divisão diferente de Zero")

numA= float(input("Insira o primeiro numero: "))
numB= float(input("Insira o segundo numero: "))656


#Escolher a operação
operator= input("""selecione a operação a ser feita!
(A)SOMA 
(B)SUBTRAÇÃo
(C)MULTIPLICAÇÃO
(D)DIVISÃO

Digite: """).upper().strip()

while operator not in ["A","B","C","D"]:
    operator= input("Digite entre as opções listadas:")

if operator == "A":
    print(f"Resultado: {numA + numB}")
elif operator == "B":
    print(f"Resultado: {numA - numB}")
elif operator== "C":
    print(f"Resultado: {numA * numB}")
elif operator== "D":
    print(f"Resultado: {numA / numB}")


