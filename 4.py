# -*- coding: utf-8 -*-
"""4.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/12qNi6hOZaOlGYUvYkkPzo83_aYA_cTGF
"""

# Python code to split string 
# by every 3th number 

# String initialization 
string = "9931411132314232"

# Defining splitting point 
n = 3

# Using list comprehension 
out = [(string[i:i+n]) for i in range(0, len(string), n)] 

# Printing output 
print(out)