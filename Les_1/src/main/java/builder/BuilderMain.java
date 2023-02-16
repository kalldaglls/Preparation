package builder;

public class BuilderMain {
    public static void main(String[] args) {
        Person personBuilder = Person.newBuilder()
                .setAddress("Address")
                .setAge(20)
                .setGender("Male")
                .build();

        System.out.println(personBuilder);
    }
}
