package _18_IO_binary_file_serialization.demo;

import java.io.Serializable;

public class Role implements Serializable {
    private int id;

    public Role(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                '}';
    }
}
