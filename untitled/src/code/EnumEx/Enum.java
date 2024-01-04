package code.EnumEx;

public class Enum {

    enum Week {
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        //these are enum constants
        //they are all public static and final
        //since its final you cant use inheritance and create childs
        //type is Week
    }

    public static void main(String[] args) {

        Week weeks;
        weeks = Week.Tuesday;

        for (Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println("\n"+weeks);
        System.out.println("\n"+weeks.ordinal());
    }

}
