class Model {
    private int num;
    private int inc;
    private int dec;
    Model(int num, int inc, int dec) {
        this.num = num;
        this.inc = inc;
        this.dec = dec;
    }
    void printModel() {
        System.out.println(num + " " + inc + " " + dec);
    }
}