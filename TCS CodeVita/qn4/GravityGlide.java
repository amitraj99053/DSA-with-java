import java.util.*;

public class GravityGlide {

    private static class Slide {
        double x1, y1, x2, y2;
        boolean isDownRight;
        double minX, maxX, minY, maxY;

        public Slide(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            
            this.minX = Math.min(x1, x2);
            this.maxX = Math.max(x1, x2);
            this.minY = Math.min(y1, y2);
            this.maxY = Math.max(y1, y2);
            
            // Determine if the slide goes down-right or down-left
            this.isDownRight = x2 > x1;
            
        }
        
        public boolean isOnOuterSide(double px, double py) {
            if (px < minX || px > maxX || py < minY || py > maxY) {
                return false;
            }
            
            // Handle vertical or near-vertical slides
            if (Math.abs(x2 - x1) < 1e-9) {
                return Math.abs(px - x1) < 1e-9;
            }
            
            double slope = (y2 - y1) / (x2 - x1);
            double expectedY = y1 + slope * (px - x1);
            
            return Math.abs(py - expectedY) < 1e-9;
        }

        // Helper method to calculate Euclidean distance to slide end
        private double getSlideDistance(double px, double py) {
            return Math.sqrt((px - x2) * (px - x2) + (py - y2) * (py - y2));
        }
    }

    public static void main(String[] args) {
        double currentX, currentY, energy;
        Slide[] slides;
        
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            
            slides = new Slide[N];
            for (int i = 0; i < N; i++) {
                slides[i] = new Slide(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            }
            
            currentX = scanner.nextDouble();
            currentY = scanner.nextDouble();
            energy = scanner.nextDouble();
        }

        boolean stuck = false;
        
        while (currentY > 0 && energy > 0) {
            
            Slide currentSlide = null;
            double slideDistance = 0;
            
            for (Slide slide : slides) {
                if (slide.isOnOuterSide(currentX, currentY)) {
                    if (slide.y2 < slide.y1) { 
                        currentSlide = slide;
                        slideDistance = slide.getSlideDistance(currentX, currentY);
                        break;
                    }
                }
            }

            if (currentSlide != null) {
                if (energy >= slideDistance) {
                    currentX = currentSlide.x2;
                    currentY = currentSlide.y2;
                    energy -= slideDistance;
                    stuck = false; 
                } else {
                    double remainingSlide = energy;
                    
                    if (currentSlide.isDownRight) {
                        currentX += remainingSlide;
                    } else {
                        currentX -= remainingSlide;
                    }
                    currentY -= remainingSlide;
                    energy = 0;
                }
                
            } else {
                
                double nextY = 0;
                Slide nextSlide = null;

                for (Slide slide : slides) {
                    if (currentX >= slide.minX && currentX <= slide.maxX) {
                        double slope = (slide.y2 - slide.y1) / (slide.x2 - slide.x1);
                        double expectedY = slide.y1 + slope * (currentX - slide.x1);
                        
                        if (expectedY < currentY && expectedY > nextY) {
                            nextY = expectedY;
                            nextSlide = slide;
                        }
                    }
                }
                
                if (!stuck) {
                    double dropDistance = currentY - nextY;
                    
                    if (dropDistance > 0) {
                        currentY = nextY;
                        energy -= dropDistance;
                    }
                    
                    if (nextSlide == null && currentY > 0) {
                        stuck = true;
                    } else if (nextSlide != null) {
                         if (!nextSlide.isOnOuterSide(currentX, currentY)) {
                             stuck = true;
                         }
                    }

                } else {
                    double cost = currentX * currentY;
                    
                    if (energy >= cost) {
                        energy -= cost;
                        stuck = false;
                    } else {
                        break;
                    }
                }
            }
        }
        
        System.out.printf("%d %d\n", (int)Math.round(currentX), (int)Math.round(currentY));
    }
}