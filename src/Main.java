public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1");
        int age = 11;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " то он достиг совершшеннолетия. ");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно подождать.");
        }
        System.out.println(" Задача 2 ");
        int temperature = 3;
        if (temperature <= 5) {
            System.out.println(" На улице холодно " + temperature + " градусов, нужно надеть шапку ");
        } else {
            System.out.println(" На улице тепло  " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println(" Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println(" Если скорость равна " + speed + " км/ч, то придется заплатить штраф. ");
        } else {
            System.out.println(" Если скорость равна " + speed + " км/ч, то можно ездитьспокойно. ");
        }
        System.out.println(" Задача 4 ");
        int ageHuman = 66;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println(" Если возраст человека равен " + ageHuman + ",то ему нужно ходить в детский сад. ");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println(" Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу. ");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то его место в университете. ");
        }
        if (ageHuman > 24) {
            System.out.println(" Если возраст человека равен " + ageHuman + ", то ему пора  ходить на работу. ");
        }
        System.out.println(" Задача 5");
        int ageKids = 9;
        int mature = 1;
        boolean matureYes = mature > 0;
        if (ageKids < 5 || (ageKids >= 5 && ageKids < 14 && !matureYes)) {
            System.out.println("Если возраст ребенка равен " + ageKids + " то ему нельзя кататься на аттракционе.");
        } else if (ageKids >= 5 && ageKids < 14 && matureYes) {
            System.out.println("Если возраст ребенка равен " + ageKids + ", то ему можно кататься в сопровождении.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageKids + ", то ему можно кататься без сопровождения взрослого.");
        }


        System.out.println(" Задача 6 ");
        int sitPlace = 60;
        int personSequence = 103 ;
        int allPlace = 102;
        if (personSequence > allPlace) {
            System.out.println("Вагон занят полностью.");}
        else if (personSequence > sitPlace){
            System.out.println("В вагоне есть стоячее место.");}
        else {
            System.out.println("В вагоне есть сидячее место.");}
        System.out.println("Задача 7");
        int one = 88;
        int two = 4;
        int three = 666;
        if (one > two && one > three) {
            System.out.println(one + " Наибольшее число ");}
        else if (two > three) {
            System.out.println(two + " наибольшее число ");}
        else {
            System.out.println(three + " наибольшоее чилсо ");}



    }

}
