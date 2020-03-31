package factorymethod;

public class Test {
    public static void main(final String[] args) {
        telephone phone = telephoneFactory.buildTelephone("Apple");
        System.out.println(phone.getTelephoneType());


        phone = telephoneFactory.buildTelephone("Samsung");
        System.out.println(phone.getTelephoneType());

    }
}
