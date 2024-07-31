package org.furkan_classes;
import java.util.HashMap;
import java.util.Map;

public class LibrarySystem {
    private Map<String, Library> libraries;

    public LibrarySystem() {
        libraries = new HashMap<>();
    }

    public void addLibrary(Library library) {
        libraries.put(library.getName(), library);
    }

    public Library getLibrary(String name) {
        return libraries.get(name);
    }

    public void printLibraryDetails() {
        for (Library library : libraries.values()) {
            System.out.println(library);
        }
    }
}

