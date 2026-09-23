package by.gsu.lecture5.task3;

public class Runner {

    public static void main(String[] args) {
        Sportsman[] sportsmen = new Sportsman[5];
        sportsmen[0] = new Sportsman("Иванов Иван Иванович", 30, 85);
        sportsmen[1] = new Sportsman("Петров Петр Петрович", 75, 80);
        sportsmen[2] = new Sportsman("Сидоров Сидор Сидорович", 90, 95);
        sportsmen[3] = new Sportsman("Кузнецов Кузьма Кузьмич", 60, 65);
        sportsmen[4] = new Sportsman("Смирнов Смирн Смирнович", 70, 70);

        System.out.println("All sportsmen:");
        for (Sportsman sportsman : sportsmen) {
            System.out.println(sportsman);
        }

        System.out.println("\nSportsmen who earned the title:");
        for (Sportsman sportsman : sportsmen) {
            if (sportsman.isMaster()) {
                System.out.println(sportsman);
            }
        }
    }
}
