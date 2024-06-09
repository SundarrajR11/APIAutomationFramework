package com.api.requestBodiesPOJOs;


import java.util.List;

public class StudentsWithoutLombak {


    private int id;
    private String name;
    private boolean isPassed;
    private List<Number> CGPA;

    public StudentsWithoutLombak(int id, String name, boolean isPassed, List<Number> CGPA) {
        this.id = id;
        this.name = name;
        this.isPassed = isPassed;
        this.CGPA = CGPA;
    }
    private StudentsWithoutLombak(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassed(boolean passed) {
        this.isPassed = passed;
    }

    public void setCGPA(List<Number> CGPA) {
        this.CGPA = CGPA;
    }
    public  StudentsWithoutLombak builder1(){
        return new StudentsWithoutLombak();
    }

    public static StudentsInner builder(){
        return new StudentsInner();
    }

    public static class StudentsInner{
        private int id;

        private String name;
        private boolean isPassed;

        private List<Number> CGPA;

        StudentsInner(){}

        // Sugarcoated methods

        public StudentsInner and(){
            return this;
        }
        public StudentsInner with(){
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

        public StudentsInner setCGPA(List<Number> CGPA) {
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

        public List<Number> getCGPA() {
            return CGPA;
        }

        public StudentsWithoutLombak build(){
            return new StudentsWithoutLombak(this.id, this.name, this.isPassed, this.CGPA);
        }

    }
}
