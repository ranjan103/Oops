import java.lang.reflect.Field;
import java.util.Scanner;
public class Lab4Exq {
    public static void main(String[] args){
        System.out.println("Enter number of students");
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        Student [] student=new Student[n];
        System.out.println("Enter name,department,email,dob,cgpa,salary rollNo respectively");
        for(int i=0;i<n;++i){
            String name,departement,email,dob;
            float cgpa,salary;
            int rollNo;
            name=input.next();
            departement=input.next();
            email=input.next();
            dob=input.next();
            cgpa=input.nextFloat();
            salary=input.nextFloat();
            rollNo=input.nextInt();
            student[i]=new Student(name,departement,email, dob,cgpa, salary,rollNo);
        }
        String dep=highestAverage(student,"cgpa",n);
        System.out.println("\nDepartment with highest average cgpa:"+dep);
        sort(student,"cgpa",1,n);
        printDepartment(student,dep,n);

        sort(student,"age",0,n);
        dep=highestAverage(student,"salary",n);
        System.out.println("\nDepartment with highest average salary:"+dep);
        printDepartment(student,dep,n);
    }
    static void printDepartment(Student[] student,String dep,int n){
        for(int i=0;i<n;++i){
            if (student[i].departement.compareTo(dep) == 0) {
                System.out.println(student[i].name + " " + student[i].departement + " " + student[i].email + " " + student[i].dob + " " + student[i].cgpa + " " + student[i].rollNo);
            }
        }
    }

    static String highestAverage(Student[] student,String param,int n){
        Class<?> cls=student[0].getClass();
        String dept="none";
        try {
            Field f;
            f = cls.getDeclaredField(param);
            int csCount = 0, itCount = 0;
            float csParam = 0, itParam = 0;
            for (int i = 0; i < n; ++i) {
                if (student[i].departement.compareTo("CS") == 0) {
                    csCount++;
                    float p = (float) f.get(student[i]);
                    csParam += p;
                } else {
                    itCount++;
                    float p = (float) f.get(student[i]);
                    itParam += p;
                }
            }
            csParam=csParam/csCount;
            itParam=itParam/itCount;
            if(csParam>=itParam)
                dept="CS";
            else
               dept="IT";
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        return dept;
    }

    static void sort(Student[] student,String param,int order,int n){
        Class<?> cls=student[0].getClass();
        Field f;
        try {
            f = cls.getDeclaredField(param);
            for(int i=0;i<n;++i){
                for(int j=0;j<n-i-1;++j) {
                    float age1 = (float) f.get(student[j]);
                    float age2 = (float) f.get(student[j + 1]);
                    if (order == 0) {
                        if (age1>age2){
                            Student temp = student[j];
                            student[j] = student[j + 1];
                            student[j + 1] = temp;
                        }
                    }
                    else{
                        if (age1<age2){
                            Student temp = student[j];
                            student[j] = student[j + 1];
                            student[j + 1] = temp;
                        }
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}


class Student{
    String name,departement,email,dob;
//    name=new String[100];
//    depar  tement=new String();
//    email=new String();
//    dob=new String();
    float cgpa,salary,age;
    int rollNo;

    Student(String name,String departement,String email,String dob,float cgpa,float salary,int rollNo){
        this.name=name;
        this.departement=departement;
        this.email=email;
        this.dob=dob;
        this.cgpa=cgpa;
        this.salary=salary;
        this.rollNo=rollNo;
        this.age= (2019-Integer.parseInt(dob.substring(6,10)))*10000+(12-Integer.parseInt(dob.substring(3,5)))*100+(31-Integer.parseInt(dob.substring(0,2)));
    }
}