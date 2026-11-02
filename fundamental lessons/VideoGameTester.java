public class VideoGameTester {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("Cyber Adventure", 90, 60.0, true);
        VideoGame game2 = new VideoGame("Simple Puzzle", 75, 15.0, false);
        VideoGame game3 = new VideoGame("Unknown", 50, 40.0, true);

        System.out.println("=== TESTING toString() & printGameInfo() ===");
        System.out.println("EXPECTED: Details -> Game: Cyber Adventure | Score: 90 | Price: $60.0 | Multiplayer: true");
        System.out.print("GOT:      ");
        game1.printGameInfo();

        System.out.println("TESTING checkTitleWord (.indexOf, -1, and .equals)");
        System.out.println("EXPECTED: true");
        System.out.println("GOT:      " + game1.checkTitleWord("Adventure"));

        System.out.println("EXPECTED: false");
        System.out.println("GOT:      " + game3.checkTitleWord("Adventure"));


        System.out.println("=== TESTING evaluateGame (substring, math, and boolean) ===");
        System.out.println("EXPECTED: Multiplayer game! Substring match index: 0, New Price: $48.0");
        System.out.println("GOT:      " + game1.evaluateGame("Cyber"));

        System.out.println("EXPECTED: Standard game. Substring match index: 0, New Price: $15.0");
        System.out.println("GOT:      " + game2.evaluateGame("Puzzle"));
    }
}