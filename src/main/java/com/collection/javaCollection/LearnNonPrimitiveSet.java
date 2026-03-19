package com.collection.javaCollection;

import java.util.HashSet;
import java.util.Set;

public class LearnNonPrimitiveSet {
    public static void main(String[] args) {

        Set<Student> ss = new HashSet<>();

        ss.add(new Student("parth",22));
        ss.add(new Student("patel",24));
        ss.add(new Student("lakhan",21));

        ss.add(new Student("parrth",22));
        System.out.println("set: "+ss);

        // here pblm is i've write duplicate obj but hash will not identifie ?? why ??

        /* Why HashSet is NOT detecting duplicate object?
        🔴 Root Cause
            By default, Java does NOT know your objects are equal
            Because:
                hashCode() → from Object class (different for each object)
                equals() → compares memory address, not values

            So:
                new Student("parth",22) != new Student("parth",22)

            👉 They are different objects in memory


         🚨 In Your Case
            Since you didn’t override:
            hashCode()
                Different hash values generated
            equals()
                Objects compared by reference → always different

            So HashSet thinks:
                "These are different objects → allow both"
        */

        /* Solution: Override equals() and hashCode()

            import java.util.Objects;

            class Student {
                String name;
                int age;

                Student(String name, int age) {
                    this.name = name;
                    this.age = age;
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (!(o instanceof Student)) return false;
                    Student s = (Student) o;
                    return age == s.age && Objects.equals(name, s.name);
                }

                @Override
                public int hashCode() {
                    return Objects.hash(name, age);
                }
            }


            Now What Happens
                ss.add(new Student("parth",22));
                ss.add(new Student("parth",22));

                Step:
                    hashCode() → same value
                    Same bucket
                    equals() → returns true

                Duplicate detected → NOT added ✅


            ⭐ Interview One-Liner
              HashSet uses hashCode() to locate the bucket and equals() to check equality.
              If both are not overridden, duplicate objects may be stored.

              Pro Tips
                If you override equals(), you MUST override hashCode()
                Otherwise → unpredictable behavior in HashSet

        */

        /* Confuse between HashInternal ??
        Please tell me clearly !
        hashcode() is find a location or a find a bucket or generate a hashcode() ??
        and equals() → compare a hash value or memory address(reference )


        🔷 1. What does hashCode() do?
        Correct Answer:
                hashCode() generates a hash value (an integer) for an object.

                It does NOT directly find bucket
                It does NOT store anything


            🔄 Then how bucket is found ??
                HashSet / HashMap does this internally:

            int hash = obj.hashCode();     // Step 1: generate hash
            int index = hash % capacity;   // Step 2: find bucket

            Final Understanding:
                hashCode() → generates hash value
                HashMap/HashSet → uses that hash to find bucket


         🔷 2. What does equals() do?
         Correct Answer:
                equals() compares actual object content (logical equality)

            It does NOT:
                Compare hash values ❌
                Compare memory address ❌ (unless not overridden)

            🔴 Default Behavior (Important)
            If you don’t override:
                equals() → compares memory address (reference)

            ✅ After Overriding:
                equals() → compares values (like name, age)

        */

        /* Full Flow in HashSet (Crystal Clear)
        When you do:
            set.add(obj);

        Step-by-step:
            1 Generate hash
                hash = obj.hashCode();
            2 Find bucket
                index = hash % array_size;
            3 Check inside bucket
                If bucket empty → add directly ✅
                If bucket NOT empty:
                    Compare using equals()

                        if (existingObj.equals(newObj)) {
                            // duplicate → DO NOT add
                        } else {
                            // different → add
                        }



        hashCode() generates a hash value, which is used internally to determine the bucket location.
        equals() is then used to compare objects inside the same bucket to ensure uniqueness.
        By default, equals compares references, but when overridden, it compares object content.

        */

    }
}
