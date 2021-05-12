package za.ac.cput.Tyronne;
/*
 * @Name: Tyronne Lloyd Hendricks
 * @Student Number: 215141210
 * @Date: 05/05/2021
 * @Description: Collection classes and Junit Testing
 */
public class Student
{
    String name;
    String email;
    String studentNumber;

    private Student(studentBuilder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.studentNumber = builder.studentNumber;
    }

    public String getName() { return name;}
    public String getEmail() {return email;}
    public String getStudentNumber() {return studentNumber;}

    public static class studentBuilder{
        private String name, email, studentNumber;

        public studentBuilder setName(String name){
            this.name = name;
            return this;
        }
        public studentBuilder setEmail(String email){
            this.email = email;
            return this;
        }
        public studentBuilder setStudentNumber(String studentNumber ){
            this.studentNumber = studentNumber;
            return this;
        }
        public  Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString(){
        return "Name: " +name+ " Email: " +email+ " Student Number: " +studentNumber  + "\n";
    }


}

