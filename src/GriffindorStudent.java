public class GriffindorStudent extends BaseHogwartsStudent {
    private int nobility;
    private  int honor;
    private int courage;

    public GriffindorStudent(String name, int magic, int transgression, int nobility, int honor, int courage) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    private int amountCharacteristicsGriffindorStudent (){
        return nobility + honor + courage;
    }
    public void comparisonGriffindorStudent (GriffindorStudent griffindorStudent){
        int studentOne = amountCharacteristicsGriffindorStudent();
        int studentTwo = griffindorStudent.amountCharacteristicsGriffindorStudent();
        if (studentOne < studentTwo) {
            System.out.println( " студент с именем  " + griffindorStudent.getName() +
                    " лучший Гриффондорец чем " + getName()) ;
        } else if (studentOne > studentTwo) {
            System.out.println( " студент с именем  " + getName()  +
                    " лучший Гриффондорец чем  " + griffindorStudent.getName()) ;
        } else {
            System.out.println( " студент с именем  " + griffindorStudent.getName() +
                    " в Гриффондоре равен студенту " + getName()) ;
        }
    }
    @Override
    public String toString() {
        return "Студент Griffindor" +
                " по имени " + super.getName() + ",  " +
                " имеет магии = " + super.getMagic() + ",  " +
                " трангресии = " + super.getTransgression() + ",  " +
                " благородства = " + nobility + ",  " +
                " чести = " + honor + ",  " +
                " храбрости = " + courage + ". ";
    }
    public void print(){
        System.out.println(this);
    }
}
