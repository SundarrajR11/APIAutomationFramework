package com.api.requestbodiespojos;

import java.util.List;


public class StudentsWithoutLombok {


    private int id;

    private String name;
    private boolean isPassed;

    private List<? extends Object> CGPA;

    public StudentsWithoutLombok(int id, String name, boolean isPassed, List<? extends Object> CGPA) {
        this.id = id;
        this.name = name;
        this.isPassed = isPassed;
        this.CGPA = CGPA;
    }

    private StudentsWithoutLombok() {
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassed(boolean passed) {
        this.isPassed = passed;
    }

    public void setCGPA(List<? extends Object> CGPA) {
        this.CGPA = CGPA;
    }

    public StudentsWithoutLombok builder1() {
        return new StudentsWithoutLombok();
    }

    public static StudentsInner builder() {
        return new StudentsInner();
    }

    @SuppressWarnings("umchecked")
    public int getId() {
        return this.id;
    }

    @SuppressWarnings("umchecked")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("umchecked")
    public List<?> getCGPA() {
        return this.CGPA;
    }

    public static class StudentsInner {
        private int id;

        private String name;
        private boolean isPassed;

        private List<? extends Object> CGPA;

        StudentsInner() {
        }

        // Sugarcoated methods

        public StudentsInner and() {
            return this;
        }

        public StudentsInner with() {
            return this;
        }

        public StudentsInner setId(int id) {
            this.id = id;
            return this;
        }

        public StudentsInner setName(String name) {
            this.name = name;
            return this;
        }

        public StudentsInner setPassed(boolean passed) {
            isPassed = passed;
            return this;
        }

        public StudentsInner setCGPA(List<? extends Object> CGPA) {
            this.CGPA = CGPA;
            return this;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public boolean getIsPassed() {
            return isPassed;
        }

        public List<? extends Object> getCGPA() {
            return CGPA;
        }

        public StudentsWithoutLombok build() {
            return new StudentsWithoutLombok(this.id, this.name, this.isPassed, this.CGPA);
        }

    }
}
