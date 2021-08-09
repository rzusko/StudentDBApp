import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    private String name;
    private List<Student> database;

    public StudentDatabase(String name) {
        this.name = name;
        this.database = new ArrayList<>();
    }

    public StudentDatabase(String name, File file) {
        this(name);
        loadDatabase(file);
    }

    public void loadDatabase(String fileName) {

    }

    public void loadDatabase(File file) {

    }

    public void saveDatabase(File file) {

    }

    public void saveDatabase(String fileName) {

    }

}
