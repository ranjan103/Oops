import java.util.Scanner;

public class Lab73 {
    public static void main(String[] args){
        
        Student73 [] studentList=new Student73[100];
        Scanner input=new Scanner(System.in);
        int size=0;
        while(true){
            int flag;
            System.out.println("Enter\n1 for Admit Student\n2 for Migrate student" +
                    "\n3 for Display Details of student\n other to exit");
            flag=input.nextInt();
            if(flag==1){
                System.out.println( "Enter studentName , regNumber "
                        +"elective Course, average Marks ,hostelName,hostelLocatoin,number of rooms");
                studentList[size]=new Student73();
                studentList[size].studentName=input.next();
                studentList[size].regNumber=input.nextInt();
                studentList[size].electiveCourse=input.next();
                studentList[size].avgMatks=input.nextDouble();
                studentList[size].hostelName=input.next();
                studentList[size].hostelLocatoin=input.next();
                studentList[size].numberOfRooms=input.nextInt();
                size++;
            }
            else if(flag==2){
                System.out.println("Enter regNum of student to be migrated");
                int regNumber;
                regNumber=input.nextInt();
                int idx=search(studentList,regNumber,size);
                if(idx==size)
                    System.out.println("student does not exit");
                else {
                    System.out.println("Enter hostel name and holstel location and hostel room to be migrated");
                    String hostelName,hostelLocation;
                    int numberOfrooms;
                    hostelName=input.next();
                    hostelLocation=input.next();
                    numberOfrooms=input.nextInt();
                    studentList[idx].hostelName=hostelName;
                    studentList[idx].hostelLocatoin=hostelLocation;
                    studentList[idx].numberOfRooms=numberOfrooms;
                }
            }
            else if(flag==3){
                System.out.println("Enter regNum of student to be displayed");
                int regNumber;
                regNumber=input.nextInt();
                int idx=search(studentList,regNumber,size);
                if(idx==size)
                    System.out.println("student does not exit");
                else {
//                    System.out.println("Enter departement name and head to be migrated");
//                    String deptName,deptHead;
//                    deptName=input.next();
//                    deptHead=input.next();
//                    studentList[idx].deptName=deptName;
//                    studentList[idx].deptHead=deptHead;
                    studentList[idx].show();
                    studentList[idx].display();
                }
            }
            else
                break;
        }
    }
    
    static int search(Student73 [] studentList,int regNumber,int size){
        for(int i=0;i<size;++i){
            if(studentList[i].regNumber==regNumber)
                return i;
        }
        return size;
    }
}

interface Department{
    String deptName="CS",deptHead="Alwyn Pias";
    void show();
}


class Hostel {
    String hostelName,hostelLocatoin;
    int numberOfRooms;
    void display(){
        System.out.println("hostelName="+hostelName+" hostelLocation="+
                hostelLocatoin+" numberOfRooms="+numberOfRooms);
    }
}


class Student73 extends Hostel implements Department{

    String studentName,electiveCourse;
    int regNumber;
    double avgMatks;
    @Override
    public void show() {
        System.out.println("deptName="+deptName+"deptHead="+deptHead);
    }

    void display(){
        super.display();
        System.out.println("studentName="+studentName+" regNumber="+regNumber+
                " elective Course="+electiveCourse+" average Marks="+avgMatks);
    }
}

