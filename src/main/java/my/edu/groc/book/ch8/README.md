# Жадные алгоритмы

Жадный алгоритм прост: на каждом шаге он выбирает оптимальный вариант.
Жадная стратегия не дает оптимального решения.
Иногда идеальное - враг хоршего. В некоторых случаях достаточно алгоритма, способного решить задачу достаточно хорошо.

## Приближенный алгоритм.

Когда вычисление точного решения занимает слишком много времени, применяется приближенный алгоритм. Эффективность приближенного алгоритма оценивается по:

- быстроте
- близости полученного решения к оптимальному

## Теория

- Множества не содержат дубликатов
- Объединение множеств означает слияние элементов обоих множеств
- Под операцией пересечения множеств понимается поиск элементов, выходящих в оба множества
- Под разностью множеств понимается исключение из одного множества элементов, присутсвующих в другом множестве
- Множества похожи на списки, но множества не содержат дубликатов
- С множествами можно выполнять различные интересные операции - вычислять их объединение, пересечение и разность

## NP-полные задачи
- Задача о коммивояжере
- Задача о покрытии множества

Многие считают, что написать быстрый алгоритм для решения таких задач невозможно

Характерные признаки NP-полной задачи:
- ваш алгоритм быстро работает при малом количестве элементов, но сильно замедляется при увеличении их числа
- формулировка "все комбинации Х" часто указывают на Np-полноту задачи
- вам приходится вычислять все возможные варианты Х, потому что задачу невозможно разбить на меньшие позадачи. Такая задача может оказаться NP-полной
- если в задаче встречается некоторая последовательность и задача не имеет простого решения, она может оказаться NP-полной
- если в задаче встречается некоторое множество и задача не имеет простого решения, она может оказаться NP-полной
- можно ли переформулировать задачу в условиях задачи покрытия множества или задачи о коммивояжере? в таком случае ваша заадча определенно является NP-полной

## Шпаргалка

- жадныеалгоритмы стремятся к локальной оптимизации в расчете на то, что в итоге будет достигнут глобальный оптимум
- у NP-полных задач не существует известных быстрых решений
- если у вас имеется NP-полная задача, лучше всего воспользоваться приближенным алгоритмом
- жадные алгоритмы легко реализуются и быстро выполняются, поэтому из них получаются хорошие приближенные алгоритмы

