# Командный проект по курсу «Java для тестировщиков»

* [Цели проекта](#цели-проекта)
* [Описание проекта](#Описание-проекта)
* [Сроки реализации проекта](#Сроки-реализации-проекта)

## Цели проекта

Цель командного проекта — протестировать приложение для трекинга игровой активности.  
Вам предстоит:
- самостоятельно протестировать часть проекта,
- составить баг-репорты на найденные баги,
- закрыть баг-репорты, составленные вашим коллегой.

## Описание проекта

- В репозитории находится заготовка проекта, в котором есть классы  для трёх сущностей: игры (`Game`), игрока (`Player`), каталога игр (`GameStore`).

- Каждая игра принадлежит какому-то каталогу.  

- Каждый игрок может добавить себе в коллекцию игру.

- Также игрок может поиграть в добавленную игру через вызов своего метода `play`, тогда система записывает количество часов, которые он проиграл в игру.

- Информация о проигранном времени хранится и в объекте игрока, и в объекте каталога игр, в чью игру он поиграл.

- Также в классе игрока и каталога игр есть методы для подсчёта разного вида статистик по играм и игрокам.

- Над каждым методом в коде есть описание того, как он должен работать. При этом часть методов в этих классах не реализована, часть реализована с дефектами.

**Ваша задача** — исправить эти дефекты и дописать нереализованные методы.

## Сроки реализации проекта

Работа над проектом рассчитана на 10 дней для команды из двух человек. Для планирования своего времени рекомендуется опираться на роадмап. Придерживайтесь следующего деления проекта на этапы и задачи участников:
| Этапы | Количество дней | Задачи |
| ----- | --------------- | ----- |
| 1, 2 этапы | 1 день | Создание репозитория для проекта, предоставление доступа участникам, распределение задач |
| 3 этап | 2 дня | Поиск дефектов, добавление тестов и составление баг-репортов|
| 4 этап | 2 дня | Исправление дефектов и реализация методов |
| 5 этап | 2 дня| Проверка на дефекты |
| Сдача проекта | 3 дня | Отправка и обратная связь от проверяющего преподавателя |
| Доработка по результатам* (при необходимости) | 2 дня | Доработка проекта по итогам обратной связи от проверяющего |
| Повторная сдача проекта* (при необходимости) | 3 дня | Отправка и обратная связь от проверяющего преподавателя |
