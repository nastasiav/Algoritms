# Рекурсия

Ли Кордуэлл: "Циклы могут ускорить работу программы. Рекурсия может ускорить работу программиста. Выбирайте, что важнее в вашей ситуации!"

## Теория

- Каждая рекурсивная функция состоит из двух частей: базового случая и рекурсивного случая.
- В рекурсивно случае функция вызывает сама себя.
- В базовом случае функция себя не вызывает, чтобы предотвратить зацикливание.
- Стек поддерживает две операции: вставка и вывод\чтение.
- Стек - простая структура данных.
- Когда вы вызваете функцию из другой функции, вызывающая функция приостанавливается в частично завершенном состоянии.
- Для стека: сохранение всей промежуточной информации может привести к значительным затратам памяти.
- Если памяти тратится слишком много:
  1. переписать код с использование цикла
  2. можно воспользоваться хвостовой рекурсией
- Все вызовы функций сохраняются в стеке вызовов.
- Если стек вызовов станет очень большим, он займет слишком много памяти.
