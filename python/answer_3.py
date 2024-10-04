import pandas as pd

df = pd.read_json('dados.json')
df = df[df['valor'] != 0]

max_fat = df.loc[df['valor'] == df['valor'].max(), 'dia'].values[0]
min_fat = df.loc[df['valor'] == df['valor'].min(), 'dia'].values[0]
dias_acima = []

for valor in df['valor']:
  if valor > df['valor'].mean():
    dias_acima.append(df.loc[df['valor'] == valor, 'dia'].values[0])

print("Dia de maior faturamento:",max_fat)
print("Dia de menor faturamento:",min_fat)

str_dias_acima = ""

for dia in dias_acima:
    str_dias_acima = str_dias_acima + str(dia) + ", "

print("Dias com faturamento maior que a média:",str_dias_acima[:-2])