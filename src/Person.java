public class Person {
    // instance variable bir sınfın içindeki değişkenlerdir. Örneğin "Person" bir class ve kişinin adı,soyadı gibi özellikler "instance variable" dır.
    String firstName; // default değeri "null" dır.
    String lastName; // default değeri "null" dır.
    int age; // default değeri 0 dır.
    double salary; // default değeri 0.0 dır.
    boolean isMarried; // default değeri "false" dır.
    String[] hobbies;

    // eğer herhangi bir constructor oluşturmassak java da default bir constructor var
    // şu şekilde --->  public Person(){}


    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary, boolean isMarried, String[]hobbies){
        this(firstName,lastName,age); // bu bir constructor chaining dir. Bu şekilde kod tekrarrından kurtuluyoruz.
        this.salary = salary <11500 ? 11500 : salary;

        /*
        if(salary <11500){
            this.salary =11500;
        } else {
            this.salary = salary;
        }
         */

        this.salary = salary;
        this.isMarried = isMarried;
        this.hobbies = hobbies;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;
    }

    public double getSalary(){
        return this.salary;
    }

    public boolean isMarried(){
        return this.isMarried;
    }

    public String[] getHobbies(){
        return this.hobbies;
    }

}
// this.firstName oluşturduğumuz class ait olan firstName anlamına gelir.

// this.firstName = firstName sağdaki firstName value dır yani parametre; soldaki mevcyt class ın feature dır.

// constructor ın bir diğer anlamı kurucu method'dur. Oluşturduğumuz sınıfın yeni bir örneğinin başlatılmasını ve başlangıç durumunun ayarlanmasını sağlarlar.

// Bir den fazla constructor olabilir.

// Overloading
//aynı isme sahip fakat farklı parametre listesine sahip bir den fazla constructor'ı aynı sınıf içinde tanımlamaktır.

// constructor chaining
// oluşturduğumuz sınıf içindeki bir constructor ın başka bir constructor'ı çağırmasıdır.