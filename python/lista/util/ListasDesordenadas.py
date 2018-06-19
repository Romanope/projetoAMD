'''
Created on 05/06/2018

@author: Romano
'''
from lista.list.ListaEncadeada import ListaEncadeada
from lista.util.Util import Util

class ListasDesordenadas:

    VALOR_LISTA_10 = 10000
    VALOR_LISTA_20 = 20000
    VALOR_LISTA_30 = 30000
    VALOR_LISTA_40 = 40000
    VALOR_LISTA_50 = 50000
    VALOR_LISTA_60 = 60000
    VALOR_LISTA_70 = 70000
    VALOR_LISTA_80 = 80000
    VALOR_LISTA_90 = 90000
    VALOR_LISTA_100 = 100000
    VALOR_LISTA_150 = 150000
    VALOR_LISTA_200 = 200000
    VALOR_LISTA_250 = 250000
    
    listaDezMilNativa = []
    listaVinteMilNativa = []
    listaTrintaMilNativa = []
    listaQuarentaMilNativa = []
    listaCinquentaMilNativa = []
    listaSessentaMilNativa = []
    listaSetentaMilNativa = []
    listaOitentaMilNativa = []
    listaNoventaMilNativa = []
    listaCemMilNativa = []
    listaCentoCinquentaMilNativa = []
    listaDuzentosMilNativa = []
    listaDuzentosCinquentaMilNativa = []

    listaDezMilImplementada = ListaEncadeada()
    listaVinteMilImplementada = ListaEncadeada()
    listaTrintaMilImplementada = ListaEncadeada()
    listaQuarentaMilImplementada = ListaEncadeada()
    listaCinquentaMilImplementada = ListaEncadeada()
    listaSessentaMilImplementada = ListaEncadeada()
    listaSetentaMilImplementada = ListaEncadeada()
    listaOitentaMilImplementada = ListaEncadeada()
    listaNoventaMilImplementada = ListaEncadeada()
    listaCemMilImplementada = ListaEncadeada()
    listaCentoCinquentaMilImplementada = ListaEncadeada()
    listaDuzentosMilImplementada = ListaEncadeada()
    listaDuzentosCinquentaMilImplementada = ListaEncadeada()
    
    def __init__ListasDesordenadas (self):
        pass
    
    def inicializarListas(self):
        
        util = Util()
        
        valores = util.readFile("D:\projetoAMD\carga_trabalho", "Carga de Trabalho.txt")
        valores = valores.split(",")
        print("Inicializando listas, por favor aguarde")
        for i in range(0, len(valores)):
            valorCorrente = valores[i]
            if i < self.VALOR_LISTA_10:
                self.listaDezMilNativa.append(valorCorrente)
                self.listaDezMilImplementada.add(valorCorrente)
            if i < self.VALOR_LISTA_20:
                self.listaVinteMilNativa.append(valorCorrente)
                self.listaVinteMilImplementada.add(valorCorrente)
            if i < self.VALOR_LISTA_30:
                self.listaTrintaMilNativa.append(valorCorrente)
                self.listaTrintaMilImplementada.add(valorCorrente)
            if i < self.VALOR_LISTA_40:
                self.listaQuarentaMilNativa.append(valorCorrente)
                self.listaQuarentaMilImplementada.add(valorCorrente)
            if i < self.VALOR_LISTA_50:
                self.listaCinquentaMilNativa.append(valorCorrente)
                self.listaCinquentaMilImplementada.add(valorCorrente)
            if i < self.VALOR_LISTA_60:
                self.listaSessentaMilNativa.append(valorCorrente);
                self.listaSessentaMilImplementada.add(valorCorrente);
            if i < self.VALOR_LISTA_70:
                self.listaSetentaMilNativa.append(valorCorrente);
                self.listaSetentaMilImplementada.add(valorCorrente);
            if i < self.VALOR_LISTA_80:
                self.listaOitentaMilNativa.append(valorCorrente);
                self.listaOitentaMilImplementada.add(valorCorrente);
            if i < self.VALOR_LISTA_90:
                self.listaNoventaMilNativa.append(valorCorrente);
                self.listaNoventaMilImplementada.add(valorCorrente);
            if i < self.VALOR_LISTA_100:
                self.listaCemMilNativa.append(valorCorrente);
                self.listaCemMilImplementada.add(valorCorrente);
            if i < self.VALOR_LISTA_150:
                self.listaCentoCinquentaMilNativa.append(valorCorrente)
                self.listaCentoCinquentaMilImplementada.add(valorCorrente)
            if i < self.VALOR_LISTA_200:
                self.listaDuzentosMilNativa.append(valorCorrente)
                self.listaDuzentosMilImplementada.add(valorCorrente)
            if i < self.VALOR_LISTA_250:
                self.listaDuzentosCinquentaMilNativa.append(valorCorrente)
                self.listaDuzentosCinquentaMilImplementada.add(valorCorrente)
        
        print("Listas inicializadas...\n\n")
        #print("Tamanho das listas nativa")
        #print(len(self.listaDezMilNativa))
        #print(len(self.listaVinteMilNativa))
        #print(len(self.listaTrintaMilNativa))
        #print(len(self.listaQuarentaMilNativa))
        #print(len(self.listaCinquentaMilNativa))
        #print(len(self.listaSessentaMilNativa))
        #print(len(self.listaSetentaMilNativa))
        #print(len(self.listaOitentaMilNativa))
        #print(len(self.listaNoventaMilNativa))
        #print(len(self.listaCemMilNativa))

        #print("\n\nTamanho das listas implementada")
        #print(self.listaDezMilImplementada.size())
        #print(self.listaVinteMilImplementada.size())
        #print(self.listaTrintaMilImplementada.size())
        #print(self.listaQuarentaMilImplementada.size())
        #print(self.listaCinquentaMilImplementada.size())
        #print(self.listaSessentaMilImplementada.size())
        #print(self.listaSetentaMilImplementada.size())
        #print(self.listaOitentaMilImplementada.size())
        #print(self.listaNoventaMilImplementada.size())
        #print(self.listaCemMilImplementada.size())
    
    def getListaNativaPorQuantidadeElementos (self, numeroElementos):
        
        
        if self.VALOR_LISTA_10 == numeroElementos:
            return self.listaDezMilNativa
        elif self.VALOR_LISTA_20 == numeroElementos:
            return self.listaVinteMilNativa
        elif self.VALOR_LISTA_30 == numeroElementos:
            return self.listaTrintaMilNativa
        elif self.VALOR_LISTA_40 == numeroElementos:
            return self.listaQuarentaMilNativa
        elif self.VALOR_LISTA_50 == numeroElementos:
            return self.listaCinquentaMilNativa
        elif self.VALOR_LISTA_60 == numeroElementos:
            return self.listaSessentaMilNativa
        elif self.VALOR_LISTA_70 == numeroElementos:
            return self.listaSetentaMilNativa
        elif self.VALOR_LISTA_80 == numeroElementos:
            return self.listaOitentaMilNativa
        elif self.VALOR_LISTA_90 == numeroElementos:
            return self.listaNoventaMilNativa
        elif self.VALOR_LISTA_100 == numeroElementos:
            return self.listaCemMilNativa
        elif self.VALOR_LISTA_150 == numeroElementos:
            return self.listaCentoCinquentaMilNativa
        elif self.VALOR_LISTA_200 == numeroElementos:
            return self.listaDuzentosMilNativa
        elif self.VALOR_LISTA_250 == numeroElementos:
            return self.listaDuzentosCinquentaMilNativa
        else:
            return None
            
    def getListaNativa (self, numeroElementos, iteracao):
        util = Util()
        valores = util.readFile("D:\projetoAMD\carga_trabalho\{}".format(numeroElementos), "carga_{}_{}.txt".format(numeroElementos, iteracao))
        return valores.split(",")

    def getListaImplementada (self, numeroElementos, iteracao):
        util = Util()
        valores = util.readFile("D:\projetoAMD\carga_trabalho\{}".format(numeroElementos), "carga_{}_{}.txt".format(numeroElementos, iteracao))
        valores = valores.split(",")
        lista_encadeada = ListaEncadeada()
        for i in range(0, len(valores)):
            lista_encadeada.add(valores[i])
        
        return lista_encadeada;
    
    def getListaImplementadaPorQuantidadeElementos (self, numeroElementos):

        if self.VALOR_LISTA_10 == numeroElementos:
            return self.listaDezMilImplementada.copy()
        elif self.VALOR_LISTA_20 == numeroElementos:
            return self.listaVinteMilImplementada.copy()
        elif self.VALOR_LISTA_30 == numeroElementos:
            return self.listaTrintaMilImplementada.copy()
        elif self.VALOR_LISTA_40 == numeroElementos:
            return self.listaQuarentaMilImplementada.copy()
        elif self.VALOR_LISTA_50 == numeroElementos:
            return self.listaCinquentaMilImplementada.copy()
        elif self.VALOR_LISTA_60 == numeroElementos:
            return self.listaSessentaMilImplementada.copy()
        elif self.VALOR_LISTA_70 == numeroElementos:
            return self.listaSetentaMilImplementada.copy()
        elif self.VALOR_LISTA_80 == numeroElementos:
            return self.listaOitentaMilImplementada.copy()
        elif self.VALOR_LISTA_90 == numeroElementos:
            return self.listaNoventaMilImplementada.copy()
        elif self.VALOR_LISTA_100 == numeroElementos:
            return self.listaCemMilImplementada.copy()
        elif self.VALOR_LISTA_150 == numeroElementos:
            return self.listaCentoCinquentaMilImplementada.copy()
        elif self.VALOR_LISTA_200 == numeroElementos:
            return self.listaDuzentosMilImplementada.copy()
        elif self.VALOR_LISTA_250 == numeroElementos:
            return self.listaDuzentosCinquentaMilImplementada.copy()
        else:
            return None