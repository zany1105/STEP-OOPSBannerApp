public class uc5 {
    public static void main(String[] args) {
        String space = "   "; 
        String[] oopsBanner = {
            String.join(space, "  OOOOO ", "  OOOOO ", " PPPPPP  ", " SSSSSS "),
            String.join(space, " OO   OO", " OO   OO", " PP   PP", "SS      "),
            String.join(space, " OO   OO", " OO   OO", " PPPPPP ", " SSSSSS "),
            String.join(space, " OO   OO", " OO   OO", " PP     ", "      SS"),
            String.join(space, "  OOOOO ", "  OOOOO ", " PP     ", "SSSSSS  ")
        };
        System.out.println("--- OOPS Banner (uc5: String.join & Inline Initialization) ---");
        for (String row : oopsBanner) {
            System.out.println(row);
        }
    }
}

    

