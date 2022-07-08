public class SlytherinStudent extends BaseHogwartsStudent {
    private int power;
    private int resourcefulness;
    private int ambitiousness;
    private int decisiveness;
    private int cunning;

    public SlytherinStudent(String name, int magic, int transgression, int power, int resourcefulness,
                                                     int ambitiousness, int decisiveness, int cunning) {
        super(name, magic, transgression);
        this.power = power;
        this.resourcefulness = resourcefulness;
        this.ambitiousness = ambitiousness;
        this.decisiveness = decisiveness;
        this.cunning = cunning;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    private int amountCharacteristicsSlytherinStudent (){
        return power + resourcefulness + ambitiousness + decisiveness + cunning;
    }
    public void comparisonSlytherinStudent (SlytherinStudent slytherinStudent){
        int studentOne = amountCharacteristicsSlytherinStudent();
        int studentTwo = slytherinStudent.amountCharacteristicsSlytherinStudent();
        if (studentOne < studentTwo) {
            System.out.println( " студент с именем  " + slytherinStudent.getName() +
                    " лучший Слизонреновец чем " + getName()) ;
        } else if (studentOne > studentTwo) {
            System.out.println( " студент с именем  " + getName()  +
                    " лучший Слизонреновец чем  " + slytherinStudent.getName()) ;
        } else {
            System.out.println( " студент с именем  " + slytherinStudent.getName() +
                    " в Слизонренове равен студенту " + getName()) ;
        }
    }
    @Override
    public String toString() {
        return "Студент Slytherin" +
                " по имени " + super.getName() + ",  " +
                " имеет магии = " + super.getMagic() + ",  " +
                " трангресии = " + super.getTransgression() + ",  " +
                " хитрости = " + cunning + ",  " +
                " решительности = " + decisiveness + ",  " +
                " амбициозности = " + ambitiousness + ",  " +
                " находчивости = " + resourcefulness + ",  " +
                " власти = " + power + ". ";
    }
    public void print(){
        System.out.println(this);
    }
}
