package Exercise.Six.ExerciseFromChat;

public class File implements Cloneable {
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public File clone() throws CloneNotSupportedException {
        return (File) super.clone();
    }

    public String[] toArray() {
        return content.split(" ");
    }
}
