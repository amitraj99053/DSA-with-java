import java.util.*;

public class CableWrap {

    private static int N, M;
    private static char[][] grid;
    
    private static final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3;

    private static class Path {
        List<int[]> points = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine();

        grid = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine().replace(" ", "");
            grid[i] = line.toCharArray();
        }
        scanner.close();

        Path rodPath = findPath('R');
        Path cablePath = findPath('C');

        if (rodPath.points.isEmpty() || cablePath.points.isEmpty()) {
            System.out.println(0);
            return;
        }

        int netWinding = calculateNetWinding(rodPath, cablePath);

        int minSwitches = Math.abs(netWinding) / 2;
        
        System.out.println(minSwitches);
    }
    
    private static Path findPath(char component) {
        Path path = new Path();
        int startR = -1, startC = -1;

        outer:
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (grid[r][c] != '.') {
                    char cell = grid[r][c];
                    boolean isComponent = (component == 'C' && (cell == 'C' || cell == 'R')) || 
                                          (component == 'R' && (cell == 'R' || cell == 'C'));

                    if (isComponent) {
                         if (r == 0 || r == N - 1 || c == 0 || c == M - 1) {
                            startR = r;
                            startC = c;
                            break outer;
                        }
                    }
                }
            }
        }
        
        if (startR == -1) {
             for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (grid[r][c] != '.') {
                        if (component == 'C' && (grid[r][c] == 'C' || grid[r][c] == 'R')) {
                            startR = r; startC = c; break;
                        }
                        if (component == 'R' && (grid[r][c] == 'R' || grid[r][c] == 'C')) {
                            startR = r; startC = c; break;
                        }
                    }
                }
                if (startR != -1) break;
            }
        }
        
        if (startR != -1) {
             tracePath(startR, startC, path, component);
        }
        return path;
    }

    private static void tracePath(int r, int c, Path path, char component) {
        int key = r * M + c;
        if (path.visited.contains(key)) return;

        char cell = grid[r][c];
        boolean isComponent = (component == 'C' && (cell == 'C' || cell == 'R')) || 
                              (component == 'R' && (cell == 'R' || cell == 'C'));

        if (isComponent) {
            path.points.add(new int[]{r, c});
            path.visited.add(key);

            for (int dir = 0; dir < 4; dir++) {
                int nextR = r + DIRS[dir][0];
                int nextC = c + DIRS[dir][1];

                if (isValid(nextR, nextC)) {
                    char nextCell = grid[nextR][nextC];
                    boolean isNeighbor = (component == 'C' && (nextCell == 'C' || nextCell == 'R')) || 
                                         (component == 'R' && (nextCell == 'R' || nextCell == 'C'));

                    if (isNeighbor) {
                        tracePath(nextR, nextC, path, component);
                    }
                }
            }
        }
    }

    private static boolean isValid(int r, int c) {
        return r >= 0 && r < N && c >= 0 && c < M;
    }

    private static int calculateNetWinding(Path rodPath, Path cablePath) {
        int netWinding = 0;
        Set<Integer> rodCrossoverKeys = new HashSet<>();
        
        Map<Integer, Integer> rodPathMap = new HashMap<>();
        for (int i = 0; i < rodPath.points.size(); i++) {
            rodPathMap.put(rodPath.points.get(i)[0] * M + rodPath.points.get(i)[1], i);
        }

        for (int i = 1; i < cablePath.points.size(); i++) {
            int[] current = cablePath.points.get(i);
            int[] previous = cablePath.points.get(i - 1);
            int currentKey = current[0] * M + current[1];
            
            if (grid[current[0]][current[1]] != '.') {
                
                if (rodPathMap.containsKey(currentKey) && rodCrossoverKeys.add(currentKey)) {
                    
                    int rodIndex = rodPathMap.get(currentKey);

                    int cableDirR = current[0] - previous[0];
                    int cableDirC = current[1] - previous[1];
                    
                    int[] rodPrev = rodPath.points.get((rodIndex - 1 + rodPath.points.size()) % rodPath.points.size());
                    int[] rodNext = rodPath.points.get((rodIndex + 1) % rodPath.points.size());
                    
                    int rodDirR = rodNext[0] - rodPrev[0];
                    int rodDirC = rodNext[1] - rodPrev[1];

                    char status = grid[current[0]][current[1]];
                    
                    int crossProduct = (cableDirC * rodDirR) - (cableDirR * rodDirC);

                    int winding = 0;
                    if (crossProduct != 0) {
                        int geometricSign = (crossProduct > 0) ? 1 : -1;
                        
                        if (status == 'C') {
                            winding = geometricSign;
                        } else {
                            winding = -geometricSign;
                        }
                    }

                    netWinding += winding;
                }
            }
        }

        return netWinding;
    }
}