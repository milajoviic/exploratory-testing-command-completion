package readOnly;

public class PersonReadOnly {
    private String name;
    private int age;

    public PersonReadOnly(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonReadOnly(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonReadOnly{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int ageUp()
    {
        int result;
        try
        {
            this.age++;
            result = this.age;
        }
        catch(Exception e)
        {
            result = this.age;
            System.out.println("Error");
        }
        return result;
    }
}
