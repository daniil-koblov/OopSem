package jobagency;

public class Man implements Observer{

    String name;

    int salary;

    public Man(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary){
        if(this.salary <= salary){
            System.out.println("Идем на работу.");
        }
        else System.out.println("Не согласен на работу.");
    }
}
