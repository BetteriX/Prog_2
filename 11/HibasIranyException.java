public class HibasIranyException extends Exception {
    private int hibakod;

    public HibasIranyException(int hibakod, String message) {
        super(message);
        this.hibakod = hibakod;
    }

    public int getHibakod() {
        return this.hibakod;
    }

}