class Driver {
    public static Model createModel(int num) {
        int inc = num+1;
        int dec = num-1;
        return new Model(num, inc, dec);
    }
    public static void main(String[] args) {
        Model m1 = createModel(10);
        m1.printModel();
    }
}
