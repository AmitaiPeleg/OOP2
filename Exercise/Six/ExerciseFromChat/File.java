import java.util.Iterator;

public class File implements Cloneable, Iterable<String> {
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

    public class FileIterator implements Iterator {
        private String[] words;
        private Integer counter;

        public FileIterator(File f) {
            this.words = f.toArray();
            this.counter = 0;
        }

        public boolean hasNext() {
            return counter < words.length;
        }

        public String next() {
            if (!hasNext()) {
                throw new RuntimeException("no more words");
            }
            String out = words[counter];
            counter++;
            return out;
        }

    }

    @Override
    public Iterator<String> iterator() {
        // TODO Auto-generated method stub
        return new FileIterator(this);
    }
}
