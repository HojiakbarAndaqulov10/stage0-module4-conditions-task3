package school.mjc.stage0.conditions.task3;

public class Seasons {
    public  void tellTheSeasonByMonthNumber(int month) {
        switch (month){
            case 1: case 12:
                System.out.println("Winter");
                break;
            case 3: case 5:
                System.out.println("Spring");
                break;
            case 6: case 8:
                System.out.println("Summer");
                break;
            case 9: case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("wrong number!");
        }
       /* if (month >= 1 && month <= 12){
            if (month >= 3 && month <= 5) {
                System.out.println("Spring");
            } else if (month >= 6 && month <= 8) {
                System.out.println("Summer");
            } else if (month >= 9 && month <= 11) {
                System.out.println("Autumn");
            } else {
                System.out.println("Winter");
            }
        } else {
            System.out.println("Wrong number!");
        }*/
    }

 /*   public static void main(String[] args) {
        tellTheSeasonByMonthNumber(12);
    }*/
}
