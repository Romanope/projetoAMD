'''
Created on 31/05/2018

@author: Romano
'''
from lista.list.ChainElement import ChainElement

class ListaEncadeada:
    def __init__(self):
        self.currentIndex = -1;
        self.rootElement = None
        self.lastElement = None
    
    def add(self, element):
        self.currentIndex += 1
        
            
        element = ChainElement(self.currentIndex, element, None)
        if self.lastElement is not None:
            self.lastElement.nextNode = element
        elif self.rootElement is None:
            self.rootElement = element
        elif self.rootElement.nextNode is None:
            self.rootElement.nextNode = element
        else:
            e = self.rootElement
            while e.nextNode is not None:
                e = e.nextNode
                if e.nextNode is None:
                    e.nextNode = element
                    break
        self.lastElement = element
    
    
    def size(self):
        return self.currentIndex+1
    

    def get(self, index):
        if index < 0:
            return None
        
        currentItem = self.rootElement
        if currentItem is not None:
            if currentItem.index == index:
                return currentItem.item
        
        while currentItem.nextNode is not None:
            currentItem = currentItem.nextNode
            if currentItem.index == index:
                return currentItem.item
            
        return None

    def toArray(self):
        array = []
        if self.rootElement is not None:
            element = self.rootElement
            array.append(element.item)
            while element.nextNode is not None:
                array.append(element.nextNode.item)
                element = element.nextNode
        
        return array
    
    def sort(self):
        
        array = self.toArray();
        
        aux = 0;
        for i in range(0, len(array)):
            valor1 = array[i];
            for j in range(i+1, len(array)):
                valor2 = array[j];
                if valor1 > valor2:
                    aux = valor1;
                    array[i] = valor2;
                    array[j] = aux;
                    valor1 = valor2;
        
        #Apagando todos os elementos
        self.rootElement = None
        self.currentIndex = -1
        self.lastElement = None
        
        #Adicionando os elementos ordenados
        for i in range(0, len(array)):
            self.add(array[i])
        return array;

    def getLastElement(self):
        return self.lastElement
    
    def getRootElement(self):
        return self.rootElement
    
    def getCurrentIndex(self):
        return self.currentIndex
    
    def copy(self):
        copy = ListaEncadeada()
        copy.currentIndex = self.currentIndex
        copy.lastElement = self.lastElement
        copy.rootElement = self.rootElement
        return copy
