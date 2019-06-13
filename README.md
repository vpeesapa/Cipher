# Cipher

## Authors
Varun Peesapati

## Introduction
The code is written in Java and implements the **Caesar Cipher** (also known as
**shift cipher**), which is a type of substitution cipher in which each letter
in the plain text is replaced by a letter some fixed number of positions down
the alphabet.

![Caesar Cipher](cipher.png)

## Usage
The program can be executed as follows:

```
$ make
javac *.java
$ java Driver
Enter a string that has to be encrypted: bob
Enter the offset by which the string needs to be encrypted by: 5
Encrypted String: gtg
Decrypted String: bob
```