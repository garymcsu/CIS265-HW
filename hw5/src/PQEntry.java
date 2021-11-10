public class PQEntry {
    private Integer key;
    private String value;

    public PQEntry() {
        this(-1, null);
    }

    public PQEntry(Integer k, String v) {
        this.key = k;
        this.value = v;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(Integer k) {
        key = k;
    }

    public void setValue(String v) {
        value = v;
    }
}
