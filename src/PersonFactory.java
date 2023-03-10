import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if(allPersons.isEmpty()){ //if no one in allPersons arraylist yet
            allPersons.add(person);
            return;
        }
        for (int i = 0; i < allPersons.size(); i++){
            if(allPersons.get(i).getLastName().compareTo(person.getLastName())==1){
                allPersons.add(i, person);
                System.out.println(i);
                return;
            }
        }

        allPersons.add(person); //if no last name in allPersons is lexicographically larger than person, add person to end
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> minor = new ArrayList<>();
        for (int i = 0; i < allPersons.size(); i++){
            if(allPersons.get(i).getAge()<18){
                minor.add(allPersons.get(i));
            }
        }
        return minor;
    }

    public boolean checkLastName(String lastName) {
        for (int i = 0; i < allPersons.size(); i++){
            if(allPersons.get(i).getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
}
