public class Wall {
    private double width, height;

    public Wall(double width, double height){
        // buradaki amaç kullanıcı negatif bir değer girer ise düzeltilmesi için...
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    // set yapılarının içine kullancağımız yapıyı eklememiz lazım çünkü dışarıdan bir değer alıp mevcut değeri değiştirir.
    public void setWidth(double width){
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height){
        this.height = height < 0 ? 0 : height;
    }

    // fakat getArea gibi yapılarda dışarıdan veri almamıza gerek yok yani --> getArea(double width, double height) yazmamıza gerek yok çünkü yukarıda bu değerler tanımlanmıştır.
    public double getArea(){
        return this.height * this.width;
    }

}
