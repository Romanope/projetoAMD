'''
Created on 10/06/2018

@author: Romano
'''
from lista.list.ListaEncadeada import ListaEncadeada
import copy

lista = ListaEncadeada.instanceWithoutParams()

lista.add(3)
lista.add(2)
lista.add(1)

lista2 = copy.deepcopy(lista)

lista2.sort()

print(lista.toArray())
print(lista2.toArray())