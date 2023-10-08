package de.wolffclan.backend.models.input;

public record InputJsonMaster(
        String guid,
        String title,
        int index,
        long dateAdded,
        long lastModified,
        int id,
        int typeCode,
        String type,
        String root,
        InputJsonMain[] main
) {
}
