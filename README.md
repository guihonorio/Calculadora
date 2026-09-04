# Calculadora Corrigida

Projeto Maven para abrir no NetBeans.

## Como abrir

1. No NetBeans: **File → Open Project**
2. Selecione a pasta `CalculadoraCorrecao`
3. Espere o Maven baixar o JUnit
4. As pastas **Test Packages** e **Test Dependencies** aparecem sozinhas

## O que foi corrigido

- Soma, subtracao, multiplicacao e divisao estavam com as contas trocadas
- O display mostrava `4.0` em vez de `4`
- Botao `0` virava `1`
- Botao `5` era ignorado
- Botao `9` virava `8`
- Botao `3` repetia `33`
- O `+` virava `-` ou `*`
- O resultado era multiplicado por `10`
- Apertar `=` de novo somava `1`
- Limpar nao zerava a calculadora
- Teclado: `7` virava `4`

## Testes

Clique com o botao direito em `CalculadoraTests.java` → **Test File**

Ou no terminal:

```bash
./mvnw test
```
