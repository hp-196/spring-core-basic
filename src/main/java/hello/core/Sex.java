package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sex {

    private String name;
    private int age;

    public static void main(String[] args) {
        Sex sex = new Sex();
        sex.setName("sexxx");
        sex.setAge(32);

        System.out.println(sex.toString());
        System.out.println(sex);
    }
}
