package model.repository;

import model.core.Teacher;

import java.util.Arrays;
import java.util.List;

public class TeacherRepository {




    private List<Teacher> teacherlist = Arrays.asList(
           new Teacher("Rami1", 30,"Python"),
           new Teacher("Rami2",40,"java"),
           new Teacher("Rami3",35,"Oracle")
    );

    public  Teacher getTeacherBySubject(String subject){

        return teacherlist.stream().filter(teacher -> teacher.getSubject().equalsIgnoreCase(subject)).findFirst().get();
    }
}
