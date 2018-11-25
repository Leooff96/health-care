from keras.models import Sequential
from keras.layers import Dense
import numpy
import json, requests

numpy.random.seed(7)

#Executa requisição para armazenamento de dados
# reponse = requests.get("urlAPI")
# dataset = json.loads(response.content)

#Carregada dados
dataset = numpy.loadtxt("DadosConsolidados.csv", delimiter=";", encoding='latin-1')

#Separa os dados, Sintomas de Resultados
#Sintomas
X = dataset[:,0:8]
#Diagnóstico/Classificção
Y = dataset[:,8:10]

print(X)

#Arquitetura da rede neural
model = Sequential()
model.add(Dense(15, input_dim=8, activation='relu'))
model.add(Dense(15, activation='relu'))
model.add(Dense(15, activation='relu'))
model.add(Dense(15, activation='relu'))
model.add(Dense(15, activation='relu'))
model.add(Dense(9, activation='relu'))
model.add(Dense(2, activation='sigmoid'))
print(model)

model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])
#Treinamento da inteligencia artificial
model.fit(X, Y, epochs=200, batch_size=10, verbose=2)

scores = model.evaluate(X, Y)
print("\n%s: %.2f%%\n" % (model.metrics_names[1], scores[1]*100))

#Pergunta os sintomas para execução do diagnostico e classificação a partir do dados obtidos
TS = [[]]
Questions = ['peso','altura', 'indice de massa', 'pressão sanguinea sistólica',
             'pressão sanguinea diastólica', 'temperatura', 'triglicedis', 'colesterol']
for q in Questions:
    TS[0].append(input('Digite seu valor de ' + q + ': '))
    
predictions = model.predict(numpy.array(TS))

#Transaforma o resultado em algo paupavel para o usuario e printa na tela
print("************")
print("Resultado\n")
for result in predictions:
    Y1 = round(result[0])
    Y2 = round(result[1])
    print("Diagnóstico: ")
    print(Y1)
    print("\nClassificação: ")
    print({
        1 : "Emergente",
        2 : "Muito Urgente",
        3 : "Urgente",
        4 : "Pouco Urgente",
        5 : "Não Urgente"
    }[Y2])