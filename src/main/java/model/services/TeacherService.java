package model.services;

import model.core.Teacher;
import model.repository.TeacherRepository;

public class TeacherService {

    private  TeacherRepository teacherRepository = new TeacherRepository();

 public Teacher getTeacherBySubject(String subject){

    return teacherRepository.getTeacherBySubject(subject);

 }
}
