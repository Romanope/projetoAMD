'''
Created on 12/06/2018

@author: Romano
'''
from lista.principal.ColetaListaImplementada import ColetaListaImplementada
from lista.util.ListasDesordenadas import ListasDesordenadas

lista = []
lista.append(50000)
lista.append(60000)
lista.append(70000)
lista.append(80000)
lista.append(90000)
lista.append(100000)
lista.append(150000)
lista.append(200000)
lista.append(250000)

listasDesordenadas = ListasDesordenadas()
for i in range(0, len(lista)):
    ColetaListaImplementada().start(14, lista[i], listasDesordenadas)
    print("{} finalizada".format(lista[i]))