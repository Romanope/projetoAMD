'''
Created on 05/06/2018

@author: Romano
'''
from lista.list.DadosColetados import DadosColetados
from lista.list.ListaEncadeada import ListaEncadeada
from lista.util.Util import Util
import time

class ColetaListaImplementada:
    pass

    def __init__(self):
        pass

    def start(self, quantidade_coletas, quantidadeElementos, listasDesordenadas):
        times = self.iniciarColetasTimes(quantidade_coletas, quantidadeElementos, listasDesordenadas)
        util = Util()
        util.writeTimes(times, "D:\\projetoAMD\\python\\implementada", "implementada_{}E_{}C.txt".format(quantidadeElementos, quantidade_coletas))
        
    def iniciarColetasTimes(self, quantidade_coletas, quantidadeElementos, listasDesordenadas):
        times = []
        lista = ListaEncadeada()
        for i in range(0, quantidade_coletas):
            lista = listasDesordenadas.getListaImplementada(quantidadeElementos, (i+1)) # recupera a lista de acordo com o número de elementos selecionado
            start = time.time_ns()
            lista.sort() #
            end = time.time_ns()
            times.append(DadosColetados(start, end)) # adicionado o tempo gasto em cada ordenação
            
        return times