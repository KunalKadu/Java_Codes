// it is similar to abstract classes . Describes what classes do and not how to do?
// Cant crerate object of interface
// Abstract classes have static , normal and abstract methods
//interfaces have only final and static methods
//functions are public or abstract in interfaces and
// variables are static and final by default( Mostly final  )
//in abstract classes it is final or non-final
/* Abstract class can provide the implementation of interfaecs
 * but interface cant provide implementation of abstract class
 * Extend keyword used in abstract class
 * Implements keyword is used in interfaces
 */
package Inheritance.Interfaces;

public interface Engine {
    static final int price = 78000;
    void start();
    void stop();
    void acc();
}
