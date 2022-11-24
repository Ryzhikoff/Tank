public class Tank {
    private int x, y, dir, fuel;
    private static int countTank = 1;
    private int number;

    public Tank (){
        this(0,0,100);
    }

    public Tank (int x, int y) {
        this(x,y, 100);
    }

    public Tank (int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        number = countTank;
        countTank++;
    }

    public void goForward(int i) {
        dir = 0;
        move(i);
    }

    public void goBackward(int i) {
        dir = 2;
        move(i);
    }

    private void move (int i ) {
        i = checkFuel(i);
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }

    private int checkFuel(int i) {
        //Если ход больше чем топливо, то устанавливаем ход равным топливу
        if (Math.abs(i) > fuel) {
            //Если ход был со знаком МИНУС - меняем знак на минус
            i = i >= 0 ? fuel : fuel * (-1);
        }
        //уменьшаем топливо
        fuel -= Math.abs(i);
        return i;
    }

    public void printPosition() {
        System.out.println(String.format("The Tank T34-%d is at %d, %d now.", number, x,y));
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }
}
