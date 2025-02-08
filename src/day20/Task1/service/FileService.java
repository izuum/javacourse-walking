package day20.Task1.service;

import day20.Task1.model.File;
import java.io.FileNotFoundException;

public class FileService {
    private final File[] files;

    public FileService(File[] files) {
        this.files = files;
    }

    public File findFile(String nameOfFile) throws FileNotFoundException {
        for (File file : files) {
            if (file.getName().equals(nameOfFile))  {
                return file;
            }
        }
        throw new FileNotFoundException("File not found");
    }
}
