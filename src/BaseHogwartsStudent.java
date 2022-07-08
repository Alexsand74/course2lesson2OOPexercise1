public abstract class BaseHogwartsStudent {
    private String name;
    private int magic;
    private int transgression;
    public BaseHogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
    private int amountCharacteristicsHogwartsStudent (){
        return magic + transgression;
    }

    public void comparisonHogwartsStudent (BaseHogwartsStudent baseHogwartsStudent){
        int studentOne = this.amountCharacteristicsHogwartsStudent();
        int studentTwo = baseHogwartsStudent.amountCharacteristicsHogwartsStudent();
        if (studentOne < studentTwo) {
            System.out.println( " студент с именем  " + baseHogwartsStudent.getName() +
                                   " лучше в Хогварде студента " + this.getName()) ;
        } else if (studentOne > studentTwo) {
            System.out.println( " студент с именем  " + this.getName()  +
                    " лучше в Хогварде студента " + baseHogwartsStudent.getName()) ;
        } else {
            System.out.println( " студент с именем  " + baseHogwartsStudent.getName() +
                    " в Хогварде равен студенту " + this.getName()) ;
        }
    }
    @Override
    public String toString() {
        return "Студент Hogwarts" +
                " по имени " + name + ",  " +
                " имеет магии = " + magic + ",  " +
                " а так же трангресии = " + transgression + ". ";
    }
    public void print(){
        System.out.println(this);
    }
}
