package com.company;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class studentsPredicates {

    public static Predicate<Students> isFemale() {
        return p -> p.getgender().equalsIgnoreCase("F");
    }
    public static Predicate<Students> ispass() {
        return p -> p.getgrade() == "A Plus" || p.getgrade() == "A" || p.getgrade() == "B";
    }

    public static List<Students> filterStudents(List<Students> students,
                                                 Predicate<Students> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.<Students>toList());
    }
}
