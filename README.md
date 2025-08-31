# Method-Classes6
 Imagine that you are tasked with programming a system that handles
the data of employees at a university. To enter some rooms in the building the employees need an
ID card, but the card takes some time to issue. Hence, when an employee is first registered into
the system they do not have an ID card. You are provided with two classes. The class Employee
has two variables: a variable name of type String and a variable id of class IdCard. The class
IdCard also has two variables: name (for the name of the employee who is the owner of the card)
and idNumber (an identifier for this particular card, like a passport number). Further it contains a
static variable nextIdNumber which should be incremented by one every time a new card is issued.
In the provided constructor for Employee, the id variable is set to null, as the card has not
been issued when we construct a new instance of that class. In the main method, we construct an
Employee empl with name “Steve”. When we create the ID card newId for empl, the constructor
takes as input empl. This should fill the variables of newId with the name of the employee and the
number of the card. We want to make sure that the ID card we just created is the ID card assigned
to the employee.
There are several tasks in this exercise:
1. Create getters for the class Employee.
2. Create a setter setIdCard for IdCard in empl.
3. Create a constructor for the class IdCard taking as parameter an Employee and setting the
variable name of idCard to the name of the employee, then setting idNumber to nextIdNum-
ber. Use the setter setIdCard to set the variable id of empl to the current object. What is
the keyword that we use for the current object?. What do we have to do with the variable
nextIdNumber?

4. Create getters for the class IdCard.
5. Compare the id card in the variable id in empl to the id card we just created. If they are
the same print “The two cards match”, and if they are not print “The cards do not match”.
You can use the method equals(Object object) to compare the two Id cards. (For two String
variables x and y, we would write x.equals(y).)
(Hint: the exercise is a bit easier if you perform the tasks in the given order.)
