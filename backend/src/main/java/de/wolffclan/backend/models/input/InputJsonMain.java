package de.wolffclan.backend.models.input;

public record InputJsonMain(
        String guid,
        String title,
        int index,
        long dateAdded,
        long lastModified,
        int id,
        int typeCode,
        String type,
        String root
) {
}
