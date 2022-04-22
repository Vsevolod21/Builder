import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = address;
    }

    public boolean hasAge() {
        return age > 0;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public boolean hasAddress() {
        return city != null;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return city;
    }

    @Override
    public String toString() {
        String ageInfo;
        if (age > 0) {
            ageInfo = String.valueOf(age);
        } else {
            ageInfo = "возраст не определен";
        }
        return "Имя - " + name + ", фамилия - " + surname +
                ", возраст - " + ageInfo + ", город проживания - " + city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(city);
    }
}

