public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException("Не хватает данных: имени или фамилии");
        }
        Person person = new Person(name, surname, age, city);
        return person;
    }
}
