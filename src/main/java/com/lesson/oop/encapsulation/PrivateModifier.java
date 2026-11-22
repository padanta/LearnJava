package com.lesson.oop.encapsulation;

public class PrivateModifier {
    public static void main(String[] args){
        Students st = new Students();
        st.setName("danta");
        System.out.println(st.getName());
    }

    private static class Students{
        private int age;
        private String name;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

//public class AnotherClass {
//    public static void main(String[] args) {
////        PrivateModifier.Students st = new PrivateModifier.Students(); // only accessible to its own top class
//    }
//}