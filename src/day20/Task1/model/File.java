package day20.Task1.model;

public class File {
    private String name;
    private int size;
    private TypeFile type;

    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public TypeFile getType() {
        return type;
    }

    public File(String name, int size, TypeFile type){
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString(){
        return """
                Имя файла: %s
                Размер файла: %d Mb
                Тип файла: %s
                """.formatted(name, size,type);
    }
}
