# Year-11-CS-Unit-7-Arraylists-Quiz-Person

Ensure that you read all instructions carefully. Do not include any additional methods that are not specified in this quiz description. Think carefully about your solution before writing anything down. Write your answers neatly - take pride in your work! Good luck, have fun! :)

1. Inside the Person class, implement a constructor. The constructor should have three parameters and these parameters should be used to initialize the state of a Person object. 
(1 mark)

2. Inside the Person class, implement getter methods for each of the three properties. 
(1 mark)

3. Inside the Person class, implement setter methods for each of the three properties. 
(1 mark)

4. Inside the Person class, implement a toString method. 
(1 mark)

5. Inside the PersonFactory class, complete the method addPerson. This method will take a Person object and add it to the allPersons list. The Person object will be added to the position in the list corresponding to their last name. That is, the allPersons list will be in ascending alphabetical order according to the last name of the Person objects stored in the allPersons list. For example:

allPersons = [person1, person2, person3, person4]

Person1:
    lastName = “Jacobson”
Person2:
    lastName = “Jammerson”
Person3
    lastName = “Lam”
Person4
    lastName = “Monka”
Person person5 = new Person(“Jacob”, “Lanson”, 19);

addPerson(person5);

allPersons = [person1, person2, person3, person5, person4]

To know which index to insert the person object into in allPersons, you may use the compareTo method in the String class. The compareTo method will return one of three integer values: -1, 0, or +1 depending on the two strings being compared. 

Example:

String str1 = “Lam”;
String str2 = “Lan”;
String str3 = “Lam”;

str1.compareTo(str2); 	    // Will return -1 because Lam is less than Lan (lexicographically).
str2.compareTo(str1);	    // Will return +1 because Lan is greater than Lan (lexicographically).
str1.compareTo(str3); 	    // Will return 0 because Lam and Lam are equivalent strings. 

6. Inside the PersonFactory class, complete the method under18. This method will return a new arraylist containing all the person’s that are under the age of 18. 

7. Inside the PersonFactory class, complete the method checkLastName. This method will return a boolean depending on whether the allPersons list contains a person whose last name is equal to the argument (actual parameter) that is passed to the method. 
