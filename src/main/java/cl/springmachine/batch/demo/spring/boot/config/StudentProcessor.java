package cl.springmachine.batch.demo.spring.boot.config;

import cl.springmachine.batch.demo.spring.boot.student.Student;
import lombok.NonNull;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(@NonNull Student student) throws Exception {
        return student;
    }
}
