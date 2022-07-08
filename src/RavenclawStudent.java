public class RavenclawStudent extends BaseHogwartsStudent {
    private int industrious;
    private  int loyalty;
    private int honest;


    public RavenclawStudent(String name, int magic, int transgression, int nobility, int loyalty, int courage) {
        super(name, magic, transgression);
        this.industrious = nobility;
        this.loyalty = loyalty;
        this.honest = courage;
    }

    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    private int amountCharacteristicsRavenclawStudent (){
        return industrious + loyalty + honest;
    }
    public void comparisonRavenclawStudent (RavenclawStudent ravenclawStudent){
        int studentOne = amountCharacteristicsRavenclawStudent();
        int studentTwo = ravenclawStudent.amountCharacteristicsRavenclawStudent();
        if (studentOne < studentTwo) {
            System.out.println( " студент с именем  " + ravenclawStudent.getName() +
                    " лучший в Когтевран чем   " + getName()) ;
        } else if (studentOne > studentTwo) {
            System.out.println( " студент с именем  " + getName()  +
                    " лучший в Когтевран чем " + ravenclawStudent.getName()) ;
        } else {
            System.out.println( " студент с именем  " + ravenclawStudent.getName() +
                    " в Когтевран равен студенту " + getName()) ;
        }
    }
    @Override
    public String toString() {
        return "Студент Ravenclaw" +
                " по имени " + super.getName() + ",  " +
                " имеет магии = " + super.getMagic() + ",  " +
                " трангресии = " + super.getTransgression() + ",  " +
                " тудолюбия = " + industrious + ",  " +
                " верности = " + loyalty + ",  " +
                " честности = " + honest + ". ";
    }
    public void print(){
        System.out.println(this);
    }
}
