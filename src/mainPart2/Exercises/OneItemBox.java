public class OneItemBox extends Box {
    private Item item;

    public OneItemBox() {
        item = null;
    }

    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        }
    }

    public boolean isInBox(Item item) {
        return this.item.equals(item);
    }

}
