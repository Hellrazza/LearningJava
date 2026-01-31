public class ArchiveItem {
    private String identifier;
    private String name;

    public ArchiveItem(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return identifier + ": " + name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if(!(other instanceof ArchiveItem)) {
            return false;
        }

        ArchiveItem otherArchiveItem = (ArchiveItem) other;

        return identifier.equals(otherArchiveItem.identifier);
    }
}
