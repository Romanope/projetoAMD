'''
Created on 01/06/2018

@author: Romano
'''

from lista.principal.ColetaListaNativa import ColetaListaNativa #
from lista.util.ListasDesordenadas import ListasDesordenadas
from lista.principal.ColetaListaImplementada import ColetaListaImplementada


OPCAO_IMPLEMENTADA = 1
OPCAO_NATIVA = 2
OPCAO_SAIR = 3

listasDesordenadas = ListasDesordenadas()
#listasDesordenadas.inicializarListas()# Lê arquivo com entradas e inicializa listas prototype


continuar = True
while (continuar):
    tpColeta = int(input("Selecione uma das opções:\n1-Implementada \n2-Nativa\n3-Sair")) 
    quantidade_coletas = int(input("Entre com a quantidade de coletas: ")) 
    quantidade_elementos = int(input("Entre com a quantidade de elementos na lista: ")) 
    if OPCAO_IMPLEMENTADA == tpColeta:
        times = ColetaListaImplementada().start(quantidade_coletas, quantidade_elementos, listasDesordenadas)
    elif OPCAO_NATIVA == tpColeta:
        ColetaListaNativa().start(quantidade_coletas, quantidade_elementos, listasDesordenadas)
    elif OPCAO_SAIR == tpColeta:
        continuar = False
    else:
        print("Opção {} inválida".format(tpColeta))
