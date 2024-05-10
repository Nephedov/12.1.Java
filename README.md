# «Композиция и зависимость объектов. Mockito при создании автотестов»

## Решения
### Задание 1
 * <a href="https://github.com/Nephedov/12.1.Java/blob/main/src/main/java/ru/netology/javaqa/Poster.java">Poster.java</a> - класс-менеджер.
 * <a href="https://github.com/Nephedov/12.1.Java/blob/main/src/test/java/ru/netology/javaqa/PosterTest.java">PosterTest.java</a> - автотесты.

Ветка <a href="https://github.com/Nephedov/12.1.Java/tree/main">main</a> с проектом.
### Задание 2
 * <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/repository/PosterRepository.java">PosterRepository.java</a> - класс-репозиторий.
 * <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/domain/Film.java">Film.java</a> - описывающий объект "фильм".
 * <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/PosterManager.java">PosterManager.java</a> - класс-менеджер.
 * <a href="https://github.com/Nephedov/12.1.Java/blob/ed12c306e1d981abbd628204c763029920f9a38f/src/test/java/ru/netology/PosterManagerTest.java">PosterManagerTest.java</a> - автотесты с Mockito.
 * <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/test/java/ru/netology/repository/PosterRepositoryTest.java">PosterRepositoryTest.java</a> - автотесты.

Ветка <a href="https://github.com/Nephedov/12.1.Java/tree/layers">layers</a> с проектом.
## Что было сделано
### Задание 1
* Создан Maven проект с и настроен <a href="https://github.com/Nephedov/12.1.Java/blob/main/pom.xml">pom.xml</a> c зависимостями и плагинами:
  * JunitJupier.
  * Lombok.
  * Jacoco.
* Настроен <a href="https://github.com/Nephedov/12.1.Java/blob/main/.github/workflows/maven.yml">maven.yml</a> для Github Ci c verify-сборкой.
* Реализован класс <a href="https://github.com/Nephedov/12.1.Java/blob/main/src/main/java/ru/netology/javaqa/Poster.java">Poster.java</a> с методами взаимодействия со строчными массивами.
* Реализован класс с тестами <a href="https://github.com/Nephedov/12.1.Java/blob/main/src/test/java/ru/netology/javaqa/PosterTest.java">PosterTest.java</a>.
### Задание 2
* Создана ветка <a href="https://github.com/Nephedov/12.1.Java/tree/layers">layers</a> из ветки <a href="https://github.com/Nephedov/12.1.Java/tree/main">main</a> в которой:
  * Реализован класс <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/domain/Film.java">Film.java</a> - описывающий объект "фильм".
  * Реализован класс-репозиторий <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/repository/PosterRepository.java">PosterRepository.java</a>, имеющий методы сохранения, удаления, поиска экземпляров Film.
  * Реализован класс <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/PosterManager.java">PosterManager.java</a>, объединяющий логику классов
    <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/domain/Film.java">Film.java</a>,
    <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/repository/PosterRepository.java">PosterRepository.java</a>.
  * Реализован класс с автотестами <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/test/java/ru/netology/repository/PosterRepositoryTest.java">PosterRepositoryTest.java</a>,
    проверяющий класс <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/repository/PosterRepository.java">PosterRepository.java</a>.
  * Реализован класс с автотестами <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/test/java/ru/netology/PosterManagerTest.java">PosterManagerTest.java</a>,
    проверяющий класс <a href="https://github.com/Nephedov/12.1.Java/blob/layers/src/main/java/ru/netology/PosterManager.java">PosterManager.java</a>, с применением Mockito.

---
---


# Описание Задания 1. Менеджер афиши (обязательное к выполнению)

Вам необходимо реализовать менеджер афиши для фильмов. В качестве объекта фильма можно взять объект строки — название фильма — или создать свой дата-класс.

![image](https://user-images.githubusercontent.com/53707586/152697921-e71d853c-aa2e-482b-be61-39e6c2cfb0b1.png)

Менеджер должен уметь выполнять следующие операции:
1. Добавление нового фильма.
2. Вывод всех фильмов в порядке добавления (`findAll`).
3. Вывод максимального лимита* последних добавленных фильмов в обратном от добавления порядке (`findLast`).

*Сделайте так, чтобы по умолчанию выводилось последние 10 добавленных фильмов, но при создании менеджера можно было указать другое число, чтобы, например, выдавать 5, а не 10. То есть у менеджера должно быть два конструктора: один без параметров, выставляющий лимит менеджера в 10, а другой с параметром, берущий значение лимита для менеджера из параметра конструктора.

# Описание Задания 2*. Менеджер афиши: divide and conquer (необязательная задача)

В первой задаче создайте новую ветку `layers`, в которой разделите менеджера на менеджера и репозиторий.
В репозитории должны быть следующие методы:
1. `findAll` — возвращает массив всех хранящихся в массиве объектов.
1. `save` — добавляет объект в массив.
1. `findById` — возвращает объект по идентификатору, либо `null`, если такого объекта нет.
1. `removeById` — удаляет объект по идентификатору, если объекта нет, то пусть будет исключение, как на лекции.
1. `removeAll`* — полностью вычищает репозиторий, для удаления всех элементов достаточно в поле `items` положить пустой массив.

Обеспечьте использование менеджером созданного вами репозитория. Репозиторий должен быть зависимостью для менеджера, то есть задаваться через конструктор и храниться в приватном поле.

Напишите 1–2 автотеста, используя Mockito для организации моков репозитория.
