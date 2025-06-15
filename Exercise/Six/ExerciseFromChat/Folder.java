import java.util.Iterator;

public class Folder implements Iterable<String> {
    private File[] files;
    private int counter;

    public Folder(int size) {
        files = new File[size];

    }

    public void addFile(File f) {
        if (counter < files.length) {
            files[counter++] = f;
        }
    }

    @Override
    public Folder clone() {
        try {
            Folder cloned = (Folder) super.clone(); // שיבוט רדוד של Folder

            // יצירת מערך חדש ושיבוט כל קובץ
            cloned.files = new File[this.files.length];
            for (int i = 0; i < this.counter; i++) {
                if (this.files[i] != null)
                    cloned.files[i] = this.files[i].clone();
            }

            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public class FolderIterator implements Iterator<String> {
        int fileIndex;
        File.FileIterator fileIterator;

        public FolderIterator() {
            this.fileIndex = 0;
            this.fileIterator = files[fileIndex].new FileIterator(files[fileIndex]);
        }

        boolean fileHaveMoreWords() {
            return (fileIterator.hasNext());
        }

        public String next() {
            if (fileHaveMoreWords()) {
                return fileIterator.next();
            } else {
                // do we have another file?
                if (fileIndex < counter) {
                    // we have another file. let's use it
                    fileIndex++;
                    this.fileIterator = files[fileIndex].new FileIterator(files[fileIndex]);
                    return next();
                }
            }
            throw new RuntimeException("end of iterator");
        }

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return fileHaveMoreWords();
        }

    }

    @Override
    public Iterator<String> iterator() {
        // TODO Auto-generated method stub
        return new FolderIterator();
    }

}