# -*- coding: utf-8 -*-
"""3.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/17BLTbEnyNLdtRBT5EFSH04tqZrIpsAfS
"""

def seto(n):
  result = []
  for x in range(1, n+1):
      if x % 3 == 0 and x % 7 == 0:
          result.append("Arkademy")
      elif x % 3 == 0:
          result.append('Arka')
      elif x % 7 == 0:
          result.append('Demy')
      else:
          result.append(str(x))
  return result

angka = int(input("Masukkan angka: "))
seto (angka)