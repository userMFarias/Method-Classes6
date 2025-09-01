public class Exercise6
{
        public static void main(String [] args)
        {
                Employee empl = new Employee("Steve");
                IdCard newId = new IdCard(empl);

                if(empl.getID ().equals(newId))
                {
                        System.out.println("The two cards match");
                }
                else
                {
                System.out.println("The cards do not match");
                }
        }

}
class Employee
{
        private String name;
        private IdCard id;
        public Employee(String name)
        {
                this.name = name;
                this.id = null;
        }

        public void setId(IdCard id)
        {
                this.id = id;
        }
        public String getName ()
        {
                return this.name;
        }
        public IdCard getID ()
        {
                return this.id;
        }
}
class IdCard
        {
                private String name;
                private int idNumber;
                private static int nextIdNumber ;
                public IdCard(Employee empl)
                {
                        this.name = empl.getName ();
                        idNumber = nextIdNumber;
                        empl.setId(this);
                        nextIdNumber ++;
                }
                public String getName ()
                 {
                         return this.name;
                 }
                 public int getidNumber ()
                 {
                         return this.idNumber;
                }

        }
