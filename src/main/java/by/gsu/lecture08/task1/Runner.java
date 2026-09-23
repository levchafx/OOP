package by.gsu.lecture08.task1;

public class Runner {

    public static void main(String[] args) {
        String poem = "What is this life if, full of care,\n"
                + "We have no time to stand and stare.\n"
                + "No time to stand beneath the boughs\n"
                + "And stare as long as sheep or cows.\n"
                + "No time to see, when woods we pass,\n"
                + "Where squirrels hide their nuts in grass.\n"
                + "No time to see, in broad daylight,\n"
                + "Streams full of stars, like skies at night.\n"
                + "No time to turn at Beauty's glance,\n"
                + "And watch her feet, how they can dance.\n"
                + "No time to wait till her mouth can\n"
                + "Enrich that smile her eyes began.\n"
                + "A poor life this if, full of care,\n"
                + "We have no time to stand and stare.";

        String path = "src/poem.txt";
        String copyPath = "src/poem_copy.txt";

        Utilities.writeText(poem, path);
        Utilities.readTextFile(path);
        Utilities.copyFile(path, copyPath);
    }
}
