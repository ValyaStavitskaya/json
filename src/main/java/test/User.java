package test;

public class User {
    private String lastName;
    private int age;

    public User(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }


    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
