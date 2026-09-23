# OOP

Java coursework for the OOP course. Each package under `src/main/java/by/gsu/lectureNN`
implements the exercises assigned in the corresponding lecture topic on Google Classroom:

https://classroom.google.com/w/Mzk4NDk3ODE5NzU3/t/all

Package numbers are zero-padded (`lecture05` … `lecture10`) so they sort in the correct
numeric order both in the file system and on GitHub.

## Structure

| Package | Classroom topic | Tasks |
|---|---|---|
| `lecture05` | Лекция 5. ООП. Инкапсуляция. Конструкторы. Создание объектов. | task1 `Car`, task2 `Rectangle`, task3 `Sportsman`, task4 `Material`/`Subject` |
| `lecture06` | Лекция 6. Наследование и полиморфизм | task1 `Material`/`Subject`, task2 `Car`/`Lorry`/`SportCar`, task3 `Purchase` + discount subclasses |
| `lecture07` | Лекция 7. Абстракция и интерфейсы | task1 `AbstractPurchase`/`Commodity` + `Comparable` |
| `lecture08` | Лекция 8. Работа с файлами | task1 file read/write/copy `Utilities`, task2 `Worker` read from `in.txt`, task3 taxi fleet (interfaces + abstract classes + CSV export) |
| `lecture09` | Лекция 9. Работа с коллекциями | task1 `ArrayList`/`Set`/`Map` basics, task2 `Student` collection |
| `lecture10` | Лекция 10. Работа с БД | task1 console login check, task2 `Abonent` + JDBC/H2 |

Each task package has its own `Runner` class with a `main` method that demonstrates the
solution — run it directly, e.g.:

```bash
mvn exec:java -Dexec.mainClass="by.gsu.lecture05.task1.Runner"
```
