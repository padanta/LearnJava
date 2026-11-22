package com.lesson.string;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("danta");
        System.out.println(sb);

        // String builder methods
        System.out.println(sb.length());

        System.out.println(sb.charAt(3));

        sb.setCharAt(4, 'o');
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.append("oz");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        sb2
                .append("Name: Muhammad Padanta\n")
                .append("Age: 24\n")
                .append("Hobby: Java\n");

        System.out.println(sb2);

        sb.insert(0, "Name: ");
        System.out.println(sb);

        sb.replace(6, 12, "Padanta");
        System.out.println(sb);

        sb.delete(0, 6);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


        /*
        length and capacity.
        The length returns the actual number of characters whereas capacity returns the amount of storage available for newly inserted characters,
        beyond which an allocation will occur.
        The capacity is a part of the internal representation of StringBuilder, and its value will dynamically change.
         */
        System.out.println(sb.length());
        System.out.println(sb.capacity());


        /*
        It is possible to specify the capacity when creating a StringBuilder object, but it is not used very often:
         */
        StringBuilder sb3 = new StringBuilder(25);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
    }
}
