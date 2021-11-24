package OOP_3.lesson_3_4_8;

public final class ComplexNumber {

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1); //первый объект с параметрами для проверки
        //поиграйтесь с параметрами
        ComplexNumber b = new ComplexNumber(1, 1); //второй объект с параметрами для проверки

        System.out.println(a.equals(b)); //  вывод
        System.out.println(a.hashCode()); //       для
        System.out.println(b.hashCode()); //            проверки
    }


    private final double re;
    private final double im;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        long t = Double.doubleToLongBits(getRe());
        int result = prime + (int) (t ^ (t >>> 32));
        t = Double.doubleToLongBits(getIm());
        result = prime * result + (int) (t ^ (t >>> 32));
        return result;
    }

    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;

    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

}
