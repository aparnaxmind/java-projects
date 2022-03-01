package com.student.demo.service;

import com.student.demo.dtos.StudentDetailsRequestDTO;
import com.student.demo.entity.Student;
import com.student.demo.repository.StudentRepository;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
//
//public class StudentServiceTest {
//    @Autowired
//    private MockMvc mockMvc;
//    @Test
//    @DisplayName("add students ")
//    void addNewStudent() throws Exception {
//        List<Student> students = new ArrayList<>();
//        Student student = new Student();
//        student.setId(1L);
//        student.setName("Abhirami");
//        student.setEmail("abhirami@gmail.com");
//        students.add(student);
//
//        StudentDetailsRequestDTO stdnt =new StudentDetailsRequestDTO();
//        stdnt.setName("abhi");
//        stdnt.setEmail("abhi@gmail.com");
//        stdnt.setAge(24);
//        Mockito.when(addNewStudent(students)).thenReturn(students);
//        mockMvc.perform( MockMvcRequestBuilders
//                        .post("/api/v1/student")
//                        .content(new ObjectMapper().writeValueAsString(new Student(1L,
//                                "Abhirami",
//                                "Abhirami@gmail.com",
//                                40)))
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }
//
//    @Test
//    void testGetStudents() {
//    }
//
//    @Test
//    void deleteStudent() {
//    }
//
//    @Test
//    void updateStudent() {
//    }
//}


@SpringBootTest
class StudentServiceTest {

    @Mock
    StudentRepository studentRepository;
    @InjectMocks
    StudentService studentService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getStudents() {
    }

    @Test
    void addNewStudent() {
        Student student = new Student();
        student.setName("abhirami");
        student.setEmail("abhi@gmail.com");
        StudentDetailsRequestDTO studentDetailsRequestDTO=new StudentDetailsRequestDTO();
        studentDetailsRequestDTO.setName("abhirami");
        studentDetailsRequestDTO.setEmail("abhi@gmail.com");
        when(studentRepository.save(ArgumentMatchers.any(Student.class))).thenReturn(student);
        Optional<Student> created = studentService.addNewStudent(studentDetailsRequestDTO);
        AssertionsForClassTypes.assertThat(created.get()).isSameAs(student.getName());
//Mockito Verify methods are used to check that certain behavior happened.
// We can use Mockito verify methods at the end of the testing method code to make sure that specified methods are called
        verify(studentRepository).save(student);
    }

}