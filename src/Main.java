/**
 * БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.
 * <p>
 * ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ
 * <p>
 * КЫЛЫП  ТУЗОСУЗДОР.
 * <p>
 * <p>
 * АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.
 * <p>
 * АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА
 * <p>
 * МЕТОДТОРУ БАР СУРОТТОГУДОЙ.
 * <p>
 * <p>
 * <p>
 * КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.
 * <p>
 * <p>
 * <p>
 * МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,
 * <p>
 * КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.
 */
public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Nurkyz", "Programmer", "Peakost ");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println();

        Dancer dancer = new Dancer("Aiza", "Dancer", "Light ");
        System.out.println(dancer);
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println();

        Singer singer = new Singer("Meerim", "singer", "Dymond");
        System.out.println(singer);
        singer.singing();
        
        singer.learn();
        singer.walk();
        singer.eat();
        System.out.println();


    }
}
