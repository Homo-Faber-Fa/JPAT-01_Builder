public class Main {
    public static void main(String[] args) {
        try {
            Person mom=new PersonBuilder()
                    .setName("Анна")
                    .setSurname("Вольф")
                    .setAge(31)
                    .setAddress("Сидней")
                    .build();
            Person son=mom.newChildBuilder()
                    .setName("Антошка")
                    .setAge(11)
                    .build();
            System.out.println("У " + mom + " есть сын, " + son);

        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
           
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
