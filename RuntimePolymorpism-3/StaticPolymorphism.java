// static means part of class
// instace funcrion part of an Object
class StaticSuper {
 public static String staticGet() {                                                        
 return "Base staticGet()";
 }

 public String dynamicGet() {
 return "Base dynamicGet()";
 }

}
// static function can not be override
class StaticSub extends StaticSuper {

 public static String staticGet() {
 return "Derived staticGet()";
 }

 @Override  // Annotation tells compiler that this function from Patent class
 // as well this Annotation tells novice Programmer that this function overrider form parent class
 public String dynamicGet() {
 return "Derived dynamicGet()";
 }
}


public class StaticPolymorphism {

 public static void main(String[] args) {

 StaticSuper sup = new StaticSub(); // Upcast

 System.out.println(sup.staticGet());  // StaticSuper.staticGet()

 System.out.println(sup.dynamicGet());
 }
}

