class Cube {
    public char[][][] faces;
    private final int N;

    public Cube(char[][][] initialFaces, int N) {
        this.N = N;
        this.faces = deepCopy(initialFaces, N);
    }

    public void executeInstruction(String instruction) {
        String[] parts = instruction.split(" ");
        String cmd = parts[0];

        if (cmd.equals("turn")) {
            turn(parts[1]);
        } else if (cmd.equals("rotate")) {
            rotate(parts[1]);
        } else {
            int faceId = OrderIt.FACE_MAP.get(cmd);
            int index = Integer.parseInt(parts[1]) - 1;
            String direction = parts[2];
            rotateRowCol(faceId, index, direction);
        }
    }

    private void turn(String direction) {
        if (direction.equals("left")) {
            char[][] temp = faces[3];
            faces[3] = faces[5];
            faces[5] = faces[1];
            faces[1] = faces[4];
            faces[4] = temp;
            
            rotateFace(2, "right");
            rotateFace(0, "left");
        } else if (direction.equals("right")) {
            char[][] temp = faces[3];
            faces[3] = faces[4];
            faces[4] = faces[1];
            faces[1] = faces[5];
            faces[5] = temp;

            rotateFace(2, "left");
            rotateFace(0, "right");
        }
    }

    private void rotate(String direction) {
        switch (direction) {
            case "front":
                char[][] temp = faces[3];
                faces[3] = faces[2];
                faces[2] = faces[1];
                faces[1] = faces[0];
                faces[0] = temp;
                
                rotateFace(4, "right");
                rotateFace(5, "left");
                break;
            case "back":
                temp = faces[3];
                faces[3] = faces[0];
                faces[0] = faces[1];
                faces[1] = faces[2];
                faces[2] = temp;

                rotateFace(4, "left");
                rotateFace(5, "right");
                break;
            case "left":
                temp = faces[2];
                faces[2] = faces[5];
                faces[5] = faces[0];
                faces[0] = faces[4];
                faces[4] = temp;
                
                rotateFace(3, "left");
                rotateFace(1, "right");
                break;
            case "right":
                temp = faces[2];
                faces[2] = faces[4];
                faces[4] = faces[0];
                faces[0] = faces[5];
                faces[5] = temp;

                rotateFace(3, "right");
                rotateFace(1, "left");
                break;
        }
    }

    private void rotateRowCol(int faceId, int index, String direction) {
        
        if (faceId == 2) { 
            char[] tempRow = new char[N];
            
            if (direction.equals("left")) { 
                for (int c = 0; c < N; c++) tempRow[c] = faces[3][index][c];
                
                for (int c = 0; c < N; c++) faces[3][index][c] = faces[5][index][c];
                
                for (int c = 0; c < N; c++) faces[5][index][c] = faces[1][index][c];
                
                for (int c = 0; c < N; c++) faces[1][index][c] = faces[4][index][c];
                
                for (int c = 0; c < N; c++) faces[4][index][c] = tempRow[c];
            } else if (direction.equals("right")) { 
                // ... reverse shift logic ...
            }
        }
    }

    private void rotateFace(int faceId, String direction) {
        char[][] face = faces[faceId];
        char[][] rotated = new char[N][N];
        
        if (direction.equals("right")) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    rotated[c][N - 1 - r] = face[r][c];
                }
            }
        } else {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    rotated[N - 1 - c][r] = face[r][c];
                }
            }
        }
        faces[faceId] = rotated;
    }

    public boolean isSolved(int faceId) {
        char targetColor = faces[faceId][0][0];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (faces[faceId][r][c] != targetColor) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static char[][][] deepCopy(char[][][] original, int N) {
        char[][][] copy = new char[6][N][N];
        for (int f = 0; f < 6; f++) {
            if (original[f] != null) {
                for (int r = 0; r < N; r++) {
                    System.arraycopy(original[f][r], 0, copy[f][r], 0, N);
                }
            }
        }
        return copy;
    }
}