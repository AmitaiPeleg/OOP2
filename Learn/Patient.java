package Learn;

public class Patient implements Comparable<Patient> {
private String name;
private int age;
private int urgency;
public Patient(String name, int age, int urgency) {
this.name = name;
this.age = age;
this.urgency = urgency;
}
public String toString(){
    return "(" + name + "," + age + ","+ urgency +")";
}

@Override
public int compareTo(Patient p) {
    if (urgency>p.urgency) {
        return 1;
    }
    else if (urgency<p.urgency) {
        return -1;
    } else{
        if (age>p.age) {
            return 1;
        }
        else if (age<p.age) {
            return -1;
        }
    }
    return 0;
}
}