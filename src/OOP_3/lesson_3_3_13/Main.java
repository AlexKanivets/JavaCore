package OOP_3.lesson_3_3_13;

import static OOP_3.lesson_3_3_13.Main.Robot.moveRobot;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot(-4,-3, Direction.DOWN);
        moveRobot(robot, 3, 0);
        int x = robot.getX();
        int y = robot.getY();
        System.out.println(x+","+y);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    public static class Robot {
        int x;
        int y;
        Direction direction;

        public Robot (int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            System.out.println("Поворот против часовой стрелки");
            if (direction == Direction.DOWN){
                this.direction = Direction.RIGHT;
                return;
            }

            if (direction == Direction.UP){
                this.direction = Direction.LEFT;
                return;
            }

            if (direction == Direction.LEFT){
                this.direction = Direction.DOWN;
                return;
            }

            if (direction == Direction.RIGHT){
                this.direction = Direction.UP;
                return;
            }
        }

        public void turnRight() {
            System.out.println("поворот по часовой стрелке");
            if (this.direction == Direction.DOWN){
                System.out.println("Вниз -> влево");
                this.direction = Direction.LEFT;
                return;
            }

            if (this.direction == Direction.UP){
                System.out.println("Вверх -> вправо");
                this.direction = Direction.RIGHT;
                return;
            }

            if (this.direction == Direction.LEFT){
                System.out.println("Влево -> вверх");
                this.direction = Direction.UP;
                return;
            }

            if (this.direction == Direction.RIGHT){
                System.out.println("Вправо -> вниз");
                this.direction = Direction.DOWN;
                return;
            }
        }

        public void stepForward() {
            System.out.println("движение");
            if (direction == Direction.DOWN){
                System.out.println("вниз");
                this.y--;
            }

            if (direction == Direction.UP){
                System.out.println("вверх");
                this.y++;
            }

            if (direction == Direction.LEFT){
                System.out.println("налево");
                this.x--;
            }

            if (direction == Direction.RIGHT){
                System.out.println("направо");
                this.x++;
            }
        }
        public static void moveRobot(Robot robot, int toX, int toY) {
            if (toX < robot.getX()) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else if (toX > robot.getX()) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
            if (toY < robot.getY()) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else if (toY > robot.getY()) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}



