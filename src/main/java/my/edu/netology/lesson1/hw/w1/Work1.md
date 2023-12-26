# Задача 1. Оценка алгосложности программы

Ниже представлен псевдокод.
Ваша задача понять и описать что он делает,
определить его асимптотику (время и дополнительная память)
и привести аргументы, почему она именно такая.
Результатом выполнения задания должен быть текстовый ответ, написание кода не требуется.

```
calc(arr):
  ans = 0
  for i от 1 до длина(arr)
    ans += arr[i] - arr[i-1]
  return ans 
```

## Решение
Сложность по времени - O(n)

Метод calc - это цикл по n-1 элементам

Сложность по памяти - O(1)

В методе calc используется только 1 переменная ans.