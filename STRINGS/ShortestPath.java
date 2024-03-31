//Given a route containing four directions (N,S,E,W) . Find the shortest path to reach the destination
//TC is O(n)

public class ShortestPath {
    public static float getShortestPath(String path) {
        // starting from origin
        int x = 0;
        int y = 0; // starting from origin
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // moving up along y axis
            if (direction == 'N') {
                y++;
            }
            // moving down along y axis
            else if (direction == 'S') {
                y--;
            }
            // moving east along x axis
            else if (direction == 'E') {
                x++;
            }
            // movind west along x axis
            else {
                x--;
            }
        }
        // finding shortest path
        int XSquare = x * x;
        int YSquare = y * y;
        return (float) Math.sqrt(XSquare + YSquare); // typecasting to float as Math functions returns double value only
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
