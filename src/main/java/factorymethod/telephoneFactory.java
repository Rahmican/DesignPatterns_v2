package factorymethod;

public class telephoneFactory {

    public static telephone buildTelephone(final String type){
        if (type.equals("Apple")) {
            return new Apple();
        } else if (type.equals("Samsung")) {
            return new Samsung();
        } else {
            throw new RuntimeException("Unkown Type ! ");
        }
    }

}
