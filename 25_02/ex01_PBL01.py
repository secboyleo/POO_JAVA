import random

tam = int(input("Quantidade de numeros"))

vetor = []
for i in range(0, tam):
    vetor.append(random.randint(0,100))
    
for i in vetor:
    if i % 2 == 0:
        print(str(i) + " = PAR")
    elif i % 3 == 0:
        print(str(i) + " = IMPAR")
    else:
        print(str(i) + " = MULTIPLO DE 3")
