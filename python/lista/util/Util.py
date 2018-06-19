'''
Created on 06/05/2018

@author: Romano
'''
from lista.list.ListaEncadeada import ListaEncadeada
from random import uniform

#valor minimo
minimo = -10000000
#valor maximo
maximo = 10000000


class Util(object):
    
    def __init__(self):
        pass
    
    def criar_lista(self, quantidadeElementos):
        listaEncadeada = ListaEncadeada
        for x in range(0, quantidadeElementos):
            valor = uniform(minimo, maximo)
            listaEncadeada.add(valor)
        
        return listaEncadeada;
    
    def writeFile(self, directory, nameFile, content):
        file_name = "{}\\{}".format(directory, nameFile)
        textFile = open(file_name, "w")
        textFile.write("".join(content))
        textFile.close()
        
    def readFile(self, diretorio, nomeArquivo):
        file = "{}\\{}".format(diretorio, nomeArquivo)
        file_object  = open(file, "r")
        return file_object.readlines()[0]
    
    def writeTimes(self, times, diretorio, nomeArquivo):
        string_array = []
        record = "{}, {}, {}\n"
        string_array.append(record.format("start", "end", "duration")) # todos os tempos coletados serao adicionados aqui
        for i in range(0, len(times)):
            dados = times[i]
            start = dados.start
            end = dados.end
            delta = dados.delta
            string_array.append(record.format(start, end, delta))
        
        self.writeFile(diretorio, nomeArquivo, "".join(string_array)) # escrevendo no arquivo todos os tempos coletados
