class ComplexNumber {
    private double val;     // действительная часть числа
    private double im;      // мнимая часть

    ComplexNumber (double val,double im){
        this.val = val;
        this.im = im;
    }

    ComplexNumber (ComplexNumber complexNumber){
        this(complexNumber.val,complexNumber.im);

    }

    static ComplexNumber sum (ComplexNumber a,ComplexNumber b) {
        return new ComplexNumber(a.val+b.val,a.im+b.im);
    }
    static ComplexNumber diff (ComplexNumber a,ComplexNumber b) {
        return new ComplexNumber(a.val-b.val,a.im-b.im);
    }

    static ComplexNumber squaring (ComplexNumber x) {
        return new ComplexNumber(Math.pow(x.val,2)- Math.pow(x.im,2),2*x.val*x.im);
    }
    static ComplexNumber sqrt (ComplexNumber x) {
        double a = x.module()/2;
        return new ComplexNumber(Math.sqrt(a + x.getVal() / 2), Math.signum(x.getIm()) * Math.sqrt(a - x.getVal() / 2));

    }

    private double module(){
        return Math.sqrt(this.val * this.val + this.im * this.im);
    }

    @Override
    public String toString() {
        String str ;
        System.out.print("Расстояние = : ");
        if (im<0) {
            str =  String.format("%4.2f - %4.2fi", val, im*-1);
        }
        else {
            str =  String.format("%4.2f + %4.2fi", val, im);

        }
        return str;
    }

    private double getVal() {
        return val;
    }

    private double getIm() {
        return im;
    }
}
