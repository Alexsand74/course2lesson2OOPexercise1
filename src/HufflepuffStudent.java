public class HufflepuffStudent extends BaseHogwartsStudent {
    private int smart;
    private  int wise;
    private int witty;

    private int creation;

    public HufflepuffStudent(String name, int magic, int transgression, int smart, int wise, int witty, int creation) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    private int amountCharacteristicsHufflepuffStudent (){
        return smart + wise + witty + creation;
    }
    public void comparisonHufflepuffStudent (HufflepuffStudent hufflepuffStudent){
        int studentOne = amountCharacteristicsHufflepuffStudent();
        int studentTwo = hufflepuffStudent.amountCharacteristicsHufflepuffStudent();
        if (studentOne < studentTwo) {
            System.out.println( " студент с именем  " + hufflepuffStudent.getName() +
                    " лучший в Пуффенде чем  " + getName()) ;
        } else if (studentOne > studentTwo) {
            System.out.println( " студент с именем  " + getName()  +
                    " лучший в Пуффенде чем  " + hufflepuffStudent.getName()) ;
        } else {
            System.out.println( " студент с именем  " + hufflepuffStudent.getName() +
                    " в Пуффендуе  равен студенту " + getName()) ;
        }
    }
    @Override
    public String toString() {
        return "Студент Hufflepuff" +
                " по имени " + super.getName() + ",  " +
                " имеет магии = " + super.getMagic() + ",  " +
                " трангресии = " + super.getTransgression() + ",  " +
                " ума = " + smart + ",  " +
                " мудрости = " + wise + ",  " +
                " остроумности = " + witty + ",  " +
                " творчества = " + creation + ". ";
    }
    public void print(){
        System.out.println(this);
    }
}
