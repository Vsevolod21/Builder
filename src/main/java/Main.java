public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(8)
                .build();
        System.out.println("У персонажа: " + mom + " есть сын: \n" + son);

        Person father = new PersonBuilder()
                .setName("Василий")
                .setSurname("Али-Баба")
                .setAge(48)
                .build();
        father.setAddress("Стамбул");
        System.out.println("Из города " + father.getAddress() +
                " приехал отец сына матери " + son.getName() + " по имени " + father.getName());
        System.out.println("Вот его данные: \n" + father);

        mom.happyBirthday();
        System.out.println(mom.getName() + " " + mom.getSurname() +
                " отметила днюху и ее данные слегка изменились: \n" + mom);

    }
}
