package ant.one;

public class Phone {
    String model;
    String color;
    short member;
    int weight;

    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.model = "13";
        iphone.color = "black";
        iphone.member = 164;
        iphone.weight = 120;
        System.out.println("iphone" + ' ' + iphone.model + ' ' + iphone.color + ' ' + iphone.member
                + ' ' + "Gb" + ',' + ' ' + iphone.weight + "gr" );

        Phone iphone1 = new Phone();
        iphone1.model = "11";
        iphone1.color = "red";
        iphone1.member = 128;
        iphone1.weight = 150;
        System.out.println("iphone" + ' ' + iphone1.model + ' ' + iphone1.color + ' ' + iphone1.member
                + ' ' + "Gb" + ',' + ' ' + iphone1.weight + "gr" );

        Phone iphone2 = new Phone();
        iphone2.model = "12pro";
        iphone2.color = "black";
        iphone2.member = 256;
        iphone2.weight = 240;
        System.out.println("iphone" + ' ' + iphone2.model + ' ' + iphone2.color + ' ' + iphone2.member
                + ' ' + "Gb" + ',' + ' ' + iphone2.weight + "gr" );
    }
}
