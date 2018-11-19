from keras.models import Sequential
from keras.layers import Dense
import numpy

numpy.random.seed(7)

dataset = numpy.loadtxt("DadosConsolidados.csv", delimiter=";", encoding='latin-1')

print(dataset)
X = dataset[:,0:15]
Y = dataset[:,15]

model = Sequential()
model.add(Dense(20, input_dim=15, activation='relu'))
model.add(Dense(20, activation='relu'))
model.add(Dense(20, activation='relu'))
model.add(Dense(20, activation='relu'))
model.add(Dense(20, activation='relu'))
model.add(Dense(16, activation='relu'))
model.add(Dense(1, activation='sigmoid'))
print(model)

model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])

model.fit(X, Y, epochs=200, batch_size=10, verbose=2)

scores = model.evaluate(X, Y)
print("\n%s: %.2f%%\n" % (model.metrics_names[1], scores[1]*100))

testset = numpy.loadtxt("TesteDadosConsolidados.csv", delimiter=";", encoding='latin-1')
TS = testset[:,0:15]
predictions = model.predict(TS)

rounded = [round(x[0]) for x in predictions]
print(rounded)