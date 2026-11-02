public class VideoGame {
    private String title;
    private int score;
    private double price;
    private boolean isMultiplayer;

    public VideoGame(String title, int score, double price, boolean isMultiplayer) {
        this.title = title;
        this.score = score;
        this.price = price;
        this.isMultiplayer = isMultiplayer;
    }

    public String toString() {
        return "Game: " + title + " | Score: " + score + " | Price: $" + price + " | Multiplayer: " + isMultiplayer;
    }

    public void printGameInfo() {
        System.out.println("Details: " + this.toString());
    }

    public boolean checkTitleWord(String word) {
        if (title.equals("Unknown")) {
            return false;
        }
        
        int index = title.indexOf(word);
        if (index != -1) {
            return true;
        } else {
            return false;
        }
    }

    public String evaluateGame(String searchKey) {
        int subIndex = title.indexOf(title.substring(0, 1));
        
        double adjustedPrice = price;
        if (price > 50.0) {
            adjustedPrice = price * 0.80; 
        }

        if (isMultiplayer && score > 80) {
            return "Multiplayer game! Substring match index: " + subIndex + ", New Price: $" + adjustedPrice;
        } else {
            return "Standard game. Substring match index: " + subIndex + ", New Price: $" + adjustedPrice;
        }
    }
}

