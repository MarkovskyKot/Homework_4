public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age=7;
        boolean ageControl=age>=18;
        if (ageControl){
            System.out.println("Возраст человека "+age+" - он совершеннолетний");
        }
        else{
            System.out.println("Возраст человека "+age+" - он не достиг совершеннолетия, нужно немного подождать");
        }
        age=27;
        ageControl=age>=18;
        //Чтобы срабатывало новое значение переменной age, надо также написать переменную ageControl
        if (ageControl){
            System.out.println("Возраст человека "+age+" - он совершеннолетний");
        }
        else{
            System.out.println("Возраст человека "+age+" - он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
        //Задача 2
        int temperature=6;
        int windSpeedMeterPerSec=3;
        if(temperature<=5||windSpeedMeterPerSec>=7){
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println();
        //Задача 3
        int rideSpeed=57;
        if(rideSpeed>60){
            System.out.println("Если скорость "+rideSpeed+", то придется заплатить штраф");
        }
        else{
            System.out.println("Если скорость "+rideSpeed+", то можно ездить спокойно");
        }
        System.out.println();
        //Задача 4
        int humanAge=42;
        if (humanAge>=2 && humanAge<=6){
            System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить в детсад");
        }
        else if (humanAge>=7 && humanAge<=17){
            System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить в школу");
        }
        else if (humanAge>=18 && humanAge<=24){
            System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить в университет");
        }
        else{
            System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить на работу");
        }
        //Задача 5
        int childAge=14;
        if (childAge<5){
            System.out.println("Если возраст ребенка равен "+childAge+", ему нельзя кататься на аттракционе");
        }
        else if (childAge>=5 && childAge<14){
            System.out.println("Если возраст ребенка равен "+childAge+", ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else{
            System.out.println("Если возраст ребенка равен "+childAge+", ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
        //Задача 6
        int engagedPlaces=57;
        if (engagedPlaces>=0 && engagedPlaces<60){
            System.out.println("В вагоне есть сидячие места");
        }
        else if (engagedPlaces>=60 && engagedPlaces<102) {
            System.out.println("В вагоне остались только стоячие места");
        }
        else if (engagedPlaces==102){
            System.out.println("Вагон полностью забит");
        }
        //Задача 7
        int one=415;
        int two=213;
        int three=714;
        if (one>two && one>three){
            System.out.println("Число 'one' - "+one+" - большее");
        } else if (two>one && two>three) {
            System.out.println("Число 'two' - "+two+" - большее");
        } else if (three>one && three>two) {
            System.out.println("Число 'three' - "+three+" - большее");
        }
    }
}