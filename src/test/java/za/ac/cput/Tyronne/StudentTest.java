package za.ac.cput.Tyronne;
/*
 * @Name: Tyronne Lloyd Hendricks
 * @Student Number: 215141210
 * @Date: 05/05/2021
 * @Description: Collection classes and Junit Testing
 */
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//TestMethodOrder allows you to specify in which order you would like to run your Test using @Order(int)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentTest {
    //Creating my Collections
    private ArrayList myArrayList = new ArrayList();
    private Map myMap = new HashMap();
    private Set mySet = new HashSet();
    private Collection<Student> myCollection = new LinkedList<>();
    //Creating Students with a builder class
    static final Student ApplicationsDevelopment1 = new Student.studentBuilder().setName("Tyronne").setStudentNumber("215141210").setEmail("215141210@mycput.ac.za").build();
    static final Student ApplicationsDevelopment2 = new Student.studentBuilder().setName("Abdul").setStudentNumber("216118905").setEmail("216118905@mycput.ac.za").build();
    static final Student CommunicationsNetwork1 = new Student.studentBuilder().setName("Wajedien").setStudentNumber("216287820").setEmail("216287820@mycput.ac.za").build();
    static final Student CommunicationsNetwork2 = new Student.studentBuilder().setName("Ian").setStudentNumber("216250773").setEmail("216250773@mycput.ac.za").build();
    static final Student BusinessAnalysis1 = new Student.studentBuilder().setName("Grant").setStudentNumber("215138848").setEmail("215138848@mycput.ac.za").build();
    static final Student BusinessAnalysis2 = new Student.studentBuilder().setName("Rick").setStudentNumber("219014337").setEmail("219014337@mycput.ac.za").build();
    static final Student Multimedia1 = new Student.studentBuilder().setName("Asiphiwe").setStudentNumber("218336675").setEmail("218336675@mycput.ac.za").build();
    static final Student Multimedia2 = new Student.studentBuilder().setName("Elrich").setStudentNumber("218150040").setEmail("218150040@mycput.ac.za").build();

    @Test
    @Order(1)
      void addListTest(){
            assertEquals(0,myArrayList.size());
            myArrayList.add(ApplicationsDevelopment1);
            myArrayList.add(ApplicationsDevelopment2);
            assertEquals(2,myArrayList.size());
            System.out.println("Applications Development Students added: " + myArrayList);
}
    @Test
    @Order(2)
    public void findListTest(){
        myArrayList.add(ApplicationsDevelopment1);
        myArrayList.add(ApplicationsDevelopment2);
        for(Object student: myArrayList){
            if(student.equals(ApplicationsDevelopment1)){
                    assertEquals(student,ApplicationsDevelopment1);
                    System.out.println(ApplicationsDevelopment1);
            }
        }
    }
    @Test
    @Order(3)
    void removeListTest(){
        myArrayList.add(ApplicationsDevelopment1);
        myArrayList.add(ApplicationsDevelopment2);
        assertEquals(2,myArrayList.size());
        assertTrue(myArrayList.remove(ApplicationsDevelopment2));
        System.out.println("1 Student Removed");
        System.out.println("Applications Development Student removed: " + myArrayList);
    }
    @Test
    @Order(4)
    void addMapTest(){
        assertEquals(0,myMap.size());
        myMap.put(CommunicationsNetwork1.getStudentNumber(),CommunicationsNetwork1);
        myMap.put(CommunicationsNetwork2.getStudentNumber(),CommunicationsNetwork2);
        assertEquals(2,myMap.size());
        System.out.println("Communications Network Students added: " + myMap);
    }
    @Test
    @Order(5)
    public void findMapTest(){
        myMap.put(CommunicationsNetwork1.getStudentNumber(),CommunicationsNetwork1);
        myMap.put(CommunicationsNetwork2.getStudentNumber(),CommunicationsNetwork2);
        for(Object student: myMap.values()){
            if(student.equals(CommunicationsNetwork1)){
                assertEquals(student,CommunicationsNetwork1);
                System.out.println(CommunicationsNetwork1);
            }
        }
    }
    @Test
    @Order(6)
    void removeMapTest(){
        myMap.put(CommunicationsNetwork1.getStudentNumber(),CommunicationsNetwork1);
        myMap.put(CommunicationsNetwork2.getStudentNumber(),CommunicationsNetwork2);
        System.out.println(myMap);
        myMap.remove(CommunicationsNetwork2.getStudentNumber());
        assertEquals(1,myMap.size());
    }
    @Test
    @Order(7)
    void addSetTest(){
        assertEquals(0,mySet.size());
        mySet.add(BusinessAnalysis1);
        mySet.add(BusinessAnalysis2);
        assertEquals(2,mySet.size());
        System.out.println("Business Analysis Students added: " + mySet);
    }
    @Test
    @Order(8)
    public void findSetTest(){
        mySet.add(BusinessAnalysis1);
        mySet.add(BusinessAnalysis2);
        for(Object student: mySet){
            if(student.equals(BusinessAnalysis1)){
                assertEquals(student,BusinessAnalysis1);
                System.out.println("Business Analysis Student" +BusinessAnalysis1);
            }
        }
    }
    @Test
    @Order(9)
    void removeSetTest(){
        mySet.add(BusinessAnalysis1);
        mySet.add(BusinessAnalysis2);
        System.out.println("Current Set: "+ mySet);
        mySet.remove(BusinessAnalysis1);
        assertEquals(1,mySet.size());
        System.out.println("1 student removed, new Set: " + mySet);
    }
    @Test
    @Order(10)
    void addCollectionTest(){
        assertEquals(0, myCollection.size());
        myCollection.add(Multimedia1);
        myCollection.add(Multimedia2); 
        assertEquals(2, myCollection.size());
        System.out.println("Multimedia Students added: " +  myCollection);
    }
    @Test
    @Order(11)
    public void findCollectionTest(){
        myCollection.add(Multimedia1);
        myCollection.add(Multimedia2);
        for(Object student:  myCollection){
            if(student.equals(Multimedia1)){
                assertEquals(student,Multimedia1);
                System.out.println("Multimedia Student " + Multimedia1);
            }
        }
    }
    @Test
    @Order(12)
    void removeCollectionTest(){
        myCollection.add(Multimedia1);
        myCollection.add(Multimedia2);
        System.out.println("Current Collection: "+  myCollection);
        myCollection.remove(Multimedia1);
        assertEquals(1, myCollection.size());
        System.out.println("1 student removed, new Collection: " +  myCollection);
    }
}//end