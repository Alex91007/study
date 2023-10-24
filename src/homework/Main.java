package homework;

public class Main {

    private int i1;
    private char c1;
    private Double d1;
    private Boolean boo1;

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public char getC1() {
        return c1;
    }

    public void setC1(char c1) {
        this.c1 = c1;
    }

    public Double getD1() {
        return d1;
    }

    public void setD1(Double d1) {
        this.d1 = d1;
    }

    public Boolean getBoo1() {
        return boo1;
    }

    public void setBoo1(Boolean boo1) {
        this.boo1 = boo1;
    }

    public static void main(String[] args) {

        int x = 1547;
        float y = 1.944f;
        String str1 = " и ";
        System.out.println(x + str1 + y);
        x = (int)y;
        System.out.println(x);
        long c = 58264L;
        c = x;
        System.out.println(c);
        short s1 = 258;
        long l1 = 320;
        char c1;
        Character ch1 = 'R';
        System.out.println(s1 + str1 + l1);
        s1 = (short)l1;
        long lo2 = s1 + l1;
        System.out.println(lo2);
        c1 = (char)lo2;
        System.out.println(c1);
        var v = c1;
        System.out.println(v);

        Main main1 = new Main();
        main1.setI1(2);
        main1.setC1('S');
        main1.setD1(2.554d);
        main1.setBoo1(true);
        System.out.println(main1.getI1() + " " + main1.getC1() + " " + main1.getD1() + " " + main1.getBoo1());

        Variables ob = new Variables();
        ob.setB((byte)1);
        ob.setS((short)25);
        ob.setI(2654564);
        ob.setL(125246245L);
        ob.setF(2.25F);
        ob.setD(2.333F);
        ob.setBo(false);
        System.out.println(ob.getB() + " " + ob.getS() + " " + ob.getI() + " " + ob.getL() + " " + ob.getL() + " " +
                           ob.getF() + " " + ob.getD() + " " + ob.getBo());
        ob.setC('C');
        ob.setCc('D');
        System.out.println(ob.getC() + " " + ob.getCc());
        ob.setBb((byte)2);
        ob.setSs((short)30);
        ob.setIi(226445);
        ob.setLl(235454877L);
        ob.setFf(2.15F);
        ob.setDd(2.254D);
        ob.setBoo(true);
        System.out.println(ob.getBb() + " " + ob.getSs() + " " + ob.getIi() + " " + ob.getLl() + " " + ob.getFf() +
                           " " + ob.getDd() + " " + ob.getBoo());


   }
}
