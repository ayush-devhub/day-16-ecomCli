package demo.ayush.ecomcli.persistence;

import java.util.List;

/**
 * Handles persistence for Users, Products, and Orders.
 * Currently CSV-based, later can swap to DB.
 */
public class FileService {
    public <T> void saveEntities(String filePath, List<T> entities) {
        // TODO: implement CSV serialization
    }

    public <T> List<T> loadEntities(String filePath, Class<T> clazz) {
        // TODO: implement CSV deserialization
        return null;
    }
}