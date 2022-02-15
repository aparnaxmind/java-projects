package com.company;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Students {


        private Integer roll_no;

        private String Name;

        private String gender;

        private Integer clas;

        private String grade;


        public Students(Integer roll_no,String Name , String gender,Integer clas, String grade) {
            this.roll_no = roll_no;
            this.Name = Name;
            this.gender = gender;
            this.clas = clas;
            this.grade = grade;

        }

        public Integer getroll_no() {
            return roll_no;
        }

        public void setroll_no(Integer roll_no) {
            this.roll_no = roll_no;
        }
        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }


        public String getgender() {
            return gender;
        }

        public void setgender(String gender) {
            this.gender = gender;
        }


        public Integer getclas() {
            return clas;
        }

        public void setclas(Integer clas) {
            this.clas = clas;
        }

        public String getgrade() {
            return grade;
        }

        public void setgrade(String grade) {
            this.grade = grade;
        }


        @Override
        public String toString() {
            return "Student { " +
                    "id =" + roll_no +
                    ", firstName ='" + Name +
                    ", gender ='" + gender +
                    ", class =" + clas +
                    ", grade ='" + grade +
                    '}';
        }



}

