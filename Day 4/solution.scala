class Person {

    var age: Int = 0

    def this(initialAge:Int) = {
        // Add some more code to run some checks on initialAge
        this()
        if(initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.")
            this.age = 0;
        } else {
            this.age = initialAge;
        }
       
    }        

    def amIOld(): Unit = {
        // Do some computations in here and print out the correct statement to the console 
        // cannot declare the var then give it value inside if, you need to give it if's value
        var old: String = if( this.age < 13) {
            "You are young."
        } else if( this.age < 18) {
            "You are a teenager."
        } else {
            "You are old."
        }
        System.out.println(old)
    }

    def yearPasses(): Unit = {
        // Increment the age of the person in here
        // age++ isn't allowed in scala
        this.age = this.age +1
    }  
}

object Solution {

    def main(args: Array[String]) {
        var T=scala.io.StdIn.readInt()
        var i=0
        for(i<-1 to T){        
             var age=scala.io.StdIn.readInt()
             var p=new Person(age)
             p.amIOld()
             var j=0
             for(j<-1 to 3){
                 p.yearPasses()
             }
             p.amIOld()
             System.out.println()

        }
    }
}
